package co.com.k4soft.apivehiculo.service;

import co.com.k4soft.apivehiculo.entity.Vehiculo;

import java.util.List;

public interface VehiculoService {

    List<Vehiculo> findAll();

    Vehiculo findByPlaca(String placa);

    void insert(Vehiculo vehiculo);

    void update(Vehiculo vehiculo);

    void delete(String placa);
}
