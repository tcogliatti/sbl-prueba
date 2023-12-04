package com.example.sblprueba.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "sbl_notificaciones", schema = "public", catalog = "BDPortaEmpleo")
public class SblNotificacionesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idnotificacion")
    private int idnotificacion;
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
    @Column(name = "tipo_notificacion")
    private String tipoNotificacion;

    public int getIdnotificacion() {
        return idnotificacion;
    }

    public void setIdnotificacion(int idnotificacion) {
        this.idnotificacion = idnotificacion;
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

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblNotificacionesEntity that = (SblNotificacionesEntity) o;

        if (idnotificacion != that.idnotificacion) return false;
        if (idpostulante != that.idpostulante) return false;
        if (idpropuestalaboral != that.idpropuestalaboral) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (tipoNotificacion != null ? !tipoNotificacion.equals(that.tipoNotificacion) : that.tipoNotificacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idnotificacion;
        result = 31 * result + idpostulante;
        result = 31 * result + idpropuestalaboral;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (tipoNotificacion != null ? tipoNotificacion.hashCode() : 0);
        return result;
    }
}
