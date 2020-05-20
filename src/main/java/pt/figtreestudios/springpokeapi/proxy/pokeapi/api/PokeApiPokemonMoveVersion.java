package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPokemonMoveVersion {
    private PokeApiNamedResource move_learn_method;
    private PokeApiNamedResource version_group;
    private Integer level_learned_at;
}
