package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiVersionEncounter {
    private Integer min_level;
    private Integer max_level;
    private List<PokeApiNamedResource> condition_values;
    private Integer chance;
    private PokeApiNamedResource method;
}
