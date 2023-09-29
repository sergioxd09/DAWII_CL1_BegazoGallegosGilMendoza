package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.controller.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescMaquillaje;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service.DescMaquillajeService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/descmaquillaje")
public class DescMaquillajeController {
    private DescMaquillajeService descMaquillajeService;

    @GetMapping("/listar")
    @ResponseBody
    public List<DescMaquillaje> listarDescMaquillaje(){
        return descMaquillajeService.listarDescMaquillaje();
    }
}
