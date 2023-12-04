package com.example.sblprueba.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "calles", schema = "public", catalog = "BDPortaEmpleo")
public class CallesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idcalle")
    private Long idcalle;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "codusualta")
    private String codusualta;
    @Basic
    @Column(name = "fecalta")
    private Date fecalta;
    @Basic
    @Column(name = "idhostalta")
    private String idhostalta;
    @Basic
    @Column(name = "codusumodi")
    private String codusumodi;
    @Basic
    @Column(name = "fecmodi")
    private Date fecmodi;
    @Basic
    @Column(name = "idhostmodi")
    private String idhostmodi;
    @Basic
    @Column(name = "codusubaja")
    private String codusubaja;
    @Basic
    @Column(name = "fecbaja")
    private Date fecbaja;
    @Basic
    @Column(name = "idhostbaja")
    private String idhostbaja;

    public Long getIdcalle() {
        return idcalle;
    }

    public void setIdcalle(Long idcalle) {
        this.idcalle = idcalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodusualta() {
        return codusualta;
    }

    public void setCodusualta(String codusualta) {
        this.codusualta = codusualta;
    }

    public Date getFecalta() {
        return fecalta;
    }

    public void setFecalta(Date fecalta) {
        this.fecalta = fecalta;
    }

    public String getIdhostalta() {
        return idhostalta;
    }

    public void setIdhostalta(String idhostalta) {
        this.idhostalta = idhostalta;
    }

    public String getCodusumodi() {
        return codusumodi;
    }

    public void setCodusumodi(String codusumodi) {
        this.codusumodi = codusumodi;
    }

    public Date getFecmodi() {
        return fecmodi;
    }

    public void setFecmodi(Date fecmodi) {
        this.fecmodi = fecmodi;
    }

    public String getIdhostmodi() {
        return idhostmodi;
    }

    public void setIdhostmodi(String idhostmodi) {
        this.idhostmodi = idhostmodi;
    }

    public String getCodusubaja() {
        return codusubaja;
    }

    public void setCodusubaja(String codusubaja) {
        this.codusubaja = codusubaja;
    }

    public Date getFecbaja() {
        return fecbaja;
    }

    public void setFecbaja(Date fecbaja) {
        this.fecbaja = fecbaja;
    }

    public String getIdhostbaja() {
        return idhostbaja;
    }

    public void setIdhostbaja(String idhostbaja) {
        this.idhostbaja = idhostbaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CallesEntity that = (CallesEntity) o;

        if (idcalle != that.idcalle) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (codusualta != null ? !codusualta.equals(that.codusualta) : that.codusualta != null) return false;
        if (fecalta != null ? !fecalta.equals(that.fecalta) : that.fecalta != null) return false;
        if (idhostalta != null ? !idhostalta.equals(that.idhostalta) : that.idhostalta != null) return false;
        if (codusumodi != null ? !codusumodi.equals(that.codusumodi) : that.codusumodi != null) return false;
        if (fecmodi != null ? !fecmodi.equals(that.fecmodi) : that.fecmodi != null) return false;
        if (idhostmodi != null ? !idhostmodi.equals(that.idhostmodi) : that.idhostmodi != null) return false;
        if (codusubaja != null ? !codusubaja.equals(that.codusubaja) : that.codusubaja != null) return false;
        if (fecbaja != null ? !fecbaja.equals(that.fecbaja) : that.fecbaja != null) return false;
        if (idhostbaja != null ? !idhostbaja.equals(that.idhostbaja) : that.idhostbaja != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Math.toIntExact(idcalle);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (codusualta != null ? codusualta.hashCode() : 0);
        result = 31 * result + (fecalta != null ? fecalta.hashCode() : 0);
        result = 31 * result + (idhostalta != null ? idhostalta.hashCode() : 0);
        result = 31 * result + (codusumodi != null ? codusumodi.hashCode() : 0);
        result = 31 * result + (fecmodi != null ? fecmodi.hashCode() : 0);
        result = 31 * result + (idhostmodi != null ? idhostmodi.hashCode() : 0);
        result = 31 * result + (codusubaja != null ? codusubaja.hashCode() : 0);
        result = 31 * result + (fecbaja != null ? fecbaja.hashCode() : 0);
        result = 31 * result + (idhostbaja != null ? idhostbaja.hashCode() : 0);
        return result;
    }
}
