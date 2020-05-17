package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiNature {
    private Integer id;
    private String name;
    private PokeApiNamedResource decreased_stat;
    private PokeApiNamedResource increased_stat;
    private PokeApiNamedResource hates_flavor;
    private PokeApiNamedResource likes_flavor;
    private List<PokeApiNatureStatChange> pokeathlon_stat_changes;
    private List<PokeApiMoveBattleStylePreference> move_battle_style_preferences;
    private List<PokeApiName> names;
}
