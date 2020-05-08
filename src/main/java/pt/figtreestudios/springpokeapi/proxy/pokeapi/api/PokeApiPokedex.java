package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiPokedex {
    private Integer id;
    private String name;
    private Boolean is_main_series;
    private List<PokeApiDescription> descriptions;
    private List<PokeApiName> names;
    private List<PokeApiPokemonEntry> pokemon_entries;
    private PokeApiNamedResource region;
    private List<PokeApiNamedResource> version_groups;
}
