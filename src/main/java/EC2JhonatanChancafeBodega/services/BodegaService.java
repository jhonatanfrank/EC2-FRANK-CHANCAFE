package EC2JhonatanChancafeBodega.services;

import java.util.List;

import EC2JhonatanChancafeBodega.model.Bodega;

public interface BodegaService {
	List<Bodega> listar();

	Bodega obtener(Integer id);

	void guardar(Bodega bodega);

	void actualizar(Bodega bodega);

	void eliminar(Integer id);
}
