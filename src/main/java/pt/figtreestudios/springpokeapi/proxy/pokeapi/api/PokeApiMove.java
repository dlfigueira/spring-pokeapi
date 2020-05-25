package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiMove implements Serializable {
    private Integer id;
    private String name;
    private Integer accuracy;
    private Integer effect_chance;
    private Integer pp;
    private Integer priority;
    private Integer power;
    private PokeApiContestComboSets contest_combos;
    private PokeApiNamedApiResource contest_type;
    private PokeApiApiResource contest_effect;
    private PokeApiNamedApiResource damage_class;
    private List<PokeApiVerboseEffect> effect_entries;
    private List<PokeApiAbilityEffectChange> effect_changes;
    private List<PokeApiMoveFlavorText> flavor_text_entries;
    private PokeApiNamedApiResource generation;
    private List<PokeApiMachineVersionDetail> machines;
    private PokeApiMoveMetaData meta;
    private List<PokeApiName> names;
    private List<PokeApiPastMoveStatValues> past_values;
    private List<PokeApiPastMoveStatChange> stat_changes;
    private PokeApiApiResource super_contest_effect;
    private PokeApiNamedApiResource target;
    private PokeApiNamedApiResource type;
}
