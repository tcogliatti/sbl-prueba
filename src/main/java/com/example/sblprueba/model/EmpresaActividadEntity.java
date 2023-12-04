package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "empresa_actividad", schema = "public", catalog = "BDPortaEmpleo")
public class EmpresaActividadEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idempresaactiv")
    private int idempresaactiv;
    @Basic
    @Column(name = "idempresa")
    private int idempresa;
    @Basic
    @Column(name = "idactividad")
    private int idactividad;

    public int getIdempresaactiv() {
        return idempresaactiv;
    }

    public void setIdempresaactiv(int idempresaactiv) {
        this.idempresaactiv = idempresaactiv;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(int idactividad) {
        this.idactividad = idactividad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpresaActividadEntity that = (EmpresaActividadEntity) o;

        if (idempresaactiv != that.idempresaactiv) return false;
        if (idempresa != that.idempresa) return false;
        if (idactividad != that.idactividad) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idempresaactiv;
        result = 31 * result + idempresa;
        result = 31 * result + idactividad;
        return result;
    }
}
