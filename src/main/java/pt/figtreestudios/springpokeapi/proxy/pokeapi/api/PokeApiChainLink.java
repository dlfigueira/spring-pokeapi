package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiChainLink {
    private boolean is_baby;
    private PokeApiNamedApiResource species;
    private List<PokeApiBerryFlavorMap> flavors;
    private List<PokeApiEvolutionDetail> evolves_to;
}
