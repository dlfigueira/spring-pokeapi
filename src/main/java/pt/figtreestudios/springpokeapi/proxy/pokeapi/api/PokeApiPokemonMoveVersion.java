package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPokemonMoveVersion {
    private PokeApiNamedApiResource move_learn_method;
    private PokeApiNamedApiResource version_group;
    private Integer level_learned_at;
}
