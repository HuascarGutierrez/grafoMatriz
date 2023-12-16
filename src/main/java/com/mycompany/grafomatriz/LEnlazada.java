/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafomatriz;

/**
 *
 * @author huasc
 */
public class LEnlazada {
    Nodo inicio;
    Nodo fin;
    int cant;
    public LEnlazada() 
    {
        inicio = null;
        fin = null;
        cant = 0;
    }
    public void agregar(String d)
    {
        Nodo nuevo = new Nodo(d);
        if(inicio == null)
        {
            inicio = nuevo;
            fin = nuevo;
        }
        else 
        {
            fin.siguiente = nuevo;
            fin = fin.siguiente;
        }
    }
    public void mostrar()
    {
        Nodo actual = inicio;
        while (actual != null)
        {
            actual.mostrar();
            actual = actual.siguiente;
        }
    }
}
