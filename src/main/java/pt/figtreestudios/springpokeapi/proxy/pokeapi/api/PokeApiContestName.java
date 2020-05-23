package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiContestName {
    private String name;
    private String color;
    private PokeApiNamedApiResource language;
}
