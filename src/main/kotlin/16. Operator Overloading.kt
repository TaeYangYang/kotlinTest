fun main(){
  /**
   * 연산자 오버로딩(Operator Overloading)
   */
  data class Point(val x: Int, val y: Int){
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
  }
  val p1 = Point(1, 2)
  val p2 = Point(3, 4)
  println(p1 + p2)
}