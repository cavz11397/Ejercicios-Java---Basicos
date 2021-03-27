package com.company;

import java.util.Scanner;

public class Ejercicio7 {

    private static Scanner teclado=new Scanner(System.in);
    private Double numero;

    public Ejercicio7() {
    }

    public void comparacion(){
        Double entrada;
        do{
            try{
                entrada=Double.parseDouble(teclado.nextLine());
                if(entrada>0){
                    setNumero(entrada);
                    break;
                }else{
                    System.out.println("Ingrese un numero mayor o igual que cero");
                }
            }catch(NumberFormatException   e){
                System.out.println("Debe ingresar un numero");
            }
        }while(true);
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }
}
