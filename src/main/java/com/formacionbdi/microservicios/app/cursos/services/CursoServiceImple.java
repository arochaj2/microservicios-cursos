package com.formacionbdi.microservicios.app.cursos.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.microservicios.app.cursos.clients.RespuestaFeignClient;
import com.formacionbdi.microservicios.app.cursos.models.repository.CursoRepository;
import com.formacionbdi.microservicios.app.models.cursos.entity.Curso;
import com.formacionbdi.microservicios.commons.services.CommonServiceImpl;

@Service
public class CursoServiceImple extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {

	@Autowired
	RespuestaFeignClient client;
	
	@Override
	@Transactional(readOnly = true)
	public Curso findCursoByAlumnoId(Long id) {
		return repository.findCursoByAlumnoId(id);
	}

	@Override
	public Iterable<Long> obtenerExamenesIdsConRespuestaAlumno(Long alumnoId) {
		return client.obtenerExamenesIdsConRespuestaAlumno(alumnoId);
	}



}
