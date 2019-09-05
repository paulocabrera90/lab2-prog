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
public class Animal {
     private String nombre;
     private String tipoAlimentacion;
     private int edad;

    public Animal() {
        this.nombre = "";
        this.tipoAlimentacion = "";
        this.edad = 0;
    }

    public Animal(String nombre, String tipoAlimentacion, int edad) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipoAlimentacion
     */
    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    /**
     * @param tipoAlimentacion the tipoAlimentacion to set
     */
    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
     
     public boolean vacunar(int edadVac){
         return this.edad < edadVac;
     }
}
