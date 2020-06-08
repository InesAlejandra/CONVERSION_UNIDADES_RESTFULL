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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author IABN
 */
@Path("/Conversion")
public class Conversion {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String saludar() {
        return "Mi API REST";
    }
   

   
    

}
