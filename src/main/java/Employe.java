/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fygdev
 */
public class Employe {
    private String nom;
    private String prenom;
    private int annee;
    private String experience;
    
    public Employe(String n, String p, int a, String e){
        this.nom = n;
        this.prenom = p;
        this.annee = a;
        this.experience = e;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public int getAnnee(){
        return this.annee;
    }
    
    public String getExperience(){
        return this.experience;
    }
    
    public void setNom(String n){
        this.nom = n;
    }
    
    public void setPrenom(String p){
        this.prenom = p;
    }
    
    public void setAnnee(int a){
        this.annee = a;
    }
    
    public void setExperience(String e){
        this.experience = e;
    }
}
