package com.example.myspring.modeles;

import java.util.Date;

public class VTargetTechnicienActivite {
    int Idtechnicien;
    int Idindicateuractivite;
    String NomIndicateur;
    double Target;
    String NomActivite;
    Date DateDebut;
    Date DateFin;
    double Avancement;
    public VTargetTechnicienActivite(){}

    public int getIdtechnicien() {
        return Idtechnicien;
    }

    public void setIdtechnicien(int idtechnicien) {
        Idtechnicien = idtechnicien;
    }

    public int getIdindicateuractivite() {
        return Idindicateuractivite;
    }

    public void setIdindicateuractivite(int idindicateuractivite) {
        Idindicateuractivite = idindicateuractivite;
    }

    public String getNomIndicateur() {
        return NomIndicateur;
    }

    public void setNomIndicateur(String nomIndicateur) {
        NomIndicateur = nomIndicateur;
    }

    public double getTarget() {
        return Target;
    }

    public void setTarget(double target) {
        Target = target;
    }

    public String getNomActivite() {
        return NomActivite;
    }

    public void setNomActivite(String nomActivite) {
        NomActivite = nomActivite;
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

    public double getAvancement() {
        return Avancement;
    }

    public void setAvancement(double avancement) {
        Avancement = avancement;
    }
}