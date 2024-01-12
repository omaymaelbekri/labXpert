




package com.simplon.labxpert.Repository;


import com.simplon.labxpert.model.Reactif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactifRepository extends JpaRepository<Reactif, Integer> {

}
