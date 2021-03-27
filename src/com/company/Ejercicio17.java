package com.company;

public class Ejercicio17 {

    public Ejercicio17() {
        Electrodomestico [] arreglo = new Electrodomestico[10];
        arreglo[0]=new Electrodomestico();
        arreglo[1]=new Lavadora();
        arreglo[2]=new Television();
        arreglo[3]=new Electrodomestico(10.0,51.0);
        arreglo[4]=new Lavadora(30.0,18.0);
        arreglo[5]=new Television(50.0,60.0);
        arreglo[6]=new Electrodomestico(50.0,87.0,"NEGRO","A");
        arreglo[7]=new Lavadora(100.0,35.0,"CAFE","B",15.0);
        arreglo[8]=new Television(80.0,43.0,"NEGRO","D",45.0,true);
        arreglo[9]=new Television();
        precioFinalEjercicio17(arreglo);
        sumarizarPrecioEjercicio17(arreglo);
    }

    public static void precioFinalEjercicio17(Electrodomestico[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            arreglo[i].precioFinal();
        }
    }

    public static void sumarizarPrecioEjercicio17(Electrodomestico[] arreglo){
        Double [] precio= {0.0,0.0,0.0};
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i] instanceof Lavadora){
                precio[1] += arreglo[i].getPrecioBase();
            }else if(arreglo[i] instanceof Television){
                precio[2] += arreglo[i].getPrecioBase();
            }else {
                precio[0] += arreglo[i].getPrecioBase();
            }
        }
        imprimirEjercicio17(precio);
    }

    public static void imprimirEjercicio17(Double [] arreglo){
        String [] electrodomesticos= {"Electrodomesticos","Lavadoras","Television"};
        for(int i=0;i<arreglo.length;i++){
            System.out.println(electrodomesticos[i]+" : "+arreglo[i]);
        }

    }
}
