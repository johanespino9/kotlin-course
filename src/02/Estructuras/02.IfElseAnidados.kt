package `02`.Estructuras

fun main() {
    // Estructuras Condicionales Anidadas

    var numero: Int = 26

    if(numero > 30){
        println("El número $numero es mayor a 30.")
    } else if(numero > 25) {
        println("El número $numero es mayor a 25.")
    } else {
        println("El número $numero es menor o igual a 25")
    }

    var animal: String = "Gato"

    if(animal == "Perro") {
        println("El animal es un Perro")
    } else if(animal == "Gato"){
        println("El animal es un Gato")

    } else {
        println("El animal no es un Perro ni un Gato. Es un $animal")
    }


}