fun main(){
  /**
   * 확장 함수 (Extension Functions)
   * 기존 클래스에 새로운 메소드를 추가
   * 같은 패키지 내에서 사용 가능, 다른 패키지 파일에서 import해서 사용 가능
   * 객체 인스턴스를 통해 호출
   * 클래스 내부의 private나 protected 멤버에 직접 접근 불가
   * 상속받은 클래스에서도 사용 가능
   * 오버라이딩은 불가능
   */
  fun String.lastChar(): Char = this[this.length - 1]
  println("Hello".lastChar())

  /**
   * 고차 함수 (Higher-order Functions)
   * 함수를 인자로 받거나 함수를 반환하는 함수. 함수형 프로그래밍!!
   * 매개변수가 하나라면 생략하고 it 라는 암시적 매게변수 사용할수도 있음
   */
  // 함수를 인자로 받음
  fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int{
    return operation(a, b)
  }
  println(operate(3, 5){num1, num2 -> num1 + num2})

  // 함수를 반환함
  fun multiplyBy(factor: Int): (Int) -> Int{
    return {number -> number * factor}
  }
  val multiplyBy2 = multiplyBy(2)
  println(multiplyBy2(4))

  /**
   * 익명 함수(Anonymous Functions)
   * 이름이 없는 함수. 변수에 할당하거나 인자로 전달 가능
   */
  val add = fun(a: Int, b: Int): Int{
    return a+b
  }
  println(add(5, 3))

  /**
   * 람다 표현식
   * {} 블록 안에 표현. 인자 및 반환 타입 생략 가능
   */
  val printSum = {a: Int, b: Int -> println(a+b)}
  printSum(1, 10)

  /**
   * 꼬리 재귀(tailrec)
   * 함수의 마지막 호출이 자기 자신을 호출하는 형태여야 가능
   */
  tailrec fun factorial(n: Int, result: Int = 1): Int{
    if(n == 1){
      return result
    } else{
      return factorial(n - 1, result * n) // 다음 함수 호출 시 result * n 값을 전달하고 스택에서 현재 호출은 제거
    }
  }
  println(factorial(5))

  /**
   * 함수 타입(Function Types)
   * 함수 타입을 사용해 함수를 변수에 할당하거나 매개변수로 전달 가능
   * () -> T 형식
   */
  val sum: (Int, Int) -> Int = {a, b -> a + b}
  println("합계: ${sum(1, 2)}")

  /**
   * 중위 함수(Infix Function)
   */
  infix fun Int.add(x: Int): Int{
    return this + x
  }
  println(3.add(5))
  println(3 add 5)

  /**
   * 인라인함수 사용 예제
   */
  measureTime { println("작업 수행!") }

  /**
   * 스코프 함수
   * let, run, also, apply, with
   */
}

/**
 * 인라인 함수(inline)
 * 람다식을 사용하는 함수의 성능 최적화를 위해 사용.
 * 함수를 호출하는 대신 코드를 컴파일 시점에 삽입
 */
inline fun measureTime(action: () -> Unit){
  val start = System.currentTimeMillis()
  action()
  val end = System.currentTimeMillis()
  println("실행시간 : ${end - start}ms")
}