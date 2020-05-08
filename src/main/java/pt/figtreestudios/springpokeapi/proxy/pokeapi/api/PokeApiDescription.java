package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiDescription {
    private String description;
    private PokeApiNamedResource language;
}
