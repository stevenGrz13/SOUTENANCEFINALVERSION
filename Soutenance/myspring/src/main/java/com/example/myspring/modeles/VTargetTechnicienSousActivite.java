package com.example.myspring.modeles;

import java.util.Date;

public class VTargetTechnicienSousActivite {
    int Idtechnicien;
    int IdindicateurSousactivite;
    String NomIndicateurSousActivite;
    double Target;
    String NomSousActivite;
    Date DateDebut;
    Date DateFin;

    double Avancement;

    public VTargetTechnicienSousActivite(){}

    public int getIdtechnicien() {
        return Idtechnicien;
    }

    public void setIdtechnicien(int idtechnicien) {
        Idtechnicien = idtechnicien;
    }

    public int getIdindicateurSousactivite() {
        return IdindicateurSousactivite;
    }

    public void setIdindicateurSousactivite(int idindicateurSousactivite) {
        IdindicateurSousactivite = idindicateurSousactivite;
    }

    public String getNomIndicateurSousActivite() {
        return NomIndicateurSousActivite;
    }

    public void setNomIndicateurSousActivite(String nomIndicateurSousActivite) {
        NomIndicateurSousActivite = nomIndicateurSousActivite;
    }

    public double getTarget() {
        return Target;
    }

    public void setTarget(double target) {
        Target = target;
    }

    public String getNomSousActivite() {
        return NomSousActivite;
    }

    public void setNomSousActivite(String nomSousActivite) {
        NomSousActivite = nomSousActivite;
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