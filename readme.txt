Configuracion inicial:
-Java version "11.0.16.1"
-Gradle 6.2.2

Dependencias:
- Serenity screenplay 3.8.1

Plugins:
-Cucumber for Java
-Gherkin


Pasos para la ejecucion:
-Abrir la terminal en la raiz del proyecto y ejecutar el siguiente comando :
 gradlew clean test -Denvironment=default -Dcucumber.filter.tags="@Compra"

-Luego de la ejecucion el reporte se cuentra en esta ruta :
target/site/serenity/index.html


