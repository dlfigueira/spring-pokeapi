package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPokemonEntry {
    private Integer entry_number;
    private PokeApiNamedApiResource pokemon_species;
}
