package com.company;

public class Television extends Electrodomestico{

    private Double resolucion;
    private Boolean sincronizadorTDT;

    public Television() {
        this.resolucion = 20.0;
        this.sincronizadorTDT = false;
    }

    public Television(Double precio, Double peso) {
        super(precio, peso);
        this.resolucion = 20.0;
        this.sincronizadorTDT = false;
    }

    public Television(Double precioBase, Double peso, String color, String consumoEnergetico, Double resolucion, Boolean sincronizadorTDT) {
        super(precioBase, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    @Override
    public void precioFinal(){
        super.precioFinal();
        if(getResolucion()>40.0){
            setPrecioBase(getPrecioBase()*1.3);
        }
        if(getSincronizadorTDT()){
            setPrecioBase(getPrecioBase()+50.0);
        }
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSincronizadorTDT() {
        return sincronizadorTDT;
    }

    public void setSincronizadorTDT(Boolean sincronizadorTDT) {
        this.sincronizadorTDT = sincronizadorTDT;
    }
}
