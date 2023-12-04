package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sbl_rango_salario", schema = "public", catalog = "BDPortaEmpleo")
public class SblRangoSalarioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idrango_salario")
    private int idrangoSalario;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdrangoSalario() {
        return idrangoSalario;
    }

    public void setIdrangoSalario(int idrangoSalario) {
        this.idrangoSalario = idrangoSalario;
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

        SblRangoSalarioEntity that = (SblRangoSalarioEntity) o;

        if (idrangoSalario != that.idrangoSalario) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idrangoSalario;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
