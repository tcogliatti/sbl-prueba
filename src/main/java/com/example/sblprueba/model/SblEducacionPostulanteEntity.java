package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sbl_educacion_postulante", schema = "public", catalog = "BDPortaEmpleo")
public class SblEducacionPostulanteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ideducacion")
    private int ideducacion;
    @Basic
    @Column(name = "idniveleducativo")
    private int idniveleducativo;
    @Basic
    @Column(name = "especialidad")
    private String especialidad;
    @Basic
    @Column(name = "idpostulante")
    private int idpostulante;
    @Basic
    @Column(name = "establecimiento")
    private String establecimiento;
    @Basic
    @Column(name = "estado")
    private String estado;

    public int getIdeducacion() {
        return ideducacion;
    }

    public void setIdeducacion(int ideducacion) {
        this.ideducacion = ideducacion;
    }

    public int getIdniveleducativo() {
        return idniveleducativo;
    }

    public void setIdniveleducativo(int idniveleducativo) {
        this.idniveleducativo = idniveleducativo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblEducacionPostulanteEntity that = (SblEducacionPostulanteEntity) o;

        if (ideducacion != that.ideducacion) return false;
        if (idniveleducativo != that.idniveleducativo) return false;
        if (idpostulante != that.idpostulante) return false;
        if (especialidad != null ? !especialidad.equals(that.especialidad) : that.especialidad != null) return false;
        if (establecimiento != null ? !establecimiento.equals(that.establecimiento) : that.establecimiento != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ideducacion;
        result = 31 * result + idniveleducativo;
        result = 31 * result + (especialidad != null ? especialidad.hashCode() : 0);
        result = 31 * result + idpostulante;
        result = 31 * result + (establecimiento != null ? establecimiento.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }
}
