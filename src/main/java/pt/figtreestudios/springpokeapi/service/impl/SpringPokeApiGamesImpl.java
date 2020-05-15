package pt.figtreestudios.springpokeapi.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.PokeApiGames;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiGeneration;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiNamedResourceList;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiPokedex;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiVersion;
import pt.figtreestudios.springpokeapi.proxy.pokeapi.api.PokeApiVersionGroup;
import pt.figtreestudios.springpokeapi.service.SpringPokeApiGames;

@Slf4j
@Service
@RequiredArgsConstructor
public class SpringPokeApiGamesImpl implements SpringPokeApiGames {
    private final PokeApiGames pokeApiGames;

    @Override
    public PokeApiNamedResourceList getGenerations() {
        return pokeApiGames.getGenerations();
    }

    @Override
    public PokeApiGeneration getGenerationById(Integer id) {
        return pokeApiGames.getGenerationById(id);
    }

    @Override
    public PokeApiGeneration getGenerationByName(String name) {
        return pokeApiGames.getGenerationByName(name);
    }

    @Override
    public PokeApiNamedResourceList getPokedex() {
        return pokeApiGames.getPokedex();
    }

    @Override
    public PokeApiPokedex getPokedexById(Integer id) {
        return pokeApiGames.getPokedexById(id);
    }

    @Override
    public PokeApiPokedex getPokedexByName(String name) {
        return pokeApiGames.getPokedexByName(name);
    }

    @Override
    public PokeApiNamedResourceList getVersions() {
        return pokeApiGames.getVersions();
    }

    @Override
    public PokeApiVersion getVersionById(Integer id) {
        return pokeApiGames.getVersionById(id);
    }

    @Override
    public PokeApiVersion getVersionByName(String name) {
        return pokeApiGames.getVersionByName(name);
    }

    @Override
    public PokeApiNamedResourceList getVersionGroups() {
        return pokeApiGames.getVersionGroups();
    }

    @Override
    public PokeApiVersionGroup getVersionGroupById(Integer id) {
        return pokeApiGames.getVersionGroupById(id);
    }

    @Override
    public PokeApiVersionGroup getVersionGroupByName(String name) {
        return pokeApiGames.getVersionGroupByName(name);
    }
}
