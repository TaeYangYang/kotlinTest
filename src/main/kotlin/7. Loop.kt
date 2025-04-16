fun main(){
  /**
   * for
   * 기본형태
   */
  for(i in 1..3){ // 1부터 3
    println(i)
  }

  for(i in 3 downTo 1){ // 3부터 1(역순)
    println(i)
  }

  for(i in 1..5 step 2){ // 일정 간격
    println(i) // 1, 3, 5
  }

  for(i in 1 until 3){ // 범위 끝은 미포함
    println(i) // 1, 2
  }

  /**
   * 컬렉션 순회
   */
  val list = listOf("aa", "bb", "cc")
  for(item in list){
    println(item)
  }

  for((idx, itemVal) in list.withIndex()){
    println("index: $idx, value: $itemVal")
  }

  /**
   * while
   */
  var a = 1
  while(a < 4){
    println(a)
    a++
  }

  /**
   * do-while
   */
  var j = 1
  do{
    println(j)
    j++
  } while(j < 3)

  /**
   * break, continue
   */
  for(i in 1..5){
    if(i % 2 == 0){
      continue
    }
    if(i == 4){
      break
    }
  }

  /**
   * 라벨을 사용한 제어
   */
  outer@ for(i in 1..3){
    for(j in 1..3){
      if(i == 2 && j == 2){
        break@outer
      }
      println("i = $i, j = $j")
    }
  }
}