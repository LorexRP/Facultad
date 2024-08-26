class P_Servicio(
    nombre: String,
    apellidos: String,
    Nidentification: String,
    Ecivil: String,
    Aincorporation: Int,
    Ndespacho: Int,
    var seccion: String
) : Empleado(nombre, apellidos, Nidentification, Ecivil, Aincorporation, Ndespacho) {

    fun trasladarSeccion(nuevaSeccion: String) {
        seccion = nuevaSeccion
    }

    override fun imprimirInformacion() {
        super.imprimirInformacion()
        println("Sección: $seccion")
    }

    companion object {
        fun crearPersonalDeServicio(): P_Servicio {
            println("Digite su nombre")
            val nombre = readln()
            println("Digite su apellido")
            val apellidos = readln()
            println("Digite su número de identificación")
            val Nidentification = readln()
            println("Digite su estado civil")
            val Ecivil = readln()
            println("Digite su año de incorporación")
            val Aincorporation = readln().toInt()
            println("Digite su número de despacho")
            val Ndespacho = readln().toInt()
            println("A qué sección pertenece")
            val seccion = readln()

            return P_Servicio(nombre, apellidos, Nidentification, Ecivil, Aincorporation, Ndespacho, seccion)
        }
    }
}
