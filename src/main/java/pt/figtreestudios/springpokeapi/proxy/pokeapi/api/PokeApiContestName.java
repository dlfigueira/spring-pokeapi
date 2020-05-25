package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiContestName implements Serializable {
    private String name;
    private String color;
    private PokeApiNamedApiResource language;
}
