/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import objects.Deportista;
import objects.Persona;

/**
 *
 * @author Usuario
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1=new Persona("kevin",28,38221454,"barrio 3");
        p1.coRrer();
        p1.anDar();
        Deportista d1=new Deportista("juan",32,21454634,"barrio 2",23);
        d1.anDar();
        d1.coRrer();
    }
    
}
