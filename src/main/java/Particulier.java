/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fygdev
 */
public class Particulier {
    private String nom;
    private String prenom;
    private String genre;
    private int age;
    
    public Particulier(String n, String p, String g, int a){
        this.nom = n;
        this.prenom = p;
        this.genre = g;
        this.age = a;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public String getGenre(){
        return this.genre;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setNom(String n){
        this.nom = n;
    }
    
    public void setPrenom(String p){
        this.prenom = p;
    }
    
    public void setGenre(String g){
        this.genre = g;
    }
    
    public void setAge(int a){
        this.age = a;
    }
}
