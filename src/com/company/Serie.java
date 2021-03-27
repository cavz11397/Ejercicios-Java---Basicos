package com.company;

public class Serie implements Entregable {

    private String titulo;
    private String genero;
    private String creador;
    private Integer cantidadDeTemporadas;
    private Boolean entregado;

    public Serie() {
        this.titulo = "";
        this.genero = "";
        this.creador = "";
        this.cantidadDeTemporadas = 3;
        this.entregado = false;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = "";
        this.cantidadDeTemporadas = 3;
        this.entregado = false;
    }

    public Serie(String titulo, String genero, String creador, Integer cantidadDeTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.cantidadDeTemporadas = cantidadDeTemporadas;
        this.entregado = false;
    }

    public void entregar() {
        this.entregado=true;
    }

    public void devolver() {
        this.entregado=false;
    }

    public Boolean isEntregado() {
        return this.entregado;
    }

    public void compareTo(Object a) {
        Serie e = (Serie) a;
        if(getCantidadDeTemporadas()>((Serie) a).getCantidadDeTemporadas()){
            System.out.println("La serie "+getTitulo()+" tiene mas temporadas");
        }else if(getCantidadDeTemporadas()< ((Serie) a).getCantidadDeTemporadas()){
            System.out.println("La serie "+((Serie) a).getTitulo()+" tiene mas temporadas");
        }else{
            System.out.println("Ambas tienen la misma cantidad de temporadas");
        }
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + getTitulo() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", creador='" + getCreador() + '\'' +
                ", cantidadDeTemporadas=" + getCantidadDeTemporadas() +
                ", entregado=" + this.entregado +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Integer getCantidadDeTemporadas() {
        return cantidadDeTemporadas;
    }

    public void setCantidadDeTemporadas(Integer cantidadDeTemporadas) {
        this.cantidadDeTemporadas = cantidadDeTemporadas;
    }
}
