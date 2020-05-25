package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiEncounter implements Serializable {
    private Integer min_level;
    private Integer max_level;
    private List<PokeApiNamedApiResource> condition_values;
    private Integer chance;
    private PokeApiNamedApiResource method;
}
