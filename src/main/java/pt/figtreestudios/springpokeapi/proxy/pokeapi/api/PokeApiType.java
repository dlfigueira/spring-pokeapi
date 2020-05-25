package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiType implements Serializable {
    private Integer id;
    private String name;
    private PokeApiTypeRelations damage_relations;
    private List<PokeApiGenerationGameIndex> game_indices;
    private PokeApiNamedApiResource generation;
    private PokeApiNamedApiResource move_damage_class;
    private List<PokeApiName> names;
    private List<PokeApiTypePokemon> pokemon;
    private List<PokeApiNamedApiResource> moves;
}
