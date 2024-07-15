package com.veterinaria.veterinaria.Controller;

import com.veterinaria.veterinaria.Model.Duenio;
import com.veterinaria.veterinaria.Service.IDuenioService;
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
public class DuenioController {

    @Autowired
    private IDuenioService duenioService;

    @GetMapping("duenio/read")
    public List<Duenio> readDuenio() {
        return duenioService.readDuenio();
    }

    @PostMapping("duenio/create")
    public String createDuenio(@RequestBody Duenio duenio) {
        duenioService.createDuenio(duenio);
        return "El Dueño se creo correctamente.";
    }

    @PutMapping("duenio/update")
    public String updateDuenio(@RequestBody Duenio duenio) {
        duenioService.updateDuenio(duenio);
        return "El Dueño se edito correctamente.";
    }

    @DeleteMapping("duenio/delete/{id_duenio}")
    public String deleteDuenio(@PathVariable Long id_duenio) {
        duenioService.deleteDuenio(id_duenio);
        return "El Dueño se borro correctamente.";
    }

}
