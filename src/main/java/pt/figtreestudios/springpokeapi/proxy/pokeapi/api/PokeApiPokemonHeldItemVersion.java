package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPokemonHeldItemVersion implements Serializable {
    private PokeApiNamedApiResource version;
    private Integer rarity;
}
