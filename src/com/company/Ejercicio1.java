package com.company;

public class Ejercicio1 {

    private Integer num1;
    private Integer num2;

    public Ejercicio1(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String Mayor(){
        String resultado;
        if(getNum1()>getNum2()){
            resultado="El primer numero es el mayor";
        } else if(getNum1()<getNum2()){
            resultado="El segundo numero es el mayor";
        } else{
            resultado="Los dos numeros son iguales";
        }
        return resultado;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }
}
