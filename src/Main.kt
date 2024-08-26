fun main() {
    while (true) {
        println(
            """
            Bienvenido a la facultad
            Indica qué tipo de persona desea registrar:
            1. Estudiante
            2. Profesor
            3. Personal de servicio
            4. Salir
        """.trimIndent()
        )

        when (readln().toInt()) {
            1 -> {
                val estudiante = Estudiante.crearEstudiante()
                estudiante.imprimirInformacion()
            }

            2 -> {
                val profesor = Profesor.crearProfesor()
                profesor.imprimirInformacion()
            }

            3 -> {
                val personalDeServicio = P_Servicio.crearPersonalDeServicio()
                personalDeServicio.imprimirInformacion()
            }
        }
    }
}
