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
public class Animal {
     private String nombre;
     private String tipoAlimentacion;
     private int edad;
     private Date fechaNacimiento;

    public Animal() {
        this.nombre = "";
        this.tipoAlimentacion = "";
        this.edad = 0;
        this.fechaNacimiento = null;
    }

    public Animal(String nombre, String tipoAlimentacion, int edad, Date fecNac) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
        this.edad = edad;
        this.fechaNacimiento = fecNac;
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
    
    public void edadConFechaDeNac(){
          java.util.Date fecha = new Date();
        int anioEdad =(fecha.getYear()+1900)  - (this.fechaNacimiento.getYear()+1900);
        this.setEdad(anioEdad);
    }
    
     public boolean vacunar(int edadVac){
//         Date fechaActual = new Date();
         int anioEdad = (this.fechaNacimiento.getYear()+1900);
         
         return anioEdad < edadVac;
     }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
