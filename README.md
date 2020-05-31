# Spring-PokeAPI

[![npm version](https://img.shields.io/github/workflow/status/dlfigueira/spring-pokeapi/CI?style=plastic)](https://img.shields.io/github/workflow/status/dlfigueira/spring-pokeapi/CI?style=plastic)
[![npm version](https://img.shields.io/github/v/release/dlfigueira/spring-pokeapi?style=plastic)](https://img.shields.io/github/v/release/dlfigueira/spring-pokeapi?style=plastic)
[![npm](https://img.shields.io/github/license/dlfigueira/spring-pokeapi?style=plastic)](https://img.shields.io/github/license/dlfigueira/spring-pokeapi?style=plastic)

Spring Boot library wrapper for [PokéAPI](https://pokeapi.co/).

## Features
* OpenFeign to interact with PokeAPI REST API
* Resources cached locally with Hazelcast

## Install
Add dependency to Github Package registry

#### Github Package Registry
The library is available in Github Package Registry:

1. Add the repository to the pom.xml

        <repositories>
            <repository>
                <id>github</id>
                <name>GitHub dlfigueira spring-pokeapi</name>
                <url>https://maven.pkg.github.com/dlfigueira/spring-pokeapi</url>
                <releases>
                    <enabled>true</enabled>
                </releases>
                <snapshots>
                    <enabled>true</enabled>
                </snapshots>
            </repository>
        </repositories>
    
2. Add dependency

        <dependencies>
            <dependency>
                <groupId>pt.figtreestudios</groupId>
                <artifactId>spring-pokeapi</artifactId>
                <version>1.0.0</version>
            </dependency>
        </dependencies>

3. Add server in .m2/settings.xml. ACCESS_TOKEN must have at least read:packages

        <servers>
          <server>
              <id>github</id>
              <username>USER</username>
              <password>ACCESS_TOKEN</password>
          </server>
        </servers>

#### Maven
Alternatively, the source code can also be downloaded and installed in the local repository.

## Usage

#### Configuration
To use this library, add the following line to your Application class.

    @Import(SpringPokeApiConfig.class)

This will bootstrap both OpenFeign and Hazelcast configurations. Or you can ignore this step and roll your own configurations.

#### Resources
This library exposes all resources as Spring components, which can be autowired into your code.
Each component points to a separate resource in PokeAPI.

* PokeApiBerries
* PokeApiContests
* PokeApiEncounters
* PokeApiEvolution
* PokeApiGames
* PokeApiItems
* PokeApiLocations
* PokeApiMachines
* PokeApiMoves
* PokeApiPokemon

Each of these resources exposes a method to get all resources (paginated with a limit and offset) and methods to get resource by id or name, where available.

## License
This project is licensed under the [MIT license](http://opensource.org/licenses/mit-license.php)
