package com.simplon.labxpert.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Resultat")

public class Resultat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(mappedBy = "resultat")
    private Test_analyse testAnalyse;
    private double valeurResultat;
    private String unite;

    public enum Statut {
        NORMAL,
        ANORMAL
    }
    @Enumerated(EnumType.STRING)
    private Statut statut;










}
