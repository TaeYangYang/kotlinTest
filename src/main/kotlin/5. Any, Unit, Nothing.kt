fun main(){
  /**
   * Any
   * 코틀린의 최상위 타입으로, 모든 객체의 부모 타입. 자바의 Object와 비슷함
   * null은 불가능, Any? 로 설정하면 가능.
   */
  val any:Any = "anyType"
  println(any)

  /**
   * Unit
   * 반환 값이 없는 함수의 반환 타입. 자바의 void와 비슷함
   * 명시적으로 Unit을 반환하거나 생략 가능
   */
  var printFun = fun (str:String): Unit{
    println(str)
  }
  printFun("unitFun")

  /**
   * Nothing
   * 절대 값을 반환하지 않는 함수의 반환 타입
   * 프로그램의 흐름이 종료되거나 예외가 발생할 것을 명시할 때 사용
   */
  var nothingFun = fun(msg:String): Nothing{
    throw Exception(msg)
  }
  nothingFun("내가 만든 예외 함수")
  println("예외함수 다음에 실행") // 위에 nothingFunc 함수가 nothing을 반환하므로 이건 실행되지 않음
}