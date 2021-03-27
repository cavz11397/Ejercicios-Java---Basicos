package com.company;

import java.util.Scanner;

public class Electrodomestico {

    private static Scanner teclado=new Scanner(System.in);
    private Double precioBase;
    private Double peso;
    private String color;
    private String consumoEnergetico;

    public Electrodomestico() {
        this.precioBase = 100.0;
        this.peso = 5.0;
        this.color = "BLANCO";
        this.consumoEnergetico = "F";
    }

    public Electrodomestico(Double precio, Double peso) {
        this.precioBase = precio;
        this.peso = peso;
        this.color = "BLANCO";
        this.consumoEnergetico = "F";
    }

    public Electrodomestico(Double precioBase, Double peso, String color, String consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(getConsumoEnergetico().charAt(0));
        comprobarColor(getColor());
    }

    private void comprobarConsumoEnergetico(char letra){
        String respuesta;
        System.out.println("¿la letra ingresada es correcta? digite:\nSI\nNO");
        do{
            respuesta= teclado.nextLine();
            if(respuesta.equalsIgnoreCase("SI")
                    || respuesta.equalsIgnoreCase("NO")){
                if(respuesta.equalsIgnoreCase("NO") ){
                    setConsumoEnergetico("F");
                }
                break;
            }
        }while(true);
    }

    private void comprobarColor(String color){
        String respuesta;
        System.out.println("¿El color ingresado es correcto? digite:\nSI\nNO");
        do{
            respuesta= teclado.nextLine();
            if(respuesta.equalsIgnoreCase("SI")
                    || respuesta.equalsIgnoreCase("NO")){
                if(respuesta.equalsIgnoreCase("NO") ){
                    setColor("BLANCO");
                }
                break;
            }
        }while(true);
    }

    public void precioFinal(){
        if((getConsumoEnergetico().equals("A")) || (getPeso()>80)){
            setPrecioBase(100.0);
        }else if((getConsumoEnergetico().equals("B"))
                || ((getPeso()>=50) && (getPeso()<=79))){
            setPrecioBase(80.0);
        }else if(getConsumoEnergetico().equals("C")){
            setPrecioBase(60.0);
        }else if((getConsumoEnergetico().equals("D"))
                || ((getPeso()>=20) && (getPeso()<=49))){
            setPrecioBase(50.0);
        }else if(getConsumoEnergetico().equals("E")){
            setPrecioBase(30.0);
        }else if((getConsumoEnergetico().equals("F"))
                || ((getPeso()>=0) && (getPeso()<=19))){
            setPrecioBase(10.0);
        }
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
}
