package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estadoscivil", schema = "public", catalog = "BDPortaEmpleo")
public class EstadoscivilEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idestadocivil")
    private Long idestadocivil;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public Long getIdestadocivil() {
        return idestadocivil;
    }

    public void setIdestadocivil(Long idestadocivil) {
        this.idestadocivil = idestadocivil;
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

        EstadoscivilEntity that = (EstadoscivilEntity) o;

        if (idestadocivil != that.idestadocivil) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Math.toIntExact(idestadocivil);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
