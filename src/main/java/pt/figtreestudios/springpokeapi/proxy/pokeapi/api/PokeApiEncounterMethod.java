package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiEncounterMethod {
    private Integer id;
    private String name;
    private Integer order;
    private List<PokeApiName> names;
}
