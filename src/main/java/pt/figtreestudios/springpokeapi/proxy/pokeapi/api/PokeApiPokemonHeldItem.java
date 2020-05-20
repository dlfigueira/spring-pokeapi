package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiPokemonHeldItem {
    private PokeApiNamedResource item;
    private List<PokeApiPokemonHeldItemVersion> version_details;
}
