package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

@Data
public class PokeApiMoveBattleStylePreference {
    private Integer low_hp_preference;
    private Integer high_hp_preference;
    private PokeApiNamedApiResource move_battle_style;
}
