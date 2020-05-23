package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiLocation {
    private Integer id;
    private String name;
    private PokeApiNamedApiResource region;
    private List<PokeApiName> names;
    private List<PokeApiGenerationGameIndex> game_indices;
    private List<PokeApiNamedApiResource> areas;
}
