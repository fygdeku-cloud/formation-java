/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fygdev
 */
public class Guichetier extends Employe{
    private String num_guichet;
    
    public Guichetier(String n, String p, int a, String e, String num_gu){
        super(n, p, a, e);
        this.num_guichet = num_gu;
    }
    
    public String getNumeroGuichet(){
        return this.num_guichet;
    }
    
    public void setNumeroGuichet(String num_gu){
        this.num_guichet = num_gu;
    }
}
