package br.com.estacionamento.controllers;

import br.com.estacionamento.facades.SensorFacade;
import br.com.estacionamento.models.SensorModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/Sensores")
public class SensorController {
    private final SensorFacade sensorFacade;

    @Autowired
    public SensorController(SensorFacade sensorFacade) throws IOException {
        this.sensorFacade = sensorFacade;
    }

    @GetMapping("/")
    public List<SensorModels> getSensor() throws IOException {
        return this.sensorFacade.buscarTodos();
    }

    @GetMapping("/{id}")
    public SensorModels getSensorById(@PathVariable int id) throws IOException {
        return this.sensorFacade.buscarPorId(id);
    }

    @PostMapping("/sensor/adicionar")
    public void adicionarSensor(@RequestBody SensorModels sensor) throws IOException {
        this.sensorFacade.adicionar(sensor);
    }

    @PutMapping("/sensor/atualizar/{id}")
    public void atualizarSensor(@PathVariable int id, @RequestBody SensorModels sensor) throws IOException {
        this.sensorFacade.atualizar(id, sensor);
    }

    @DeleteMapping("/sensor/remover/{id}")
    public void removerSensor(@PathVariable int id) throws IOException {
        this.sensorFacade.remover(id);
    }
}
