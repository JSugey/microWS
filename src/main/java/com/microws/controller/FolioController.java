package com.microws.controller;

import com.microws.entity.ApiResponse;
import com.microws.entity.Folio;
import com.microws.entity.SolicitarFolio;
import com.microws.service.FolioService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Siniestros/AMIS")
public class FolioController {
    
    @Autowired
    private FolioService servicio;
    
    
    @PostMapping("/sf/solicitar")
    public ApiResponse<Folio> solicitarFolio(@RequestBody SolicitarFolio solicitar){
        ApiResponse<Folio> respuesta;
        try {
            Folio folio = servicio.solicitarFolio(solicitar);
            respuesta = new ApiResponse("true", null, folio, null, null);
        } catch (Exception ex) {
            Logger.getLogger(FolioController.class.getName()).log(Level.SEVERE, null, ex);
            respuesta = new ApiResponse("false", null, null, null, null);
        }
        return respuesta;
    }
    
    @PostMapping("/vf/vincular")
    public ApiResponse<Folio> vincular(@RequestBody SolicitarFolio solicitar){
        ApiResponse<Folio> respuesta =new ApiResponse();
        return respuesta;
    }
    
    @PostMapping("/vf/vincularcontraparte")
    public ApiResponse<Folio> vicularContraParte(@RequestBody SolicitarFolio solicitar){
        ApiResponse<Folio> respuesta =new ApiResponse();
        return respuesta;
    }
    
    @PostMapping("/vf/consultar")
    public ApiResponse<Folio> consultar(@RequestBody SolicitarFolio solicitar){
        ApiResponse<Folio> respuesta =new ApiResponse();
        return respuesta;
    }
    
    @PostMapping("/cf/cancelar")
    public ApiResponse<Folio> cancelar(@RequestBody SolicitarFolio solicitar){
        ApiResponse<Folio> respuesta =new ApiResponse();
        
        return respuesta;
    }    
    
}
