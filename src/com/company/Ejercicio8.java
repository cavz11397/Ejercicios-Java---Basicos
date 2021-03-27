package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    private static Scanner teclado=new Scanner(System.in);
    private String dia;

    public Ejercicio8() {
    }

    public void ingresoDia(){
        String entrada;
        do{
            System.out.println("Ingrese un dia de la semana (en español)");
            entrada=teclado.nextLine();
            entrada=entrada.toUpperCase(Locale.ROOT);
            if(entrada.equals("LUNES") || entrada.equals("MARTES")
                    || entrada.equals("MIERCOLES") || entrada.equals("JUEVES")
                    || entrada.equals("VIERNES") || entrada.equals("SABADO")
                    || entrada.equals("DOMINGO")){
                setDia(entrada);
                break;
            }
        }while(true);
    }

    public String respuesta(){
        String respuesta="";
        switch(getDia()){
            case "SABADO":
                respuesta="No es un dia laboral";
                break;
            case "DOMINGO":
                respuesta="No es un dia laboral";
                break;
            default:
                respuesta="Es un dia laboral";
                break;
        }
        return respuesta;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
