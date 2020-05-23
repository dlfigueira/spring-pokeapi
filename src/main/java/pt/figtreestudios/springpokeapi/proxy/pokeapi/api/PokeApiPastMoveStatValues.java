package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiPastMoveStatValues {
    private Integer accuracy;
    private Integer effect_chance;
    private Integer power;
    private Integer pp;
    private List<PokeApiVerboseEffect> effect_entries;
    private PokeApiNamedApiResource ailment;
    private PokeApiNamedApiResource category;
}
