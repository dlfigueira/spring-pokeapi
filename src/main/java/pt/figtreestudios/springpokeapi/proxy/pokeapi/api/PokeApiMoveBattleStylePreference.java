package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiMoveBattleStylePreference implements Serializable {
    private Integer low_hp_preference;
    private Integer high_hp_preference;
    private PokeApiNamedApiResource move_battle_style;
}
