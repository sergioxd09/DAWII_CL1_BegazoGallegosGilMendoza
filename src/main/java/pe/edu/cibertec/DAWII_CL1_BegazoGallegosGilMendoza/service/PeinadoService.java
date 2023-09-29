package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescPeinado;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.Peinado;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request.PeinadoRequest;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.response.ResultadoResponse;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.repository.PeinadoRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class PeinadoService {

    private PeinadoRepository peinadoRepository;


    public List<Peinado> listarPeinado() {
        return peinadoRepository.findAll();
    }

    public ResultadoResponse guardarPeinado(PeinadoRequest peinado) {
        String mensaje = "Peinado registrado correctamente";
        Boolean respuesta = true;
        try {
            Peinado objPeinado = new Peinado();
            if (peinado.getId_peinado() > 0) {
                objPeinado.setId_peinado(peinado.getId_peinado());
            }
            objPeinado.setPrecio_peinado(peinado.getPrecio_peinado());
            objPeinado.setTiempo_peinado(peinado.getTiempo_peinado());

            DescPeinado descPeinado = new DescPeinado();
            descPeinado.setId_desc_peinado(peinado.getId_desc_peinado());
            objPeinado.setDescpeinado(descPeinado);


            peinadoRepository.save(objPeinado);
        }catch (Exception ex){
            mensaje = "Peinado no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
}


