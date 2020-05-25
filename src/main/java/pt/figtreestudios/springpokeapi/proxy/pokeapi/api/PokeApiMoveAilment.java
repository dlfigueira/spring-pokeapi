package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiMoveAilment implements Serializable {
    private Integer id;
    private String name;
    private List<PokeApiNamedApiResource> moves;
    private List<PokeApiName> names;
}
