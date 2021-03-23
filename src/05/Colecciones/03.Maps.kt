package `05`.Colecciones

fun main() {
    // Maps - Diccionarios
    // [ "ab": 30]
    // [ "bc": 12]
    // [ "cd": 13]
    // [ "de": 42]

    var map = mutableMapOf("ab" to 30, "bc" to 12, "cd" to 13, "de" to 42)

//    map.put("ab", 40)
    map.set("ab", 40)
    println(map)

    for(elemento in map){
        println("Elemento key: ${elemento.key}, value: ${elemento.value}")
    }

}