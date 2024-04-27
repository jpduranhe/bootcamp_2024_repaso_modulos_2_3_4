package cl.modulo4;

import java.util.Date;

public class ServicioAtencionVeterinariaImpl implements ServicioAtencionVeterinaria {

	private PersistirMascota persistirMascota;	
	
	public ServicioAtencionVeterinariaImpl(PersistirMascota persistirMascota) {
		this.persistirMascota = persistirMascota;
	}

	@Override
	public boolean atenderMascota(Mascota mascota) {
		System.out.println("Atendiendo a"+mascota.getNombre());
		mascota.setUltimaAtencion(new Date());
		
		int resultado=persistirMascota.guardarMascota(mascota);
		if(resultado>0) {
			persistirMascota.contarMascota();
			return true;
		}else {
			return false;
		}
		
		
	}

	@Override
	public void operarMascota(Mascota mascota) {
		System.out.println("Operando a"+mascota.getNombre());
		mascota.setUltimaAtencion(new Date());
		persistirMascota.guardarMascota(mascota);
	}

}
