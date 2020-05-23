package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiEncounterConditionValue {
    private Integer id;
    private String name;
    private PokeApiNamedApiResource condition;
    private List<PokeApiName> names;
}
