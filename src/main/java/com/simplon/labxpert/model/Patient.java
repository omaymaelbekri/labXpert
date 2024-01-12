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
@Table(name = "Patient")

public class Patient {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)

 private int id;
private String Nom;
private String Prénom;
private Date datenaissance;
private String sexe;
private String Adresse;
private  String telephone;
//Historique des analyses (liste des analyses effectuées)
 @OneToMany(mappedBy ="patient",fetch = FetchType.LAZY)
 private Collection<Echantillon> echantillon;

}
