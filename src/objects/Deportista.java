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
public class Deportista extends Persona{
    private int resistencia;

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public Deportista() {
    }
    
    public Deportista (String nombre,int edad,double dni,String domicilio,int resistencia)
    {   this.nombre=nombre;
        this.dni=dni;
        this.domicilio=domicilio;
        this.edad=edad;
        this.resistencia=resistencia;}
    
    public void anDar(){
        this.resistencia+=1;
        System.out.println(nombre+" anda mas rapido");
    }
    public void coRrer(){
        this.resistencia+=2;
        System.out.println(nombre+" corre mas rapido");
    }
    
}
