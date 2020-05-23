package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiEncounterCondition {
    private Integer id;
    private String name;
    private List<PokeApiName> names;
    private List<PokeApiNamedApiResource> values;
}
