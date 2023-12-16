/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grafomatriz;
import java.util.Scanner;
/**
 *
 * @author huasc
 */
public class GrafoMatriz {

    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            String[] Nodos = {"A","B","C","D"};
            int M=999;
            int[][] matriz1 = {{0,9,M,10},{9,0,2,3},{M,2,0,4},{10,3,4,0}}; 
            
            int[][] matriz2 = {{0,9,M,10},{M,0,2,M},{M,M,0,M},{M,3,4,0}};
            
            while (true)
            {
                System.out.println("\tOPCIONES");
                System.out.println("1. Ingresar grafo");
                System.out.println("2. Ejemplo no dirigido");
                System.out.println("3. Ejemplo dirigido");
                System.out.println("4. Salir");
                int a;
                a = leer.nextInt();
                switch(a)
                {
                    case 1: Grafo nuevo = new Grafo();
                            nuevo.obtenerRuta();
                            break;
                    case 2: Grafo noDirigido = new Grafo(Nodos,matriz1);
                            noDirigido.obtenerRuta();
                            break;
                    case 3: Grafo dirigido = new Grafo(Nodos,matriz2);
                            dirigido.obtenerRuta();
                            break;
                    case 4: return;
                    default: System.out.println("Ingrese un dato correcto");
                }
            }
    }
}
