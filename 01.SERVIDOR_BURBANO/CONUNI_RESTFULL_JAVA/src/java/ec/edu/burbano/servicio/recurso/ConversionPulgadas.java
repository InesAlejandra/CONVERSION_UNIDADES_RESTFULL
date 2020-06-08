/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.burbano.servicio.recurso;

import com.google.gson.Gson;
import ec.edu.burbano.modelo.Dato;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author IABN
 */
@Path("/ConversionPulgadas")
public class ConversionPulgadas {
    
 
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public double pulgadasAcentimetros(String pulgadas) {
        Gson gson = new Gson();
        Dato dato_entrada = gson.fromJson(pulgadas, Dato.class);
        dato_entrada.setSalidad(dato_entrada.getEntrada()*2.54);
        return dato_entrada.getSalidad();
    }  
}
