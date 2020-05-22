package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiPokemonSpecies {
    private Integer id;
    private String name;
    private Integer order;
    private Integer gender_rate;
    private Integer capture_rate;
    private Integer base_happiness;
    private boolean is_baby;
    private Integer hatch_counter;
    private boolean has_gender_differences;
    private boolean forms_switchable;
    private PokeApiNamedApiResource growth_rate;
    private List<PokeApiPokemonSpeciesDexEntry> pokedex_numbers;
    private List<PokeApiNamedApiResource> egg_groups;
    private PokeApiNamedApiResource color;
    private PokeApiNamedApiResource shape;
    private PokeApiNamedApiResource evolves_from_species;
    private PokeApiApiResource evolution_chain;
    private PokeApiNamedApiResource habitat;
    private PokeApiNamedApiResource generation;
    private List<PokeApiName> names;
    private List<PokeApiPalParkEncounterArea> pal_park_encounters;
    private List<PokeApiFlavorText> flavor_text_entries;
    private List<PokeApiDescription> form_descriptions;
    private List<PokeApiGenus> genera;
    private List<PokeApiPokemonSpeciesVariety> varieties;
}
