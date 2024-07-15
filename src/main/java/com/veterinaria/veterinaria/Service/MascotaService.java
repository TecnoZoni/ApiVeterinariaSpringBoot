package com.veterinaria.veterinaria.Service;

import com.veterinaria.veterinaria.DTO.MascoDuenioDTO;
import com.veterinaria.veterinaria.Model.Mascota;
import com.veterinaria.veterinaria.Repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public void createMascota(Mascota mascota) {
        mascoRepo.save(mascota);
    }

    @Override
    public List<Mascota> readMascota() {
        return mascoRepo.findAll();
    }

    @Override
    public void updateMascota(Mascota mascota) {
        mascoRepo.save(mascota);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        mascoRepo.deleteById(id_mascota);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        return mascoRepo.findById(id_mascota).orElse(null);
    }

    @Override
    public List<Mascota> getCaniches() {
        List<Mascota> listaMascotas = this.readMascota();
        List<Mascota> listaCaniches = new ArrayList<Mascota>();

        for (Mascota masco : listaMascotas) {
            if (masco.getEspecie().equalsIgnoreCase("perro") && masco.getRaza().equalsIgnoreCase("caniche")) {
                listaCaniches.add(masco);
            }
        }

        return listaCaniches;
    }

    @Override
    public List<MascoDuenioDTO> getMascoDuenios() {
        List<Mascota> listaMascotas = this.readMascota();
        List<MascoDuenioDTO> listaMascoDuenio = new ArrayList<MascoDuenioDTO>();
        MascoDuenioDTO mascoDuenio = new MascoDuenioDTO();

        for (Mascota masco : listaMascotas) {
            mascoDuenio.setNombre_mascota(masco.getNombre());
            mascoDuenio.setEspecie(masco.getEspecie());
            mascoDuenio.setRaza(masco.getRaza());
            mascoDuenio.setNombre_duenio(masco.getUnDuenio().getNombre());
            mascoDuenio.setApellido_duenio(masco.getUnDuenio().getApellido());
            listaMascoDuenio.add(mascoDuenio);

            mascoDuenio = new MascoDuenioDTO();
        }

        return listaMascoDuenio;
    }

}
