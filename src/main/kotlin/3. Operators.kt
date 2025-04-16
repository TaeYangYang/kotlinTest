fun main(){
  var a = 1;
  var b = 2;

  var trueVal = true;
  var falseVal = false;

  /**
   * 산술 연산자( +, -, *, /, % )
   */
  println(a + b)

  /**
   * 대입 연산자( =, +=, -=, *=, /=, %= )
   */
  a += 1

  /**
   * 비교 연산자( ==, !=, >, <, >=, <= )
   */
  println(a > b)

  /**
   * 논리 연산자
   */
  println(trueVal && falseVal)
  println(trueVal || falseVal)
  println(!trueVal)

  /**
   * 비트 연산자(and, or, xor, inv(not 연산), shl(왼쪽 시프트), shr(오른쪽 시프트)
   */
  println(a.and(b))
  println(a.inv())
  println(a.shl(1))

  /**
   * 증감 연산자( ++, -- )
   */
  a++

  /**
   * 엘비스 연산자( ?: ), 안전한 호출 연산자( ?. )
   */
  val name: String? = null
  val lastName: String? = "Kim"
  val result = name ?: lastName?: "이름없음"
  println(result) // Kim 출력
  println(name?.length) // name이 null이라면 null 반환

  /**
   * 범위 연산자 (..)
   */
  for(i in 1..10){
    print(i)
  }

  /**
   * in 연산자
   */
  val number = 5;
  val isInRange = number in 1..5

  /**
   * 범위 연산자
   */
  for(i in 1..3){ // 1부터 3
    print(i)
  }

  for(i in 3 downTo 1){ // 3부터 1(역순)
    print(i)
  }

  for(i in 1..5 step 2){ // 일정 간격
    print(i) // 1, 3, 5
  }

  for(i in 1 until 3){ // 범위 끝은 미포함
    print(i) // 1, 2
  }

  /**
   * 별표(*) 연산자
   * 베열 또는 컬렉션을 풀거나(spreading) 요소를 분리(unpacking)
   */

  fun printStr(vararg strs: String){
    for(str in strs){
      println(str)
    }
  }
  val strArr = arrayOf("첫번째", "두번째", "세번째")
  printStr(*strArr)

}