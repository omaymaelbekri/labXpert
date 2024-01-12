package com.simplon.labxpert.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomUtilisateur;
    private String motDePasse;
    public enum Role {
        TECHNICIEN,
        RESPONSABLE_DE_LABORATOIRE,
        ADMINISTRATEUR
    }
    @Enumerated(EnumType.STRING)
    private Role role;
    private String informationsPersonnelles;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private Collection<Analyse>analyse;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private Collection<Plannification> plannification;







}
