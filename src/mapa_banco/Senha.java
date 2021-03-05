/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa_banco;

/**
 *
 * @author Guilherme Filvoch
 */

import java.util.ArrayList;

public class Senha {
    String tipo;
    Integer numero;
    
    public Senha() {}

    /**
     *
     * @param tipo
     * @param numero
     */
    public Senha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.tipo + "-" + this.numero;
    }
    
    public void setSenha(ArrayList list, String tipo) {
        this.tipo = tipo;
        this.numero = list.size();
        int i = list.size();
        Boolean hasEqual;
        do {
            i++;
            this.numero = i;
            hasEqual = list.contains(this.toString());
        } while(hasEqual);
        list.add(this.toString());
    }
}