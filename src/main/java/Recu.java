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
}
