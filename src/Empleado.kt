open class Empleado(
    nombre: String,
    apellidos: String,
    Nidentification: String,
    Ecivil: String,
    var Aincorporation: Int,
    var Ndespacho: Int
) : Persona(nombre, apellidos, Nidentification, Ecivil) {

    fun reasignarDespacho(nuevoDespacho: Int) {
        Ndespacho = nuevoDespacho
    }

    override fun imprimirInformacion() {
        super.imprimirInformacion()
        println("Año de Incorporación: $Aincorporation, Número de Despacho: $Ndespacho")
    }
}
