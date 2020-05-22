package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiVerboseEffect {
    private String name;
    private String short_effect;
    private PokeApiNamedApiResource language;
}
