package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sbl_areaspostulantes", schema = "public", catalog = "BDPortaEmpleo")
public class SblAreaspostulantesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idareapostulante")
    private int idareapostulante;
    @Basic
    @Column(name = "idpostulante")
    private Integer idpostulante;
    @Basic
    @Column(name = "idarea")
    private int idarea;

    public int getIdareapostulante() {
        return idareapostulante;
    }

    public void setIdareapostulante(int idareapostulante) {
        this.idareapostulante = idareapostulante;
    }

    public Integer getIdpostulante() {
        return idpostulante;
    }

    public void setIdpostulante(Integer idpostulante) {
        this.idpostulante = idpostulante;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblAreaspostulantesEntity that = (SblAreaspostulantesEntity) o;

        if (idareapostulante != that.idareapostulante) return false;
        if (idarea != that.idarea) return false;
        if (idpostulante != null ? !idpostulante.equals(that.idpostulante) : that.idpostulante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idareapostulante;
        result = 31 * result + (idpostulante != null ? idpostulante.hashCode() : 0);
        result = 31 * result + idarea;
        return result;
    }
}
