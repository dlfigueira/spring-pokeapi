package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiNatureStatChange {
    private Integer max_change;
    private PokeApiNamedApiResource pokeathlon_stat;
}
