package com.example.nostrafamiglia.repository;
// esto hereda  el JPARepository que permite hacer los CRUD sobre las entidades/tablas de model
// acceso a la base de datos donde se hacen las peticiones o sentencias sin tener que escribirlas
// como una view
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.nostrafamiglia.model.Arma;

@Repository // esto la identifica la clase como repositorio para usarla con autowired en el service o donde se necesite (es solo como ponerle un class o id)
public interface ArmaRepository extends JpaRepository<Arma, Integer> {
}
//Aquí es donde hereda de la clase JpaRepository, que ya viene con muchos métodos útiles como:
//findAll(): devuelve todas las armas.
//findById(1): busca un arma por ID.
//save(rango): guarda o actualiza un arma.
//deleteById(1): elimina un arma por ID.

// se le pueden añadir más como findByMunicion o cosas así