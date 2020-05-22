package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiPokemon {
    private Integer id;
    private String name;
    private Integer base_experience;
    private Integer height;
    private boolean is_default;
    private Integer order;
    private Integer weight;
    private List<PokeApiPokemonAbility> abilities;
    private List<PokeApiNamedApiResource> forms;
    private List<PokeApiVersionGameIndex> game_indices;
    private List<PokeApiPokemonHeldItem> held_items;
    private List<PokeApiLocationAreaEncounter> location_area_encounters;
    private List<PokeApiPokemonMove> moves;
    private List<PokeApiPokemonSprites> sprites;
    private List<PokeApiNamedApiResource> species;
    private List<PokeApiPokemonStat> stats;
    private List<PokeApiPokemonType> types;
}
