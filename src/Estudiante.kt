class Estudiante(
    nombre: String,
    apellidos: String,
    Nidentification: String,
    Ecivil: String,
    var Cmatriculacion: String
) : Persona(nombre, apellidos, Nidentification, Ecivil) {

    fun matricularEnNuevoCurso(nuevoCurso: String) {
        Cmatriculacion = nuevoCurso
    }

    override fun imprimirInformacion() {
        super.imprimirInformacion()
        println("Curso Matriculado: $Cmatriculacion")
    }

    companion object {
        fun crearEstudiante(): Estudiante {
            println("Digite su nombre")
            val nombre = readln()
            println("Digite su apellido")
            val apellidos = readln()
            println("Digite su número de identificación")
            val Nidentification = readln()
            println("Digite su estado civil")
            val Ecivil = readln()
            println("Digite el curso en el que está matriculado")
            val Cmatriculacion = readln()

            return Estudiante(nombre, apellidos, Nidentification, Ecivil, Cmatriculacion)
        }
    }
}
