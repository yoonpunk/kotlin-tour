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