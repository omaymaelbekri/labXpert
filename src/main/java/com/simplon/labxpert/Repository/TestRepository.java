


package com.simplon.labxpert.Repository;


import com.simplon.labxpert.model.Test_analyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test_analyse, Integer> {

}