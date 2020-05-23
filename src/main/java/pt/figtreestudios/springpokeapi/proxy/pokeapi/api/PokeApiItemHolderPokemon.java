package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiItemHolderPokemon {
    private PokeApiNamedApiResource pokemon;
    private List<PokeApiItemHolderPokemonVersionDetail> version_details;
}
