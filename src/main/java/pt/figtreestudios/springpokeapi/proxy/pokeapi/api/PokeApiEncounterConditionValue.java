package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiEncounterConditionValue implements Serializable {
    private Integer id;
    private String name;
    private PokeApiNamedApiResource condition;
    private List<PokeApiName> names;
}
