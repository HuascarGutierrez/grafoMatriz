/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafomatriz;

/**
 *
 * @author huasc
 */
public class Nodo {
    String dato;
    Nodo siguiente;
    public Nodo(String d)
    {
        dato = d;
        siguiente = null;
    }
    public void mostrar ()
    {
        System.out.println("________________________________________");
        System.out.println("Dato: "+dato);
        System.out.println("siguiente: "+siguiente);
        System.out.println("________________________________________");
    }
}
