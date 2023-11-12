# Kotlin Tour

## 코틀린 연습 프로젝트  
아래 코틀린 공식 가이드 문서를 보고 연습하는 프로젝트 입니다.
- https://kotlinlang.org/docs/getting-started.html


### Hello World

```kotlin
fun main() {
    println("Hello World!")
}
```
- `fun`: 함수 선언
- `main`: 프로그램이 시작점이 되는 함수
- `{}`: 함수 정의 구역
- `print` `println`: 표준출력 함수

### Variables
```kotlin
// 읽기 전용 변수
val popcorn = 5
val hotdog = 7

// 가변 변수
var customers = 10

fun main() {
    // 값 재할당
    customers = 8
    println(customers)
}
```
- `val`: 읽기 전용 변수
- `var`: 가변 변수
- `top level`: main 함수 위 선언된 변수
- 재할당이 필요한 변수의 경우에만 `var`를 사용하고, 기본적으로는 `val`을 사용하는 것이 권장됨

### String templates
```kotlin
fun main() {
    val customers = 10
    println("There are $customers customers")

    println("There are ${customers + 1} customers")
}
```
`String templates`을 통해 변수나 객체 저장된 데이터를 문자열 안으로 변환할 수 있다.   
`Templates expressions`은 `$`로 시작하며 `{}`안에 코드를 배치할 수 있다.

코틀린에서는 변수의 타입을 명시하지 않는다. 대신 타입추론을 사용한다.

### Basic types
코틀린에서 모든 변수와 데이터 구조는 데이터 타입이며, 이를 통해 컴파일러가 변수와 데이터 구조에 어떠한 행동을 할 수 있는지 알 수 있다.  
(데이터 타입을 통해 어떤 함수와 프로퍼티를 갖고 있는지 알 수 있음)

코틀린은 `타입추론`을 통해, 데이터 타입을 추론한다.   
아래 예시에서는 `customers`를 `Int`형 데이터 타입으로 추론하고 산술연산을 수행한다.

```kotlin
fun main() {
    var customers = 10

    customers = 8

    customers = customers + 3
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3

    println(customers)
}
```

| Category               | Basic types                |
|------------------------|----------------------------|
| Integers               | Byte, Short, Int, Long     |
| Unsigned integers      | UByte, UShort, UInt, ULong |
| Floating-point numbers | Float, Double              |
| Booleans               | Boolean                    |
| Characters             | Char                       |
| Strings                | String                     |

코틀린에서는 변수를 선언하고 이를 나중에 초기화할 수 있으며, 변수가 처음 참조되기 전 초기화될 때 이를 관리한다.  
초기화없이 변수의 타입을 선언하기 위해서는 `:`를 사용해 타입을 지정한다.

```kotlin
fun main() {
    val d: Int
    d = 3

    val e: String = "hello"

    println(d)
    println(e)
}
```