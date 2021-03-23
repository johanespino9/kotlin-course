package `04`.FuncionesEnKotlin

import java.util.*

fun main() {
    // Casos Practicos

    // Elaborar un perfil profesional dinamico
    // Hallar los años de experiencia a partir de ingresar
    // el año en que empezo a trabajar

    // Plantilla:
    // Diseñador Grafico con 4 años de experiencia en
    // la industria Automotriz. Con conocimientos en
    // Illustrator, Photoshop y Premiere. Con capacidad
    // de liderar equipos, responsable y proactivo.

    var puesto = ""
    var anioDeInicioLaboral = 0
    var industria = ""
    var conocimiento1 = ""
    var conocimiento2 = ""
    var conocimiento3 = ""
    var habilidad1 = ""
    var habilidad2 = ""
    var habilidad3 = ""
    var aniosDeExperiencia = 0
    var perfilProfesional = ""

    fun solicitarDatos(){
        println("Ingrese el nombre del puesto: ")
        puesto = readLine().toString()

        println("Ingrese el año en el que empezo a trabajar: ")
        anioDeInicioLaboral = Integer.valueOf(readLine())

        println("Ingrese la industria en la cual trabajó: ")
        industria = readLine().toString()

        println("Ingrese el primer conocimiento: ")
        conocimiento1 = readLine().toString()

        println("Ingrese el segundo conocimiento: ")
        conocimiento2 = readLine().toString()

        println("Ingrese el tercer conocimiento: ")
        conocimiento3 = readLine().toString()

        println("Ingrese la primer habilidad: ")
        habilidad1 = readLine().toString()

        println("Ingrese la segunda habilidad: ")
        habilidad2 = readLine().toString()

        println("Ingrese la tercera habilidad: ")
        habilidad3 = readLine().toString()
    }

    fun generarPerfil(puesto: String, anios: Int, industria: String, conocimiento1: String, conocimiento2: String, conocimiento3: String, habilidad1: String, habilidad2: String, habilidad3: String): String {


        return "$puesto con $anios años de experiencia en la industria\n" +
                "$industria. Con conocimientos en $conocimiento1, $conocimiento2 y $conocimiento3.\n" +
                " Con capacidad de $habilidad1, $habilidad2 y $habilidad3"
    }

    fun obtenerAniosDeExperiencia(anioDeInicioLaboral: Int) : Int{
        return 2021 - anioDeInicioLaboral
    }
    fun imprimirPlantilla(plantilla: String){
        println(plantilla)
    }


    solicitarDatos()
    aniosDeExperiencia = obtenerAniosDeExperiencia(2012)
    perfilProfesional = generarPerfil(puesto,aniosDeExperiencia,industria, conocimiento1, conocimiento2, conocimiento3,habilidad1,habilidad2,habilidad3)
    imprimirPlantilla(perfilProfesional)

}