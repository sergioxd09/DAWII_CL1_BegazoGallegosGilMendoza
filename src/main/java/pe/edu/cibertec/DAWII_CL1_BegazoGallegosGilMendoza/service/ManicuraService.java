package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescManicura;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.Manicura;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request.ManicuraRequest;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.response.ResultadoResponse;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.repository.ManicuraRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ManicuraService {
    private ManicuraRepository manicuraRepository;

    public List<Manicura> listarManicura(){
        return manicuraRepository.findAll();
    }
    public ResultadoResponse guardarManicura(ManicuraRequest manicura){
        String mensaje = "Manicura Registrado Correctamente";
        Boolean respuesta = true;
        try{
            Manicura objManicura = new Manicura();
            if(manicura.getId_manicura()>0){
                objManicura.setId_manicura(manicura.getId_manicura());
            }
            objManicura.setPrecio_manicura(manicura.getPrecio_manicura());
            objManicura.setTiempo_manicura(manicura.getTiempo_manicura());

            DescManicura descManicura = new DescManicura();
            descManicura.setId_desc_manicura(manicura.getId_desc_manicura());
            objManicura.setDescmanicura(descManicura);

            manicuraRepository.save(objManicura);

        }catch(Exception ex){
            mensaje = "Manicura no Registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
}
