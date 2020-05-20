package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiPokemonStat {
    private PokeApiNamedResource stat;
    private Integer effort;
    private Integer base_stat;
}
