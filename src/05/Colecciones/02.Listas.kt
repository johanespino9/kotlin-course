package `05`.Colecciones

fun main() {
    // Listas Mutables e Inmutables

//    var lista = listOf<String>("Juan", "Jose")
//    var lista2 = mutableListOf<String>("Pepe", "Eduardo")
//    println(lista)
//    println(lista2)
//    lista2.add("Miguel")
//    lista2.removeAt(0)
//    println(lista2)
//    println(lista2.get(1))
//    lista2.set(1, "MIGUEL")
//    println(lista2)
//    println(lista2.first())
//    println(lista2.last())
//    lista2.clear()
//    println(lista2)
//    lista2.addAll(lista)
//    println(lista2)



//    var lista = arrayListOf(1, 31, 3, 59, 200, 10,30)
//    println(lista)
//    lista.sort()
//    println(lista)
//    lista.sortDescending()
//    println(lista)

    var lista = setOf(1,2,3,3,3,3,4,5,5,5,6,6)
    println(lista)
    var lista2 = mutableSetOf(1,2,3,3,3,3,4,5,5,5,6,6)
    println(lista2)
    lista2.add(1)
    lista2.add(4)
    lista2.add(7)
    println(lista2)
}