package com.company;
import java.util.Scanner;

public class Persona {

    private static Scanner teclado=new Scanner(System.in);
    private String nombre;
    private String Sexo;
    private Integer edad;
    private Double DNI;
    private Double peso;
    private Double altura;

    public Persona() {
        this.nombre = "";
        Sexo = "H";
        this.edad = 0;
        this.DNI = generarDNI();
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, String sexo, Integer edad) {
        this.nombre = nombre;
        Sexo = sexo;
        this.edad = edad;
        this.DNI = generarDNI();
        this.peso = 0.0;
        this.altura = 0.0;
        comprobarSexo(getSexo().charAt(0));
    }

    public Persona(String nombre, String sexo, Integer edad, Double peso, Double altura) {
        this.nombre = nombre;
        Sexo = sexo;
        this.edad = edad;
        this.DNI = generarDNI();
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(getSexo().charAt(0));
    }

    public Integer calcularIMC(){
        Double resultado;
        Integer retorno;
        resultado=getPeso()/Math.pow(getAltura(),2);
        if(resultado<20){
            retorno=-1;
        }else if(resultado>= 20 && resultado<=25){
            retorno=0;
        }else{
            retorno=1;
        }
        return retorno;
    }

    public Boolean esMayorDeEdad(){
        Boolean resultado;
        if(getEdad()>=18){
            resultado=true;
        }else{
            resultado=false;
        }
        return resultado;
    }

    private void comprobarSexo(char sexo){
        String respuesta;
        System.out.println("¿El sexo ingresado es correcto? digite:\nSI\nNO");
        do{
            respuesta= teclado.nextLine();
            if(respuesta.equalsIgnoreCase("SI")
                    || respuesta.equalsIgnoreCase("NO")){
                if(respuesta.equalsIgnoreCase("NO") ){
                    setSexo("H");
                }
                break;
            }
        }while(true);
    }

   @Override
    public String toString(){
        return " nombre: "+getNombre()+
                " ,Sexo: "+getSexo()+
                " ,edad: "+getEdad()+
                " ,DNI: "+getDNI()+
                " ,peso: "+getPeso()+
                " ,altura: "+getAltura();
    }

    public Double generarDNI(){
        Double resultado=Math.floor(Math.random()*(99999999-10000000+1)+10000000);
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getDNI() {
        return DNI;
    }
}
