fun main(){
  /**
   * 리스트
   * List(불변)
   * MutableList(변경 가능)
   */
  val numbers: List<Int> = listOf(1, 2, 3) // listOf는 코틀린 표준 라이브러리에 정의된 List<T> 타입 객체를 생성하는 함수
  // numbers[0] = 100; 에러
  println(numbers[0])
  println(numbers)
  numbers.fold(0) {acc, number -> acc + number}

  val mutableList: MutableList<String> = mutableListOf("one", "two", "three")
  mutableList.add("four")
  println(mutableList)

  //fold : 초기값과 연산을 모두 제공
  val foldSum = numbers.fold(0){acc, number -> acc + number} // 초기값 0, 모든 항목 연산
  val reduceSum = numbers.reduce{acc, number -> acc + number} // 초기값 없이 첫 번째 값 부터 연산

  /**
   * Set
   */
  val numberSet: Set<Int> = setOf(1, 2, 3, 2, 5)
  println(numberSet)

  /**
   * 맵
   * Map(불변)
   * MutableMap(변경 가능)
   */
  val map: Map<String, String> = mapOf("first" to "one", "second" to "two")
  println(map)

  var mutableMap: MutableMap<String, String> = mutableMapOf("apple" to "사과")
  mutableMap["banana"] = "바나나"

}