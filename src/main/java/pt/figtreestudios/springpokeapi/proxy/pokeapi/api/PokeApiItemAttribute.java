package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiItemAttribute {
    private Integer id;
    private String name;
    private List<PokeApiNamedApiResource> items;
    private List<PokeApiName> names;
    private List<PokeApiDescription> descriptions;
}
