package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPokemonMoveVersion implements Serializable {
    private PokeApiNamedApiResource move_learn_method;
    private PokeApiNamedApiResource version_group;
    private Integer level_learned_at;
}
