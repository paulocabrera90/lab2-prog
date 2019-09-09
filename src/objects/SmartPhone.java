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
public class SmartPhone extends Celular{
    
    String pixelsCamara;
    String  tamañoMemoriaInterna;
    String  tamañoMemoriaExterna;

    public SmartPhone(String pixelsCamara, String tamañoMemoriaInterna, String tamañoMemoriaExterna, String marca, String modelo, String color) {
        super(marca, modelo, color);
        this.pixelsCamara = pixelsCamara;
        this.tamañoMemoriaInterna = tamañoMemoriaInterna;
        this.tamañoMemoriaExterna = tamañoMemoriaExterna;
    }

    public SmartPhone(String pixelsCamara, String tamañoMemoriaInterna, String tamañoMemoriaExterna) {
        this.pixelsCamara = pixelsCamara;
        this.tamañoMemoriaInterna = tamañoMemoriaInterna;
        this.tamañoMemoriaExterna = tamañoMemoriaExterna;
    }

    public SmartPhone() {
    }
    
    

    public String getPixelsCamara() {
        return pixelsCamara;
    }

    public void setPixelsCamara(String pixelsCamara) {
        this.pixelsCamara = pixelsCamara;
    }

    public String getTamañoMemoriaInterna() {
        return tamañoMemoriaInterna;
    }

    public void setTamañoMemoriaInterna(String tamañoMemoriaInterna) {
        this.tamañoMemoriaInterna = tamañoMemoriaInterna;
    }

    public String getTamañoMemoriaExterna() {
        return tamañoMemoriaExterna;
    }

    public void setTamañoMemoriaExterna(String tamañoMemoriaExterna) {
        this.tamañoMemoriaExterna = tamañoMemoriaExterna;
    }
    
    //Sobreescribo metodo de heredado de celular para mostras las caracteristicas del smartPhone
    public void informarCaracteristicas(){
       System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Color: " + getColor() +
               ", Pixeles de camara: "+ getPixelsCamara() + ", Memoria interna: " + getTamañoMemoriaInterna() + 
               ", Memoria externa: " + getTamañoMemoriaExterna() );
    }
    
}
