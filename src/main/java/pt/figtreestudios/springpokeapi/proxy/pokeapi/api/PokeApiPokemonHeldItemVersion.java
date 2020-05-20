package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPokemonHeldItemVersion {
    private PokeApiNamedResource version;
    private Integer rarity;
}
