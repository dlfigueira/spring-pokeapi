package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiPokedex implements Serializable {
    private Integer id;
    private String name;
    private Boolean is_main_series;
    private List<PokeApiDescription> descriptions;
    private List<PokeApiName> names;
    private List<PokeApiPokemonEntry> pokemon_entries;
    private PokeApiNamedApiResource region;
    private List<PokeApiNamedApiResource> version_groups;
}
