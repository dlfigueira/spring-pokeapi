package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiVersionGroupFlavorText {
    private String text;
    private PokeApiNamedApiResource language;
    private PokeApiNamedApiResource version_group;
}
