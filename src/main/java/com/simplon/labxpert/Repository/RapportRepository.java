
package com.simplon.labxpert.Repository;


import com.simplon.labxpert.model.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RapportRepository extends JpaRepository<Rapport, Integer> {

}
