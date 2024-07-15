package com.veterinaria.veterinaria.Service;

import com.veterinaria.veterinaria.DTO.MascoDuenioDTO;
import com.veterinaria.veterinaria.Model.Mascota;
import java.util.List;

public interface IMascotaService {

    public void createMascota(Mascota mascota);

    public List<Mascota> readMascota();

    public void updateMascota(Mascota mascota);

    public void deleteMascota(Long id_mascota);

    public Mascota findMascota(Long id_mascota);
    
    public List<Mascota> getCaniches();
    
    public List<MascoDuenioDTO> getMascoDuenios();
}
