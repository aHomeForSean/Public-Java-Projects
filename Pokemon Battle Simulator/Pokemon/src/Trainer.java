/**
 * Represents a Pokémon Trainer with a team of up to 3 Pokémon.
 */
public class Trainer {
// Declare private fields for name, an array to hold up to 3 Pokémon, and a counter for the number of Pokemon
    private String name;
    private Pokemon[] pokemons = new Pokemon[3];
    private int pokemonCount = 0;

    // Constructor: Initialize the trainer's name and create an empty array for Pokémon
    public Trainer(String name) {
        this.name = name;
    }

// Method to add a Pokémon to the trainer's team
    public void addPokemon(Pokemon newPokemon) {
        // If the team is full (3 Pokémon), print a message saying the team is full
        if (pokemonCount < 3) { /// [0, 0, 0,]
            pokemons[pokemonCount] = newPokemon;
            pokemonCount++;
            System.out.println(newPokemon.getStatus() + " has joined " + this.name + "'s party! \n");
        }
        else {
            System.out.println(this.name + "'s party is full and can't hold any more members.");
            // Otherwise, add the new Pokémon to the array and increment the counter
        }
    }

// Method to get a specific Pokémon from the trainer's team by index (0, 1, or 2)
    public Pokemon getPokemon(int index) {
        if (index >= 0 && index < pokemonCount) {
            return pokemons[index];
        }
        else {
            System.out.println("Pokéball is empty!");
            return null;
        }
    }

// Method to return a string with trainer's information and list of their Pokémon
    public String getTrainerInfo(){
        String info = this.name + "'s current Pokémon: \n";
        for (int i = 0; i < pokemonCount; i++) {
            info = info + pokemons[i].getStatus() + "\n";
        }
        return info;
    }
    public String getTrainerName(){
        return this.name;
    }

}

