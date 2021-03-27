package com.company;

public class Lavadora extends Electrodomestico{

    private Double carga;

    public Lavadora() {
        this.carga = 5.0;
    }

    public Lavadora(Double precio, Double peso) {
        super(precio, peso);
        this.carga = 5.0;
    }

    public Lavadora(Double precioBase, Double peso, String color, String consumoEnergetico, Double carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    @Override
    public void precioFinal(){
        super.precioFinal();
        if(getCarga()>30.0){
            setPrecioBase(getPrecioBase()+50.0);
        }
    }


    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
}
