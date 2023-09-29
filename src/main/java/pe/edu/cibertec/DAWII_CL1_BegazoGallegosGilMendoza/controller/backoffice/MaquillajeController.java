package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.controller.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.Maquillaje;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request.MaquillajeRequest;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.response.ResultadoResponse;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service.MaquillajeService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/maquillaje")
public class MaquillajeController {

    private MaquillajeService maquillajeService;

    @GetMapping("")
    public String index(Model model){
        model.addAttribute("listaMaquillaje",
                maquillajeService.listarMaquillaje());
        return "backoffice/maquillaje/frmMantMaquillaje";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Maquillaje> listarMaquillaje(){
        return maquillajeService.listarMaquillaje();
    }
    @PostMapping("/guardar")
    @ResponseBody
    public ResultadoResponse guardarMaquillaje(
            @RequestBody MaquillajeRequest maquillajeRequest
    ){
        return maquillajeService.guardarMaquillaje(maquillajeRequest);
    }
}
