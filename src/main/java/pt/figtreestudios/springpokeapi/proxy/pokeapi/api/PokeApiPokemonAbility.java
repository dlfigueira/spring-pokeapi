package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPokemonAbility {
    private boolean is_hidden;
    private Integer slot;
    private PokeApiNamedApiResource ability;
}
