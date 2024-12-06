	/**
 	 * Simulates a simple battle between two Pokémon.
 	 */
public class PokemonBattle {
// Method to simulate a battle between two Pokémon:
	public void battle(Pokemon pokemon1, Trainer trainer1, Pokemon pokemon2, Trainer trainer2) {
		System.out.println("The battle between " + trainer1.getTrainerName() + "'s " + pokemon1.getName() + " and " + trainer2.getTrainerName() + "'s " + pokemon2.getName() + " begins! \n");
    // The battle should continue while neither Pokémon has fainted
		while (!pokemon1.isFainted() && !pokemon2.isFainted()) {
			// Each Pokémon takes turns attacking the other
			pokemon1.attack(pokemon2);
			// After each attack, print the remaining health of the opponent // This is already in .attack
			if (pokemon2.isFainted()) {
				System.out.println(pokemon2.getName() + " has fainted!");
				break;
			}
			pokemon2.attack(pokemon1);
			if (pokemon1.isFainted()) {
				System.out.println(pokemon1.getName() + " has fainted!");
				break;
			}
		}
		if (pokemon2.isFainted()){
			System.out.println(pokemon1.getName() + " won!");
		}
		else {
			System.out.println(pokemon2.getName() + " won!");
		}



    // Once the battle ends (one Pokémon has fainted), print the winner and loser12.
	}
}

