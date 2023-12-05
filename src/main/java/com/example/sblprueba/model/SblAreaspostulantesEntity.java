package com.example.sblprueba.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sbl_areaspostulantes", schema = "public", catalog = "BDPortaEmpleo")
public class SblAreaspostulantesEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "idareapostulante")
    private Long idareapostulante;
    @ManyToOne
    @JoinColumn(name = "idpostulante")
    private SblPostulantesEntity postulante;
    @ManyToOne
    @JoinColumn(name = "idarea")
    private SblAreasEntity area;

    public Long getIdareapostulante() {
        return idareapostulante;
    }

    public void setIdareapostulante(Long idareapostulante) {
        this.idareapostulante = idareapostulante;
    }

    public SblPostulantesEntity getPostulante() {
        return postulante;
    }

    public void setPostulante(SblPostulantesEntity idpostulante) {
        this.postulante = idpostulante;
    }

    public SblAreasEntity getArea() {
        return area;
    }

    public void setArea(SblAreasEntity idarea) {
        this.area = idarea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SblAreaspostulantesEntity that = (SblAreaspostulantesEntity) o;

        if (idareapostulante != that.idareapostulante) return false;
        if (area != that.area) return false;
        if (postulante != null ? !postulante.equals(that.postulante) : that.postulante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Long result = idareapostulante;
        result = 31 * result + (postulante != null ? postulante.hashCode() : 0);
        result = 31 * result + area.getIdarea();
        return Math.toIntExact(result);
    }
}
