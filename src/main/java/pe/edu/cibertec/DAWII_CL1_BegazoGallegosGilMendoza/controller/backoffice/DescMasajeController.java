package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.controller.backoffice;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescMasaje;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service.DescMasajeService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/descmasaje")
public class DescMasajeController {

    private DescMasajeService descMasajeService;

    @GetMapping("/listar")
    @ResponseBody
    public List<DescMasaje> listarDescMasaje(){return descMasajeService.listarDescMasaje();}
}
