package com.example.sblprueba.model;

import com.example.sblprueba.dto.request.PostulanteRequestDTO;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "sbl_postulantes", schema = "public", catalog = "BDPortaEmpleo")
public class SblPostulantesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idpostulante")
    private Long idpostulante;
    @Basic
    @Column(name = "fechaalta")
    private Date fechaalta;
    @Basic
    @Column(name = "rutacv")
    private String rutacv;
    @Basic
    @Column(name = "estado")
    private Boolean estado;
    @Basic
    @Column(name = "foto")
    private String foto;
    @Basic
    @Column(name = "tienelicencia")
    private Boolean tienelicencia;
    @Basic
    @Column(name = "idusuario")
    private Integer idusuario;
    @Basic
    @Column(name = "apellido")
    private String apellido;
    @Basic
    @Column(name = "nombres")
    private String nombres;
    @Basic
    @Column(name = "nrodoc")
    private Long nrodoc;
    @Basic
    @Column(name = "nrofiscal")
    private Long nrofiscal;
    @Basic
    @Column(name = "fecnac")
    private Date fecnac;
    @Basic
    @Column(name = "sexo")
    private String sexo;
    @Basic
    @Column(name = "celular")
    private String celular;
    @Basic
    @Column(name = "telefono")
    private String telefono;
    @Basic
    @Column(name = "mail")
    private String mail;
    @Basic
    @Column(name = "numcalle")
    private String numcalle;
    @Basic
    @Column(name = "tienehijos")
    private Boolean tienehijos;
    @ManyToOne
    @JoinColumn(name = "idprovincia")
    private ProvinciasEntity provincia;
    @ManyToOne
    @JoinColumn(name = "idpartido")
    private PartidosEntity partido;
    @ManyToOne
    @JoinColumn(name = "idlocalidad")
    private LocalidadesEntity localidad;
    @ManyToOne
    @JoinColumn(name = "idcalle")
    private CallesEntity calle;
    @ManyToOne
    @JoinColumn(name = "idpais")
    private PaisesEntity pais;
    @ManyToOne
    @JoinColumn(name = "idestadocivil")
    private EstadoscivilEntity estadoCivil;
    @Basic
    @Column(name = "filesize")
    private BigDecimal filesize;
    @ManyToOne
    @JoinColumn(name = "idtipodoc")
    private TiposdocEntity tipoDoc;
    @Basic
    @Column(name = "otro_genero")
    private String otroGenero;
    @Basic
    @Column(name = "nombreautopercibido")
    private String nombreautopercibido;

    // -----------------------------------------------------------------

    public SblPostulantesEntity() {
    }

    public SblPostulantesEntity(Date fechaalta, String rutacv, Boolean estado, String foto, Boolean tienelicencia, Integer idusuario, String apellido, String nombres, Long nrodoc, Long nrofiscal, Date fecnac, String sexo, String celular, String telefono, String mail, String numcalle, Boolean tienehijos, ProvinciasEntity provincia, PartidosEntity partido, LocalidadesEntity localidad, CallesEntity calle, PaisesEntity pais, EstadoscivilEntity estadoCivil, BigDecimal filesize, TiposdocEntity tipoDoc, String otroGenero, String nombreautopercibido) {
//    public SblPostulantesEntity(Long idpostulante, Date fechaalta, String rutacv, Boolean estado, String foto, Boolean tienelicencia, Integer idusuario, String apellido, String nombres, Long nrodoc, Long nrofiscal, Date fecnac, String sexo, String celular, String telefono, String mail, String numcalle, Boolean tienehijos, ProvinciasEntity provincia, PartidosEntity partido, LocalidadesEntity localidad, CallesEntity calle, PaisesEntity pais, EstadoscivilEntity estadoCivil, BigDecimal filesize, TiposdocEntity tipoDoc, String otroGenero, String nombreautopercibido) {
//        this.idpostulante = idpostulante;
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

    public SblPostulantesEntity(PostulanteRequestDTO p) {
//        this.idpostulante = p.;
        this.rutacv = p.getRutacv();
        this.estado = p.getEstado();
        this.foto = p.getFoto();
        this.tienelicencia = p.getTienelicencia();
        this.idusuario = p.getIdusuario();
        this.apellido = p.getApellido();
        this.nombres = p.getNombres();
        this.nrodoc = p.getNrodoc();
        this.nrofiscal = p.getNrofiscal();
        this.sexo = p.getSexo();
        this.celular = p.getCelular();
        this.telefono = p.getTelefono();
        this.mail = p.getMail();
        this.numcalle = p.getNumcalle();
        this.tienehijos = p.getTienehijos();
        this.filesize = p.getFilesize();
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

    public ProvinciasEntity getProvincia() {
        return provincia;
    }

    public void setProvincia(ProvinciasEntity provincia) {
        this.provincia = provincia;
    }

    public PartidosEntity getPartido() {
        return partido;
    }

    public void setPartido(PartidosEntity idpartido) {
        this.partido = idpartido;
    }

    public LocalidadesEntity getLocalidad() {
        return localidad;
    }

    public void setLocalidad(LocalidadesEntity idlocalidad) {
        this.localidad = idlocalidad;
    }

    public CallesEntity getCalle() {
        return calle;
    }

    public void setCalle(CallesEntity idcalle) {
        this.calle = idcalle;
    }

    public PaisesEntity getPais() {
        return pais;
    }

    public void setPais(PaisesEntity idpais) {
        this.pais = idpais;
    }

    public EstadoscivilEntity getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoscivilEntity idestadocivil) {
        this.estadoCivil = idestadocivil;
    }

    public BigDecimal getFilesize() {
        return filesize;
    }

    public void setFilesize(BigDecimal filesize) {
        this.filesize = filesize;
    }

    public TiposdocEntity getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(TiposdocEntity idtipodoc) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblPostulantesEntity that = (SblPostulantesEntity) o;

        if (idpostulante != that.idpostulante) return false;
        if (fechaalta != null ? !fechaalta.equals(that.fechaalta) : that.fechaalta != null) return false;
        if (rutacv != null ? !rutacv.equals(that.rutacv) : that.rutacv != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (foto != null ? !foto.equals(that.foto) : that.foto != null) return false;
        if (tienelicencia != null ? !tienelicencia.equals(that.tienelicencia) : that.tienelicencia != null)
            return false;
        if (idusuario != null ? !idusuario.equals(that.idusuario) : that.idusuario != null) return false;
        if (apellido != null ? !apellido.equals(that.apellido) : that.apellido != null) return false;
        if (nombres != null ? !nombres.equals(that.nombres) : that.nombres != null) return false;
        if (nrodoc != null ? !nrodoc.equals(that.nrodoc) : that.nrodoc != null) return false;
        if (nrofiscal != null ? !nrofiscal.equals(that.nrofiscal) : that.nrofiscal != null) return false;
        if (fecnac != null ? !fecnac.equals(that.fecnac) : that.fecnac != null) return false;
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) return false;
        if (celular != null ? !celular.equals(that.celular) : that.celular != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;
        if (numcalle != null ? !numcalle.equals(that.numcalle) : that.numcalle != null) return false;
        if (tienehijos != null ? !tienehijos.equals(that.tienehijos) : that.tienehijos != null) return false;
        if (provincia != null ? !provincia.equals(that.provincia) : that.provincia != null) return false;
        if (partido != null ? !partido.equals(that.partido) : that.partido != null) return false;
        if (localidad != null ? !localidad.equals(that.localidad) : that.localidad != null) return false;
        if (calle != null ? !calle.equals(that.calle) : that.calle != null) return false;
        if (pais != null ? !pais.equals(that.pais) : that.pais != null) return false;
        if (estadoCivil != null ? !estadoCivil.equals(that.estadoCivil) : that.estadoCivil != null)
            return false;
        if (filesize != null ? !filesize.equals(that.filesize) : that.filesize != null) return false;
        if (tipoDoc != null ? !tipoDoc.equals(that.tipoDoc) : that.tipoDoc != null) return false;
        if (otroGenero != null ? !otroGenero.equals(that.otroGenero) : that.otroGenero != null) return false;
        if (nombreautopercibido != null ? !nombreautopercibido.equals(that.nombreautopercibido) : that.nombreautopercibido != null)
            return false;

        return true;
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
