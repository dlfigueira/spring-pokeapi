package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiAbilityEffectChange implements Serializable {
    private List<PokeApiEffect> effect_entries;
    private PokeApiNamedApiResource version_group;
}
