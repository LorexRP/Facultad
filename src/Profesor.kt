class Profesor(
    nombre: String,
    apellidos: String,
    Nidentificacion: String,
    Ecivil: String,
    Aincorporation: Int,
    Ndespacho: Int,
    var departamento: String
) : Empleado(nombre, apellidos, Nidentificacion, Ecivil, Aincorporation, Ndespacho) {

    fun cambiarDepartamento(nuevoDepartamento: String) {
        departamento = nuevoDepartamento
    }

    override fun imprimirInformacion() {
        super.imprimirInformacion()
        println("Departamento: $departamento")
    }

    companion object {
        fun crearProfesor(): Profesor {
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
            println("A qué departamento pertenece")
            val departamento = readln()

            return Profesor(nombre, apellidos, Nidentification, Ecivil, Aincorporation, Ndespacho, departamento)
        }
    }
}
