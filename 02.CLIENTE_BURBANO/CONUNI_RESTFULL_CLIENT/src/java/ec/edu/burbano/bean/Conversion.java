/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.burbano.bean;

import ec.edu.burbano.controlador.CentimetrosAPulgadas;
import ec.edu.burbano.controlador.PulgadasACentimetros;
import ec.edu.burbano.model.Dato;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author IABN
 */
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;

import javax.annotation.PostConstruct;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import javax.xml.ws.WebServiceRef;

/**
 *
 * @author IABN
 */
@Named(value = "conversion")
@RequestScoped
public class Conversion implements Serializable {

    private double entrada;
    private double respuesta;

    Dato dato1= new Dato();
    public Conversion() {
    }

    @PostConstruct
    public void init() {
        entrada = 0;
        respuesta = 0;
       
    }

    CentimetrosAPulgadas client1 = new CentimetrosAPulgadas();
    PulgadasACentimetros client2 = new PulgadasACentimetros();
    
    public void centimetrosPulgada() {
        Dato numero = new Dato();
       // numero = client1.find
   //this.respuesta = client1.centimetrosApulgadas(entrada, Dato.class );
  
    client1.close();
    }

    public void pulgadaCentimetro() {
       // this.respuesta = pulgadasAcentrimetros(this.entrada);
       client1.close();
    }

    public double getDato1() {
        return entrada;
    }

    public void setDato1(double dato1) {
        this.entrada = dato1;
    }

    public double getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(double respuesta) {
        this.respuesta = respuesta;
    }
}
 
 
 