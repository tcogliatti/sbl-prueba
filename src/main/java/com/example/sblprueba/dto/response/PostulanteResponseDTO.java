package com.example.sblprueba.dto.response;

import com.example.sblprueba.model.*;

import java.math.BigDecimal;
import java.sql.Date;

public class PostulanteResponseDTO {
        private Long idpostulante;
        private Date fechaalta;
        private String rutacv;
        private Boolean estado;
        private String foto;
        private Boolean tienelicencia;
        private Integer idusuario;
        private String apellido;
        private String nombres;
        private Long nrodoc;
        private Long nrofiscal;
        private Date fecnac;
        private String sexo;
        private String celular;
        private String telefono;
        private String mail;
        private String numcalle;
        private Boolean tienehijos;
        private String provincia;
        private String partido;
        private String localidad;
        private String calle;
        private String pais;
        private String estadoCivil;
        private BigDecimal filesize;
        private String tipoDoc;
        private String otroGenero;
        private String nombreautopercibido;

        // -----------------------------------------------------------------

        public PostulanteResponseDTO() {
        }

        public PostulanteResponseDTO(Long idpostulante, Date fechaalta, String rutacv, Boolean estado, String foto, Boolean tienelicencia, Integer idusuario, String apellido, String nombres, Long nrodoc, Long nrofiscal, Date fecnac, String sexo, String celular, String telefono, String mail, String numcalle, Boolean tienehijos, String provincia, String partido, String localidad, String calle, String pais, String estadoCivil, BigDecimal filesize, String tipoDoc, String otroGenero, String nombreautopercibido) {
            this.idpostulante = idpostulante;
            this.fechaalta = fechaalta;
            this.rutacv = rutacv;
            this.estado = estado;
            this.foto = foto;
            this.tienelicencia = tienelicencia;
            this.idusuario = idusuario;
            this.apellido = apellido;
            this.nombres = nombres;
            this.nrodoc = nrodoc;
            this.nrofiscal = nrofiscal;
            this.fecnac = fecnac;
            this.sexo = sexo;
            this.celular = celular;
            this.telefono = telefono;
            this.mail = mail;
            this.numcalle = numcalle;
            this.tienehijos = tienehijos;
            this.provincia = provincia;
            this.partido = partido;
            this.localidad = localidad;
            this.calle = calle;
            this.pais = pais;
            this.estadoCivil = estadoCivil;
            this.filesize = filesize;
            this.tipoDoc = tipoDoc;
            this.otroGenero = otroGenero;
            this.nombreautopercibido = nombreautopercibido;
        }
        public PostulanteResponseDTO(SblPostulantesEntity p) {
            this.idpostulante = p.getIdpostulante();
            this.fechaalta = p.getFechaalta();
            this.rutacv = p.getRutacv();
            this.estado = p.getEstado();
            this.foto = p.getFoto();
            this.tienelicencia = p.getTienelicencia();
            this.idusuario = p.getIdusuario();
            this.apellido = p.getApellido();
            this.nombres = p.getNombres();
            this.nrodoc = p.getNrodoc();
            this.nrofiscal = p.getNrofiscal();
            this.fecnac = p.getFecnac();
            this.sexo = p.getSexo();
            this.celular = p.getCelular();
            this.telefono = p.getTelefono();
            this.mail = p.getMail();
            this.numcalle = p.getNumcalle();
            this.tienehijos = p.getTienehijos();
            this.provincia = p.getProvincia().getDescripcion();
            this.partido = p.getPartido().getDescripcion();
            this.localidad = p.getLocalidad().getDescripcion();
            this.calle = p.getCalle().getDescripcion();
            this.pais = p.getPais().getDescripcion();
            this.estadoCivil = p.getEstadoCivil().getDescripcion();
            this.filesize = p.getFilesize();
            this.tipoDoc = p.getTipoDoc().getCodigo();
            this.otroGenero = p.getOtroGenero();
            this.nombreautopercibido = p.getNombreautopercibido();
        }
        // -----------------------------------------------------------------
        public Long getIdpostulante() {
            return idpostulante;
        }

        public void setIdpostulante(Long idpostulante) {
            this.idpostulante = idpostulante;
        }

        public Date getFechaalta() {
            return fechaalta;
        }

        public void setFechaalta(Date fechaalta) {
            this.fechaalta = fechaalta;
        }

        public String getRutacv() {
            return rutacv;
        }

        public void setRutacv(String rutacv) {
            this.rutacv = rutacv;
        }

        public Boolean getEstado() {
            return estado;
        }

        public void setEstado(Boolean estado) {
            this.estado = estado;
        }

        public String getFoto() {
            return foto;
        }

        public void setFoto(String foto) {
            this.foto = foto;
        }

