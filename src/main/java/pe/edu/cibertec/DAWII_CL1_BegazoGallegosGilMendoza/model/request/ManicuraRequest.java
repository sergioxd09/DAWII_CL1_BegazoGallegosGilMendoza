package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.request;

import lombok.Data;

@Data
public class ManicuraRequest {
    private Integer id_manicura;
    private String desc_manicura;
    private String precio_manicura;
    private String tiempo_manicura;
    private Integer id_desc_manicura;
}
