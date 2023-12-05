package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sbl_estados_propuestas", schema = "public", catalog = "BDPortaEmpleo")
public class SblEstadosPropuestasEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "idestado_propuesta")
    private Long idestadoPropuesta;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public Long getIdestadoPropuesta() {
        return idestadoPropuesta;
    }

    public void setIdestadoPropuesta(Long idestadoPropuesta) {
        this.idestadoPropuesta = idestadoPropuesta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblEstadosPropuestasEntity that = (SblEstadosPropuestasEntity) o;

        if (idestadoPropuesta != that.idestadoPropuesta) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Long result = idestadoPropuesta;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return Math.toIntExact(result);
    }
}
