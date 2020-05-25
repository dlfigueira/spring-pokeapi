package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiLocation implements Serializable {
    private Integer id;
    private String name;
    private PokeApiNamedApiResource region;
    private List<PokeApiName> names;
    private List<PokeApiGenerationGameIndex> game_indices;
    private List<PokeApiNamedApiResource> areas;
}
