package com.simplon.labxpert.Repository;


import com.simplon.labxpert.model.Analyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyseRepository extends JpaRepository<Analyse, Integer> {

}
