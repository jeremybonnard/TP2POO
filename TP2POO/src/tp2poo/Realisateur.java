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
public class Realisateur extends Personne {
     private ArrayList<Dvd> aRealiser;
 public Realisateur(){
     super();
     this.aRealiser = new ArrayList<Dvd>();
 }
  public Realisateur(Dvd unDvd){
     super();
     this.aRealiser = new ArrayList<Dvd>();
     this.aRealiser.add(unDvd);
 }
   public Realisateur(ArrayList<Dvd> lesDvd ){
     super();
     this.aRealiser = new ArrayList<Dvd>();
     for(Dvd unDvd : lesDvd){
         this.aRealiser.add(unDvd);         
     }         
 }
}
