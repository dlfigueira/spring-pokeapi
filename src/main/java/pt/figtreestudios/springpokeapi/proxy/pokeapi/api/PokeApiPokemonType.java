package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPokemonType {
    private Integer slot;
    private PokeApiNamedApiResource type;
}
