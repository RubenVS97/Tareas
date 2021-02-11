/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import java.util.ArrayList;

/**
 *
 * @author ruben
 */
public class Pila {

    private ArrayList<Character> arrayList = new ArrayList<>();
    private int tope = 4; 

    public void añadir() {
        if(arrayList.size() >= tope){
         arrayList.add(0, 'w');   
        }
        
    }

    public void eliminar() {
        
        if (arrayList.size() <= tope) {
            arrayList.remove(4);
        }
    }

    public boolean vacia() {
        return arrayList.isEmpty();
    }

    public boolean llena() {
        return !arrayList.isEmpty();
    }

    public int numeroElementos() {
        return arrayList.size();
    }

    public void imprimir() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public char[] sacarElementos() {
        char[] array  = null;
        for (int i=arrayList.size()-1; i>=0; i--) {
            array = arrayList.get(i).toChars(i);
            
        }
        arrayList.clear();
        return array;
    }
}
