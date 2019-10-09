package co.com.k4soft.apivehiculo.service.impl;

import co.com.k4soft.apivehiculo.entity.Vehiculo;
import co.com.k4soft.apivehiculo.repository.VehiculoRespository;
import co.com.k4soft.apivehiculo.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRespository vehiculoRespository;


    @Override
    public List<Vehiculo> findAll() {
        return vehiculoRespository.findAll();
    }

    @Override
    public Vehiculo findByPlaca(String placa) {
        return vehiculoRespository.findById(placa).orElse(null);
    }

    @Override
    public void insert(Vehiculo vehiculoIn) {
        Vehiculo vehiculoOut = findByPlaca(vehiculoIn.getPlaca());
        if(vehiculoOut == null){
            vehiculoRespository.save(vehiculoIn);
        }
    }

    @Override
    public void update(Vehiculo vehiculoIn) {
        Vehiculo vehiculoOut = findByPlaca(vehiculoIn.getPlaca());
        if(vehiculoOut != null){
            vehiculoRespository.save(vehiculoIn);
        }
    }

    @Override
    public void delete(String placa) {
        Vehiculo vehiculoOut = findByPlaca(placa);
        if(vehiculoOut != null){
            vehiculoRespository.deleteById(placa);
        }
    }
}
