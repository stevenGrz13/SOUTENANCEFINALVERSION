package com.example.myspring.entities;

public class UsefulEntity {
    int IdTechnicien;
    boolean Etat;

    public UsefulEntity(){}
    public int getIdTechnicien() {
        return IdTechnicien;
    }

    public void setIdTechnicien(int idTechnicien) {
        IdTechnicien = idTechnicien;
    }

    public boolean isEtat() {
        return Etat;
    }

    public void setEtat(boolean etat) {
        Etat = etat;
    }
}