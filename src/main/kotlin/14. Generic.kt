fun main(){
  /**
   * 제네릭 (Generics)
   * 컴파일 시점에 타입이 결정
   */

  val intBox = Box(10)
  val stringBox = Box("Hello")
  println("int : ${intBox.getValue()} / String : ${stringBox.getValue()}")



}
class Box<T>(val param: T){
  fun getValue(): T = param
}