package com.example.myspring.modeles;

import java.util.Date;

public class RapportIndicateurActivite {
    int Id;
    int IdTechnicien;
    int IdIndicateurActivite;
    double QuantiteEffectue;
    Date DateDebut;
    Date DateFin;
    boolean Validation;
    String VerificationLink;

    String NomIndicateur;

    public RapportIndicateurActivite(){}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getIdTechnicien() {
        return IdTechnicien;
    }

    public void setIdTechnicien(int idTechnicien) {
        IdTechnicien = idTechnicien;
    }

    public int getIdIndicateurActivite() {
        return IdIndicateurActivite;
    }

    public void setIdIndicateurActivite(int idIndicateurActivite) {
        IdIndicateurActivite = idIndicateurActivite;
    }

    public double getQuantiteEffectue() {
        return QuantiteEffectue;
    }

    public void setQuantiteEffectue(double quantiteEffectue) {
        QuantiteEffectue = quantiteEffectue;
    }

    public Date getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        DateDebut = dateDebut;
    }

    public Date getDateFin() {
        return DateFin;
    }

    public void setDateFin(Date dateFin) {
        DateFin = dateFin;
    }

    public boolean isValidation() {
        return Validation;
    }

    public void setValidation(boolean validation) {
        Validation = validation;
    }

    public String getVerificationLink() {
        return VerificationLink;
    }

    public void setVerificationLink(String verificationLink) {
        VerificationLink = verificationLink;
    }

    public String getNomIndicateur() {
        return NomIndicateur;
    }

    public void setNomIndicateur(String nomIndicateur) {
        NomIndicateur = nomIndicateur;
    }
}
