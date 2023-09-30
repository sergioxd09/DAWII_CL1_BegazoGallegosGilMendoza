package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.controller.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescManicura;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.service.DescManicuraService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/descmanicura")
public class DescManicuraController {
    private DescManicuraService descManicuraService;

    @GetMapping("/listar")
    @ResponseBody
    public List<DescManicura> listarDescManicura(){
        return descManicuraService.listarDescManicura();
    }
}
