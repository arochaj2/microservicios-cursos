package com.formacionbdi.microservicios.app.cursos.services;

import com.formacionbdi.microservicios.app.models.cursos.entity.Curso;
import com.formacionbdi.microservicios.commons.services.CommonService;

public interface CursoService extends CommonService<Curso> {
	
	public Curso findCursoByAlumnoId(Long id);

}
