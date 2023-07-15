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
public class Trabajador {
    private String password;
    private String email;

    public Trabajador(String password, String email) {
        this.password = password;
        this.email = email;
    }
    

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
