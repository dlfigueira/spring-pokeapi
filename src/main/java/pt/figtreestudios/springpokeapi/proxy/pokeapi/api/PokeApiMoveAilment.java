package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiMoveAilment {
    private Integer id;
    private String name;
    private List<PokeApiNamedApiResource> moves;
    private List<PokeApiName> names;
}