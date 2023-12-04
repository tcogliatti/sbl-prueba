package com.example.sblprueba.controller;

import com.example.sblprueba.dto.request.PostulanteRequestDTO;
import com.example.sblprueba.dto.response.PostulanteResponseDTO;
import com.example.sblprueba.service.PostulanteService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/postulantes")
public class PostulanteController {
    @Autowired
    private PostulanteService postulanteService;

    @GetMapping("")
    public List<PostulanteResponseDTO> findAll(){
        return this.postulanteService.findAll();
    }

    @PostMapping("")
    public ResponseEntity<PostulanteResponseDTO> save(@RequestBody @Validated PostulanteRequestDTO request){
        final var result = this.postulanteService.save(request);
        return ResponseEntity.accepted().body(result);
    }
}
