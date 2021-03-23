package `04`.FuncionesEnKotlin

fun main() {
    // Funciones con parametros de salida
    var mensaje: String = ""

    fun saludar(nombre: String) : String{

        return "Hola, como estas? Soy $nombre"
    }

    fun despedirse(nombre: String) : String {
        return "Adios, nos vemos pronto $nombre"
    }

    mensaje = saludar("Jose")
    println(mensaje)
    mensaje = despedirse("Eduardo")
    println(mensaje)
}