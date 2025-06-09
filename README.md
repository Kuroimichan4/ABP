# ABP – Proyecto Final La Nostra Famiglia

## 👥 Integrantes
- Miriam Hernández – [@kuroimichan4](https://github.com/kuroimichan4)
- Daniel García – [@DarksAces](https://github.com/DarksAces)
- Xavier Ortíz – [@Erpiolo](https://github.com/Erpiolo)
- Javier Villena – [@sudoJavi](https://github.com/sudoJavi)

---

## 📝 Descripción del proyecto La Nostra Famiglia

La Nostra Famiglia es una API REST desarrollada con Java + Spring Boot y conectada a una base de datos MySQL alojada en un servidor Linux. Esta API permite consultar, registrar y administrar datos sobre miembros, rangos, armas, contactos, servicios y pedidos, y está pensada para integrarse con una web desarrollada en paralelo.

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
Obtener todas las armas
```bash
GET     http://172.17.22.132:8081/lafamiglia/armas           
```
Ver detalles de un arma
```bash
GET    http://172.17.22.132:8081 /lafamiglia/armas/{id}       
```
Añadir nueva arma
```bash
POST    http://172.17.22.132:8081/lafamiglia/armas             
```
Modificar arma existente
```bash
PUT     http://172.17.22.132:8081/lafamiglia/armas/{id}        
```
Eliminar arma
```bash
DELETE  http://172.17.22.132:8081/lafamiglia/armas/{id}        
```



### 🧑‍🚀 Members
Obtener todos los miembros
```bash
GET     http://172.17.22.132:8081/lafamiglia/members                 
```
Ver detalles de un miembro
```bash
GET     http://172.17.22.132:8081/lafamiglia/members/{id}           
```
Crear miembro
```bash
POST    http://172.17.22.132:8081/lafamiglia/members                 
```
Modificar miembro
```bash
PUT     http://172.17.22.132:8081/lafamiglia/members/{id}            
```
Eliminar miembro
```bash
DELETE  http://172.17.22.132:8081/lafamiglia/members/{id}             
```



### 🎖️ Rangos
Listar todos los rangos
```bash
GET     http://172.17.22.132:8081/lafamiglia/rangos         
```
Ver detalles de un rango
```bash
GET     http://172.17.22.132:8081/lafamiglia/rangos/{id}     
```
Crear nuevo rango
```bash
POST    http://172.17.22.132:8081/lafamiglia/rangos          
```
Modificar rango
```bash
PUT     http://172.17.22.132:8081/lafamiglia/rangos/{id}     
```
Eliminar rango
```bash
DELETE  http://172.17.22.132:8081/lafamiglia/rangos/{id}  
```



### 📇 Contactos
Obtener todos los contactos
```bash
GET     http://172.17.22.132:8081/lafamiglia/contactos    
```
Ver detalles de un contacto
```bash
GET     http://172.17.22.132:8081/lafamiglia/contactos/{id}    
```
Crear nuevo contacto
```bash
POST    http://172.17.22.132:8081/lafamiglia/contactos         
```
Modificar contacto
```bash
PUT     http://172.17.22.132:8081/lafamiglia/contactos/{id}     
```
Eliminar contacto
```bash
DELETE  http://172.17.22.132:8081/lafamiglia/contactos/{id}    
```



### 📦 Pedidos
Obtener todos los pedidos
```bash
GET     http://172.17.22.132:8081/lafamiglia/pedidos    
```
Ver detalles de un pedido
```bash
GET     http://172.17.22.132:8081/lafamiglia/pedidos/{id}      
```
Crear nuevo pedido
```bash
POST    http://172.17.22.132:8081/lafamiglia/pedidos          
```
Modificar pedido
```bash
PUT     http://172.17.22.132:8081/lafamiglia/pedidos/{id}     
```
Eliminar pedido
```bash
DELETE  http://172.17.22.132:8081/lafamiglia/pedidos/{id}    
```



### 🕴️ Encargados de Pedido
Obtener todos los pedidos
```bash
GET     http://172.17.22.132:8081/lafamiglia/encargados        
```
Ver detalles de un encargado
```bash
GET     http://172.17.22.132:8081/lafamiglia/encargados/{id} 
```
Crear nuevo encargado
```bash
POST    http://172.17.22.132:8081/lafamiglia/encargados    
```
Modificar encargado
```bash
PUT     http://172.17.22.132:8081/lafamiglia/encargados/{id} 
```
Eliminar encargado
```bash
DELETE  http://172.17.22.132:8081/lafamiglia/encargados/{id}  
```



### 👤 Usuarios
Listar todos los usuarios
```bash
GET     http://172.17.22.132:8081/lafamiglia/usuarios        
```
Ver detalles de un usuario
```bash
GET     http://172.17.22.132:8081/lafamiglia/usuarios/{id}     
```
Crear nuevo usuario
```bash
POST    http://172.17.22.132:8081/lafamiglia/usuarios  
```
Modificar usuario
```bash
PUT     http://172.17.22.132:8081/lafamiglia/usuarios/{id}  
```
Eliminar usuario
```bash
DELETE  http://172.17.22.132:8081/lafamiglia/usuarios/{id}    
```

---

## 🧩 Tecnologías usadas
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- IntelliJ IDEA



