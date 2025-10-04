package com.bobadilla.ordenamiento.burbuja;

import java.util.Arrays;

public class OrdBurbuja {

    // Ordenamiento normal 
    public void ordenar(int[] arreglo){
        long start = System.nanoTime();
        
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 1; j < arreglo.length;j++){
                if(arreglo[j-1] > arreglo[j]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j-1];
                    arreglo[j-1] = aux;
                }
            }
        }
       
        System.out.println("Tiempo tomado en milis: "+(System.nanoTime()-start));
        System.out.println("Arreglo Ordenado -> "+Arrays.toString(arreglo));

    }

    // Ordenamiento mejorado 
    public void ordenamientoMejorado(int [] arreglo){
        long start = System.nanoTime();
        for(int i = 0; i < arreglo.length ; i++){
            for(int j = 1; j < arreglo.length - i; j++){
                if(arreglo[j-1] > arreglo[j]){
                    int aux = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        System.out.println("Tiempo tomado en milis: "+(System.nanoTime()-start));
        System.out.println("Arreglo Ordenado -> "+Arrays.toString(arreglo));
    }
}
