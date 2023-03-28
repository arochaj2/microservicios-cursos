package com.formacionbdi.microservicios.app.models.cursos.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cursos_alumnos")
public class CursoAlumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="alumno_id", unique=true)
	private Long alumnoId;
	
	@JsonIgnoreProperties(value = "cursoAlumnos")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="curso_id")
	private Curso curso;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the alumnoId
	 */
	public Long getAlumnoId() {
		return alumnoId;
	}

	/**
	 * @param alumnoId the alumnoId to set
	 */
	public void setAlumnoId(Long alumnoId) {
		this.alumnoId = alumnoId;
	}

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alumnoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CursoAlumno)) {
			return false;
		}
		CursoAlumno other = (CursoAlumno) obj;
		return Objects.equals(alumnoId, other.alumnoId);
	}
	
	
	
}
