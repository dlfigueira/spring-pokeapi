package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPokemonSpeciesDexEntry {
    private Integer entry_number;
    private PokeApiNamedResource pokedex;
}
