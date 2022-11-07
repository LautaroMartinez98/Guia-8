/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Paises {
    private String paises;

    public Paises(String pais) {
        this.paises = pais;
    }

    public Paises() {
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    @Override
    public String toString() {
        return "País= " + paises ;
    }
    
    
}
