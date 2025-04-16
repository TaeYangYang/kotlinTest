fun main(){
  /**
   * 클래스 심화
   */

  /**
   * 상속 : 기본적으로 final이며 상속 허용을 위해 open 사용
   */
  open class Animal{
    var name: String = ""
    open fun sound(){
      println("동물소리를 내어봐요")
    }
  }
  class Dog : Animal(){

    override fun sound() { // override : 메소드 오버라이드
      println("멍멍멍")
      super.name = "댕댕이"
    }
  }
  val dog = Dog()
  dog.sound()

  /**
   * 추상 클래스 : abstract 키워드 사용
   * 인스턴스화 불가능. 메소드는 하위 클래스에서 구현 필요
   */
  abstract class AbstractAnimal{
    abstract fun sound()
  }
  class Cat : AbstractAnimal(){
    override fun sound() {
      println("냐옹야옹")
    }
  }
  val cat = Cat()
  cat.sound()

  /**
   * 인터페이스 : interface 키워드 사용
   */
  class Human : Walkable{
    override fun walk() {
      println("사람 걷는다!")
    }
  }
  val human = Human()
  human.walk()

}


interface Walkable{
  fun walk()
}

/**
 * 중첩 클래스 : 외부 클래스와 독립적
 * 내부 클래스 : inner 키워드로 선언. 외부 클래스에 대한 참조를 가짐
 */
class Outer{
  private val message = "Hello world"

  class Nested{
    fun greet() = "Hello Nested"
  }

  inner class Inner{
    fun greet() = "Message: $message"
  }
}

/**
 * sealed 클래스 : 상속 가능한 하위 클래스를 제한
 * enum보다 유연하고 abstract 보다는 제한적인 특징
 * sealed 클래스는 abstract와 유사하게 직접 객체를 생성할 수 없음
 * sealed 클래스를 상속받는 하위 클래스는 같은 파일 내에만 선언 가능
 * when 표현식과 함께 사용하면 컴파일러가 모든 경우를 검사할 수 있음
 * data class와 함께 사용하여 다양한 상태 표현 가능
 */
sealed class Result{
  class Success(val data: String) : Result()
  class Error(val message: String) : Result()
}

fun handleResult(result: Result){
  when(result){
    is Result.Success -> println("성공: ${result.data}")
    is Result.Error -> println("실패: ${result.message}")
  }
}

fun result(){
  val success = Result.Success("데이터 반환")
  val error = Result.Error("오류 발생")
  handleResult(success)
  handleResult(error)
}