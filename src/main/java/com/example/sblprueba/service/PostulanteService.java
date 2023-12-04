package com.example.sblprueba.service;

import com.example.sblprueba.dto.request.PostulanteRequestDTO;
import com.example.sblprueba.dto.response.PostulanteResponseDTO;
import com.example.sblprueba.exceptions.NotFoundEntity;
import com.example.sblprueba.model.*;
import com.example.sblprueba.repository.*;
import org.aspectj.weaver.ast.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service("PostulanteService")
public class PostulanteService {

    @Autowired
    private PostulanteRepository postulanteRepository;
    @Autowired
    private ProvinciasRepository provinciasRepository;
    @Autowired
    private PartidosRepository partidosRepository;
    @Autowired
    private LocalidadesRepository localidadesRepository;
    @Autowired
    private CallesRepository callesRepository;
    @Autowired
    private PaisesRepository paisesRepository;
    @Autowired
    private EstadosCivilRepository estadosCivilRepository;
    @Autowired
    private TiposDocRepository tiposDocRepository;

    public List<PostulanteResponseDTO> findAll() {
        List<PostulanteResponseDTO> result = this.postulanteRepository.findAll()
                .stream().map((item) -> {
                    PostulanteResponseDTO pt = new PostulanteResponseDTO(item);
                    return pt;
                }).toList();
        return result;
    }

    public PostulanteResponseDTO save(PostulanteRequestDTO request) {
        SblPostulantesEntity p = new SblPostulantesEntity(request);

        p.setFechaalta(new java.sql.Date(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()).getTime()));
        ProvinciasEntity provincia = provinciasRepository.findById(request.getProvincia())
                .orElseThrow(() -> new NotFoundEntity("Provincia", request.getProvincia()));
        p.setProvincia(provincia);
        PartidosEntity partido = partidosRepository.findById(request.getPartido())
                .orElseThrow(() -> new NotFoundEntity("Partido", request.getPartido()));
        p.setPartido(partido);
        LocalidadesEntity localidad = localidadesRepository.findById(request.getLocalidad())
                .orElseThrow(() -> new NotFoundEntity("Localidad", request.getLocalidad()));
        p.setLocalidad(localidad);
        PaisesEntity pais = paisesRepository.findById(request.getPais())
                .orElseThrow(() -> new NotFoundEntity("Pais", request.getPais()));
        p.setPais(pais);
        CallesEntity calle = callesRepository.findById(request.getCalle())
                .orElseThrow(() -> new NotFoundEntity("Calle", request.getCalle()));
        p.setCalle(calle);
        EstadoscivilEntity estadoCivil = estadosCivilRepository.findById(request.getEstadoCivil())
                .orElseThrow(() -> new NotFoundEntity("Estado Civil", request.getEstadoCivil()));
        p.setEstadoCivil(estadoCivil);
        TiposdocEntity tipoDoc = tiposDocRepository.findById(request.getTipoDoc())
                .orElseThrow(() -> new NotFoundEntity("Tipo de Documento", request.getTipoDoc()));
        p.setTipoDoc(tipoDoc);
        p.setFecnac(convertDate(request.getFecnac()));
        final SblPostulantesEntity result = this.postulanteRepository.save(p);

        return new PostulanteResponseDTO(result);
    }

    private java.sql.Date convertDate(String dateString){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date date = dateFormat.parse(dateString);
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            return sqlDate;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
