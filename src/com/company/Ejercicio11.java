package com.company;

public class Ejercicio11 {

    private String frase;
    private Integer a;
    private Integer e;
    private Integer i;
    private Integer o;
    private Integer u;

    public Ejercicio11() {
        this.a = 0;
        this.e = 0;
        this.i = 0;
        this.o = 0;
        this.u = 0;
    }

    public void contar(){
        char [] arreglo = getFrase().toCharArray();
        for(int j=0;j<arreglo.length;j++){
            sumar(arreglo[j]);
        }
    }

    public void sumar(char caracter){
        switch(caracter){
            case 'a':
                setA(getA()+1);
                break;
            case 'e':
                setE(getE()+1);
                break;
            case 'i':
                setI(getI()+1);
                break;
            case 'o':
                setO(getO()+1);
                break;
            case 'u':
                setU(getU()+1);
                break;
            default:
                break;
        }
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getE() {
        return e;
    }

    public void setE(Integer e) {
        this.e = e;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Integer getO() {
        return o;
    }

    public void setO(Integer o) {
        this.o = o;
    }

    public Integer getU() {
        return u;
    }

    public void setU(Integer u) {
        this.u = u;
    }
}
