# Mini Proyecto 3.2 – Analizador de Calificaciones de un Grupo

## Entorno de trabajo
- IntelliJ IDEA Community
- Plugin de Scala
- Scala 2.12.21
- JDK 17
- sbt

## Descripción del programa
Aplicación en Scala desarrollada para evaluar de forma cuantitativa y cualitativa las notas de un grupo de estudiantes a lo largo de dos evaluaciones. Analiza estados individuales, calcula métricas globales, clasifica por rangos e imparte comparativas entre distintas rondas de evaluación.

## Funciones creadas
- `aprobado(nota: Int): Boolean`: Determina si una nota es igual o superior a 5.
- `estadoNota(nota: Int): String`: Retorna `"APROBADO"` o `"SUSPENSO"` usando `aprobado`.
- `maxNota(a: Int, b: Int): Int`: Retorna la calificación máxima entre dos enteros.
- `clasificacion(nota: Int): String`: Clasifica cualitativamente según rango:
  - 9 o 10 -> `EXCELENTE`
  - 7 u 8 -> `NOTABLE`
  - 5 o 6 -> `APROBADO`
  - 0 a 4 -> `SUSPENSO`

## Colecciones utilizadas
- `List[String]`: Lista inmutable para almacenar los nombres de los alumnos.
- `Array[Int]`: Arreglo para manejar las notas correspondientes de cada evaluación.

## Explicación de la Inmutabilidad de Listas (Sección 3.2.15)
Al ejecutar la operación `val nuevosEstudiantes = "Carlos" :: estudiantes`, la lista original `estudiantes` **no sufre ninguna modificación**. 

Esto sucede porque en Scala la estructura `List` es **inmutable por diseño**. La operación `::` (cons) crea una nueva estructura de lista en memoria que antepone el elemento `"Carlos"` y apunta mediante referencias a la lista existente, garantizando seguridad en el manejo de estado sin alterar los datos originales.

## Problemas presentados y solución
1. **Desalineación de colecciones:** La iteración paralela entre la lista de nombres y el array de notas requería control riguroso de límites.
   - *Solución:* Se usaron bucles `while` guiados por `arregloNotas.length` asegurando índices coincidentes sin excepciones.
2. **Duplicación de código:** El reporte de la segunda evaluación requería las mismas métricas que la primera.
   - *Solución:* Se encapsuló la lógica de procesamiento estadístico y despliegue dentro de la función `analizarEvaluacion` reduciendo el código redundante.