package com.simplon.labxpert.model;

import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

import javax.persistence.*;
import java.util.Collection;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "planifications")

public class Plannification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateHeureDebut;
    private Date dateHeureFin;
    @ManyToOne
    private User user;
    @OneToOne
    private Analyse analyse;



}
