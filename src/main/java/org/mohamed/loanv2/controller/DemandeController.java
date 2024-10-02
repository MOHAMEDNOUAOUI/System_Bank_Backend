package org.mohamed.loanv2.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.mohamed.loanv2.entity.Demande;
import org.mohamed.loanv2.repository.impl.DemandeRepositoryImpl;
import org.mohamed.loanv2.service.DemandeService;
import org.mohamed.loanv2.service.impl.DemandeServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@WebServlet(name = "DemandeController" , value = "/demande-controller")

public class DemandeController extends HttpServlet {

    private final DemandeServiceImpl demandeService = new DemandeServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {


        //firstpage
        String monproject =  request.getParameter("monproject");
        String jesuis = request.getParameter("jesuis_select");
        Double montant = Double.valueOf(request.getParameter("montant"));
        int dure = Integer.parseInt(request.getParameter("dure"));
        Double mensualite = Double.valueOf(request.getParameter("mensualite"));
        //secondpage
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephon");
        //thirdpage
        String civilite = request.getParameter("radio");
        String name = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String CIN = request.getParameter("CIN");
        String datenaissanceStr = request.getParameter("datenaissance");
        String DateDembaucheStr= request.getParameter("DateDembauche");
        Double totalrevenue = Double.valueOf(request.getParameter("totalrevenue"));


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate datenaissance = null;
        try {
            datenaissance = LocalDate.parse(datenaissanceStr, formatter);
        }catch (DateTimeParseException e) {
            e.printStackTrace();
        }

        LocalDate DateDembauche = null;
        try {
            DateDembauche = LocalDate.parse(DateDembaucheStr, formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }


        Demande demande = new Demande();
        demande.setMonproject(monproject);
        demande.setJesuis(jesuis);
        demande.setMensualite(montant);
        demande.setDuree(dure);
        demande.setMensualite(mensualite);
        demande.setEmail(email);
        demande.setTelephone(telephone);
        demande.setCivilite(civilite);
        demande.setNom(name);
        demande.setPrenom(prenom);
        demande.setCIN(CIN);
        demande.setDatenaissance(datenaissance);
        demande.setDatedebauche(DateDembauche);
        demande.setTotalrevenue(totalrevenue);


        demandeService.createDemande(demande);

    }

}
