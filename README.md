# 🚀 Proyecto Pagatu - Arquitectura de Microservicios

Repositorio oficial del sistema **Pagatu**, desarrollado bajo una arquitectura orientada a microservicios con Spring Boot, Spring Cloud Config y bases de datos relacionales en PostgreSQL.

---

## 📂 Estructura del Repositorio

* **`infra/pagatu-config`**: Servidor centralizado de configuración (Spring Cloud Config Server) operando en el puerto `18888` con un repositorio local (`config-repo`).
* **`services/pagatu-orden-ms`** (o `pagatu-orden-ms`): Microservicio de gestión de órdenes que actúa como Config Client, conectado dinámicamente a los perfiles de desarrollo y producción.
* **`docs/`**: Carpeta contenedora de capturas de evidencia, diagramas y reportes en PDF de cada sesión.

---

## 🛠️ Tecnologías Utilizadas
* **Java 21**
* **Spring Boot (v4.0.8)**
* **Spring Cloud (Config Server & Config Client)**
* **Spring Actuator & Flyway Migration**
* **PostgreSQL & Docker Compose**