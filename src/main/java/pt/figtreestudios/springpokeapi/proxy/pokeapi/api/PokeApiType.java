package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiType {
    private Integer id;
    private String name;
    private PokeApiTypeRelations damage_relations;
    private List<PokeApiGenerationGameIndex> game_indices;
    private PokeApiNamedResource generation;
    private PokeApiNamedResource move_damage_class;
    private List<PokeApiName> names;
    private List<PokeApiTypePokemon> pokemon;
    private List<PokeApiNamedResource> moves;
}
