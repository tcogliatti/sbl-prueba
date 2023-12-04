package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "idiomas", schema = "public", catalog = "BDPortaEmpleo")
public class IdiomasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ididioma")
    private int ididioma;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdidioma() {
        return ididioma;
    }

    public void setIdidioma(int ididioma) {
        this.ididioma = ididioma;
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

        IdiomasEntity that = (IdiomasEntity) o;

        if (ididioma != that.ididioma) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ididioma;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
