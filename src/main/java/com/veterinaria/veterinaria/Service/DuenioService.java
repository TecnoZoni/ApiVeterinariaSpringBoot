package com.veterinaria.veterinaria.Service;

import com.veterinaria.veterinaria.Model.Duenio;
import com.veterinaria.veterinaria.Repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService {

    @Autowired
    private IDuenioRepository duenioRepo;

    @Override
    public void createDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }

    @Override
    public List<Duenio> readDuenio() {
        return duenioRepo.findAll();
    }

    @Override
    public void updateDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id_duenio) {
        duenioRepo.deleteById(id_duenio);
    }

    @Override
    public Duenio findDuenio(Long id_duenio) {
        return duenioRepo.findById(id_duenio).orElse(null);
    }
}
