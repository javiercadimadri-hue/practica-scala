object Main extends App {

  
  val jugadores = List("Alex", "Chen", "Marta", "Sindhu", "Luis")
  val puntuaciones = Array(18, 24, 21, 20, 26)
  val puntuacionesRonda2 = Array(22, 19, 20, 21, 17)

  
  def bust(puntuacion: Int): Boolean = {
    puntuacion > 21
  }

  // --- 3.1.8 Función estadoMano ---
  def estadoMano(puntuacion: Int): String = {
    if (bust(puntuacion)) "BUST" else "VALIDA"
  }

  
  def mejorMano(handA: Int, handB: Int): Int = {
    if (bust(handA) && bust(handB)) 0
    else if (bust(handA)) handB
    else if (bust(handB)) handA
    else if (handA >= handB) handA
    else handB
  }

  
  def procesarRondaWhile(nombreRonda: String, pts: Array[Int]): Int = {
    println(s"=== Processing $nombreRonda (versión while) ===")
    var i = 0
    var manosValidas = 0
    var manosBust = 0
    var mejorPuntuacion = 0

    while (i < pts.length) {
      val jugador = jugadores(i)
      val puntuacion = pts(i)
      val estado = estadoMano(puntuacion)

      println(s"$jugador -> $puntuacion ->$estado")

      if (bust(puntuacion)) {
        manosBust += 1
      } else {
        manosValidas += 1
        mejorPuntuacion = mejorMano(mejorPuntuacion, puntuacion)
      }
      i += 1
    }

    println(s"\n--- Resumen de $nombreRonda ---")
    println(s"Jugadores: ${jugadores.length}")
    println(s"Manos válidas: $manosValidas")
    println(s"Bust: $manosBust")
    println(s"Mejor puntuación válida: $mejorPuntuacion\n")

    mejorPuntuacion
  }

  val mejorR1 = procesarRondaWhile("Ronda 1", puntuaciones)


  val mejorR2 = procesarRondaWhile("Ronda 2", puntuacionesRonda2)

  println("=== Comparación Final de Rondas ===")
  println(s"Mejor puntuación de la primera ronda: $mejorR1")
  println(s"Mejor puntuación de la segunda ronda: $mejorR2")

  if (mejorR1 > mejorR2) {
    println("La primera ronda tuvo la mejor puntuación.")
  } else if (mejorR2 > mejorR1) {
    println("La segunda ronda tuvo la mejor puntuación.")
  } else {
    println("Ambas rondas tuvieron la misma mejor puntuación.")
  }
  println()


  println("=== Procesamiento alternativo usando foreach ===")
  jugadores.zip(puntuaciones).foreach { case (jugador, pts) =>
    println(s"$jugador -> $pts ->${estadoMano(pts)}")
  }
}