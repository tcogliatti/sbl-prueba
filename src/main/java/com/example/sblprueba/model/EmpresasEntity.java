package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "empresas", schema = "public", catalog = "BDPortaEmpleo")
public class EmpresasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idempresa")
    private int idempresa;
    @Basic
    @Column(name = "nombre_comercial")
    private String nombreComercial;
    @Basic
    @Column(name = "razon_social")
    private String razonSocial;
    @Basic
    @Column(name = "cuit")
    private String cuit;
    @Basic
    @Column(name = "telefono_fijo")
    private String telefonoFijo;
    @Basic
    @Column(name = "celular")
    private String celular;
    @Basic
    @Column(name = "contacto")
    private String contacto;
    @Basic
    @Column(name = "enlaceweb")
    private String enlaceweb;
    @Basic
    @Column(name = "iddependencia")
    private Integer iddependencia;
    @Basic
    @Column(name = "anio_creacion")
    private Integer anioCreacion;
    @Basic
    @Column(name = "idlocalidad")
    private Integer idlocalidad;
    @Basic
    @Column(name = "idcalle")
    private Integer idcalle;
    @Basic
    @Column(name = "numero")
    private String numero;
    @Basic
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Basic
    @Column(name = "cant_personal")
    private Integer cantPersonal;
    @Basic
    @Column(name = "idrango_facturacion")
    private Integer idrangoFacturacion;
    @Basic
    @Column(name = "idsector_economico")
    private Integer idsectorEconomico;
    @Basic
    @Column(name = "idpartida_inmobiliaria")
    private Integer idpartidaInmobiliaria;
    @Basic
    @Column(name = "idestado_empresa")
    private Integer idestadoEmpresa;
    @Basic
    @Column(name = "observaciones")
    private String observaciones;
    @Basic
    @Column(name = "logo")
    private String logo;
    @Basic
    @Column(name = "titular")
    private String titular;

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEnlaceweb() {
        return enlaceweb;
    }

    public void setEnlaceweb(String enlaceweb) {
        this.enlaceweb = enlaceweb;
    }

    public Integer getIddependencia() {
        return iddependencia;
    }

    public void setIddependencia(Integer iddependencia) {
        this.iddependencia = iddependencia;
    }

    public Integer getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(Integer anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Integer getIdlocalidad() {
        return idlocalidad;
    }

    public void setIdlocalidad(Integer idlocalidad) {
        this.idlocalidad = idlocalidad;
    }

    public Integer getIdcalle() {
        return idcalle;
    }

    public void setIdcalle(Integer idcalle) {
        this.idcalle = idcalle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getCantPersonal() {
        return cantPersonal;
    }

    public void setCantPersonal(Integer cantPersonal) {
        this.cantPersonal = cantPersonal;
    }

    public Integer getIdrangoFacturacion() {
        return idrangoFacturacion;
    }

    public void setIdrangoFacturacion(Integer idrangoFacturacion) {
        this.idrangoFacturacion = idrangoFacturacion;
    }

    public Integer getIdsectorEconomico() {
        return idsectorEconomico;
    }

    public void setIdsectorEconomico(Integer idsectorEconomico) {
        this.idsectorEconomico = idsectorEconomico;
    }

    public Integer getIdpartidaInmobiliaria() {
        return idpartidaInmobiliaria;
    }

    public void setIdpartidaInmobiliaria(Integer idpartidaInmobiliaria) {
        this.idpartidaInmobiliaria = idpartidaInmobiliaria;
    }

    public Integer getIdestadoEmpresa() {
        return idestadoEmpresa;
    }

    public void setIdestadoEmpresa(Integer idestadoEmpresa) {
        this.idestadoEmpresa = idestadoEmpresa;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpresasEntity that = (EmpresasEntity) o;

        if (idempresa != that.idempresa) return false;
        if (nombreComercial != null ? !nombreComercial.equals(that.nombreComercial) : that.nombreComercial != null)
            return false;
        if (razonSocial != null ? !razonSocial.equals(that.razonSocial) : that.razonSocial != null) return false;
        if (cuit != null ? !cuit.equals(that.cuit) : that.cuit != null) return false;
        if (telefonoFijo != null ? !telefonoFijo.equals(that.telefonoFijo) : that.telefonoFijo != null) return false;
        if (celular != null ? !celular.equals(that.celular) : that.celular != null) return false;
        if (contacto != null ? !contacto.equals(that.contacto) : that.contacto != null) return false;
        if (enlaceweb != null ? !enlaceweb.equals(that.enlaceweb) : that.enlaceweb != null) return false;
        if (iddependencia != null ? !iddependencia.equals(that.iddependencia) : that.iddependencia != null)
            return false;
        if (anioCreacion != null ? !anioCreacion.equals(that.anioCreacion) : that.anioCreacion != null) return false;
        if (idlocalidad != null ? !idlocalidad.equals(that.idlocalidad) : that.idlocalidad != null) return false;
        if (idcalle != null ? !idcalle.equals(that.idcalle) : that.idcalle != null) return false;
        if (numero != null ? !numero.equals(that.numero) : that.numero != null) return false;
        if (correoElectronico != null ? !correoElectronico.equals(that.correoElectronico) : that.correoElectronico != null)
            return false;
        if (cantPersonal != null ? !cantPersonal.equals(that.cantPersonal) : that.cantPersonal != null) return false;
        if (idrangoFacturacion != null ? !idrangoFacturacion.equals(that.idrangoFacturacion) : that.idrangoFacturacion != null)
            return false;
        if (idsectorEconomico != null ? !idsectorEconomico.equals(that.idsectorEconomico) : that.idsectorEconomico != null)
            return false;
        if (idpartidaInmobiliaria != null ? !idpartidaInmobiliaria.equals(that.idpartidaInmobiliaria) : that.idpartidaInmobiliaria != null)
            return false;
        if (idestadoEmpresa != null ? !idestadoEmpresa.equals(that.idestadoEmpresa) : that.idestadoEmpresa != null)
            return false;
        if (observaciones != null ? !observaciones.equals(that.observaciones) : that.observaciones != null)
            return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (titular != null ? !titular.equals(that.titular) : that.titular != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idempresa;
        result = 31 * result + (nombreComercial != null ? nombreComercial.hashCode() : 0);
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (cuit != null ? cuit.hashCode() : 0);
        result = 31 * result + (telefonoFijo != null ? telefonoFijo.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (contacto != null ? contacto.hashCode() : 0);
        result = 31 * result + (enlaceweb != null ? enlaceweb.hashCode() : 0);
        result = 31 * result + (iddependencia != null ? iddependencia.hashCode() : 0);
        result = 31 * result + (anioCreacion != null ? anioCreacion.hashCode() : 0);
        result = 31 * result + (idlocalidad != null ? idlocalidad.hashCode() : 0);
        result = 31 * result + (idcalle != null ? idcalle.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (cantPersonal != null ? cantPersonal.hashCode() : 0);
        result = 31 * result + (idrangoFacturacion != null ? idrangoFacturacion.hashCode() : 0);
        result = 31 * result + (idsectorEconomico != null ? idsectorEconomico.hashCode() : 0);
        result = 31 * result + (idpartidaInmobiliaria != null ? idpartidaInmobiliaria.hashCode() : 0);
        result = 31 * result + (idestadoEmpresa != null ? idestadoEmpresa.hashCode() : 0);
        result = 31 * result + (observaciones != null ? observaciones.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (titular != null ? titular.hashCode() : 0);
        return result;
    }
}
