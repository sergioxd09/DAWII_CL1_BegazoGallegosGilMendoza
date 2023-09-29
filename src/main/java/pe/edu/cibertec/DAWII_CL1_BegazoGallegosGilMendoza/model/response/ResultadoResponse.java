package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.response;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResultadoResponse {
    private boolean respuesta;
    private String mensaje;
}
