package com.example.prueba.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Priority;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.prueba.models.Equipo;
import com.example.prueba.models.Jugador;
import com.example.prueba.services.IService;

@Component
public class AppConfig2 implements IService{
    
    @Override
    public List<Jugador> futbolistas(){
        List<Jugador> futbolistas = new ArrayList<>();
        futbolistas.add(new Jugador("Cristiano", 23, new Equipo("Cruz Azul", "Mexico")));
        futbolistas.add(new Jugador("Ronaldino", 4, new Equipo("Cruz Azul", "Mexico")));
       
        return futbolistas;
    }

}
