package com.company;
import java.util.Scanner;

public class Ejercicio15 extends Main{

    private static Scanner teclado=new Scanner(System.in);
    private Integer entrada;

    public Ejercicio15() {
    }

    public void menu(){
        Boolean bandera=true;
        do{
            System.out.println("***GESTION CINEMATOGRAFICA***\n1- NUEVO ACTOR"
                +"\n2- BUSCAR ACTOR\n3- ELIMINAR ACTOR\n4- MODIFICAR ACTOR\n"+
                "5- VER TODOS LOS ACTORES\n6- VER PELICULAS DE LOS ACTORES\n"+
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8- SALIR");
            setEntrada(elegir("NO"));
            switch(getEntrada()){
                case 8:
                    bandera=false;
                    break;
                default:
                    if(getEntrada()>7 || getEntrada()<1){
                        System.out.println("OPCION INCORRECTO");
                    }
            }
        }while(bandera);
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }
}
