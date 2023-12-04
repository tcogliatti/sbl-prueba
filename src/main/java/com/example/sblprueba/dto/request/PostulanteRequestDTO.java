package com.example.sblprueba.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PostulanteRequestDTO {
    private Integer idusuario;
    private String nombres;
    private String apellido;
    private Long nrodoc;
    private String fecnac;
    private String sexo;
    private String foto;
    private String rutacv;
    private Boolean estado;
    private Boolean tienelicencia;
    private Long nrofiscal;
    private String celular;
    private String telefono;
    private String mail;
    private String numcalle;
    private Boolean tienehijos;
    private Long provincia;
    private Long partido;
    private Long localidad;
    private Long calle;
    private Long pais;
    private Long estadoCivil;
    private BigDecimal filesize;
    private Long tipoDoc;
    private String otroGenero;
    private String nombreautopercibido;

    public PostulanteRequestDTO() {
    }
    public PostulanteRequestDTO(String rutacv, Boolean estado, String foto, Boolean tienelicencia, Integer idusuario, String apellido, String nombres, Long nrodoc, Long nrofiscal, String fecnac, String sexo, String celular, String telefono, String mail, String numcalle, Boolean tienehijos, Long provincia, Long partido, Long localidad, Long calle, Long pais, Long estadoCivil, BigDecimal filesize, Long tipoDoc, String otroGenero, String nombreautopercibido) {
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
   }
