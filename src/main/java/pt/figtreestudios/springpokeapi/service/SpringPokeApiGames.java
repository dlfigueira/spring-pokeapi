package pt.figtreestudios.springpokeapi.service;

import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGeneration;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokedex;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiVersion;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiVersionGroup;

public interface SpringPokeApiGames {
    PokeApiNamedResourceList getGenerations();
    PokeApiGeneration getGenerationById(Integer id);
    PokeApiGeneration getGenerationByName(String name);

    PokeApiNamedResourceList getPokedex();
    PokeApiPokedex getPokedexById(Integer id);
    PokeApiPokedex getPokedexByName(String name);

    PokeApiNamedResourceList getVersions();
    PokeApiVersion getVersionById(Integer id);
    PokeApiVersion getVersionByName(String name);

    PokeApiNamedResourceList getVersionGroups();
    PokeApiVersionGroup getVersionGroupById(Integer id);
    PokeApiVersionGroup getVersionGroupByName(String name);
}
