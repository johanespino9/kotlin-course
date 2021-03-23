package `04`.FuncionesEnKotlin

fun main() {
    // Funciones con parametros de entrada


    fun imprimirNombre(nombre:  String){
        println("Hola, me llamo $nombre.")
    }

    fun imprimirApellido(apellido: String){
        println("Hola, mi apellido es $apellido")
    }

    fun saludar(){
        imprimirNombre("Juan")
        imprimirApellido("Perez")
    }

    saludar()


}