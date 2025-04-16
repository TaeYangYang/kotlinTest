fun main(){
  /**
   * object 사용
   */
  Database.connect()

  /**
   * companion object 사용
   */
  println("constant Val: ${MyTestClass.MyCompanionObj.myVal}")

  /**
   * 익명 객체
   */
  val button = object : ClickListener{ // 선언과 동시에 인터페이스 구현
    override fun onClick() {
      println("버튼 클릭!")
    }
  }
}

/**
 * 동반 객체 (companion object)
 * 클래스 내부에서 정적인 속성/메서드를 만들 때 사용
 */
class MyTestClass{
  companion object MyCompanionObj{
    const val myVal = "500"
  }
}

/**
 * 객체 선언 (object)
 * 싱글톤 객체 생성 가능(전역 객체)
 */
object Database{
  val name = "MainDB"
  fun connect() = println("$name 연결")
}

interface ClickListener{
  fun onClick()
}
