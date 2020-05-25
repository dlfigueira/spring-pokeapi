package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPokemonEntry implements Serializable {
    private Integer entry_number;
    private PokeApiNamedApiResource pokemon_species;
}
