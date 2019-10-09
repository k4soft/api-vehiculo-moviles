package co.com.k4soft.apivehiculo.repository;

import co.com.k4soft.apivehiculo.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculoRespository extends JpaRepository<Vehiculo, String> {

}
