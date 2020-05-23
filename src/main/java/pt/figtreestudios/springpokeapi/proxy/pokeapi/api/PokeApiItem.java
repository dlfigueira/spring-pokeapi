package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiItem {
    private Integer id;
    private String name;
    private Integer cost;
    private Integer fling_power;
    private PokeApiNamedApiResource fling_effect;
    private List<PokeApiNamedApiResource> attributes;
    private PokeApiNamedApiResource category;
    private List<PokeApiVerboseEffect> effect_entries;
    private List<PokeApiVersionGroupFlavorText> flavor_text_entries;
    private List<PokeApiGenerationGameIndex> game_indices;
    private List<PokeApiName> names;
    private PokeApiItemSprites sprites;
    private List<PokeApiItemHolderPokemon> held_by_pokemon;
    private PokeApiApiResource baby_trigger_for;
    private List<PokeApiMachineVersionDetail> machines;
}
