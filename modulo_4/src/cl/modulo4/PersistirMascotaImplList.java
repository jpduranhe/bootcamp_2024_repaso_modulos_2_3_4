package cl.modulo4;

import java.util.ArrayList;
import java.util.List;

public class PersistirMascotaImplList implements PersistirMascota{
	
	List<Mascota> list= new ArrayList<>();

	@Override
	public int guardarMascota(Mascota mascota) {
		// TODO Auto-generated method stub
		list.add(mascota);
		return 1;
	}

	@Override
	public int contarMascota() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Mascota getMascota(String nombre) {
		return list.get(0);
	}

	@Override
	public List<Mascota> getListado() {
		// TODO Auto-generated method stub
		return list;
	}

}
