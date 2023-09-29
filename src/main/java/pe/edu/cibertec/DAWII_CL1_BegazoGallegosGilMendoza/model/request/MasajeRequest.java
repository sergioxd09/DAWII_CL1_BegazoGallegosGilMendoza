package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request;

import lombok.Data;

@Data
public class MasajeRequest {

    private Integer id_masaje;
    private String desc_masaje;
    private String precio_masaje;
    private String tiempo_masaje;
    private Integer id_desc_masaje;


}
