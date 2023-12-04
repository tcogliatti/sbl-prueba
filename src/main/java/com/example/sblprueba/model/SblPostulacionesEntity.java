package com.example.sblprueba.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "sbl_postulaciones", schema = "public", catalog = "BDPortaEmpleo")
public class SblPostulacionesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idpostulacion")
    private int idpostulacion;
    @Basic
    @Column(name = "idpostulante")
    private int idpostulante;
    @Basic
    @Column(name = "idpropuestalaboral")
    private int idpropuestalaboral;
    @Basic
    @Column(name = "fecha")
    private Date fecha;
    @Basic
    @Column(name = "apto")
    private Boolean apto;
    @Basic
    @Column(name = "notificado")
    private Boolean notificado;
    @Basic
    @Column(name = "activo")
    private Boolean activo;

    public int getIdpostulacion() {
        return idpostulacion;
    }

    public void setIdpostulacion(int idpostulacion) {
        this.idpostulacion = idpostulacion;
    }

    public int getIdpostulante() {
        return idpostulante;
    }

    public void setIdpostulante(int idpostulante) {
        this.idpostulante = idpostulante;
    }

    public int getIdpropuestalaboral() {
        return idpropuestalaboral;
    }

    public void setIdpropuestalaboral(int idpropuestalaboral) {
        this.idpropuestalaboral = idpropuestalaboral;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getApto() {
        return apto;
    }

    public void setApto(Boolean apto) {
        this.apto = apto;
    }

    public Boolean getNotificado() {
        return notificado;
    }

    public void setNotificado(Boolean notificado) {
        this.notificado = notificado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblPostulacionesEntity that = (SblPostulacionesEntity) o;

        if (idpostulacion != that.idpostulacion) return false;
        if (idpostulante != that.idpostulante) return false;
        if (idpropuestalaboral != that.idpropuestalaboral) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (apto != null ? !apto.equals(that.apto) : that.apto != null) return false;
        if (notificado != null ? !notificado.equals(that.notificado) : that.notificado != null) return false;
        if (activo != null ? !activo.equals(that.activo) : that.activo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpostulacion;
        result = 31 * result + idpostulante;
        result = 31 * result + idpropuestalaboral;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (apto != null ? apto.hashCode() : 0);
        result = 31 * result + (notificado != null ? notificado.hashCode() : 0);
        result = 31 * result + (activo != null ? activo.hashCode() : 0);
        return result;
    }
}
