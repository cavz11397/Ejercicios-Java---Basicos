package com.company;

public class Ejercicio12 {

    private String palabra1;
    private String palabra2;

    public Ejercicio12() {
    }

    public String[] comparar(){
        String [] resultado={"",""} ;
        char [] arrayPalabra1=getPalabra1().toCharArray();
        char [] arrayPalabra2=getPalabra2().toCharArray();
        if(getPalabra1().equals(getPalabra2())){
            resultado[0]="Son iguales";
        }else{
            for(int i=0;i<arrayPalabra1.length;i++){
                if(i<arrayPalabra1.length && i<arrayPalabra2.length){
                    if(arrayPalabra1[i] != arrayPalabra2[i]) {
                        resultado[0] += Character.toString(arrayPalabra1[i]);
                        resultado[1] += Character.toString(arrayPalabra2[i]);
                    }else{
                        resultado[0]+= " ";
                        resultado[1]+= " ";
                    }
                }else{
                    break;
                }
            }
        }
        return resultado;
    }

    public String getPalabra1() {
        return palabra1;
    }

    public void setPalabra1(String palabra1) {
        this.palabra1 = palabra1;
    }

    public String getPalabra2() {
        return palabra2;
    }

    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }
}
