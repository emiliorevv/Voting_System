package com.example.voting_system.services;
import com.example.voting_system.model.Candidato;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CandidatoServicios {

   public Candidato guardar(long id, String nombre, String descripcion, String imagen);




}
