/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fygdev
 */
public class Compte {
    private double solde;
    private String numero;
    private String date_creation;
    
    public Compte(double s, String n, String d){
        this.solde = s;
        this.numero = n;
        this.date_creation = d;
    }
    
    public double getSolde(){
        return this.solde;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public String getDateCreation(){
        return this.date_creation;
    }
    
    public void setSolde(double s){
        this.solde = s;
    }
    
    public void setNumero(String n){
        this.numero = n;
    }
    
    public void setDateCreation(String d){
        this.date_creation = d;
    }
}
