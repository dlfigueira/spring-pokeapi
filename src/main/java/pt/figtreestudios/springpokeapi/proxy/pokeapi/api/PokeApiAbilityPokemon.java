package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiAbilityPokemon {
    private boolean is_hidden;
    private Integer slot;
    private PokeApiNamedResource pokemon;
}
