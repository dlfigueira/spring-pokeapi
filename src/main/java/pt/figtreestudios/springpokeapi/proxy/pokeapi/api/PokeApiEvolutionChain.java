package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiEvolutionChain {
    private Integer id;
    private PokeApiNamedApiResource baby_trigger_item;
    private PokeApiChainLink chain;
}