        public Boolean getTienelicencia() {
            return tienelicencia;
        }

        public void setTienelicencia(Boolean tienelicencia) {
            this.tienelicencia = tienelicencia;
        }

        public Integer getIdusuario() {
            return idusuario;
        }

        public void setIdusuario(Integer idusuario) {
            this.idusuario = idusuario;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public Long getNrodoc() {
            return nrodoc;
        }

        public void setNrodoc(Long nrodoc) {
            this.nrodoc = nrodoc;
        }

        public Long getNrofiscal() {
            return nrofiscal;
        }

        public void setNrofiscal(Long nrofiscal) {
            this.nrofiscal = nrofiscal;
        }

        public Date getFecnac() {
            return fecnac;
        }

        public void setFecnac(Date fecnac) {
            this.fecnac = fecnac;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public String getCelular() {
            return celular;
        }

        public void setCelular(String celular) {
            this.celular = celular;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getNumcalle() {
            return numcalle;
        }

        public void setNumcalle(String numcalle) {
            this.numcalle = numcalle;
        }

        public Boolean getTienehijos() {
            return tienehijos;
        }

        public void setTienehijos(Boolean tienehijos) {
            this.tienehijos = tienehijos;
        }

        public String getProvincia() {
            return provincia;
        }

        public void setProvincia(String provincia) {
            this.provincia = provincia;
        }

        public String getPartido() {
            return partido;
        }

        public void setPartido(String idpartido) {
            this.partido = idpartido;
        }

        public String getLocalidad() {
            return localidad;
        }

        public void setLocalidad(String idlocalidad) {
            this.localidad = idlocalidad;
        }

        public String getCalle() {
            return calle;
        }

        public void setCalle(String idcalle) {
            this.calle = idcalle;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String idpais) {
            this.pais = idpais;
        }

        public String getEstadoCivil() {
            return estadoCivil;
        }

        public void setEstadoCivil(String idestadocivil) {
            this.estadoCivil = idestadocivil;
        }

        public BigDecimal getFilesize() {
            return filesize;
        }

        public void setFilesize(BigDecimal filesize) {
            this.filesize = filesize;
        }

        public String getTipoDoc() {
            return tipoDoc;
        }

        public void setTipoDoc(String idtipodoc) {
            this.tipoDoc = idtipodoc;
        }

        public String getOtroGenero() {
            return otroGenero;
        }

        public void setOtroGenero(String otroGenero) {
            this.otroGenero = otroGenero;
        }

        public String getNombreautopercibido() {
            return nombreautopercibido;
        }

        public void setNombreautopercibido(String nombreautopercibido) {
            this.nombreautopercibido = nombreautopercibido;
        }

        @Override
        public int hashCode() {
            int result = Math.toIntExact(idpostulante);
            result = 31 * result + (fechaalta != null ? fechaalta.hashCode() : 0);
            result = 31 * result + (rutacv != null ? rutacv.hashCode() : 0);
            result = 31 * result + (estado != null ? estado.hashCode() : 0);
            result = 31 * result + (foto != null ? foto.hashCode() : 0);
            result = 31 * result + (tienelicencia != null ? tienelicencia.hashCode() : 0);
            result = 31 * result + (idusuario != null ? idusuario.hashCode() : 0);
            result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
            result = 31 * result + (nombres != null ? nombres.hashCode() : 0);
            result = 31 * result + (nrodoc != null ? nrodoc.hashCode() : 0);
            result = 31 * result + (nrofiscal != null ? nrofiscal.hashCode() : 0);
            result = 31 * result + (fecnac != null ? fecnac.hashCode() : 0);
            result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
            result = 31 * result + (celular != null ? celular.hashCode() : 0);
            result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
            result = 31 * result + (mail != null ? mail.hashCode() : 0);
            result = 31 * result + (numcalle != null ? numcalle.hashCode() : 0);
            result = 31 * result + (tienehijos != null ? tienehijos.hashCode() : 0);
            result = 31 * result + (provincia != null ? provincia.hashCode() : 0);
            result = 31 * result + (partido != null ? partido.hashCode() : 0);
            result = 31 * result + (localidad != null ? localidad.hashCode() : 0);
            result = 31 * result + (calle != null ? calle.hashCode() : 0);
            result = 31 * result + (pais != null ? pais.hashCode() : 0);
            result = 31 * result + (estadoCivil != null ? estadoCivil.hashCode() : 0);
            result = 31 * result + (filesize != null ? filesize.hashCode() : 0);
            result = 31 * result + (tipoDoc != null ? tipoDoc.hashCode() : 0);
            result = 31 * result + (otroGenero != null ? otroGenero.hashCode() : 0);
            result = 31 * result + (nombreautopercibido != null ? nombreautopercibido.hashCode() : 0);
            return result;
        }
    }

