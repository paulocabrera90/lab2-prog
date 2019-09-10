/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import objects.Animal;
import objects.Caballo;

import objects.Celular;
import objects.Deportista;
import objects.Gato;
import objects.Perro;
import objects.Persona;
import objects.SmartPhone;

/**
 *
 * @author Usuario
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        Persona p1=new Persona("kevin",28,38221454,"barrio 3");
        p1.coRrer();
        p1.anDar();
        Deportista d1=new Deportista("juan",32,21454634,"barrio 2",23);
        d1.anDar();
        d1.coRrer();
        
        //Parte Martin
        //Ejecucion celular
        System.out.println("");
        System.out.println("");
        Celular c1= new Celular();
        c1.setColor("Gris");
        c1.setMarca("Motorola");
        c1.setModelo("1100");
        c1.llamar("Juan");
        c1.finalizarLlamada();
        c1.informarCaracteristicas();
        
        //Ejecucion celular
        System.out.println("");
        System.out.println("");
        SmartPhone smart2= new SmartPhone();
        smart2.setColor("Blanco");
        smart2.setMarca("Samsung");
        smart2.setModelo("J9");
        smart2.setPixelsCamara("35mpx");
        smart2.setTamañoMemoriaExterna("16gb");
        smart2.setTamañoMemoriaInterna("8GB");
        smart2.llamar("Valeria Lynch");
        smart2.finalizarLlamada();
        smart2.informarCaracteristicas();
        
       //// PArte Paulo Cabrera
       // ANIMALES
        
        
          System.out.println("");
        System.out.println("");
      
          DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fecNacimientoPerr = format.parse("26/10/2015");
        
        Perro aPerro = new Perro("Boxer", "Keller", "Raza", 0, fecNacimientoPerr);
        aPerro.edadConFechaDeNac();
        aPerro.mostrar(2015);
        
        System.out.println("");
        
        
        
        Date fecNacimientoGato = format.parse("05/02/2010");
        
        Gato aGato = new Gato("Siamese", "Bako", "Sabrositos", 0, fecNacimientoGato);
        aGato.edadConFechaDeNac();
        aGato.mostrar(2017);
         
         System.out.println("");
        
        
        Date fecNacimientoCaballo= format.parse("05/02/2016");
        Caballo aCaballo = new Caballo();
        aCaballo.setFechaNacimiento(fecNacimientoGato);
        aCaballo.edadConFechaDeNac();
        aCaballo.setNombre("Apolo");
        aCaballo.setRaza("Ballo");
        aCaballo.setTipoAlimentacion("Maiz, verduras y frutas");
        
        aCaballo.mostrar(2014);
               
        
       
    }
    
    
}
