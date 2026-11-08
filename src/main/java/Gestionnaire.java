/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fygdev
 */


public class Gestionnaire extends Employe {
    private String num_gerant;
    
    public Gestionnaire(String n, String p, int a, String e, String num_g){
        super(n, p, a, e);
        this.num_gerant = num_g;
    }
    
    public String getNumeroGerant(){
        return this.num_gerant;
    }
    
    public void setNumeroGerant(String num_g){
        this.num_gerant = num_g;
    }
}
