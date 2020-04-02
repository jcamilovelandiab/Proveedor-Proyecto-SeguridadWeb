/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.toluca.proveedor.api.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author jcami
 */
@Path("products")
public class ProductController {
    
    @GET
    public Response ping(){
        return Response
                .ok("Hey! This is the product controller")
                .build();
    }
    
}
