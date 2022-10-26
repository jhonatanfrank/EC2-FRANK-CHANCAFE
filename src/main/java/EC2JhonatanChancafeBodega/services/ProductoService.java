package EC2JhonatanChancafeBodega.services;

import java.util.List;

import EC2JhonatanChancafeBodega.model.Producto;

public interface ProductoService {
	List<Producto> listar();

	Producto obtener(Integer id);

	void guardar(Producto producto);

	void actualizar(Producto producto);

	void eliminar(Integer id);
}
