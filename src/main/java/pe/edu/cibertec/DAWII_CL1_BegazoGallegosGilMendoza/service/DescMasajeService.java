package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescMasaje;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.repository.DescMasajeRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class DescMasajeService {
    private DescMasajeRepository descMasajeRepository;

    public List<DescMasaje> listarDescMasaje(){return descMasajeRepository.findAll();}
}
