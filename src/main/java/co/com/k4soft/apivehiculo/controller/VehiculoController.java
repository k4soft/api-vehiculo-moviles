package co.com.k4soft.apivehiculo.controller;


import co.com.k4soft.apivehiculo.entity.Vehiculo;
import co.com.k4soft.apivehiculo.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculo/v1")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping("/vehiculos")
    public List<Vehiculo> findAll(){
       return vehiculoService.findAll();
    }

    @GetMapping("/vehiculo/{placa}")
    public Vehiculo findByPlaca(@PathVariable(value = "placa") String placa){
        return vehiculoService.findByPlaca(placa);
    }

    @PostMapping("/vehiculo")
    public void insert(@RequestBody Vehiculo vehiculo){
        vehiculoService.insert(vehiculo);
    }

    @PutMapping("/vehiculo/{placa}")
    public void update(@RequestBody Vehiculo vehiculo,@PathVariable(value = "placa",required = true)  String placa){
        vehiculo.setPlaca(placa);
        vehiculoService.update(vehiculo);
    }

    @DeleteMapping("/vehiculo/{placa}")
    public void delete(@PathVariable(value = "placa") String placa) {
         vehiculoService.delete(placa);
    }
}
