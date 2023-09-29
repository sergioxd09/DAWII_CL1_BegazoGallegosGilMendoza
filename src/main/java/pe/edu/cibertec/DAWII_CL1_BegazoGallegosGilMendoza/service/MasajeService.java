package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescMasaje;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.Masaje;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request.MasajeRequest;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.response.ResultadoResponse;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.repository.MasajeRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class MasajeService {

    private MasajeRepository masajeRepository;

    public List<Masaje> listarMasaje() {return masajeRepository.findAll();}
    public ResultadoResponse guaradarMasaje(MasajeRequest masaje){
    String mensaje = "Masaje registrado Correctamente";
    Boolean respuesta = true;
    try{
        Masaje objMasaje = new Masaje();
        if(objMasaje.getId_masaje()>0){
            objMasaje.setId_masaje(objMasaje.getId_masaje());
        }
        objMasaje.setTiempo_masaje((objMasaje.getTiempo_masaje()));
        objMasaje.setPrecio_masaje((objMasaje.getPrecio_masaje()));

        DescMasaje descMasaje = new DescMasaje();
        descMasaje.setId_desc_masaje(descMasaje.getId_desc_masaje());
        objMasaje.setDecmasaje((descMasaje));

        masajeRepository.save(objMasaje);
    }catch (Exception ex){
        mensaje = "Masaje no registro";
        respuesta = false;
    }
    return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
}
