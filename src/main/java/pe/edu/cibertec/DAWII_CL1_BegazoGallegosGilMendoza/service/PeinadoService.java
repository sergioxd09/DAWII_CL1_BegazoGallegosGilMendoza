package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescPeinado;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.Peinado;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request.PeinadoRequest;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.repository.PeinadoRepository;

@Service
public class PeinadoService {
    @Autowired
    private PeinadoRepository peinadoRepository;
    @Autowired
    private DescPeinadoService descPeinadoService;
    @Transactional
    public Boolean guardarPeinado(PeinadoRequest peinadoRequest){
        Peinado peinado = new Peinado();
        peinado.setTiempoPeinado(peinadoRequest.getTiempoPeinado());
        peinado.setPrecioPeinado(peinadoRequest.getPrecioPeinado());
        Peinado nuevoPeinado = peinadoRepository.save(peinado);
        DescPeinado descPeinado = new DescPeinado();
        descPeinado.setDescPeinado(peinadoRequest.getDescPeinado());
        descPeinado.setPeinado(peinado);
        descPeinadoService.guardarDescPeinado(descPeinado);
        return  nuevoPeinado.getIdPeinado()>0;
    }
}
