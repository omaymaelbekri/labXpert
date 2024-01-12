
package com.simplon.labxpert.Repository;


import com.simplon.labxpert.model.Plannification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlannificationRepository extends JpaRepository<Plannification, Integer> {

}