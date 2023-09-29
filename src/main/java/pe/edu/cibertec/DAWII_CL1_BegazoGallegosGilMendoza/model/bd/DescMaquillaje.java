package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd;

import jakarta.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@Entity
@Table(name="descmaquillaje")

public class DescMaquillaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_desc_maquillaje;
    @Column(name="desc_maquillaje")
    private String desc_maquillaje;
}
