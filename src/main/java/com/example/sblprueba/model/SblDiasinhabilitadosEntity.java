package com.example.sblprueba.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "sbl_diasinhabilitados", schema = "public", catalog = "BDPortaEmpleo")
public class SblDiasinhabilitadosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "iddiainhabilitado")
    private int iddiainhabilitado;
    @Basic
    @Column(name = "fecha")
    private Date fecha;
    @Basic
    @Column(name = "motivo")
    private String motivo;

    public int getIddiainhabilitado() {
        return iddiainhabilitado;
    }

    public void setIddiainhabilitado(int iddiainhabilitado) {
        this.iddiainhabilitado = iddiainhabilitado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblDiasinhabilitadosEntity that = (SblDiasinhabilitadosEntity) o;

        if (iddiainhabilitado != that.iddiainhabilitado) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (motivo != null ? !motivo.equals(that.motivo) : that.motivo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iddiainhabilitado;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (motivo != null ? motivo.hashCode() : 0);
        return result;
    }
}
