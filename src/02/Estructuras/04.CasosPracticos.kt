package `02`.Estructuras

fun main() {
    // Ingresar 3 notas de un estudiantes y hallar el promedio
    // de dichas notas. Luego, tenemos que imprimir el estado del alumno
    // según su promedio.
    // Si es mayor a 17 es Sobresaliente
    // Si es mayor a 12 y menor igual a 17 es Regular
    // Si es menor a 12 es Reprobado

    var nota1 = Integer.valueOf(readLine())
    var nota2 = Integer.valueOf(readLine())
    var nota3 = Integer.valueOf(readLine())
    var suma = nota1 + nota2 + nota3
    var promedio = suma/3

    var estadoAlumno = ""
    if(promedio > 17){
        estadoAlumno = "Sobresaliente"
    } else if(promedio > 12) {
        estadoAlumno = "Regular"
    } else {
        estadoAlumno = "Reprobado"
    }

    println("La nota número 1 es: $nota1")
    println("La nota número 2 es: $nota2")
    println("La nota número 3 es: $nota3")
    println("La suma es: $suma")
    println("El promedio es: $promedio")
    println("El alumno es: $estadoAlumno")
}