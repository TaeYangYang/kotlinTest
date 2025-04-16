fun main(){
  /**
   * 배열 타입, 주요 메소드
   */
  val numbers: Array<Int> = arrayOf(1, 2, 3, -4)
  val arr = Array(3) {i -> i + 1}
  val intArr = intArrayOf(1, 2)

  numbers.set(0, 11)
  println(numbers)
  println(arr[1])

  val strArr: Array<String> = arrayOf("AAA", "BBB", "CCC", "BBB")
  println(strArr.size) // size : 배열의 크기
  println(strArr.contains("CC")) // contains : 포함 여부
  println(strArr.indexOf("BBB")) // indexOf : 특정 값의 인덱스, 없으면 -1
  println(strArr.lastIndexOf("BBB")) // lastIndexOf : 마지막으로 나타나는 값의 인덱스, 없으면 -1
  strArr.reverse() // reverse : 배열을 반전
  println(strArr.joinToString())
  println(strArr.sortedArray().joinToString()) // sortedArray : 정렬된 배열 반환

  /**
   * 배열 반복
   */
  // 기본 형태
  for(item in strArr){
    println(item)
  }

  // 인덱스와 함께 값을 사용 : indices, withIndex 사용
  for(i in strArr.indices){
    println("index $i: ${strArr[i]}")
  }

  for((index, value) in strArr.withIndex()){
    println("withIdex $index: $value")
  }
}