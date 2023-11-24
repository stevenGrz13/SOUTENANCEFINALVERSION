package com.example.myspring.fonc;

import com.example.myspring.conn.Connexion;
import com.example.myspring.entities.*;
import com.example.myspring.modeles.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Objects;

public class Fonction {
    public static Technicien technicienById(int id)throws Exception{
        String sql = "select * from technicien where id="+id;
        Connection connection = Connexion.getConn();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        Technicien technicien = new Technicien();
        while (rs.next()){
            technicien.setId(rs.getInt("id"));
            technicien.setEmail(rs.getString("email"));
            technicien.setPass(rs.getString("pass"));
        }
        connection.close();
        return technicien;
    }

    public static ArrayList<Technicien> listeTechnicien()throws Exception{
        String sql = "select * from technicien";
        Connection connection = Connexion.getConn();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Technicien> res =  new ArrayList<>();
        while (rs.next()){
            Technicien technicien = new Technicien();
            technicien.setId(rs.getInt("id"));
            technicien.setEmail(rs.getString("email"));
            technicien.setPass(rs.getString("pass"));
            res.add(technicien);
        }
        connection.close();
        return res;
    }

    public static ArrayList<VTargetTechnicienActivite> getListeTargetTechnicienActivite(int idtechnicien) throws Exception{
        String sql = "select * from vtargettechnicienactivite where idtechnicien="+idtechnicien;
        Connection connection = Connexion.getConn();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<VTargetTechnicienActivite> res = new ArrayList<>();
        while (rs.next()){
            VTargetTechnicienActivite v = new VTargetTechnicienActivite();
            v.setIdtechnicien(rs.getInt("idtechnicien"));
            v.setIdindicateuractivite(rs.getInt("idindicateuractivite"));
            v.setNomIndicateur(rs.getString("nomindicateur"));
            v.setTarget(rs.getDouble("target"));
            v.setNomActivite(rs.getString("details"));
            v.setDateDebut(rs.getDate("datedebut"));
            v.setDateFin(rs.getDate("datefin"));
            v.setAvancement(rs.getDouble("avancement"));
            res.add(v);
        }
        connection.close();
        return res;
    }

    public static ArrayList<VTargetTechnicienSousActivite> getListeTargetTechnicienSousActivite(int idtechnicien) throws Exception{
        String sql = "select * from vtargettechniciensousactivite where idtechnicien="+idtechnicien;
        Connection connection = Connexion.getConn();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<VTargetTechnicienSousActivite> res = new ArrayList<>();
        while (rs.next()){
            VTargetTechnicienSousActivite v = new VTargetTechnicienSousActivite();
            v.setIdtechnicien(rs.getInt("idtechnicien"));
            v.setIdindicateurSousactivite(rs.getInt("idindicateursousactivite"));
            v.setNomIndicateurSousActivite(rs.getString("nomindicateur"));
            v.setTarget(rs.getDouble("target"));
            v.setNomSousActivite(rs.getString("nomindicateur"));
            v.setDateDebut(rs.getDate("datedebut"));
            v.setDateFin(rs.getDate("datefin"));
            v.setAvancement(rs.getDouble("avancement"));
            res.add(v);
        }
        connection.close();
        return res;
    }

    public static ArrayList<RapportIndicateurActivite> getListeRapportActiviteByIdTechnicien(int idtechnicien) throws Exception{
        String sql = "select * from vrapportindicateuractivite where idtechnicien="+idtechnicien;
        Connection connection = Connexion.getConn();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<RapportIndicateurActivite> res = new ArrayList<>();
        while(rs.next()){
            RapportIndicateurActivite item = new RapportIndicateurActivite();
            item.setId(rs.getInt("id"));
            item.setIdTechnicien(rs.getInt("idtechnicien"));
            item.setIdIndicateurActivite(rs.getInt("idindicateuractivite"));
            item.setQuantiteEffectue(rs.getDouble("quantiteeffectue"));
            item.setDateDebut(rs.getDate("datedebut"));
            item.setDateFin(rs.getDate("datefin"));
            item.setValidation(rs.getBoolean("validation"));
            item.setVerificationLink(rs.getString("verificationlink"));
            item.setNomIndicateur(rs.getString("nomindicateur"));
            res.add(item);
        }
        connection.close();
        return res;
    }

    public static ArrayList<RapportIndicateurSousActivite> getListeRapportSousActiviteByIdTechnicien(int idtechnicien) throws Exception{
        String sql = "select * from vrapportindicateursousactivite where idtechnicien="+idtechnicien;
        Connection connection = Connexion.getConn();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<RapportIndicateurSousActivite> res = new ArrayList<>();
        while(rs.next()){
            RapportIndicateurSousActivite item = new RapportIndicateurSousActivite();
            item.setId(rs.getInt("id"));
            item.setIdTechnicien(rs.getInt("idtechnicien"));
            item.setIdIndicateurSousActivite(rs.getInt("idindicateursousactivite"));
            item.setQuantiteEffectue(rs.getDouble("quantiteeffectue"));
            item.setDateDebut(rs.getDate("datedebut"));
            item.setDateFin(rs.getDate("datefin"));
            item.setValidation(rs.getBoolean("validation"));
            item.setVerificationLink(rs.getString("verificationlink"));
            item.setNomIndicateurSousActivite(rs.getString("nomindicateur"));
            res.add(item);
        }
        connection.close();
        return res;
    }

    public static void main(String[] args) {

    }
}
