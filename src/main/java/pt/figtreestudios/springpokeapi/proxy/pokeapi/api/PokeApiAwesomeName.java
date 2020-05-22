package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiAwesomeName {
    private String awesome_name;
    private PokeApiNamedApiResource language;
}
