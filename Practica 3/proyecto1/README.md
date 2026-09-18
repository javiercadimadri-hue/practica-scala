# Mini proyecto 3.1 – Torneo de Twenty-One

## Entorno
- Visual Studio Code
- Metals
- Scala 2.12.21
- JDK 17
- sbt

## Descripción
Este mini proyecto en Scala analiza los resultados de varias rondas de un torneo del juego **Twenty-One** (Blackjack). Identifica las puntuaciones válidas, los jugadores eliminados (*BUST*), evalúa estadísticas por ronda y realiza una comparación cuantitativa entre rondas.

## Funciones utilizadas
- `bust`: Determina si una puntuación dada supera los 21 puntos (retorna `Boolean`).
- `estadoMano`: Evalúa una puntuación y retorna la cadena `"VALIDA"` o `"BUST"`.
- `mejorMano`: Compara dos puntuaciones y devuelve la mayor puntuación válida según las reglas del torneo.

## Ejecución
Desde la terminal del proyecto, ejecuta los siguientes comandos:

```bash
sbt compile
sbt run