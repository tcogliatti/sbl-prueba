package com.example.sblprueba.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "sbl_propuestaslaborales", schema = "public", catalog = "BDPortaEmpleo")
public class SblPropuestaslaboralesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idpropuestalaboral")
    private int idpropuestalaboral;
    @Basic
    @Column(name = "idempresa")
    private int idempresa;
    @Basic
    @Column(name = "idtipopuesto")
    private int idtipopuesto;
    @Basic
    @Column(name = "idrango_salario")
    private int idrangoSalario;
    @Basic
    @Column(name = "idestado_propuesta")
    private int idestadoPropuesta;
    @Basic
    @Column(name = "puesto")
    private String puesto;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "fechapublicacion")
    private Date fechapublicacion;
    @Basic
    @Column(name = "lugartrabajo")
    private String lugartrabajo;
    @Basic
    @Column(name = "empresavisible")
    private Boolean empresavisible;
    @Basic
    @Column(name = "vacantes")
    private Integer vacantes;
    @Basic
    @Column(name = "fecvto")
    private Date fecvto;
    @Basic
    @Column(name = "requisitos")
    private String requisitos;

    public int getIdpropuestalaboral() {
        return idpropuestalaboral;
    }

    public void setIdpropuestalaboral(int idpropuestalaboral) {
        this.idpropuestalaboral = idpropuestalaboral;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getIdtipopuesto() {
        return idtipopuesto;
    }

    public void setIdtipopuesto(int idtipopuesto) {
        this.idtipopuesto = idtipopuesto;
    }

    public int getIdrangoSalario() {
        return idrangoSalario;
    }

    public void setIdrangoSalario(int idrangoSalario) {
        this.idrangoSalario = idrangoSalario;
    }

    public int getIdestadoPropuesta() {
        return idestadoPropuesta;
    }

    public void setIdestadoPropuesta(int idestadoPropuesta) {
        this.idestadoPropuesta = idestadoPropuesta;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(Date fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public String getLugartrabajo() {
        return lugartrabajo;
    }

    public void setLugartrabajo(String lugartrabajo) {
        this.lugartrabajo = lugartrabajo;
    }

    public Boolean getEmpresavisible() {
        return empresavisible;
    }

    public void setEmpresavisible(Boolean empresavisible) {
        this.empresavisible = empresavisible;
    }

    public Integer getVacantes() {
        return vacantes;
    }

    public void setVacantes(Integer vacantes) {
        this.vacantes = vacantes;
    }

    public Date getFecvto() {
        return fecvto;
    }

    public void setFecvto(Date fecvto) {
        this.fecvto = fecvto;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblPropuestaslaboralesEntity that = (SblPropuestaslaboralesEntity) o;

        if (idpropuestalaboral != that.idpropuestalaboral) return false;
        if (idempresa != that.idempresa) return false;
        if (idtipopuesto != that.idtipopuesto) return false;
        if (idrangoSalario != that.idrangoSalario) return false;
        if (idestadoPropuesta != that.idestadoPropuesta) return false;
        if (puesto != null ? !puesto.equals(that.puesto) : that.puesto != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (fechapublicacion != null ? !fechapublicacion.equals(that.fechapublicacion) : that.fechapublicacion != null)
            return false;
        if (lugartrabajo != null ? !lugartrabajo.equals(that.lugartrabajo) : that.lugartrabajo != null) return false;
        if (empresavisible != null ? !empresavisible.equals(that.empresavisible) : that.empresavisible != null)
            return false;
        if (vacantes != null ? !vacantes.equals(that.vacantes) : that.vacantes != null) return false;
        if (fecvto != null ? !fecvto.equals(that.fecvto) : that.fecvto != null) return false;
        if (requisitos != null ? !requisitos.equals(that.requisitos) : that.requisitos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpropuestalaboral;
        result = 31 * result + idempresa;
        result = 31 * result + idtipopuesto;
        result = 31 * result + idrangoSalario;
        result = 31 * result + idestadoPropuesta;
        result = 31 * result + (puesto != null ? puesto.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (fechapublicacion != null ? fechapublicacion.hashCode() : 0);
        result = 31 * result + (lugartrabajo != null ? lugartrabajo.hashCode() : 0);
        result = 31 * result + (empresavisible != null ? empresavisible.hashCode() : 0);
        result = 31 * result + (vacantes != null ? vacantes.hashCode() : 0);
        result = 31 * result + (fecvto != null ? fecvto.hashCode() : 0);
        result = 31 * result + (requisitos != null ? requisitos.hashCode() : 0);
        return result;
    }
}
