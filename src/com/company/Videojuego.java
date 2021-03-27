package com.company;

public class Videojuego implements Entregable{

    private String titulo;
    private String genero;
    private String compania;
    private Integer horasEstimadas;
    private Boolean entregado;

    public Videojuego() {
        this.titulo = "";
        this.genero = "";
        this.compania = "";
        this.horasEstimadas = 10;
        this.entregado = false;
    }

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = "";
        this.compania = "";
        this.entregado = false;
    }

    public Videojuego(String titulo, String genero, String compania, Integer horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
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
        Videojuego e = (Videojuego) a;
        if(getHorasEstimadas()>((Videojuego) a).getHorasEstimadas()){
            System.out.println("El videojuego "+getTitulo()+" tiene mas horas estimadas");
        }else if(getHorasEstimadas()< ((Videojuego) a).getHorasEstimadas()){
            System.out.println("El videojuego "+((Serie) a).getTitulo()+" tiene mas horas estimadas");
        }else{
            System.out.println("Ambos tienen la misma cantidad de horas estimadas");
        }
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + getTitulo() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", compania='" + getCompania() + '\'' +
                ", horasEstimadas=" + getHorasEstimadas() +
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

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
}
