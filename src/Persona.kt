open class Persona(
    val nombre: String,
    val apellidos: String,
    val Nidentification: String,
    var Ecivil: String
) {
    fun cambiarEstadoCivil(nuevoEstadoCivil: String) {
        Ecivil = nuevoEstadoCivil
    }

    open fun imprimirInformacion() {
        println("Nombre: $nombre $apellidos, ID: $Nidentification, Estado Civil: $Ecivil")
    }
}
