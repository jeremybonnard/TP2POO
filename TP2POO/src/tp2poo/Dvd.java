/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2poo;
import java.time.Duration;
import java.util.ArrayList; 
/**
 *
 * @author Plouf
 */
public class Dvd extends Article {
    
    protected Duration duree;
    protected ArrayList<Realisateur> aEteRealiser;
    
    
    // Constructeur par défaut
    public Dvd(){
        super();
        this.duree = Duration.ofMinutes(0);                             
    }
    // Constructeur complet        
    public Dvd(int reference, String designation, double prix, int duree){
        super(reference,designation,prix);
        this.duree = Duration.ofMinutes(duree);                        
    }
//Getters et Setters
    public Duration getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = Duration.ofMinutes(duree);
    }

    //Fonction to String
    public String toString(){
        return getReference()+" "+getDesignation()+" "+getPrix()+" "+getDuree();              
    }
    
    
    
}
