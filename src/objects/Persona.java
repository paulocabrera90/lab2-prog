/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author kevin
 */
public class Persona {
   protected String nombre;
   protected int edad;
   protected double dni;
   protected String domicilio;
   
   public String getNombre(){return nombre;}
   
   public void setNombre(String nombre){this.nombre=nombre;}
   
   
   public int getEdad(){return edad;}
   
   public void getEdad(int edad){this.edad=edad;}
   
   
   public double getDni(){return dni;}
   
   public void setDni (double dni){this.dni=dni;}
   
   public String getDomicilio(){return domicilio;}
   
   public void setDomicilio(String domicilio){this.domicilio=domicilio;}
   
   
   public Persona(){};
   
   public Persona(String nombre,int edad,double dni,String domicilio){
       this.nombre=nombre;
       this.dni=dni;
       this.edad=edad;
       this.domicilio=domicilio;
   }
   
   public void anDar(){System.out.println(nombre+" camina");};
   
   public void coRrer(){System.out.println(nombre+" corre");};
   
   
}

