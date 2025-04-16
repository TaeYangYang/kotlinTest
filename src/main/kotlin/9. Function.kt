fun main(){
  /**
   * 함수 기초!
   * 코틀린에서의 함수의 기본 형태
   ********************************************************
    fun 함수이름(매개변수1: 타입1, 매개변수2: 타입2): 반환타입 {
        // 함수 본문
    }
   ********************************************************
   */

  /**
   * 기본적인 형태
   */
  fun add(a: Int, b: Int): Int{
    return a + b
  }
  println(add(3, 2))

  /**
   * 반환값이 없는 함수(Unit 반환)
   * 반환타입 Unit은 생략 가능
   */
  fun printMsg(msg: String): Unit{
    println(msg)
  }
  printMsg("Hello!!")

  /**
   * 매개변수 기본 값 설정(Default Arguments)
   */
  fun printInfo(name: String = "Kim", age: Int = 0){
    println("이름은 $name 나이는 $age")
  }
  printInfo("태양", 30)
  printInfo("태양")
  printInfo()

  /**
   * 이름 있는 인수(Named Arguments)
   * 파라미터 위치에 관계없이 인수의 이름을 명시하여 적으면 됨
   */
  printInfo(age = 10, name = "어린이")

  /**
   * 가변 인수(vararg)
   * 메소드에 전달되는 파라미터 개수가 확실하지 않을 때 vararg 키워드를 사용
   */
  fun sum(msg: String, vararg numbers: Int): Int{
    println(msg)
    // numbers는 배열로 취급됨
    return numbers.sum()
  }
  println(sum("print!", 1, 2, 3))

  /**
   * 중첩 함수
   * 함수 안에 또 다른 함수 사용 가능
   */
  fun outer(){
    fun inner(){
      println("inner function!!")
    }
    inner()
  }
  // inner() // 여기서는 에러
  outer()
}