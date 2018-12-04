# Conexion por Heroku
[![Heroku link](https://www.herokucdn.com/deploy/button.png)](https://infinite-eyrie-66800.herokuapp.com/)

### Documento de arquitectura
## Introduccion
- Para este parcial, en el cual necesitabamos crear un API Rest el cual debia realizar el cambio entre grados Celsius y grados Fahrenheit, debiamos utilizar lenguajes como Java, javascript, axios, html y el conocimiento en MVC y de como generar un API correctamente estructurado, entonces para esto, utilizamos las formulas dadas para el intercambio entre mediciones de temperaturas y lo debiamos implementar en la persistencia, al realizar esta implementacion correctamente, accediamos a implementar el controlador en el cual los mensajes que obteniamos de el intercambio de temperaturas y la temperatura que se queria cambiar los convertiamos en objetos JSon para que despues pudieran ser correctamente analisados y usados por cualquier externo.
Al ya tener los mensajes correctamente formateados con Json procediamos a realizar la pagina HTML la cual debia tener dos campos los cuales permitieran hacer los intercambios de temperatura, para realizar estos cambios, debiamos conectar el controlador con la pagina web mediante peticiones HTTP en este caso peticiones GET, por lo tanto para realizar estas peticiones, utilizamos axios, el cual recibe un response la cual en este caso es el codigo Json del API que ya habiamos generado. Al ya tener el codigo obtenido de la API procediamos a mostrarlo en la pagina web en los campos dados.

## Pruebas
- Implementacion de los cambios de temperatura en la persistencia.
- Implementacion del controlador con sus respectivas direccione o path.
- Implementacion del archivo javascript con las peticiones get con axios.
- Pagina HTML funcionando correctamente, se muestra como usar el API y la forma de obtener los datos mendiante la URL del API REST.
- El correct codigo Json que se debe mostrar cuando la peticion se realize mediante navegador.
