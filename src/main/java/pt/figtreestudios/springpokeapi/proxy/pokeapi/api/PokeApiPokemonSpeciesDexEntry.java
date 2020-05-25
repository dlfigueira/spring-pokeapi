package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPokemonSpeciesDexEntry implements Serializable {
    private Integer entry_number;
    private PokeApiNamedApiResource pokedex;
}
