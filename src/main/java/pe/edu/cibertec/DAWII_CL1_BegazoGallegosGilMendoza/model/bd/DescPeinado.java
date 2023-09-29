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
@Table(name="descpeinado")
public class DescPeinado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdDescPeinado;
    @Column(name="DescPeinado")
    private String DescPeinado;
    @OneToMany
    @JoinColumn(name="IdPeinado")
    private Peinado peinado;
}
