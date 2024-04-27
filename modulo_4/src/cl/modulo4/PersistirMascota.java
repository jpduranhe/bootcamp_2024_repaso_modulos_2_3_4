package cl.modulo4;

import java.util.List;

public interface PersistirMascota {
	
	int guardarMascota(Mascota mascota);
	int contarMascota();
	Mascota getMascota(String nombre);
	List<Mascota> getListado();
}
