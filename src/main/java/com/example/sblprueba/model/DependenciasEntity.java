package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "dependencias", schema = "public", catalog = "BDPortaEmpleo")
public class DependenciasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "iddependencia")
    private int iddependencia;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "idrafam")
    private String idrafam;
    @Basic
    @Column(name = "tipousuario")
    private Integer tipousuario;
    @Basic
    @Column(name = "clave")
    private String clave;
    @Basic
    @Column(name = "mail")
    private String mail;
    @Basic
    @Column(name = "contacto")
    private String contacto;
    @Basic
    @Column(name = "visible")
    private Boolean visible;
    @Basic
    @Column(name = "es_secretaria")
    private Boolean esSecretaria;

    public int getIddependencia() {
        return iddependencia;
    }

    public void setIddependencia(int iddependencia) {
        this.iddependencia = iddependencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdrafam() {
        return idrafam;
    }

    public void setIdrafam(String idrafam) {
        this.idrafam = idrafam;
    }

    public Integer getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(Integer tipousuario) {
        this.tipousuario = tipousuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getEsSecretaria() {
        return esSecretaria;
    }

    public void setEsSecretaria(Boolean esSecretaria) {
        this.esSecretaria = esSecretaria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DependenciasEntity that = (DependenciasEntity) o;

        if (iddependencia != that.iddependencia) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (idrafam != null ? !idrafam.equals(that.idrafam) : that.idrafam != null) return false;
        if (tipousuario != null ? !tipousuario.equals(that.tipousuario) : that.tipousuario != null) return false;
        if (clave != null ? !clave.equals(that.clave) : that.clave != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;
        if (contacto != null ? !contacto.equals(that.contacto) : that.contacto != null) return false;
        if (visible != null ? !visible.equals(that.visible) : that.visible != null) return false;
        if (esSecretaria != null ? !esSecretaria.equals(that.esSecretaria) : that.esSecretaria != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iddependencia;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (idrafam != null ? idrafam.hashCode() : 0);
        result = 31 * result + (tipousuario != null ? tipousuario.hashCode() : 0);
        result = 31 * result + (clave != null ? clave.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (contacto != null ? contacto.hashCode() : 0);
        result = 31 * result + (visible != null ? visible.hashCode() : 0);
        result = 31 * result + (esSecretaria != null ? esSecretaria.hashCode() : 0);
        return result;
    }
}
