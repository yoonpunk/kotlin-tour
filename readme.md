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
// 불변객체
val popcorn = 5
val hotdog = 7

// 가변객체
var customers = 10

fun main() {
    // 값 재할당
    customers = 8
    println(customers)
}
```
- `val`: 불변객체 (읽기전용)
- `var`: 가변객체 (읽기전용)
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
