package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sbl_areaspropuesta", schema = "public", catalog = "BDPortaEmpleo")
public class SblAreaspropuestaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idareapropuesta")
    private Long idareapropuesta;
    @Basic
    @Column(name = "idarea")
    private int idarea;
    @Basic
    @Column(name = "idpropuestalaboral")
    private int idpropuestalaboral;

    public Long getIdareapropuesta() {
        return idareapropuesta;
    }

    public void setIdareapropuesta(Long idareapropuesta) {
        this.idareapropuesta = idareapropuesta;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public int getIdpropuestalaboral() {
        return idpropuestalaboral;
    }

    public void setIdpropuestalaboral(int idpropuestalaboral) {
        this.idpropuestalaboral = idpropuestalaboral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblAreaspropuestaEntity that = (SblAreaspropuestaEntity) o;

        if (idareapropuesta != that.idareapropuesta) return false;
        if (idarea != that.idarea) return false;
        if (idpropuestalaboral != that.idpropuestalaboral) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Long result = idareapropuesta;
        result = 31 * result + idarea;
        result = 31 * result + idpropuestalaboral;
        return Math.toIntExact(result);
    }
}
