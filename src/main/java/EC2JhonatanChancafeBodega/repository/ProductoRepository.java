package EC2JhonatanChancafeBodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC2JhonatanChancafeBodega.model.Producto;

@Repository

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
