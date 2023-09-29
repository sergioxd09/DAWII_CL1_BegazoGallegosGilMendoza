package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request;

import lombok.Data;


@Data
public class MaquillajeRequest {

    private Integer id_maquillaje;
    private String desc_maquillaje;
    private String precio_maquillaje;
    private String tiempo_maquillaje;
    private Integer id_desc_maquillaje;
}

