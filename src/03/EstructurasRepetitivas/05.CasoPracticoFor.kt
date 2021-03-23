package `03`.EstructurasRepetitivas

fun main() {
    // Casos Practicos
    // FOR

    // Un programa que permita ingresar una frase u oracion y que
    // haga un conteo de las vocales que contiene dicha frase.
    // Ademas, mencionaremos las vocales que se estan empleando

    var frase: String = ""
    var sumaVocales = 0
    print("Ingrese una frase u oracion: ")
    frase = readLine().toString()


    for (i in frase){
        if(i in "aeiouAEIOU"){
            sumaVocales++
            println("$i ")
        }
    }
    println("Cantidad de vocales en esta frase: $sumaVocales")

}