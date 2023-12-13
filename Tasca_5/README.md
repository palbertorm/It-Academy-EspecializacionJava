Compilar un proyecto Maven.

Desde la terminal ubicarse en la carpeta del proyecto y ejecutar los siguientes comandos:

    ss tu sistema no reconoce el comando MVN, verifica si lo tienes, en caso de no tener, descarcarlo en la pagina oficialde MAVEN:
    mvn -version
    https://maven.apache.org/download.cgi
    En el archivo de configuración, añade la siguiente línea:
    export PATH=$PATH:/ruta/a/maven/bin
    por ultimo, refresca tu terminal:
    source ~/.zshrc
    Remueve los .class generados (si existen), descargará las librerías según lo que se haya definido en las dependencias del pom.xml
    mvn clean
    Compila nuestro código. De los .java genera los .class.
    mvn compile
    Compila las pruebas.
    mvn test-compile
    Ejecuta las pruebas.
    mvn test
    Genera los archivos jar o war, según lo que se haya definido en el pom.xml
    mvn install
