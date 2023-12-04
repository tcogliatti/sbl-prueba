package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sbl_areas", schema = "public", catalog = "BDPortaEmpleo")
public class SblAreasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idarea")
    private int idarea;
    @Basic
    @Column(name = "idareapadre")
    private Integer idareapadre;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public Integer getIdareapadre() {
        return idareapadre;
    }

    public void setIdareapadre(Integer idareapadre) {
        this.idareapadre = idareapadre;
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

        SblAreasEntity that = (SblAreasEntity) o;

        if (idarea != that.idarea) return false;
        if (idareapadre != null ? !idareapadre.equals(that.idareapadre) : that.idareapadre != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idarea;
        result = 31 * result + (idareapadre != null ? idareapadre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
