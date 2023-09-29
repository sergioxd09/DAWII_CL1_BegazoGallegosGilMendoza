package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescMaquillaje;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.Maquillaje;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request.MaquillajeRequest;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.response.ResultadoResponse;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.repository.MaquillajeRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class MaquillajeService {
    private MaquillajeRepository maquillajeRepository;
    public List<Maquillaje> listarMaquillaje(){return maquillajeRepository.findAll(); }

    public ResultadoResponse guardarMaquillaje(MaquillajeRequest maquillaje){
        String mensaje = "Maquillaje registrado correctamente";
        Boolean respuesta = true;
        try {
            Maquillaje objMaquillaje = new Maquillaje();
            if (maquillaje.getId_maquillaje() > 0) {
                objMaquillaje.setId_maquillaje(maquillaje.getId_maquillaje());
            }
            objMaquillaje.setPrecio_maquillaje(maquillaje.getPrecio_maquillaje());
            objMaquillaje.setTiempo_maquillaje(maquillaje.getTiempo_maquillaje());

            DescMaquillaje descMaquillaje = new DescMaquillaje();
            descMaquillaje.setId_desc_maquillaje(maquillaje.getId_desc_maquillaje());
            objMaquillaje.setDescmaquillaje(descMaquillaje);


            maquillajeRepository.save(objMaquillaje);
        }catch (Exception ex){
            mensaje = "Maquillaje no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
}
