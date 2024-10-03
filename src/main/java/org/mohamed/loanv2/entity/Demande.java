package org.mohamed.loanv2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter

@Entity
@Table(name="demande")
@Access(AccessType.FIELD)
public class Demande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "monproject")
    String monproject;

    @Column(name = "jesuis")
    String jesuis;

    @Column(name = "montant")
    @Positive
    @Min(5000)
    @Max(400000)
    private double Montant;

    @Column(name = "duree")
    @Min(6)
    @Max(120)
    @Positive
    private int Duree;

    @Positive
    @Column(name = "mensualite")
    private double Mensualite;


    @Column(name = "email" , length = 50)
    private String Email;

    @Column(name = "telephone" , length = 20)
    private String Telephone;

    @Column(name = "civilite")
    private String Civilite;

    @Column(name = "nom" , length = 30)
    private String Nom;

    @Column(name = "prenom" , length = 30)
    private String Prenom;

    @Column(name = "CIN" , length = 30)
    private String CIN;

    @Column(name = "datenaissance")
    private LocalDate Datenaissance;

    @Column(name = "datedembauche")
    private LocalDate Datedebauche;

    @Column(name = "totalrevenue")
    private double Totalrevenue;
    



}
