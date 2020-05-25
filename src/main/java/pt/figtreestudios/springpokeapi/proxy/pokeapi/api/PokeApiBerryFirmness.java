package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiBerryFirmness implements Serializable {
    private Integer id;
    private String name;
    private PokeApiNamedApiResource berries;
    private List<PokeApiName> names;
}
