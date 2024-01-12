package com.simplon.labxpert.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Test")

public class Test_analyse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int min;
    private int max;
    @ManyToOne
    private Test_analyse testAnalyse;
    @OneToOne
    private Resultat resultat;


}
