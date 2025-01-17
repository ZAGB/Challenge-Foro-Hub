# 🚀 Proyecto API - Foro Hub - Grupo 7 

**Creado por:**  Zujeily Gonzalez Barrantes 

## 🛠 Tecnologías Utilizadas

- **Lenguaje**: Java 23 ☕
- **Framework**: Spring Boot 3.0 🌱
- **Base de Datos**: MySQL 8.0 🐬
- **Seguridad**: JSON Web Tokens (JWT) 🔐
- **Herramientas de Construcción**: Maven 4.0.0 📦

## 🛠️ Dependencias del Proyecto

- **🔗 Lombok** - Simplifica la creación de código repetitivo como getters, setters y constructores.  
- **🌐 Spring Web** - Framework para desarrollar aplicaciones web y APIs RESTful.  
- **⚡ Spring Boot DevTools** - Proporciona herramientas para desarrollo rápido, como recarga automática.  
- **📂 Spring Data JPA** - Acceso simplificado a bases de datos relacionales utilizando JPA.  
- **🛫 Flyway Migration** - Herramienta para migraciones de base de datos y versionado.  
- **🐬 MySQL Driver** - Conector para interactuar con bases de datos MySQL.  
- **✔️ Validation** - Manejo de validaciones para entradas y datos de usuario.  
- **🛡️ Spring Security** - Framework para autenticar, autorizar y proteger aplicaciones.

 ## Descripcion:

 El objetivo de este proyecto final es crear un API REST y implementar seguridad a la misma para ello tenemos el ForoHub, el foro es una aplicación desarrollada con Spring donde se simula el funcionamiento de un foro de ayuda, Mi implementacion contiene dos tablas. Topicos y usuarios.

## 🌟 Funcionalidades del API REST
### 🧑‍💻 Usuario/Autenticación y Autorización:-
- **Inicio de sesión:** - Genera un token JWT para autenticar al usuario y permitirle acceder a los recursos protegidos del sistema.
- **Roles y permisos:** - Define roles (e.g. usuario) y restringe el acceso a ciertas funcionalidades.
- **Gestión de autenticación:** - Valida tokens JWT en cada solicitud protegida. Administra la renovacion y expiracion tokens.


### 📚 Tópicos
- **Crear un nuevo tópico:** - Permite a los usuarios crear un nuevo tópico con un título y contenido.
- **Obtener lista de tópicos:** - Devuelve todos los tópicos publicados, con opciones de paginación.
- **Obtener detalles de un tópico:** - Retorna los detalles completos de un tópico especifico, incluyendo autor, curso y fecha de creación.
- **Actualizar un tópico:** - Permite editar el contenido de un tópico existente.
- **Eliminar un tópico:** - Borra un topico especifico de la base de datos.

## Endpoints

## 📋 Endpoints de la API

| Método | Endpoint          | Descripción                                         |
|--------|-------------------|-----------------------------------------------------|
| POST   | `/topicos`        | Permite crear un nuevo tópico                       |
| GET    | `/topicos`        | Se utiliza para listar todos los tópicos           |
| GET    | `/topicos/{id}`   | Realiza consultas a un tópico específico            |
| PUT    | `/topicos/{id}`   | Actualiza un tópico existente                       |
| DELETE | `/topicos/{id}`   | Sirve para eliminar un tópico                       |
| POST   | `/login`          | Permite autenticar a un usuario y generar un token |
