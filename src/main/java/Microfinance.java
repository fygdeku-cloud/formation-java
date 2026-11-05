/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fygdev
 */
public class Microfinance {
    private String nom;
    private String adresse;
    
    public Microfinance(String n, String a){
        this.nom = n;
        this.adresse = a;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setNom(String n){
        this.nom = n;
    }
    
    public String getAdresse(){
        return this.adresse;
    }
    
    public void setAdresse(String a){
        this.adresse = a;
    }
}
