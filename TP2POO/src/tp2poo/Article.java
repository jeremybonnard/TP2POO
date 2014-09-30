/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2poo;
import java.util.ArrayList; 
/**
 *
 * @author Plouf
 */
public class Article {
    protected int reference;
    protected double prix;
    protected String designation;
    //Constructeur par défaut
    public Article(){
        super();
    }
    /* Constructeur ac paramettre
        reference
    */
    public Article(int reference){
        this();
        this.reference = reference;
    }
    /*Constructeur ac paramettre:
        reference
        designation
    */
    public Article (int reference, String designation){
        this();
        this.reference = reference;
        this.designation = designation;
    }
    //constructeur complet
    public Article(int reference, String designation, double prix){
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;        
    }
    //getter et setter
    public int getReference(){
        return this.reference;        
    }
    public double getPrix(){
        return this.prix;        
    }
    public String getDesignation(){
        return this.designation;
    }
    public void setReference(int reference){
        this.reference = reference;
    }
    public void setPrix(double prix){
        this.prix = prix;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }
    //Fonction to String
    public String toString(){
        return getReference()+" "+getDesignation()+" "+getPrix();              
    }
    
    
}
