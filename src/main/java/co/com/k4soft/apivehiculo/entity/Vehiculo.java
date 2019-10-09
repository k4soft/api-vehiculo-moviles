package co.com.k4soft.apivehiculo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vehiculo")
@Data
public class Vehiculo implements Serializable {

    @Id
    @Column(name = "placa")
    private String placa;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;

}
