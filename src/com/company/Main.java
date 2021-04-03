package com.company;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    private static Scanner teclado=new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Debe ingresar un numero correspondiente al ejercic" +
                "io que se quiere ejecutar, del 1 al 18");
        switch(elegir("SI")){
            case 1:
                ejercicio1(3,2);
                ejercicio1(2,3);
                ejercicio1(3,3);
                break;
            case 2:
                System.out.println("Ingresar el primer y segundo numero");
                ejercicio2();
                break;
            case 3:
                System.out.println("Debe ingresar el Radio");
                ejercicio3();
                break;
            case 4:
                System.out.println("Debe ingresar el precio del articulo");
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
            case 7:
                ejercicio7();
                break;
            case 8:
                ejercicio8();
                break;
            case 9:
                ejercicio9();
                break;
            case 10:
                ejercicio10();
                break;
            case 11:
                ejercicio11();
                break;
            case 12:
                ejercicio12();
                break;
            case 13:
                ejercicio13();
                break;
            case 14:
                ejercicio14();
                break;
            case 15:
                ejercicio15();
                break;
            case 16:
                ejercicio16();
                break;
            case 17:
                ejercicio17();
                break;
            case 18:
                ejercicio18();
                break;
        }
    }

    public static Integer elegir(String limites){
        Integer eleccion=0;
        do{
            System.out.println("Ingrese un numero");
            try{
                eleccion=Integer.valueOf(teclado.nextLine());
                if(limites.equals("SI")) {
                    if (Comparision.andBoolean(Comparision.equalOrGreater(eleccion, 1), Comparision.equalOrLess(eleccion, 18))) {
                        break;
                    }
                    System.out.println("Ingrese un numero entre 1 y 18");
                }else{
                    break;
                }
            }catch(NumberFormatException   e){
                System.out.println("Debe ingresar un numero");
            }
        }while(true);
        return eleccion;
    }

    public static Double numero(){
        Double num;
        do{
            try{
                num=Double.parseDouble(teclado.nextLine());
                break;
            }catch(NumberFormatException   e){
                System.out.println("Debe ingresar un numero");
            }
        }while(true);
        return num;
    }

    public static void ejercicio1(Integer num1, Integer num2){
        Ejercicio1 ejecutandose = new Ejercicio1(num1,num2);
        System.out.println("Primer numero: "+ejecutandose.getNum1());
        System.out.println("Segundo numero: "+ejecutandose.getNum2());
        System.out.println(ejecutandose.Mayor());
    }

    public static void ejercicio2(){
        Ejercicio1 ejecutandose = new Ejercicio1(elegir("NO"),elegir("NO"));
        System.out.println("Primer numero: "+ejecutandose.getNum1());
        System.out.println("Segundo numero: "+ejecutandose.getNum2());
        System.out.println(ejecutandose.Mayor());
    }

    public static void ejercicio3(){
        Double radio=numero();
        System.out.println("El radio es: "+radio);
        System.out.println("El area es: "+Math.PI*Math.pow(radio,2));
    }

    public static void ejercicio4(){
        Double total=numero();
        total=total*(1.21);
        System.out.println("Total a pagar: "+total);
    }

    public static void ejercicio5(){
        String pares="2";
        String impares="1";
        Integer i=3;
        while(Comparision.lessNumber(i,100)){
            if(Comparision.equalsNumbers(i%2,0)){
                pares+=" ,"+i;
            }else{
                impares+=" ,"+i;
            }
            i++;
        }
        System.out.println("Los numeros impares son: "+impares);
        System.out.println("Los numeros pares son: "+pares);
    }

    public static void ejercicio6(){
        String pares="2";
        String impares="1";
        for(int i=3;i<100;i++){
            if(Comparision.equalsNumbers(i%2,0)){
                pares+=" ,"+i;
            }else{
                impares+=" ,"+i;
            }
        }
        System.out.println("Los numeros impares son: "+impares);
        System.out.println("Los numeros pares son: "+pares);
    }

    public static void ejercicio7(){
        Ejercicio7 ejecutandose = new Ejercicio7();
        System.out.println("Ingrese un numero: ");
        ejecutandose.comparacion();
        System.out.println("El numero ingresado es: "+ejecutandose.getNumero());
    }

    public static void ejercicio8(){
        Ejercicio8 ejecutandose = new Ejercicio8();
        ejecutandose.ingresoDia();
        System.out.println(ejecutandose.respuesta());
    }

    public static void ejercicio9(){
        String frase="La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("ingrese una frase");
        frase=frase.replace("a","e")+" "+teclado.nextLine();
        System.out.println(frase);
    }

    public static void ejercicio10(){
        String entrada="";
        System.out.println("Ingrese una frase");
        entrada= teclado.nextLine();
        entrada=entrada.replace(" ","");
        System.out.println("Resultado: "+entrada);
    }

    public static void ejercicio11(){
        Ejercicio11 ejecutandose = new Ejercicio11();
        System.out.println("Ingrese una frase");
        ejecutandose.setFrase(teclado.nextLine());
        ejecutandose.contar();
        System.out.println("Longitud de la frase: "+ejecutandose.getFrase().length());
        System.out.println("a: "+ejecutandose.getA()+"\ne: "+ejecutandose.getE()+
                "\ni: "+ejecutandose.getI()+"\no: "+ejecutandose.getO()+"\nu: "+
                ejecutandose.getU());
    }

    public static void ejercicio12(){
        String [] resultado;
        Ejercicio12 ejecutandose = new Ejercicio12();
        System.out.println("Ingrese la primera palabra");
        ejecutandose.setPalabra1(teclado.nextLine());
        System.out.println("Ingrese la segunda palabra");
        ejecutandose.setPalabra2(teclado.nextLine());
        resultado=ejecutandose.comparar();
        if(resultado[0].equals("Son iguales")){
            System.out.println(resultado[0]);
        }else {
            System.out.println("Son diferentes en los siguientes caracteres: ");
            System.out.println(resultado[0]);
            System.out.println(resultado[1]);
        }
    }

    public static void ejercicio13(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
    }

    public static void ejercicio14(){
        Integer entrada;
        do{
            entrada=elegir("NO");
        }while(Comparision.equalOrGreater(entrada,1000));
        for(int i=entrada;i<=1000;i+=2){
            System.out.println(i);
        }
    }

    public static void ejercicio15(){
        Ejercicio15 ejecutandose = new Ejercicio15();
        ejecutandose.menu();
    }

    public static void ejercicio16(){
        Ejercicio16 ejecutandose = new Ejercicio16();
    }

    public static void ejercicio17(){
        Ejercicio17 ejecutandose = new Ejercicio17();
    }

    public static void ejercicio18(){
        Ejercicio18 ejecutandose = new Ejercicio18();
    }
}
