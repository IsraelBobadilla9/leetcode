package com.bobadilla.ordenamiento;

import java.util.Arrays;

import com.bobadilla.ordenamiento.burbuja.OrdBurbuja;
import com.bobadilla.ordenamiento.insertionSort.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = {6,41,6,27,1,26,8,32,12,34};
        System.out.println("Ordenamiento -> "+Arrays.toString(arreglo));
        OrdBurbuja burbuja = new OrdBurbuja();
        burbuja.ordenar(arreglo);
        // ordenamiento Mejorado
        System.out.println();
        burbuja.ordenamientoMejorado(arreglo);
        int[] arregloInsertSort = {16,47,11,10,50,36,11,50,21,30};
        System.out.println("===============INSERTION SORT =======");
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.ordenamiento(arregloInsertSort);
        insertionSort.ordenamientoWhile(arregloInsertSort);



        // END ORDENAMIENTOS O N*N

    }
}