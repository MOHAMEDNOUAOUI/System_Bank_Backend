package org.mohamed.loanv2.controller;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.mohamed.loanv2.config.EntityManagerFactoryHolder;
import org.mohamed.loanv2.entity.Demande;
import org.mohamed.loanv2.repository.impl.DemandeRepositoryImpl;
import org.mohamed.loanv2.service.DemandeService;
import org.mohamed.loanv2.service.impl.DemandeServiceImpl;

import java.io.*;
import java.time.*;


@WebServlet(name = "demandecontroller" , value = "/demande")
public class DemandeController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManager entityManager = EntityManagerFactoryHolder.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            String email = request.getParameter("email");
            String telephone = request.getParameter("telephone");
            int mensualite = Integer.parseInt(request.getParameter("mensualite"));

            Demande demande = new Demande();
            demande.setEmail(email);
            demande.setTelephone(telephone);
            demande.setMensualite(mensualite);

            entityManager.persist(demande);
            entityTransaction.commit();

            response.sendRedirect("success.jsp"); // Redirect to a success page
        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "An error occurred while processing your request.");
        } finally {
            entityManager.close();
        }
    }

}
