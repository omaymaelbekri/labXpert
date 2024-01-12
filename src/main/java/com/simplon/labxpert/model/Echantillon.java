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
@Table(name="Echantillon")

public class Echantillon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Patient patient;
    private Date dateprelevement;
    @OneToMany(mappedBy = "echantillon",fetch =FetchType.LAZY)
    private Collection<Analyse>analyse;
    public enum Statut {
        EN_ATTENTE, EN_COURS, TERMINE
    }

    @Enumerated(EnumType.STRING)
    private Statut statut;

}
