package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.controller.backoffice;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.Masaje;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request.MasajeRequest;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.response.ResultadoResponse;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service.MasajeService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/masaje")
public class MasajeController {

    private MasajeService masajeService;

    @GetMapping("")
    public String index(Model model){
        model.addAttribute("listarMasaje",
                masajeService.listarMasaje());
        return "backoffice/masaje/frmMantMasaje";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Masaje> listarMasaje(){return masajeService.listarMasaje();}

    @PostMapping("/guardar")
    @ResponseBody
    public ResultadoResponse guardarMasaje(
            @RequestBody MasajeRequest masajeRequest
            ){
        return masajeService.guaradarMasaje(masajeRequest);
    }
}
