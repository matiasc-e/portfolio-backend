package com.portfolio.mti.services;

import com.portfolio.mti.models.Proyects;
import com.portfolio.mti.repository.ProyectsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProyectsService {

    private final ProyectsRepo proyectsRepo;

    @Autowired
    public ProyectsService(ProyectsRepo proyectsRepo) {
        this.proyectsRepo = proyectsRepo;
    }

    public Proyects addProyect (Proyects proyect) {
        return proyectsRepo.save(proyect);
    }

    public Proyects updateProyect (Proyects proyect) {
        return proyectsRepo.save(proyect);
    }



    public List<Proyects> getProyects () {
        return proyectsRepo.findAll();
    }

    public void deleteProyect (Long id) {
        proyectsRepo.deleteById(id);
    }

}
