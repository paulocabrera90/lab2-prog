/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Usuario
 */
public class Perro extends Animal{
    private String raza;

    public Perro(String raza) {
        this.raza = raza;
    }
    public Perro(){
         super();
         this.raza = "";
    }

    public Perro(String raza, String nombre, String tipoAlimentacion, int edad) {
        super(nombre, tipoAlimentacion, edad);
        this.raza = raza;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
    
}
