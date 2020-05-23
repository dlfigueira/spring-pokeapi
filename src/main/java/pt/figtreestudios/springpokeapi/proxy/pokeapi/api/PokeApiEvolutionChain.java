package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiEvolutionChain {
    private Integer id;
    private PokeApiNamedApiResource baby_trigger_item;
    private PokeApiChainLink chain;
}
