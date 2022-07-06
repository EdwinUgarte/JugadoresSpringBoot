package com.example.prueba.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.prueba.models.Equipo;
import com.example.prueba.models.Jugador;
import com.example.prueba.services.IService;

@Component
@Primary
public class AppConfig implements IService{
    
    @Override
    public List<Jugador> futbolistas(){
        List<Jugador> futbolistas = new ArrayList<>();
        futbolistas.add(new Jugador("Sebastian Jurado", 23, new Equipo("Cruz Azul", "Mexico")));
        futbolistas.add(new Jugador("Julio Cesar 'El Cata'", 4, new Equipo("Cruz Azul", "Mexico")));
        futbolistas.add(new Jugador("Jhonatan Rodriguez", 23, new Equipo("America", "Mexico")));
        futbolistas.add(new Jugador("Uriel Antuna", 17, new Equipo("Cruz Azul", "Mexico")));
        futbolistas.add(new Jugador("Santiago Gimenez", 9, new Equipo("Cruz Azul", "Mexico")));
        futbolistas.add(new Jugador("Angel Romero", 10, new Equipo("Cruz Azul", "Mexico")));
        futbolistas.add(new Jugador("Messi", 10, new Equipo("Barcelona", "España")));
        
        return futbolistas;

        
    }


}
