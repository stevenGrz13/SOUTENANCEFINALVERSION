package com.example.myspring;

import com.example.myspring.entities.UsefulEntity;
import com.example.myspring.fonc.Authentification;
import com.example.myspring.fonc.Fonction;
import com.example.myspring.fonc.Insertion;
import com.example.myspring.modeles.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/api/anae")
@CrossOrigin("*")
public class SolarController {

    @GetMapping("technicienbyid/{idtechnicien}")
    public Technicien techById(@PathVariable("idtechnicien") int idtechnicien) throws Exception {
        return Fonction.technicienById(idtechnicien);
    }

    @GetMapping("logintechnicien/{nom}/{pass}")
    public UsefulEntity loginTechnicien(@PathVariable("nom") String nom, @PathVariable("pass") String pass) throws Exception {
        return Authentification.loginTechnicien(nom,pass);
    }

    @GetMapping("listetargettechnicienactivite/{idtechnicien}")
    public ArrayList<VTargetTechnicienActivite> listetargetactivite(@PathVariable("idtechnicien") int idtechnicien) throws Exception{
        return Fonction.getListeTargetTechnicienActivite(idtechnicien);
    }

    @GetMapping("listetargettechniciensousactivite/{idtechnicien}")
    public ArrayList<VTargetTechnicienSousActivite> listetargetsousactivite(@PathVariable("idtechnicien") int idtechnicien) throws Exception{
        return Fonction.getListeTargetTechnicienSousActivite(idtechnicien);
    }

    @GetMapping("insertionrapportactivite/{idtechnicien}/{idindicateuractivite}/{quantiteeffectue}/{datedebut}/{datefin}/{verificationlink}")
    public void InsertionRapportActivite(@PathVariable("idtechnicien") int idtechnicien, @PathVariable("idindicateuractivite") int idindicateuractivite, @PathVariable("quantiteeffectue") String quantiteeffectue, @PathVariable("datedebut")String datedebut, @PathVariable("datefin")String datefin, @PathVariable("verificationlink") String verificationlink){
        Insertion.InsertionRapportActivite(idtechnicien, idindicateuractivite, quantiteeffectue, datedebut, datefin, verificationlink);
    }

    @GetMapping("insertionrapportsousactivite/{idtechnicien}/{idindicateursousactivite}/{quantiteeffectue}/{datedebut}/{datefin}/{verificationlink}")
    public void InsertionRapportSousActivite(@PathVariable("idtechnicien") int idtechnicien, @PathVariable("idindicateursousactivite") int idindicateursousactivite, @PathVariable("datedebut")String datedebut, @PathVariable("datefin")String datefin, @PathVariable("quantiteeffectue") String quantiteeffectue, @PathVariable("verificationlink") String verificationlink){
        Insertion.InsertionRapportSousActivite(idtechnicien, idindicateursousactivite, quantiteeffectue, datedebut, datefin, verificationlink);
    }

    @GetMapping("listerapportactivitetechnicien/{idtechnicien}")
    public ArrayList<RapportIndicateurActivite> getlisterapportactivite(@PathVariable("idtechnicien") int idtechnicien) throws Exception{
        return Fonction.getListeRapportActiviteByIdTechnicien(idtechnicien);
    }

    @GetMapping("listerapportsousactivitetechnicien/{idtechnicien}")
    public ArrayList<RapportIndicateurSousActivite> getlisterapportsousactivite(@PathVariable("idtechnicien") int idtechnicien) throws Exception{
        return Fonction.getListeRapportSousActiviteByIdTechnicien(idtechnicien);
    }


    //
    @GetMapping("insertionmouvementvehicule/{idprojet}/{idvehicule}/{idtechnicien}/{idsitedepart}/{idsitearrivee}/{datedebut}/{datefin}")
    public void insertionmouvement(@PathVariable("idprojet") int idprojet,@PathVariable("idvehicule")int idvehicule,@PathVariable("idtechnicien")int idtechnicien,@PathVariable("idsitedepart") int idsitedepart,@PathVariable("idsitearrivee")int idsitearrivee,@PathVariable("datedebut") String datedebut,@PathVariable("datefin")String datefin){
        Insertion.InsertionMouvementVehicule(idprojet, idvehicule, idtechnicien, idsitedepart, idsitearrivee, datedebut, datefin);
    }
}