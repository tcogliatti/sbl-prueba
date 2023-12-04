package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sbl_motivo_reunion", schema = "public", catalog = "BDPortaEmpleo")
public class SblMotivoReunionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmotivo")
    private int idmotivo;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdmotivo() {
        return idmotivo;
    }

    public void setIdmotivo(int idmotivo) {
        this.idmotivo = idmotivo;
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

        SblMotivoReunionEntity that = (SblMotivoReunionEntity) o;

        if (idmotivo != that.idmotivo) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idmotivo;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
