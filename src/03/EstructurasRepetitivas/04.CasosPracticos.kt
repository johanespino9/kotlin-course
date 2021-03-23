package `03`.EstructurasRepetitivas

fun main() {
    // Casos Practicos

    // Realizar un programa que permita ingresar N numeros
    // hasta que se ingrese un numero negativo. Además, se debe
    // hallar la suma de los numeros ingresados, excepto el
    // numero negativo.

    var numero = 0
    var suma = 0

//    while (numero >= 0){
//        suma += numero
//        print("Ingrese un numero: ")
//        numero = Integer.valueOf(readLine())
//    }
//    println("La suma de los numeros ingresados es: $suma")

    // DO WHILE

    // Crear un programa que permita ingresar n cantidad de numeros
    // y que se halle cuantos de estos numeros son pares.

    var cantidadNumeros = 0
    var cantidadPares = 0
    var numeroIngresado = 0
    var contador = 0

    print("Ingrese la cantidad de numeros a evaluar: ")
    cantidadNumeros = Integer.valueOf(readLine())
    do {

        print("Ingrese un numero: ")
        numeroIngresado = Integer.valueOf(readLine())
        // Sabemos que un numero par es el cual al dividir entre 2
        // nos da como resto 0.
        if(numeroIngresado % 2 == 0){
            // Es numero par
            cantidadPares++
        }
        contador++

    } while (contador < cantidadNumeros)

    println("La cantidad de numero pares es: $cantidadPares")
}