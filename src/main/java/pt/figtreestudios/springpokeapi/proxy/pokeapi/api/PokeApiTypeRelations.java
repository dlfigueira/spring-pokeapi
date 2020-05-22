package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiTypeRelations {
    private List<PokeApiNamedApiResource> no_damage_to;
    private List<PokeApiNamedApiResource> half_damage_to;
    private List<PokeApiNamedApiResource> double_damage_to;
    private List<PokeApiNamedApiResource> no_damage_from;
    private List<PokeApiNamedApiResource> half_damage_from;
    private List<PokeApiNamedApiResource> double_damage_from;
}
