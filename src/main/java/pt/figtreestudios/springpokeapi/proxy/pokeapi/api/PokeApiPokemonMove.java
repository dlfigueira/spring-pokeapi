package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiPokemonMove {
    private PokeApiNamedResource move;
    private List<PokeApiPokemonMoveVersion> version_group_details;
}
