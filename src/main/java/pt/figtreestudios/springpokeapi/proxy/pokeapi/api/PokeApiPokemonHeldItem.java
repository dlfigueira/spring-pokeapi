package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiPokemonHeldItem implements Serializable {
    private PokeApiNamedApiResource item;
    private List<PokeApiPokemonHeldItemVersion> version_details;
}
