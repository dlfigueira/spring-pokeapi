package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiBerryFlavor {
    private Integer id;
    private String name;
    private List<PokeApiFlavorBerryMap> berries;
    private PokeApiNamedApiResource contest_type;
    private List<PokeApiName> names;
}
