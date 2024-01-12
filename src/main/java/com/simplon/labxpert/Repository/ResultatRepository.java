

package com.simplon.labxpert.Repository;


import com.simplon.labxpert.model.Resultat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultatRepository extends JpaRepository<Resultat, Integer> {

}