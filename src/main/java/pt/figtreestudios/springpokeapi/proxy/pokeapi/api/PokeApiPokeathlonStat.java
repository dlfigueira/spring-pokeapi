package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiPokeathlonStat {
    private Integer id;
    private String name;
    private List<PokeApiName> names;
    private PokeApiNaturePokeathlonStatAffectSets affecting_natures;
}
