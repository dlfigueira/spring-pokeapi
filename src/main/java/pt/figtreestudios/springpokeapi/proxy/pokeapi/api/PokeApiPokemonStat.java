package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPokemonStat implements Serializable {
    private PokeApiNamedApiResource stat;
    private Integer effort;
    private Integer base_stat;
}
