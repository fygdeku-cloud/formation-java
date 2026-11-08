/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fygdev
 */
public class Transaction {
    private String type;
    private String reference;
    private String description;
    private double montant;
    
    public Transaction(String t, String r, String d, double m){
        this.type = t;
        this.reference = r;
        this.description = d;
        this.montant = m;
    }
    
    public String getType(){
        return this.type;
    }
    
    public String getReference(){
        return this.reference;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public double getMontant(){
        return this.montant;
    }
    
    public void setType(String t){
        this.type = t;
    }
    
    public void setReference(String r){
        this.reference = r;
    }
    
    public void setDescription(String d){
        this.description = d;
    }
    
    public void setMontant(double m){
        this.montant = m;
    }
}
