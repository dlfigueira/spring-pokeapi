package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiTypeRelations {
    private List<PokeApiNamedResource> no_damage_to;
    private List<PokeApiNamedResource> half_damage_to;
    private List<PokeApiNamedResource> double_damage_to;
    private List<PokeApiNamedResource> no_damage_from;
    private List<PokeApiNamedResource> half_damage_from;
    private List<PokeApiNamedResource> double_damage_from;
}
