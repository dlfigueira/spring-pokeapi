package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiEncounterMethod implements Serializable {
    private Integer id;
    private String name;
    private Integer order;
    private List<PokeApiName> names;
}
