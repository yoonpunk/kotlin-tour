fun main() {
    // 문자열을 저장하는 읽기 전용 리스트
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    // 원소 타입을 명시한 가변 리스트
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // 가변 리스트를 불변하게 변경 (캐스팅)
    val shapesLocked: List<String> = shapes

    // index를 통한 접근
    println("The first item in the list is: ${readOnlyShapes[0]}")

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
}