package com.veterinaria.veterinaria.Repository;

import com.veterinaria.veterinaria.Model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
    
}
