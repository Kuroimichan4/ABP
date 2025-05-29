# ABP – Proyecto Final

## La Nostra Famiglia

Una API REST diseñada para gestionar la información de una organización ficticia, conectada a una base de datos remota en un servidor Linux. Esta API permite consultar, registrar y administrar datos sobre miembros, rangos, armas, contactos, servicios y pedidos, y está pensada para integrarse con una web desarrollada en paralelo.

---

## 👥 Integrantes
- Miriam Hernández – [@kuroimichan4](https://github.com/kuroimichan4)
- Daniel García – [@DarksAces](https://github.com/DarksAces)
- Xavier Ortíz – [@Erpiolo](https://github.com/Erpiolo)
- Javier Villena – [@sudoJavi](https://github.com/sudoJavi)

---

## 📝 Descripción del proyecto

**La Nostra Famiglia** es una API desarrollada con Java + Spring Boot y conectada a una base de datos **MySQL** alojada en un servidor Linux.

### Objetivos:
- Facilitar el acceso y gestión de información para una web corporativa.
- Ofrecer operaciones CRUD completas para todas las entidades de la organización.
- Integrar relaciones complejas como encargados de pedidos (contacto o miembro) mediante `ENUM`.

---

## 🌐 Endpoints utilizados

### 📁 Servicios
Obtener todos los servicios:
```bash
GET http://172.17.22.132:8081/lafamiglia/servicios
```
Obtener un servicio por ID:
```bash
GET http://172.17.22.132:8081/lafamiglia/servicios/{id}  
```
Crear nuevo servicio:
```bash
POST http://172.17.22.132:8081/lafamiglia/servicios 
```
Modificar un servicio existente
```bash
PUT http://172.17.22.132:8081/lafamiglia/servicios/{id}  
```
Eliminar un servicio

```bash
DELETE http://172.17.22.132:8081/lafamiglia/servicios/{id}  
```

### 🔫 Armas
```bash
GET     /lafamiglia/armas             → Listar todas las armas
```
```bash
GET     /lafamiglia/armas/{id}        → Ver detalles de un arma
```
```bash
POST    /lafamiglia/armas             → Añadir nueva arma
```
```bash
PUT     /lafamiglia/armas/{id}        → Modificar arma existente
```
```bash
DELETE  /lafamiglia/armas/{id}        → Eliminar arma
```



### 🧑‍🚀 Members
```bash
GET     /api/members                  → Listar todos los miembros
```
```bash
GET     /api/members/{id}             → Ver detalles de un miembro
```
```bash
POST    /api/members                  → Crear miembro
```
```bash
PUT     /api/members/{id}             → Modificar miembro
```
```bash
DELETE  /api/members/{id}             → Eliminar miembro
```



### 🎖️ Rangos
```bash
GET     /lafamiglia/rangos            → Listar todos los rangos
```
```bash
GET     /lafamiglia/rangos/{id}       → Ver detalles de un rango
```
```bash
POST    /lafamiglia/rangos            → Crear nuevo rango
```
```bash
PUT     /lafamiglia/rangos/{id}       → Modificar rango
```
```bash
DELETE  /lafamiglia/rangos/{id}       → Eliminar rango
```



### 📇 Contactos
```bash
GET     /lafamiglia/contactos         → Listar todos los contactos
```
```bash
GET     /lafamiglia/contactos/{id}    → Ver detalles de un contacto
```
```bash
POST    /lafamiglia/contactos         → Crear nuevo contacto
```
```bash
PUT     /lafamiglia/contactos/{id}    → Modificar contacto
```
```bash
DELETE  /lafamiglia/contactos/{id}    → Eliminar contacto
```



### 📦 Pedidos
```bash
GET     /lafamiglia/pedidos           → Listar todos los pedidos
```
```bash
GET     /lafamiglia/pedidos/{id}      → Ver detalles de un pedido
```
```bash
POST    /lafamiglia/pedidos           → Crear nuevo pedido
```
```bash
PUT     /lafamiglia/pedidos/{id}      → Modificar pedido
```
```bash
DELETE  /lafamiglia/pedidos/{id}      → Eliminar pedido
```



### 🕴️ Encargados de Pedido
```bash
GET     /lafamiglia/encargados        → Listar todos los encargados
```
```bash
GET     /lafamiglia/encargados/{id}   → Ver detalles de un encargado
```
```bash
POST    /lafamiglia/encargados        → Crear nuevo encargado
```
```bash
PUT     /lafamiglia/encargados/{id}   → Modificar encargado
```
```bash
DELETE  /lafamiglia/encargados/{id}   → Eliminar encargado
```



### 👤 Usuarios
```bash
GET     /lafamiglia/usuarios          → Listar todos los usuarios
```
```bash
GET     /lafamiglia/usuarios/{id}     → Ver detalles de un usuario
```
```bash
POST    /lafamiglia/usuarios          → Crear nuevo usuario
```
```bash
PUT     /lafamiglia/usuarios/{id}     → Modificar usuario
```
```bash
DELETE  /lafamiglia/usuarios/{id}     → Eliminar usuario
```

---

## 🧩 Tecnologías usadas
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- IntelliJ IDEA



