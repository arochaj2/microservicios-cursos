package com.formacionbdi.microservicios.app.cursos.services;

import org.springframework.web.bind.annotation.PathVariable;

import com.formacionbdi.microservicios.app.models.cursos.entity.Curso;
import com.formacionbdi.microservicios.commons.services.CommonService;

public interface CursoService extends CommonService<Curso> {
	
	public Curso findCursoByAlumnoId(Long id);
	
	public Iterable<Long> obtenerExamenesIdsConRespuestaAlumno(Long alumnoId);

}
