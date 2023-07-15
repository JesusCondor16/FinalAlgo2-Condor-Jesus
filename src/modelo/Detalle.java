/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author user
 */
public class Detalle {
    private int cantidad;
    private float precio;
    private float descuento;
    private float total;

    public Detalle(int cantidad, float precio, float descuento, float total) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getTotal() {
        return total;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
