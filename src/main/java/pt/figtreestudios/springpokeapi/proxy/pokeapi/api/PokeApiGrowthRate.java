package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiGrowthRate implements Serializable {
    private Integer id;
    private String name;
    private String formula;
    private List<PokeApiDescription> descriptions;
    private List<PokeApiGrowthRateExperienceLevel> levels;
    private List<PokeApiNamedApiResource> pokemon_species;
}
