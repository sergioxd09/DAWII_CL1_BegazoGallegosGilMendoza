package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescPeinado;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.repository.DescPeinadoRepository;
@Service
public class DescPeinadoService {
    @Autowired
    private DescPeinadoRepository descPeinadoRepository;

    public DescPeinado guardarDescPeinado(DescPeinado descPeinado){
        return descPeinadoRepository.save(descPeinado);
    }
}
