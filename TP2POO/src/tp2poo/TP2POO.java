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
public class TP2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Exercice 1
    Article a1,a2;
    a1=new Article();
        a1.setReference(100);
        a1.setDesignation("La Programmation en java");
        a1.setPrix(20.5);
        
       a2=new Article(100,"Les méthodes d'agile",25.5);
       
        test(a1);
        System.out.println(a1.toString());
        
        test(a2);
        System.out.println(a2.toString());
        
    }
    public static void test(Article a){
        System.out.println("reference: "+a.getReference());
        System.out.println("designation :"+a.getDesignation());
        System.out.println("prix :"+a.getPrix()+" €");
    }
     // Exerice 1 fin 
}
