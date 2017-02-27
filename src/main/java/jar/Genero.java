/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jar;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author 1061786305
 */
@Entity
public class Genero {
    
    @Id private String codigo;
    private String desciripcion;

    //constructor vacio

    public Genero() {
    }

    public Genero(String codigo, String desciripcion) {
        this.codigo = codigo;
        this.desciripcion = desciripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDesciripcion() {
        return desciripcion;
    }

    public void setDesciripcion(String desciripcion) {
        this.desciripcion = desciripcion;
    }
    
    
}
