/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafomatriz;
import java.util.Scanner;
/**
 *
 * @author huasc
 */
public class Grafo {
    Nodo inicio;
    Nodo fin;
    int cant;
    String[] nodos;
    int [][] matriz;
    Scanner leer = new Scanner(System.in);
    public Grafo (String[] n, int[][] mat)
    {
        inicio = null;
        fin = null;
        cant = mat.length;
        nodos = n;
        matriz = mat;
    }
    
    public Grafo ()
    {
        int a;
        inicio = null;
        fin = null;
        System.out.println("Ingrese la cantidad");
        a = leer.nextInt();
        cant = a;
        System.out.println("Ingrese cada nodo en orden");
        for(int i=0;i<cant;i++)
        {
            System.out.print((i+1)+": ");
            nodos[i] = leer.next();
        }
        System.out.println("Ingrese la matriz(Recuerde que M es 999): ");
        for(int i=0;i<cant;i++)
        {
            for(int j=0;j<cant;j++)
            {   
                System.out.print("Del nodo "+i+"al nodo "+j+": ");
                matriz[i][j] = leer.nextInt();
            }
        }
    }
    
    public void agregar (String d)
    {
            Nodo nuevo = new Nodo(d);
            if (inicio == null)
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
    public void mostrarRuta () 
    {
        Nodo actual = inicio;
        while (actual!=null)
        {
            actual.mostrar();
            actual = actual.siguiente;
        }
    }
    public void obtenerRuta()
    {
        this.inicio = null;
        this.fin = null;
        this.agregar(nodos[0]);
        int localizador=0, acumulador = 0;
        int coste = 0;
        int costoR;
        int i,j;
        for (i=0;i<cant;i++)
	{
            costoR = 999;
		for(j=i;j<cant;j++)
		{
			if (matriz[i][j] !=0 && matriz[i][j]!=999)    // i seria actual 
			{
				if(matriz[i][j] < costoR)
				{
					costoR = matriz[i][j];
                                        localizador = j ;
				}
			}
                        else
                        {
                            acumulador++;
                        }
		}
                coste += costoR;
                i=localizador-1;
                System.out.println("- Costo: "+costoR);
                System.out.println("  localizador"+localizador+"\n");
                /*Nodo nuevo = new Nodo(nodos[localizador]);
                if(inicio == null)
                {
                    inicio = nuevo;
                    fin = inicio;
                }
                else
                {
                    fin.siguiente = nuevo;
                    fin = fin.siguiente;
                }*/
                this.agregar(nodos[localizador]);
                if (acumulador == cant)
                {
                    System.out.println("CAMINO A TOMAR");
                    System.out.println("_________________________________");
                    this.mostrarRuta();
                    System.out.println("Costo total: "+coste);
                    System.out.println("_________________________________");
                    return;
                }
        }
    }
}
