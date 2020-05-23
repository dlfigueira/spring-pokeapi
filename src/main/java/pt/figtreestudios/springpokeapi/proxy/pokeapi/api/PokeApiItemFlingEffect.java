package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiItemFlingEffect {
    private Integer id;
    private String name;
    private List<PokeApiEffect> effect_entries;
    private List<PokeApiNamedApiResource> items;
}
