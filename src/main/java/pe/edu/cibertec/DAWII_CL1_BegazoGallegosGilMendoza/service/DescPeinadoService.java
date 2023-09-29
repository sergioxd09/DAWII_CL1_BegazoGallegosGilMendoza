package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescPeinado;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.repository.DescPeinadoRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class DescPeinadoService {

    private DescPeinadoRepository descPeinadoRepository;

    public List<DescPeinado> listarDescPeinado(){
        return descPeinadoRepository.findAll();
    }
}
