package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiGenus {
    private String genus;
    private PokeApiNamedApiResource language;
}
