## Configuración e Instalación del Entorno 2: Visual Studio Code y Metals

### Descripción del Entorno

Para el segundo entorno de desarrollo se seleccionó Visual Studio Code en combinación con el servidor de lenguaje Metals. Esta alternativa ligera permite trabajar con Scala mediante una arquitectura basada en extensiones, manteniendo la gestión de dependencias a través de sbt.

### Pasos de Configuración e Instalación

1. **Instalación de Visual Studio Code y la Extensión Scala (Metals)**
   Se instaló el editor Visual Studio Code y se añadió la extensión oficial "Scala (Metals)" desde el mercado de extensiones. Esta herramienta proporciona soporte de autocompletado, navegación de código, refactorización y diagnóstico de errores en tiempo real.

2. **Importación e Indexación del Proyecto sbt**
   Al abrir la carpeta raíz del proyecto en Visual Studio Code, la extensión Metals detectó automáticamente el archivo `build.sbt`. Se seleccionó la opción de importar la construcción del proyecto (*Import build*), lo que inició el proceso de descarga de dependencias e indexación de la versión de Scala especificada (`2.12.21`).

3. **Verificación de la Estructura y Código Fuente**
   Se comprobó que la estructura del proyecto (`src/main/scala`) fuera reconocida correctamente por el servidor de lenguaje y que el archivo `Main.scala` no presentara advertencias de compilación ni errores de sintaxis.

### Ejecución del Programa

4. **Ejecución Directa mediante CodeLens (Interfaz)**
   Una vez finalizada la indexación de Metals, se utilizó el botón interactivo `run` que aparece sobre la definición del objeto o método principal dentro del archivo `Main.scala`, ejecutando la aplicación directamente en la consola integrada.

5. **Ejecución mediante la Terminal de VS Code (`sbt run`)**
   Como método alternativo, se abrió la terminal integrada de Visual Studio Code en la ruta del proyecto y se ejecutó el comando `sbt run` para compilar y lanzar la aplicación desde la línea de comandos de sbt.