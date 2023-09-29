package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescMaquillaje;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.repository.DescMaquillajeRepository;
import java.util.List;

@AllArgsConstructor
@Service
public class DescMaquillajeService {
    private DescMaquillajeRepository descMaquillajeRepository;

    public List<DescMaquillaje> listarDescMaquillaje(){
        return descMaquillajeRepository.findAll();
    }
}
