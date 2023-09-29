package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.response;


import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ResultadoResponse {
    private boolean respuesta;
    private String mensaje;
}
