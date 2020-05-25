package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiAwesomeName implements Serializable {
    private String awesome_name;
    private PokeApiNamedApiResource language;
}
