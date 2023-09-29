package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.controller.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescPeinado;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request.PeinadoRequest;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.response.ResultadoResponse;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service.DescPeinadoService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/descpeinado")
public class DescPeinadoController {

    private DescPeinadoService descPeinadoService;

    @GetMapping("/listar")
    @ResponseBody
    public List<DescPeinado> listarDescPeinado(){
        return descPeinadoService.listarDescPeinado();
    }
}
