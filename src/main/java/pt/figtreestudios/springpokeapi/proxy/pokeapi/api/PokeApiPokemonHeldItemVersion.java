package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPokemonHeldItemVersion {
    private PokeApiNamedApiResource version;
    private Integer rarity;
}
