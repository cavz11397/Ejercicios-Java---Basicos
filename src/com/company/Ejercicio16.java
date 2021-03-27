package com.company;

import java.util.Scanner;
import java.util.Locale;

public class Ejercicio16 extends Main{

    private static Scanner teclado=new Scanner(System.in);

    public Ejercicio16() {
        Persona persona1;
        Persona persona2;
        Persona persona3=new Persona();
        String nombre;
        String sexo;
        Integer edad;
        Double peso;
        Double altura;
        System.out.println("Ingrese el nombre de la persona 1:");
        nombre=teclado.nextLine();
        System.out.println("Ingrese el sexo de la persona 1\nH- Hombre"+
                "\nM- Mujer");
        do{
            sexo=teclado.nextLine().toUpperCase(Locale.ROOT);
            if(sexo.equalsIgnoreCase("H")
                    || sexo.equalsIgnoreCase("M")){
                break;
            }else{
                System.out.println("Ingrese una opcion valida");
            }
        }while(true);
        System.out.println("Ingrese la edad de la persona 1:");
        edad=elegir("NO");

        /**
         * 635 kilogramos, record mundial de la persona mas pesada
         * 2.1 kilogramos, record mundial de la persona menos pesada
         * */
        System.out.println("Ingrese el peso de la persona 1 en kilogramos:");
        peso=auxiliarEjercicio16(635.0,2.1);

        /**
         * 2.70 metros, record mundial de la persona mas alta
         * 0.54 metros, record mundial de la persona mas baja
         */
        System.out.println("Ingrese la altura de la persona 1 en metros:");
        altura=auxiliarEjercicio16(2.70,0.54);
        persona1=new Persona(nombre,sexo,edad,peso,altura);
        persona2=new Persona(nombre,sexo,edad);
        persona2.setPeso(60.0);
        persona2.setAltura(1.54);
        persona3.setPeso(89.0);
        persona3.setAltura(1.80);
        reductorEjercicio16(persona1,persona2,persona3);
    }

    public static Double auxiliarEjercicio16(Double max, Double min){
        Double respuesta;
        do{
            System.out.println("Digite un numero entre: "+min+" y "+max);
            respuesta=numero();
            if(respuesta>=min && respuesta<=max){
                break;
            }
        }while(true);
        return respuesta;
    }

    public static void reductorEjercicio16(Persona persona1,Persona persona2,Persona persona3){
        comprobarPesoEjercicio16(persona1);
        comprobarPesoEjercicio16(persona2);
        comprobarPesoEjercicio16(persona3);
        mayoriaDeEdadEjercicio16(persona1);
        mayoriaDeEdadEjercicio16(persona2);
        mayoriaDeEdadEjercicio16(persona3);
        System.out.println("persona 1: "+persona1.toString());
        System.out.println("persona 2: "+persona2.toString());
        System.out.println("persona 3: "+persona3.toString());
    }

    public static void comprobarPesoEjercicio16(Persona p){
        Integer respuesta;
        respuesta=p.calcularIMC();
        if(respuesta==-1){
            System.out.println("Esta bien");
        }else if(respuesta==0){
            System.out.println("Esta por debajo del peso ideal");
        }else{
            System.out.println("Tiene sobrepeso");
        }
    }

    public static void mayoriaDeEdadEjercicio16(Persona p){
        if(p.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
