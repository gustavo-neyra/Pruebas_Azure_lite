 ### Bienvenidos

Proyecto Java con Graddle, utilizando herramienta Cucumber para pruebas funcionales. 
Ejecución remota a través de Browserstack.

Para editar las variables de los casos de prueba acceder a la ruta src\test\resources\data en donde se encuentran los archivos JSON asociados a los casos de prueba
Se recomienda no cambiar los datos de user y pass en los archivos JSON, ya que estos son utilizados para la ejecución de las pruebas en los mercados correspondientes. 

Se dejá como respaldo la información de datos user y pass en el archivo JSON dataBackupUsers en el directorio raíz.


Tasks disponibles para ejecución:
- smokeTests - 8 test end to end para pruebas funcionales asociadas a los Json que incluyen la palabra "smokeTest"
- regresion - 36 test end to end para pruebas funcionales asociadas a los Json que incluyen la palabra "regresion"
- fastRegresion - 18 test end to end para pruebas funcionales asociadas a los Json que incluyen la palabra "regresion" donde solo se consideran los primeros 4 casos por cada Json

Ejemplo ejecución por consola de bitrise:

gradle :smokeTests 
gradle :regresion
gradle :fastRegresion
