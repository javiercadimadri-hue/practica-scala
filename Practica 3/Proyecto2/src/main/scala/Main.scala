object Main extends App {

  // --- Datos iniciales ---
  val estudiantes = List("Ana", "Luis", "Marta", "Pedro", "Sofia")
  val notas = Array(8, 4, 10, 6, 3)

  // --- Función aprobado ---
  def aprobado(nota: Int): Boolean = {
    nota >= 5
  }

  // --- Función estadoNota ---
  def estadoNota(nota: Int): String = {
    if (aprobado(nota)) "APROBADO" else "SUSPENSO"
  }

  // --- Función maxNota ---
  def maxNota(a: Int, b: Int): Int = {
    if (a >= b) a else b
  }

  // --- Función clasificacion ---
  def clasificacion(nota: Int): String = {
    if (nota >= 9) "EXCELENTE"
    else if (nota >= 7) "NOTABLE"
    else if (nota >= 5) "APROBADO"
    else "SUSPENSO"
  }

  // --- Función para analizar evaluaciones ---
  def analizarEvaluacion(nombreEvaluacion: String, listaEstudiantes: List[String], arregloNotas: Array[Int]): (Int, Int) = {
    println(s"=== $nombreEvaluacion ===")

    var i = 0
    var aprobadosCount = 0
    var suspensosCount = 0
    var notaMax = 0

    while (i < arregloNotas.length) {
      val estudiante = listaEstudiantes(i)
      val nota = arregloNotas(i)
      val estado = estadoNota(nota)

      println(s"$estudiante -> $nota -> $estado")

      if (aprobado(nota)) {
        aprobadosCount += 1
      } else {
        suspensosCount += 1
      }

      notaMax = maxNota(notaMax, nota)
      i += 1
    }

    println(s"\n--- Resumen del grupo ($nombreEvaluacion) ---")
    println(s"Estudiantes: ${listaEstudiantes.length}")
    println(s"Aprobados: $aprobadosCount")
    println(s"Suspensos: $suspensosCount")
    println(s"Mejor nota: $notaMax")

    println("\nClasificación cualitativa:")
    var j = 0
    while (j < arregloNotas.length) {
      val e = listaEstudiantes(j)
      val n = arregloNotas(j)
      println(s"$e -> $n -> ${clasificacion(n)}")
      j += 1
    }
    println()

    (notaMax, aprobadosCount)
  }

  // Ejecución Primera Evaluación
  val (maxEv1, aprobadosEv1) = analizarEvaluacion("Primera Evaluación", estudiantes, notas)

  // Ejecución Segunda Evaluación
  val notasSegundaEvaluacion = Array(9, 5, 8, 7, 6)
  val (maxEv2, aprobadosEv2) = analizarEvaluacion("Segunda Evaluación", estudiantes, notasSegundaEvaluacion)

  // Comparación de Evaluaciones
  println("=== Comparación de Evaluaciones ===")
  println(s"Mejor nota de la primera evaluación: $maxEv1")
  println(s"Mejor nota de la segunda evaluación: $maxEv2")
  println(s"Número de aprobados de la primera: $aprobadosEv1")
  println(s"Número de aprobados de la segunda: $aprobadosEv2")

  if (aprobadosEv2 > aprobadosEv1) {
    println("El grupo ha mejorado.")
  } else if (aprobadosEv2 < aprobadosEv1) {
    println("El grupo ha empeorado.")
  } else {
    println("El grupo se ha mantenido igual.")
  }
  println()

  // Operaciones con Listas
  println("=== 3.2.15 Operaciones con Listas ===")
  val nuevosEstudiantes = "Carlos" :: estudiantes

  println(s"Lista original: $estudiantes")
  println(s"Nueva lista (con Carlos): $nuevosEstudiantes")
}