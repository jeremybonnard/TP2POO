/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2poo;
import java.time.Duration;
/**
 *
 * @author Plouf
 */
public class Dvd extends Article {
    
    protected Duration duree;
    protected String realisateur;
    
    // Constructeur par défaut
    public Dvd(){
        super();
        this.duree = Duration.ofMinutes(0);
        this.realisateur = "Inconnu";                            
    }
    // Constructeur complet        
    public Dvd(int reference, String designation, double prix, int duree, String realisateur){
        super(reference,designation,prix);
        this.duree = Duration.ofMinutes(duree);
        this.realisateur = realisateur;                     
    }
//Getters et Setters
    public Duration getDuree() {
        return duree;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setDuree(int duree) {
        this.duree = Duration.ofMinutes(duree);
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }
    //Fonction to String
    public String toString(){
        return getReference()+" "+getDesignation()+" "+getPrix()+" "+getDuree()+" "+getRealisateur();              
    }
    
    
    
}
