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
public class Gato extends Animal{
    private String raza;

    public Gato(String raza) {
        this.raza = raza;
    }
     public Gato() {
         super();
        this.raza = "";
    }
    public Gato(String raza, String nombre, String tipoAlimentacion, int edad) {
        super(nombre, tipoAlimentacion, edad);
        this.raza = raza;
    }
    
    
}
