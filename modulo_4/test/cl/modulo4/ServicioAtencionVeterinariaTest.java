package cl.modulo4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class ServicioAtencionVeterinariaTest {
	
	ServicioAtencionVeterinaria servicioAtencionVeterinaria;
	PersistirMascota persistirMascota;
	@BeforeEach
	void setUp() throws Exception {
		 MockitoAnnotations.initMocks(this);
		
		persistirMascota= Mockito.mock(PersistirMascota.class);
		when(persistirMascota.guardarMascota(any(Mascota.class))).thenReturn(1);
		
		servicioAtencionVeterinaria= new ServicioAtencionVeterinariaImpl(persistirMascota);
	}

	@Test
	void testDevuleTrue() {
		Mascota mascota= new Mascota("Firulais","kiltro",1);
		boolean resultado=servicioAtencionVeterinaria.atenderMascota(mascota);		
		assertTrue(resultado);
		verify(persistirMascota).contarMascota();
	}
	@Test
	void testDevuleFalse() {
		when(persistirMascota.guardarMascota(any(Mascota.class))).thenReturn(0);
		Mascota mascota= new Mascota("Firulais","kiltro",1);
		boolean resultado=servicioAtencionVeterinaria.atenderMascota(mascota);		
		assertFalse(resultado);
		verify(persistirMascota,never()).contarMascota();
	}
	




}
