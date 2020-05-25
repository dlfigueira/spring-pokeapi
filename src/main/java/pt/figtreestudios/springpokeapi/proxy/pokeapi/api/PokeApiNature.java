package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiNature implements Serializable {
    private Integer id;
    private String name;
    private PokeApiNamedApiResource decreased_stat;
    private PokeApiNamedApiResource increased_stat;
    private PokeApiNamedApiResource hates_flavor;
    private PokeApiNamedApiResource likes_flavor;
    private List<PokeApiNatureStatChange> pokeathlon_stat_changes;
    private List<PokeApiMoveBattleStylePreference> move_battle_style_preferences;
    private List<PokeApiName> names;
}
