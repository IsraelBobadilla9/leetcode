package com.bobadilla.ordenamiento.insertionSort;

import java.util.Arrays;

public class InsertionSort {
    
    public void ordenamiento(int[] arreglo){
        long start = System.nanoTime();

        for(int i = 1; i < arreglo.length;i++){
            int pivote = i;
            for(int j = i -1; j >= 0; j--){
                
               if(arreglo[pivote] < arreglo[j]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[pivote];
                    arreglo[pivote] = aux;
               }else{
                break;
               }
               pivote--;
            }
            
        }

        System.out.println("Tiempo en nano: "+(System.nanoTime()-start));
         System.out.println("Arreglo Ordenado -> "+Arrays.toString(arreglo));
    }

    // utilizando un while para ahorrar lineas 
    public void ordenamientoWhile(int[] arreglo){
        long start = System.nanoTime();

        for(int i = 1; i < arreglo.length;i++){
            int pivote = arreglo[i];
            int j = i-1;
            while(j >= 0 && arreglo[j] > pivote){
                arreglo[j+1] = arreglo[j];
                j--;
            }        
            arreglo[j+1] = pivote;
            
        }

        System.out.println("Tiempo en nano: "+(System.nanoTime()-start));
         System.out.println("Arreglo Ordenado -> "+Arrays.toString(arreglo));
    }



}
