package pt.figtreestudios.springpokeapi.service;

import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGeneration;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokedex;

public interface SpringPokeApiGames {
    PokeApiNamedResourceList getGenerations();
    PokeApiGeneration getGenerationById(Integer id);
    PokeApiGeneration getGenerationByName(String name);

    PokeApiNamedResourceList getPokedex();
    PokeApiPokedex getPokedexById(Integer id);
    PokeApiPokedex getPokedexByName(String name);
}
