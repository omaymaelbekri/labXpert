package com.simplon.labxpert.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Collection;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Analyses")
public class Analyse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dateDebut;
    private Date dateFin;
    @ManyToOne
    private Echantillon echantillon;
    @ManyToOne
    private User user;
    @OneToOne(mappedBy = "analyse")
    private Plannification plannification;
    @OneToMany(mappedBy = "analyse", fetch = FetchType.LAZY)
    private Collection <Test_analyse> testAnalyse;
    @OneToMany(mappedBy ="analyse",fetch = FetchType.LAZY)
    private Collection<Reactif> reactif;





}
