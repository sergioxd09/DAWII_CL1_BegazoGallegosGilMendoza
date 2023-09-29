package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request;

import lombok.Data;


@Data
public class PeinadoRequest {

    private Integer id_peinado;
    private String desc_peinado;
    private String precio_peinado;
    private String tiempo_peinado;
    private Integer id_desc_peinado;
}
