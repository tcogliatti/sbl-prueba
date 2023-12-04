package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sbl_tipospuesto", schema = "public", catalog = "BDPortaEmpleo")
public class SblTipospuestoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtipopuesto")
    private int idtipopuesto;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdtipopuesto() {
        return idtipopuesto;
    }

    public void setIdtipopuesto(int idtipopuesto) {
        this.idtipopuesto = idtipopuesto;
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

        SblTipospuestoEntity that = (SblTipospuestoEntity) o;

        if (idtipopuesto != that.idtipopuesto) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtipopuesto;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
