package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sbl_niveles_educativos", schema = "public", catalog = "BDPortaEmpleo")
public class SblNivelesEducativosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idniveleducativo")
    private int idniveleducativo;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdniveleducativo() {
        return idniveleducativo;
    }

    public void setIdniveleducativo(int idniveleducativo) {
        this.idniveleducativo = idniveleducativo;
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

        SblNivelesEducativosEntity that = (SblNivelesEducativosEntity) o;

        if (idniveleducativo != that.idniveleducativo) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idniveleducativo;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
