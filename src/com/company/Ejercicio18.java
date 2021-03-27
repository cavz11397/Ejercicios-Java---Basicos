package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio18 extends Main{

    private static Scanner teclado=new Scanner(System.in);

    public Ejercicio18() {
        Serie [] series = new Serie[5];
        Videojuego [] videojuegos = new Videojuego[5];
        for(int i=0;i< series.length;i++){
            System.out.println("------------------------------------\n"+(i+1));
            series[i]=llenarSerieEjercicio18();
            videojuegos[i]=llenarVideojuegoEjercicio18();
        }
        entregarEjercicio18(series,videojuegos);
        buscarEjercicio18(series);
        buscarEjercicio18(videojuegos);
    }

    public static Serie llenarSerieEjercicio18(){
        Serie serie;
        String titulo;
        String genero;
        String creador;
        Integer cantTemporadas;
        System.out.println("Ingrese el titulo de la serie: ");
        titulo=teclado.nextLine();
        System.out.println("Ingrese el genero de la serie: ");
        genero=teclado.nextLine();
        System.out.println("Ingrese el nombre del creador de la serie: ");
        creador=teclado.nextLine();
        System.out.println("Ingrese el numero de temporadas que tiene la serie: ");
        cantTemporadas=elegir("NO");
        serie=new Serie(titulo,genero,creador,cantTemporadas);
        return serie;
    }

    public static Videojuego llenarVideojuegoEjercicio18(){
        Videojuego videojuego;
        String titulo;
        String genero;
        String compania;
        Integer horasEstimadas;
        System.out.println("Ingrese el titulo del videojuego: ");
        titulo=teclado.nextLine();
        System.out.println("Ingrese el genero del videojuego: ");
        genero=teclado.nextLine();
        System.out.println("Ingrese el nombre del creador del videojuego: ");
        compania=teclado.nextLine();
        System.out.println("Ingrese el numero de horas estimadas que tiene el videojuego: ");
        horasEstimadas=elegir("NO");
        videojuego=new Videojuego(titulo,genero,compania,horasEstimadas);
        return videojuego;
    }

    public static void entregarEjercicio18(Serie[] series, Videojuego [] videojuegos){
        Integer contador=0;
        for(int i=0;i< series.length;i++){
            if(Math.random()>=0.5){
                series[i].entregar();
                videojuegos[i].entregar();
            }
        }
        for (int i=0;i< series.length;i++){
            contador=auxiliarEjercicio18(series[i],contador);
            contador=auxiliarEjercicio18(videojuegos[i], contador);
        }
        System.out.println("Habia entregados (entre ambos) un total de: "+contador);
    }

    public static Integer auxiliarEjercicio18(Object a, Integer cont){
        if((a instanceof Serie) || (a instanceof Videojuego)){
            if(((Entregable) a).isEntregado()){
                ((Entregable) a).devolver();
                cont++;
            }
        }
        return cont;
    }

    public static void buscarEjercicio18 (Object [] a){
        ArrayList<String> mayortitulo =new ArrayList<>();
        Integer mayornumero=0;
        if(a[0] instanceof Serie){
            for(int i=0;i<a.length;i++) {
                if(((Serie)a[i]).getCantidadDeTemporadas()>mayornumero) {
                    mayornumero=((Serie)a[i]).getCantidadDeTemporadas();
                    mayortitulo.clear();
                    mayortitulo.add(((Serie)a[i]).getTitulo());
                }else if(((Serie)a[i]).getCantidadDeTemporadas()==mayornumero){
                    mayortitulo.add(((Serie)a[i]).getTitulo());
                }
            }
        }else {
            for(int i=0;i<a.length;i++) {
                if(((Videojuego)a[i]).getHorasEstimadas()>mayornumero) {
                    mayornumero=((Videojuego)a[i]).getHorasEstimadas();
                    mayortitulo.clear();
                    mayortitulo.add(((Videojuego)a[i]).getTitulo());
                }else if(((Videojuego)a[i]).getHorasEstimadas()==mayornumero){
                    mayortitulo.add(((Videojuego)a[i]).getTitulo());
                }
            }
        }
        imprimirEjercicio18(mayortitulo,a);
    }

    public static void imprimirEjercicio18(ArrayList<String> mayorTitulo, Object [] a){
        for(int i=0;i<a.length;i++){
            if((a[i] instanceof Serie) && (((Serie)a[i]).getTitulo().equals(mayorTitulo.get(0)))){
                System.out.println(((Serie)a[i]).toString());
                mayorTitulo.remove(0);
            }else if((a[i] instanceof Videojuego) && (((Videojuego)a[i]).getTitulo().equals(mayorTitulo.get(0)))){
                System.out.println(((Videojuego)a[i]).toString());
                mayorTitulo.remove(0);
            }
            if (mayorTitulo.isEmpty()){
                break;
            }
        }
    }
}
