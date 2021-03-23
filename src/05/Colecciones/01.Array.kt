package `05`.Colecciones

fun main() {
    // Array (Arreglos o Matrices)
    // [1, 2, 3, 4, 5]

    var arreglo:Array<Double> = Array(5,{ i -> 0.0 })

    arreglo.set(0, 1.2)
    arreglo.set(1, 2.3)
    arreglo.set(2, 13.3)
    arreglo.set(3, 39.3)
    arreglo.set(4, 3.3)

    println(arreglo.get(0))
    println(arreglo[0])

    for (elemento in arreglo) {
        println("Elemento: $elemento")
    }
}