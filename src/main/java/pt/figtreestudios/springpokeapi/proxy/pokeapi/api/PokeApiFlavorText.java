package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiFlavorText {
    private String flavor_text;
    private PokeApiNamedApiResource language;
    private PokeApiNamedApiResource version;
}
