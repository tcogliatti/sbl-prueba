package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sgde_estado_empresa", schema = "public", catalog = "BDPortaEmpleo")
public class SgdeEstadoEmpresaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idestado_empresa")
    private int idestadoEmpresa;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdestadoEmpresa() {
        return idestadoEmpresa;
    }

    public void setIdestadoEmpresa(int idestadoEmpresa) {
        this.idestadoEmpresa = idestadoEmpresa;
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

        SgdeEstadoEmpresaEntity that = (SgdeEstadoEmpresaEntity) o;

        if (idestadoEmpresa != that.idestadoEmpresa) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idestadoEmpresa;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
