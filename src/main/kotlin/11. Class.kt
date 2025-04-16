fun main(){
  /**
   * 클래스의 기본 형태
   *
   * 접근 제한자
   * public(기본) : 어디서든 접근 가능
   * private : 클래스 내부에서만 접근 가능
   * protected : 클래스와 서브 클래스에서 접근 가능
   * internal : 같은 모듈 내에서 접근 가능(한 프로젝트 내에서 접근 가능)
   */
  class Person(){
    var name: String = ""
    var age: Int = 0

    fun intro(){
      println("안녕! 나는 $name!! 나이는 $age!!!")
    }
  }
  val person = Person()
  person.name = "태양"
  person.age = 12
  person.intro()

  /**
   * 생성자(constructor) : 클레스의 이름 옆 괄호 안에 정의
   */
  class Book(val title: String, val price: Int)
  val book = Book("책", 10000)

  /**
   * 보조 생성자(secondary constructor)
   * constructor 키워드를 사용하여 선언. 클래스 내에 여러 개 정의 가능
   */
  class Animal(val name: String, var age: Int){
    var nickname: String = ""

    constructor(name: String, age: Int, nickname: String): this(name, age){
      this.nickname = nickname
    }
  }
  var animal = Animal("원숭이", 5, "숭이숭이")

  /**
   * init : 객체 생성 시 init 블록이 자동으로 호출됨.
   * 여러 개 정의 가능하며 순서대로 실행됨
   */
  class MyClass(val msg: String, val code: Int){
    init{
      println("init my class: msg: $msg, code: $code")
    }
  }
  val myClass = MyClass("message!!", 100)

  /**
   * Data Class
   * 간단한 데이터 저장 객체를 만들 때 사용
   * equals, hashCode, toString, copy 메소드는 자동으로 생성됨
   */
  data class Student(val name: String, val grade: Int){
    var age = 14
    constructor(name: String, grade: Int, age: Int): this(name, grade){
      this.age = age
      println("Student age 초기화")
    }
  }
  val student1 = Student("김학생", 3, 16)
  println(student1)
  val student2 = student1.copy(name="이학생", grade=2)
  println(student2)

  /**
   * 구조분해 : componentN() 함수
   */
  var (a, b) = student1
  var c = student1.component2()
  println("구조분해 a : $a")
  println("구조분해 b : $b")
  println("구조분해 c : $c")
}