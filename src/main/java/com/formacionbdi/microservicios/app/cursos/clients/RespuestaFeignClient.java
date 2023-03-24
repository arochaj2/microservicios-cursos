package com.formacionbdi.microservicios.app.cursos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="microservicios-respuestas")
public interface RespuestaFeignClient {
	
	@GetMapping("/alumno/{alumnoId}/examenes-respondidos")
	public Iterable<Long> obtenerExamenesIdsConRespuestaAlumno(@PathVariable Long alumnoId); //<-- no necesariamente el nombre tiene que tener el mismo nombre del metodo

}
