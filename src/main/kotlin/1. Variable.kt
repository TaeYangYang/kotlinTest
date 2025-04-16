const val MAX_LIMIT = 100
lateinit var text: String
fun main(args: Array<String>) {
  /**
   * 변수 타입(Int, Long, Short, Byte, Float, Double, Char, Boolean)
   */
  // 정수 실수
  var intValue: Int = 1234 // 32비트
  var longValue: Long = 1234L // 64비트
  var intValueByHex: Int = 0x1af //16진수
  var intValueByBin: Int = 0b1101 //2진수 (binary 약자)
  //코틀린은 8진수 표기는 지원하지 않는다.

  var doubleValue: Double = 123.5 //실수는 소수점을 포함해 숫자를 쓰거나
  var doubleValueWithExp: Double = 123.5e10 //필요시 지수 표기법을 추가한다.
  var floatValue: Float = 123.5f //Float는 f를 붙인다.=


  // 코틀린은 내부적으로 문자열을 UTF -16 BE 방식을 사용
  // 따라서 글자 하나하나가 2 byte의 메모리 공간을 사용
  // 문자, 문자열
  var charValue: Char = 'a'
  var koreanCharValue: Char = '가'
  var stringValue = "one line string test"
  var multiLineStringValue = """multiline
    string
    test"""

  //불리언
  var booleanValue: Boolean = true

  /**
   * 변수 선언 : val, var
   * val: 읽기 전용(Immutable) 변수 선언, 이후 변경 불가 (자바의 final)
   * var: 변경 가능한(Mutable) 변수 선언
   */
  val num = 1
  val num2: Int = 2 // 명시적 타입 선언
  // num = 3 하면 에러 (val인데 재할당을 하려고 해서)

  var num3 = 3;
  num3 = 4 // 재할당 가능

  /**
   * 문자열 템플릿을 사용한 값 출력
   */
  var str = "test"
  println("테스트문자열1:$str\n테스트2:${str}\n달러출력:\$ead\n표현식${num+num2}") // $변수명 또는 ${변수명} 형태로 사용

  /**
   * 지연 초기화
   * 주로 var로 선언, Null 불가. 기본 자료형(Int, Long, Double 등)에는 사용 불가
   * 주로 클래스 멤버 변수를 선언할 때 사용
   * 사용 전에 초기화하지 않으면 UninitializedPropertyAccessException 발생
   */
  //lateinit var text: String --> 맨 윗줄에 선언함
  if(::text.isInitialized){
    text = initValue("initText")
  }


  /**
   * by lazy 초기화
   * 변수를 처음 사용할 때 초기화됩니다. 주로 읽기 전용 변수(val)와 함께 사용됩니다.
   * thread-safe 이다
   * null 가능
   */
  val lazyStr: String by lazy {
    println("lazyStr 변수 초기화된다")
    "init!!!"
  }
  println(lazyStr)

  /**
   * 상수(const)
   * const val: 컴파일 타임에 상수로 사용되는 변수 선언.
   * 조건: 최상위 수준에서 또는 object나 companion object 내부에서 선언
   */
  // const val MAX_LIMIT = 100; 여기서 선언하면 에러.. 1번 라인 참고! ( 함수 밖에 선언 )

  /**
   * Null 허용
   * 기본적으로 코틀린 변수는 null을 허용하지 않습니다.
   * null을 허용하려면 타입 뒤에 ?를 붙입니다.
   */
  var nullableName: String? = null
  // var nullableName: String = null 이건 에러

  /**
   * 엘비스 연산자 (?:)
   * null 값일 때 기본 값을 반환할 수 있습니다.
   */
  // null 값이 허용된 변수에 접근할 때는 안전한 호출 연산자(?.)를 사용해야 합니다.
  val length = nullableName?.length ?: 0  // nullableName이 null이면 0 반환


}

fun initValue(str: String): String {
  return str;
}