# Conexion por Heroku
[![Heroku link](https://www.herokucdn.com/deploy/button.png)](https://infinite-eyrie-66800.herokuapp.com/)

# Documento de arquitectura
## Introduccion
- Para este parcial, en el cual necesitabamos crear un API Rest el cual debia realizar el cambio entre grados Celsius y grados Fahrenheit, debiamos utilizar lenguajes como Java, javascript, axios, html y el conocimiento en MVC y de como generar un API correctamente estructurado, entonces para esto, utilizamos las formulas dadas para el intercambio entre mediciones de temperaturas y lo debiamos implementar en la persistencia, al realizar esta implementacion correctamente, accediamos a implementar el controlador en el cual los mensajes que obteniamos de el intercambio de temperaturas y la temperatura que se queria cambiar los convertiamos en objetos JSon para que despues pudieran ser correctamente analisados y usados por cualquier externo.
Al ya tener los mensajes correctamente formateados con Json procediamos a realizar la pagina HTML la cual debia tener dos campos los cuales permitieran hacer los intercambios de temperatura, para realizar estos cambios, debiamos conectar el controlador con la pagina web mediante peticiones HTTP en este caso peticiones GET, por lo tanto para realizar estas peticiones, utilizamos axios, el cual recibe un response la cual en este caso es el codigo Json del API que ya habiamos generado. Al ya tener el codigo obtenido de la API procediamos a mostrarlo en la pagina web en los campos dados.

## Pruebas
- Implementacion de los cambios de temperatura en la persistencia.
![alt text](https://github.com/ARSWCamiloLopez/Parcial3Corte/blob/master/screenshots/Screenshot%20from%202018-12-04%2011-34-19.png)
![alt text](https://github.com/ARSWCamiloLopez/Parcial3Corte/blob/master/screenshots/Screenshot%20from%202018-12-04%2011-34-46.png)
- Implementacion del controlador con sus respectivas direccione o path.
![alt text](https://github.com/ARSWCamiloLopez/Parcial3Corte/blob/master/screenshots/Screenshot%20from%202018-12-04%2011-35-48.png)
![alt text](https://github.com/ARSWCamiloLopez/Parcial3Corte/blob/master/screenshots/Screenshot%20from%202018-12-04%2011-36-05.png)
- Implementacion del archivo javascript con las peticiones get con axios.
![alt text](https://github.com/ARSWCamiloLopez/Parcial3Corte/blob/master/screenshots/Screenshot%20from%202018-12-04%2011-36-25.png)
- Pagina HTML funcionando correctamente, se muestra como usar el API y la forma de obtener los datos mendiante la URL del API REST.
![alt text](https://github.com/ARSWCamiloLopez/Parcial3Corte/blob/master/screenshots/Screenshot%20from%202018-12-04%2011-37-22.png)
- El correcto codigo Json que se debe mostrar cuando la peticion se realize mediante navegador.
![alt text](https://github.com/ARSWCamiloLopez/Parcial3Corte/blob/master/screenshots/Screenshot%20from%202018-12-04%2011-38-03.png)
## Limitaciones de arquitectura
- Esta arquitectura en este caso esta limitada al cambio de dos temperaturas las cuales son Celsius y Fahrenheit, no tiene ningun tipo de extension para otras temperaturas futuras, pero con la correxta implementacion de las clases, el correcto empaquetado de las mismas y la buena documentacion con la que cuenta la arquitectura se puede extender facilmente implementando los metodos que se requieran para un nuevo cambio de temperatura.
## Atributos de calidad
- Esta arquitectura cuenta con el model MVC el cual esta correctamente implementado, cada una de las clases, metodos y atributos tienen nombres concretos los cuales nos dan la facilidad de saber que hace o a que se refiere cada uno de estos. Los metodos de esta arquitectura estan debidamente documentados para la persona que se quiera informar acerca del proyecto. La pagina HTML es amigable con el usuario, es explicita con el usuario y la funcionalidad esta implementada correctamente, el API que se usa para este caso esta con un formato Json correcto y existe la manera de implementar el API en otras arquitecturas mediante una URL que esta dispoinible en la pagina.
## Conclusiones
- Para realizar este tipo de arquitecturas y de paginas es necesario un poco de conocimiento sobre todas estas tecnologias de las que se hablaron en este documento, pero, con este conocimiento y un poco de creatividad se pueden realizar APIs como la que acabamos de observar, que son muy uties y tienen extensibilidad facil para otras arquitecturas. Entonces, el conocimiento de estas tecnologias nos abre las puertas para crear apliaciones web sencillas y bastante utiles, hasta poder implementarlas en paginas o aplicaciones web mas complejas pero a la vez de un uso mas detallado.
