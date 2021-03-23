package `02`.Estructuras

fun main() {
    // Switch
    var animal = "Perro"

    when(animal) {
        "Perro"-> println("El animal es un Perro.")
        "Gato" -> println("El animal es un Gato.")
        "Tigre" -> println("El animal es un Tigre.")
        else -> println("El animal es un animal no identificado")
    }






    var numero: Int = 6

    when(numero) {
        in 1..3 -> print("El numero esta en el rango de 1 a 3")
        in 4..7 -> println("El numero esta en el rango de 4 a 7")
        in 8..11 -> println("El numero esta en el rango de 8 a 11")
        else -> println("El numero se encuentra fuera de un rango identificado")
    }





}