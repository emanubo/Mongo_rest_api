# Mongo_rest_api
Prueba nexos



1.	Herramientas usadas
	Java
	Spring Boot
	Maven
	MongoDB
	Postman

 







2.	Script base de datos mongo

 

use personas;
db.createCollection("personas");

db.createUser({
    user: "manuel",
    pwd: "123",
    roles: [
        {
            role: "userAdminAnyDatabase",
            db: "admin"
        },
        "readWriteAnyDatabase"
    ],
});




db.personas.insertMany([
  {
    "nombre" : "manuel",
    "documento" : "111111",
    "edad" : "36",
	"parentesco" : "hijo"
  },
  {
    "nombre" : "juan",
    "documento" : "22222",
    "edad" : "72",
	"parentesco" : "padre"
  },
  {
    "nombre" : "laura",
    "documento" : "33333",
    "edad" : "38",
	"parentesco" : "hermana"
  }
]);

3.	Project Structure

 





4.	Aplicación

   


5.	Pruebas ejecutadas a microservicios.

GET


 








POST


 

PUT

 




PROBAR EL SERVICIO GET PARA OBTENER UNA CATEGORÍA POR ID

 
DELETE

 
6.	Download Source Code  
https://github.com/emanubo/Mongo_rest_api

Gracias !

