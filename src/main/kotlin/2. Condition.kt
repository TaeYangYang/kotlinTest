fun main(args: Array<String>) {
  /**
   * if-else
   */
  val score: Int = 85

  if (score >= 90) {
    println("A학점")
  } else if (score >= 80) {
    println("B학점")
  } else {
    println("F학점")
  }

  // 표현식으로 사용 가능
  val grade: String = if (score >= 90) "A" else if (score >= 80) "B" else "F"
  val grade2 = if (score >= 90) {
    "A"
  } else if (score >= 80) {
    "B"
  } else {
    "F"
  }

  /**
   * when 조건문
   */

  val number = 3
  when (number) {
    1 -> println("1")
    2 -> println("2")
    3,4,5 -> println("3~5 중 하나")
    in 6..10 -> ("6~10 중 하나")
    else -> println("무슨 숫자일까?")
  }

  // 표현식으로 사용 가능
  val res = when(number){
    1 -> "one"
    2 -> "two"
    in 3..5 -> "3..5"
    else -> "other"
  }

  // 조건 없는 when
  when{
    number > 1 -> println("1보다 큼")
    number > 2 -> println("2보다 큼")
    else -> println("아무것도 아님")
  }

}