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

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter

@Entity
@Table(name="demande")
public class Demande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "email" , length = 50)
    private String Email;

    @Column(name = "phone" , length = 20)
    private String Phone;

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

    @Column(name = "creditType")
    private String CreditType;


}
