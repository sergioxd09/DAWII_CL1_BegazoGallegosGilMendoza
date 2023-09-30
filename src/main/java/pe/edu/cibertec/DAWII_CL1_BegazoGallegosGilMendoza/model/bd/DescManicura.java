package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "descmanicura")
public class DescManicura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_desc_manicura;
    @Column(name = "desc_manicura")
    private String desc_manicura;
}
