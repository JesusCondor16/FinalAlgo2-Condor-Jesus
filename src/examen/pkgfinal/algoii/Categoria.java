/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkgfinal.algoii;

/**
 *
 * @author user
 */
public class Categoria {
    
    private String nombre;
    private boolean disponible;

    public Categoria(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
