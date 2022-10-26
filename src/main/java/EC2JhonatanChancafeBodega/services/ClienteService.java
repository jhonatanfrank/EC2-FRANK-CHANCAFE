package EC2JhonatanChancafeBodega.services;

import java.util.List;

import EC2JhonatanChancafeBodega.model.Cliente;

public interface ClienteService {
	List<Cliente> listar();

	Cliente obtener(Integer id);

	void guardar(Cliente cliente);

	void actualizar(Cliente cliente);

	void eliminar(Integer id);
}
