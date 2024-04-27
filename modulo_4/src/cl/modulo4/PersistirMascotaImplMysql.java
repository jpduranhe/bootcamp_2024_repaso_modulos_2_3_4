package cl.modulo4;

import java.util.List;

public class PersistirMascotaImplMysql implements PersistirMascota {

	@Override
	public int guardarMascota(Mascota mascota) {
		
		return 1;
	}

	@Override
	public int contarMascota() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Mascota getMascota(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mascota> getListado() {
		// TODO Auto-generated method stub
		return null;
	}

}
