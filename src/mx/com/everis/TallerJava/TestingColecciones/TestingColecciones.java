/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.everis.TallerJava.TestingColecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Berserker
 */
public class TestingColecciones {
    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList<String>();
        nombre.add("Gera");
        nombre.add("Chihuahua");
        
        
        
        for (String a : nombre) {
            System.out.println(a);
        }
        
        List<String> apellidos = new ArrayList<String>();
        apellidos.add("anene");
        apellidos.add("vava");
        
        System.out.println("Tamaño apellidos: "+apellidos.size());
        
        System.out.println(apellidos.get(0));
        
        if (apellidos.contains("vava")) {
            System.out.println("Contiene el apellido");
        }else{
            System.out.println("No contiene el apellido");
        }
        
        for (Iterator<String> iterator = apellidos.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            System.out.println(next);
        }
        
        Iterator<String> ite = nombre.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
        
    }
}
