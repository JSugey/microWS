package com.microws.service;

import com.microws.entity.Folio;
import com.microws.entity.SolicitarFolio;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Service;

@Service(value = "folioService")
public class FolioService {
    
    public Folio solicitarFolio(SolicitarFolio solicitar) throws Exception{
        Folio folio = new Folio();
        int idRandom =(int)(Math.random() * 9999) + 1;
        String fecha = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");  
        Date date = new Date(solicitar.getFechaAtencion().getTime());
        fecha = sdf.format(date);        
        String folioString = solicitar.getNumeroSiniestro()+fecha+solicitar.getOrigen()+solicitar.getDestino();
        folio.setIdFolioAtencion(idRandom+"");
        folio.setFolioAtencion(folioString);
        return folio;
    }
}
