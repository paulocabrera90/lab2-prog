/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Martin
 */
public class Celular {
    
    private String marca;
    private String modelo;
    private String color;

    public Celular(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Celular() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void llamar(String persona){
        System.out.println("Llamando a " + persona);
    }
    
    public void finalizarLlamada(){
        System.out.println("Llamada finalizada");
    }
    
    public void informarCaracteristicas(){
       System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Color: " + getColor());
    }
        

}
    

