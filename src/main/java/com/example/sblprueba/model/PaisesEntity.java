package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "paises", schema = "public", catalog = "BDPortaEmpleo")
public class PaisesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idpais")
    private Long idpais;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public Long getIdpais() {
        return idpais;
    }

    public void setIdpais(Long idpais) {
        this.idpais = idpais;
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

        PaisesEntity that = (PaisesEntity) o;

        if (idpais != that.idpais) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Math.toIntExact(idpais);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
