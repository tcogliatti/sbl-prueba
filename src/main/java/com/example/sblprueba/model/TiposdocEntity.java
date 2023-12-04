package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tiposdoc", schema = "public", catalog = "BDPortaEmpleo")
public class TiposdocEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "idtipodoc")
    private Long idtipodoc;
    @Basic
    @Column(name = "codigo")
    private String codigo;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public Long getIdtipodoc() {
        return idtipodoc;
    }

    public void setIdtipodoc(Long idtipodoc) {
        this.idtipodoc = idtipodoc;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

        TiposdocEntity that = (TiposdocEntity) o;

        if (idtipodoc != that.idtipodoc) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Math.toIntExact(idtipodoc);
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
