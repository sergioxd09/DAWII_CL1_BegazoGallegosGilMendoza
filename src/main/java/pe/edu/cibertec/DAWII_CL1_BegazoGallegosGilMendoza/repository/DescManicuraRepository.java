package pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_CL1_BegazoGallegosGilMendoza.model.bd.DescManicura;

@Repository
public interface DescManicuraRepository extends JpaRepository<DescManicura,Integer> {
}
