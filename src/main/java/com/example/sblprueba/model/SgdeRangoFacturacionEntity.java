package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sgde_rango_facturacion", schema = "public", catalog = "BDPortaEmpleo")
public class SgdeRangoFacturacionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idrango_facturacion")
    private int idrangoFacturacion;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "maximo")
    private Integer maximo;

    public int getIdrangoFacturacion() {
        return idrangoFacturacion;
    }

    public void setIdrangoFacturacion(int idrangoFacturacion) {
        this.idrangoFacturacion = idrangoFacturacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getMaximo() {
        return maximo;
    }

    public void setMaximo(Integer maximo) {
        this.maximo = maximo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgdeRangoFacturacionEntity that = (SgdeRangoFacturacionEntity) o;

        if (idrangoFacturacion != that.idrangoFacturacion) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (maximo != null ? !maximo.equals(that.maximo) : that.maximo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idrangoFacturacion;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (maximo != null ? maximo.hashCode() : 0);
        return result;
    }
}
