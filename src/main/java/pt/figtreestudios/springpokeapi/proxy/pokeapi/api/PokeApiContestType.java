package pt.figtreestudios.springpokeapi.proxy.pokeapi.api;

import lombok.Data;

import java.util.List;

@Data
public class PokeApiContestType {
    private Integer id;
    private String name;
    private PokeApiNamedApiResource berry_flavor;
    private List<PokeApiContestName> names;
}
