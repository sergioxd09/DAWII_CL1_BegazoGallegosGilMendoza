package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="peinado")
public class Peinado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdPeinado;
    @Column(name="PrecioPeinado")
    private String PrecioPeinado;
    @Column(name="TiempoPeinado")
    private String TiempoPeinado;

}
