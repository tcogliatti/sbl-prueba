package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sgde_sector_economico", schema = "public", catalog = "BDPortaEmpleo")
public class SgdeSectorEconomicoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idsector_economico")
    private int idsectorEconomico;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdsectorEconomico() {
        return idsectorEconomico;
    }

    public void setIdsectorEconomico(int idsectorEconomico) {
        this.idsectorEconomico = idsectorEconomico;
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

        SgdeSectorEconomicoEntity that = (SgdeSectorEconomicoEntity) o;

        if (idsectorEconomico != that.idsectorEconomico) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idsectorEconomico;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
