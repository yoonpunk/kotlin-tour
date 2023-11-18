fun main() {
    // 읽기 전용 Set, 중복된 "cherry" 하나는 드랍된다.
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // 원소 타입을 명시한 가변 Set
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)

    // 가변 Set을 읽기 전용 Set으로 캐스팅
    val fruitLocked: Set<String> = fruit

    // 원소 개수 얻기
    println("This set has ${readOnlyFruit.count()} items")

    // 특정 원소가 있는지 확인하기
    println("banana" in readOnlyFruit)

    // 가변 리스트에서 원소를 추가하거나 제거하기
    fruit.add("dragonFruit")
    println(fruit)

    fruit.remove("dragonFruit")
    println(fruit)
}