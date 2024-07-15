package com.veterinaria.veterinaria.Service;

import com.veterinaria.veterinaria.Model.Duenio;
import java.util.List;

public interface IDuenioService {

    public void createDuenio(Duenio duenio);

    public List<Duenio> readDuenio();

    public void updateDuenio(Duenio duenio);

    public void deleteDuenio(Long id_duenio);
    
    public Duenio findDuenio(Long id_duenio);
}
