/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Date;

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
    public Gato(String raza, String nombre, String tipoAlimentacion, int edad, Date fechNac) {
        super(nombre, tipoAlimentacion, edad, fechNac);
        this.raza = raza;
    }
    
    
      public void mostrar(int edadVac){
           String vac = "No";
          if(this.vacunar(edadVac)){
              vac= "Si";
          }
       System.out.println("Gato : " + this.getNombre() + ", Raza: " + this.getRaza() + ", Edad: "+ this.getEdad() + ", Tipo Alimentacion: " + this.getTipoAlimentacion() + ", Tiene Vacuna: " + vac);
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
