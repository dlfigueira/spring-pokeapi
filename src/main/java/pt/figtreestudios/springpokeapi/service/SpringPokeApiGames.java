package pt.figtreestudios.springpokeapi.service;

import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGenerationApi;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;

public interface SpringPokeApiGames {
    PokeApiNamedResourceList getGenerations();
    PokeApiGenerationApi getGenerationById(Integer id);
    PokeApiGenerationApi getGenerationByName(String name);
}
