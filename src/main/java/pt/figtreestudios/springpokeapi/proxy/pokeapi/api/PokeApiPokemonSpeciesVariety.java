package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPokemonSpeciesVariety {
    private String is_default;
    private PokeApiNamedApiResource pokemon;
}
