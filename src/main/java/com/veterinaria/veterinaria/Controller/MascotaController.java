package com.veterinaria.veterinaria.Controller;

import com.veterinaria.veterinaria.DTO.MascoDuenioDTO;
import com.veterinaria.veterinaria.Model.Mascota;
import com.veterinaria.veterinaria.Service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;

    @GetMapping("mascota/read")
    public List<Mascota> readMascota() {
        return mascotaService.readMascota();
    }

    @PostMapping("mascota/create")
    public String createMascota(@RequestBody Mascota mascota) {
        mascotaService.createMascota(mascota);
        return "La Mascota se creo correctamente.";
    }

    @PutMapping("mascota/update")
    public String updateMascota(@RequestBody Mascota mascota) {
        mascotaService.updateMascota(mascota);
        return "La Mascota se edito correctamente.";
    }

    @DeleteMapping("mascota/delete/{id_mascota}")
    public String deleteMascota(@PathVariable Long id_mascota) {
        mascotaService.deleteMascota(id_mascota);
        return "La Mascota se borro correctamente.";
    }

    @GetMapping("mascota/caniches")
    public List<Mascota> getCaniches() {
        return mascotaService.getCaniches();
    }

    @GetMapping("mascota/masco-duenios")
    public List<MascoDuenioDTO> getMascoDuenios() {
        return mascotaService.getMascoDuenios();
    }

}
