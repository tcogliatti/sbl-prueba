package com.example.sblprueba.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "sbl_exp_laborales", schema = "public", catalog = "BDPortaEmpleo")
public class SblExpLaboralesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idexplaboral")
    private int idexplaboral;
    @Basic
    @Column(name = "empresa")
    private String empresa;
    @Basic
    @Column(name = "fecingreso")
    private Date fecingreso;
    @Basic
    @Column(name = "fecegreso")
    private Date fecegreso;
    @Basic
    @Column(name = "ref_apenom")
    private String refApenom;
    @Basic
    @Column(name = "telefono")
    private String telefono;
    @Basic
    @Column(name = "funcion")
    private String funcion;
    @Basic
    @Column(name = "idpostulante")
    private Integer idpostulante;
    @Basic
    @Column(name = "puesto")
    private String puesto;

    public int getIdexplaboral() {
        return idexplaboral;
    }

    public void setIdexplaboral(int idexplaboral) {
        this.idexplaboral = idexplaboral;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getFecingreso() {
        return fecingreso;
    }

    public void setFecingreso(Date fecingreso) {
        this.fecingreso = fecingreso;
    }

    public Date getFecegreso() {
        return fecegreso;
    }

    public void setFecegreso(Date fecegreso) {
        this.fecegreso = fecegreso;
    }

    public String getRefApenom() {
        return refApenom;
    }

    public void setRefApenom(String refApenom) {
        this.refApenom = refApenom;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public Integer getIdpostulante() {
        return idpostulante;
    }

    public void setIdpostulante(Integer idpostulante) {
        this.idpostulante = idpostulante;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblExpLaboralesEntity that = (SblExpLaboralesEntity) o;

        if (idexplaboral != that.idexplaboral) return false;
        if (empresa != null ? !empresa.equals(that.empresa) : that.empresa != null) return false;
        if (fecingreso != null ? !fecingreso.equals(that.fecingreso) : that.fecingreso != null) return false;
        if (fecegreso != null ? !fecegreso.equals(that.fecegreso) : that.fecegreso != null) return false;
        if (refApenom != null ? !refApenom.equals(that.refApenom) : that.refApenom != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (funcion != null ? !funcion.equals(that.funcion) : that.funcion != null) return false;
        if (idpostulante != null ? !idpostulante.equals(that.idpostulante) : that.idpostulante != null) return false;
        if (puesto != null ? !puesto.equals(that.puesto) : that.puesto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idexplaboral;
        result = 31 * result + (empresa != null ? empresa.hashCode() : 0);
        result = 31 * result + (fecingreso != null ? fecingreso.hashCode() : 0);
        result = 31 * result + (fecegreso != null ? fecegreso.hashCode() : 0);
        result = 31 * result + (refApenom != null ? refApenom.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (funcion != null ? funcion.hashCode() : 0);
        result = 31 * result + (idpostulante != null ? idpostulante.hashCode() : 0);
        result = 31 * result + (puesto != null ? puesto.hashCode() : 0);
        return result;
    }
}
