
package com.simplon.labxpert.Repository;


import com.simplon.labxpert.model.Echantillon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EchantillonRepository extends JpaRepository<Echantillon, Integer> {

}