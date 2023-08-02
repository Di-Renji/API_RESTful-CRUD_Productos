# API RESTful - CRUD Productos


Desarrollo de una API RESTful de un CRUD de Productos, hecha con Java y SpringBoot.

Para la creación del proyecto use la siguientes características:

- Lenguaje: Java
- JDK: 17
- MAVEN: 3.1.2

Se usaron las siguientes dependencias:

- Spring Web
- MySQL Driver
- Lombok
- Spring Data JPA
- Spring Boot Dev Tools

## Empezando

Si desea tener el proyecto completo puede clonar el repositorio, pero si quiere tener la plantilla del proyecto creado con todas las características, puede descargar el archivo "Productos.zip" que se encuentra en el mismo repositorio.

Para la creación de la Base de Datos necesitará el siguiente script en MySQL:



```
CREATE DATABASE bd_apirestful_productos;
USE bd_apirestful_productos

```

La configuracion del "application.properties":

```
spring.datasource.url=jdbc:mysql://localhost/bd_apirestful_productos
spring.datasource.username=root
spring.datasource.password=

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true

```
