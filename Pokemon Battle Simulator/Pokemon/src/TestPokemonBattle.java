/**
 * Tests the Pokémon battle game by creating Pokémon and Trainers and simulating a battle.
 */
public class TestPokemonBattle {
    public static void main(String[] args) {
        // Create instances of Pokémon: Pikachu (level 5) and Charmander (level 6)
        Pokemon pikachu = new Pokemon("Pikachu", 5);
        Pokemon charmander = new Pokemon("Charmander", 6);

        // Create Trainer instances for Ash and Brock
        Trainer ash = new Trainer("Ash");
        Trainer brock = new Trainer("Brock");

        // Add Pokémon to their respective trainers using addPokemon() method
        ash.addPokemon(pikachu);
        brock.addPokemon(charmander);

        // Display the trainers' information using the getTrainerInfo() method
        System.out.println(ash.getTrainerInfo());
        System.out.println(brock.getTrainerInfo());

        // Create an instance of PokemonBattle and start a battle between Pikachu and Charmander
        PokemonBattle battle = new PokemonBattle();

        // Use the battle() method to simulate the battle
        battle.battle(pikachu, ash, charmander, brock);
    }
}

