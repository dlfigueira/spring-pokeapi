package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiItemHolderPokemonVersionDetail {
    private Integer rarity;
    private PokeApiNamedApiResource version;
}
