package com.example.sblprueba.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "sbl_turnos", schema = "public", catalog = "BDPortaEmpleo")
public class SblTurnosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idturno")
    private int idturno;
    @Basic
    @Column(name = "documento")
    private long documento;
    @Basic
    @Column(name = "fecha")
    private Date fecha;
    @Basic
    @Column(name = "hora")
    private Time hora;
    @Basic
    @Column(name = "nombres")
    private String nombres;
    @Basic
    @Column(name = "telefono")
    private String telefono;
    @Basic
    @Column(name = "asistio")
    private Boolean asistio;
    @Basic
    @Column(name = "idmotivo")
    private Integer idmotivo;
    @Basic
    @Column(name = "hora_asistio")
    private Time horaAsistio;
    @Basic
    @Column(name = "atendido")
    private Boolean atendido;

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getAsistio() {
        return asistio;
    }

    public void setAsistio(Boolean asistio) {
        this.asistio = asistio;
    }

    public Integer getIdmotivo() {
        return idmotivo;
    }

    public void setIdmotivo(Integer idmotivo) {
        this.idmotivo = idmotivo;
    }

    public Time getHoraAsistio() {
        return horaAsistio;
    }

    public void setHoraAsistio(Time horaAsistio) {
        this.horaAsistio = horaAsistio;
    }

    public Boolean getAtendido() {
        return atendido;
    }

    public void setAtendido(Boolean atendido) {
        this.atendido = atendido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblTurnosEntity that = (SblTurnosEntity) o;

        if (idturno != that.idturno) return false;
        if (documento != that.documento) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (hora != null ? !hora.equals(that.hora) : that.hora != null) return false;
        if (nombres != null ? !nombres.equals(that.nombres) : that.nombres != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (asistio != null ? !asistio.equals(that.asistio) : that.asistio != null) return false;
        if (idmotivo != null ? !idmotivo.equals(that.idmotivo) : that.idmotivo != null) return false;
        if (horaAsistio != null ? !horaAsistio.equals(that.horaAsistio) : that.horaAsistio != null) return false;
        if (atendido != null ? !atendido.equals(that.atendido) : that.atendido != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idturno;
        result = 31 * result + (int) (documento ^ (documento >>> 32));
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (hora != null ? hora.hashCode() : 0);
        result = 31 * result + (nombres != null ? nombres.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (asistio != null ? asistio.hashCode() : 0);
        result = 31 * result + (idmotivo != null ? idmotivo.hashCode() : 0);
        result = 31 * result + (horaAsistio != null ? horaAsistio.hashCode() : 0);
        result = 31 * result + (atendido != null ? atendido.hashCode() : 0);
        return result;
    }
}
