package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiNatureStatChange {
    private Integer max_change;
    private PokeApiNamedResource pokeathlon_stat;
}
