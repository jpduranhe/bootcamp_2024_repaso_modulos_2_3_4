package cl.modulo4;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersistirMascota persistirMascota= new PersistirMascotaImplMysql();
		ServicioAtencionVeterinaria servicioAtencionVeterinaria= new ServicioAtencionVeterinariaImpl(persistirMascota);

		Mascota mascota= new Mascota("Firulais","kiltro",1);
		Boolean result = servicioAtencionVeterinaria.atenderMascota(mascota);
		
		System.out.println("resutado Atencion->"+result);
		
	}

}
