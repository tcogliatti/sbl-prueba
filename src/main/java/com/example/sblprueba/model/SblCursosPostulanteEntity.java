package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sbl_cursos_postulante", schema = "public", catalog = "BDPortaEmpleo")
public class SblCursosPostulanteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idcurso")
    private int idcurso;
    @Basic
    @Column(name = "idpostulante")
    private int idpostulante;
    @Basic
    @Column(name = "establecimiento")
    private String establecimiento;
    @Basic
    @Column(name = "duracion")
    private String duracion;
    @Basic
    @Column(name = "estado")
    private String estado;
    @Basic
    @Column(name = "anio")
    private String anio;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public int getIdpostulante() {
        return idpostulante;
    }

    public void setIdpostulante(int idpostulante) {
        this.idpostulante = idpostulante;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
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

        SblCursosPostulanteEntity that = (SblCursosPostulanteEntity) o;

        if (idcurso != that.idcurso) return false;
        if (idpostulante != that.idpostulante) return false;
        if (establecimiento != null ? !establecimiento.equals(that.establecimiento) : that.establecimiento != null)
            return false;
        if (duracion != null ? !duracion.equals(that.duracion) : that.duracion != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (anio != null ? !anio.equals(that.anio) : that.anio != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idcurso;
        result = 31 * result + idpostulante;
        result = 31 * result + (establecimiento != null ? establecimiento.hashCode() : 0);
        result = 31 * result + (duracion != null ? duracion.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (anio != null ? anio.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
