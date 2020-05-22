package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiName {
    private String name;
    private PokeApiNamedApiResource language;
}
