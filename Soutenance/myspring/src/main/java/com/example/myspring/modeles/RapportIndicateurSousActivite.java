package com.example.myspring.modeles;

import java.util.Date;

public class RapportIndicateurSousActivite {
    int Id;
    int IdTechnicien;
    int IdIndicateurSousActivite;
    double QuantiteEffectue;
    Date DateDebut;
    Date DateFin;
    boolean Validation;
    String VerificationLink;
    String NomIndicateurSousActivite;

    public RapportIndicateurSousActivite(){}

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

    public int getIdIndicateurSousActivite() {
        return IdIndicateurSousActivite;
    }

    public void setIdIndicateurSousActivite(int idIndicateurSousActivite) {
        IdIndicateurSousActivite = idIndicateurSousActivite;
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

    public String getNomIndicateurSousActivite() {
        return NomIndicateurSousActivite;
    }

    public void setNomIndicateurSousActivite(String nomIndicateurSousActivite) {
        NomIndicateurSousActivite = nomIndicateurSousActivite;
    }
}
