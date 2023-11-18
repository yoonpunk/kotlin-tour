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

### Collections

코틀린은 다음과 같은 `Collections`을 제공하며, 모든 컬렉션은 가변하거나 읽기 전용일 수 있다.

| Collection type | Description                    |
|-----------------|--------------------------------|
| Lists           | 순서가 있는 원소의 컬렉션                 |
| Sets            | 순서가 없는 고유한 원소의 컬렉션             |
| Maps            | 키-값 구조의 집합. 키는 고유하고 하나의 값에 매핑됨 |

**List**

리스트는 추가된 순서대로 원소를 저장하며, 중복을 허용한다.

- 읽기 전용 List는 `listOf()`를 통해 `List`를 생성한다.
- 가변 List는 `mutableListOf()`를 통해 `MutableList`를 생성한다.
- List 생성 시, 코틀린은 List에 저장된 원소의 타입을 추론한다.
- 원소 타입을 명시하기 위해서는 List 타입 선언 뒤 `<>`에 타입을 선언한다. 

```kotlin
// 문자열을 저장하는 읽기 전용 리스트
val readOnlyShapes = listOf("triangle", "square", "circle")
println(readOnlyShapes)

// 원소 타입을 명시한 가변 리스트
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
println(shapes)
```

- 가변 리스트를 읽기 전용 리스트로 변경할 수 있다. (캐스팅)
```kotlin
// 가변 리스트를 불변하게 변경 (캐스팅)
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
val shapesLocked: List<String> = shapes
```

- index를 통해 원소 접근이 가능하다. `[]`
```kotlin
    // index를 통한 접근
println("The first item in the list is: ${readOnlyShapes[0]}")
```

- 다음과 같은 함수(`extension functions`)를 사용할 수 있다.  
(`extension functions`는 다른 장에서 알아보자)
  - `.first()`: 첫번째 원소 가져오기 
  - `.last()`: 마지막 원소 가져오기 
  - `.count()`: 저장된 원소 개수 가져오기
  - `.add()`: 원소를 추가하기
  - `.remove()`: 원소를 제거하기

```kotlin
// 첫번째 원소 접근, 마지막 원소 접근
println("The first item in the list is: ${readOnlyShapes.first()}")
println("The first item in the list is: ${readOnlyShapes.last()}")

// 원소 개수 얻기
println("This list has ${readOnlyShapes.count()} items")

// 특정 원소가 있는지 확인하기
println("circle" in readOnlyShapes)

// 가변 리스트에서 원소를 추가하거나 제거하기
shapes.add("pentagon")
println(shapes)

shapes.remove("pentagon")
println(shapes)
```

- `in` 연산자를 통해 특정 원소의 포함유무를 알 수 있다.
```kotlin
// 특정 원소가 있는지 확인하기
println("circle" in readOnlyShapes)
```

**Set**

Set은 순서가 없으며 중복을 허용하지 않는다.

- 읽기 전용 Set은 `setOf()`를 통해 `Set`를 생성한다.
- 가변 Set은 `mutableSetOf()`를 통해 `MutableSet`을 생성한다.
- Set 생성 시, 코틀린은 Set 저장된 원소의 타입을 추론한다.
- 원소 타입을 명시하기 위해서는 Set 타입 선언 뒤 `<>`에 타입을 선언한다. 

```kotlin
// 읽기 전용 Set, 중복된 "cherry" 하나는 드랍된다.
val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
// 원소 타입을 명시한 가변 Set
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
```

- 읽기 전용 뷰를 만들기 위해 캐스팅을 활용할 수 있다.
```kotlin
// 원소 타입을 명시한 가변 Set
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
// 가변 Set을 읽기 전용 Set으로 캐스팅
val fruitLocked: Set<String> = fruit
```

- Set은 순서가 없으므로 인덱스를 통한 접근은 불가능하다.

- Set은 다음과 같은 함수를 제공한다.
  - count : 원소 개수 구하기
  - add : 원소 추가하기 
  - remove : 원소 제거하기
```kotlin
// 원소 개수 얻기
println("This set has ${fruit.count()} items")

// 가변 리스트에서 원소를 추가하거나 제거하기
fruit.add("dragonFruit")
println(fruit)

fruit.remove("dragonFruit")
println(fruit)
```

- Set은 `in` 연산자로 특정 원소의 포함여부를 알 수 있다.
```kotlin
// 특정 원소가 있는지 확인하기
println("banana" in readOnlyFruit)
```

