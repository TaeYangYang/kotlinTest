/**
 * Enum 사용
 */
enum class Direction(val angle: Int){
  // angle이라는 속성을 추가한것. 속성 필요없으면 enum class Direction{} 형태로 쓰면됨
  // angle 속성은 각각 0, 180, 90, 270
  NORTH(0), SOUTH(180), EAST(90), WEST(270);

  // 메소드 추가 가능
  fun toOpposite(): Direction{
    return when(this){
      NORTH -> SOUTH
      SOUTH -> NORTH
      EAST -> WEST
      WEST -> EAST
    }
  }
}

/**
 * Enum 확장(인터페이스 또는 추상 메소드 정의)
 */
interface Printable{
  fun print()
}

enum class Number(val num: Int) : Printable{
  ONE(1){
    override fun print(){
      println("1입니다")
    }
  },
  TWO(2){
    override fun print() {
      println("2입니다")
    }
  }
}

fun main(){
  val dir = Direction.EAST
  
  when(dir){
    Direction.EAST -> println("동쪽")
    Direction.NORTH -> println("북쪽")
    Direction.SOUTH -> println("남쪽")
    Direction.WEST -> println("서쪽")
  }
  
  println("${dir.name} 방향은 ${dir.angle}도")
  println("반대 방향은 ${dir.toOpposite().name} 입니다?")

  /**
   * enum 클래스에서 values, valueOf 사용
   */
  for(direction in Direction.values()){
    println(direction)
  }
  println(Direction.valueOf("EAST"))

  /**
   * enum의 메소드 사용
   */
  Number.ONE.print()
}

