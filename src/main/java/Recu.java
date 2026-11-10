/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fygdev
 */
public class Recu {
    private Particulier particulier; 
    private Compte compte;
    private Transaction transaction;
    
    public Recu(Particulier p, Compte c, Transaction t){
        this.particulier = p;
        this.compte = c;
        this.transaction = t;
    }
    
    public Compte getCompte(){
        return this.compte;
    }
    
    public Particulier getParticulier(){
        return this.particulier;
    }
    
    public Transaction getTransaction(){
        return this.transaction;
    }
    
    public void setCompte(Compte c){
        this.compte = c;
    }
    
    public void setParticulier(Particulier p){
        this.particulier = p;
    }
    
    public void setTransaction(Transaction t){
        this.transaction = t;
    }
}
