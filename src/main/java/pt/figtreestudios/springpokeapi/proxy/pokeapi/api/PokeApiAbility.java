package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiAbility implements Serializable {
    private Integer id;
    private String name;
    private boolean is_main_series;
    private PokeApiNamedApiResource generation;
    private List<PokeApiName> names;
    private List<PokeApiVerboseEffect> effect_entries;
    private List<PokeApiAbilityEffectChange> effect_changes;
    private List<PokeApiAbilityFlavorText> flavor_text_entries;
    private List<PokeApiAbilityPokemon> pokemon;
}
