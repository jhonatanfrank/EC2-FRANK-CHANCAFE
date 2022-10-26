package EC2JhonatanChancafeBodega.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC2JhonatanChancafeBodega.model.Producto;
import EC2JhonatanChancafeBodega.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;

	@Override
	public List<Producto> listar() {
		return repository.findAll();
	}

	@Override
	public Producto obtener(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Producto producto) {
		repository.save(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		repository.saveAndFlush(producto);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

}
