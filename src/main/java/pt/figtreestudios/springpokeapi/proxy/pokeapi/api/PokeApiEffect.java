package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiEffect {
    private String effect;
    private PokeApiNamedApiResource language;
}
