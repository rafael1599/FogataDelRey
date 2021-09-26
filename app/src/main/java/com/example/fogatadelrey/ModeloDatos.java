package com.example.fogatadelrey;

public class ModeloDatos {
    private int imageResourse;
    private String nombrePlato, descripPlato, precioPlato, descuPlato;

    public ModeloDatos(int imageResourse, String nombrePlato, String descripPlato, String precioPlato, String descuPlato) {
        this.imageResourse = imageResourse;
        this.nombrePlato = nombrePlato;
        this.descripPlato = descripPlato;
        this.precioPlato = precioPlato;
        this.descuPlato = descuPlato;
    }

    public int getImageResourse() {
        return imageResourse;
    }

    public void setImageResourse(int imageResourse) {
        this.imageResourse = imageResourse;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getDescripPlato() {
        return descripPlato;
    }

    public void setDescripPlato(String descripPlato) {
        this.descripPlato = descripPlato;
    }

    public String getPrecioPlato() {
        return precioPlato;
    }

    public void setPrecioPlato(String precioPlato) {
        this.precioPlato = precioPlato;
    }

    public String getDescuPlato() {
        return descuPlato;
    }

    public void setDescuPlato(String descuPlato) {
        this.descuPlato = descuPlato;
    }
}


