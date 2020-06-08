/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.burbano.servicio.recurso;

import com.google.gson.Gson;
import ec.edu.burbano.modelo.Dato;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author IABN
 */
@Path("/ConversionCentimetros")
public class ConversionCentimetros {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public double centimetrosApulgadas(String centimetros) {
        Gson gson = new Gson();
        Dato dato_entrada = gson.fromJson(centimetros, Dato.class);
        dato_entrada.setSalidad(dato_entrada.getEntrada() / 2.54);
        return dato_entrada.getSalidad();
    }
}
