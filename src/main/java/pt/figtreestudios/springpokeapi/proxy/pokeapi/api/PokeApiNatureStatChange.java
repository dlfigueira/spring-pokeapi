package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiNatureStatChange implements Serializable {
    private Integer max_change;
    private PokeApiNamedApiResource pokeathlon_stat;
}
