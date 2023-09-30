package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescManicura;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.repository.DescManicuraRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class DescManicuraService {
    private DescManicuraRepository descManicuraRepository;

    public List<DescManicura> listarDescManicura(){
        return descManicuraRepository.findAll();
    }
}
