	/**
 	 * Represents a Pokémon with basic stats and abilities.
 	 */
public class Pokemon {
    // Declare private fields for name, level, health, maxHealth, and attackPower
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int attackPower;

    // Constructor: Initialize Pokémon's name and level
    public Pokemon(String name, int level) {
        this.name = name;
        this.level=level;
            // Set maxHealth based on level and initial health as maxHealth
        this.maxHealth = level *10;
        this.health = this.maxHealth;
        // Set attackPower based on level (level * 2 or another appropriate value)
        this.attackPower = level *2;
    }

    // Getter and setter for health
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        // The setter should ensure health is within 0 and maxHealth
        if(health > maxHealth) {
            this.health = maxHealth;
        }
        else if (health < 0) {
            this.health = health = 0;
        }
        else {
            this.health = health;
        }
    }

    // Method to simulate attacking another Pokémon:
    public void attack(Pokemon opponent) {
        // Subtract attackPower from opponent's health
        opponent.setHealth(opponent.getHealth() - this.attackPower);
        // Print a message about the attack and the remaining health of the opponent
        System.out.println(this.name + " attacks " + opponent.name + " for " + this.attackPower + " damage!");
        System.out.println(opponent.name + " has " + opponent.getHealth() + " hp remaining. \n");
    }
    public boolean isFainted() {
        // Method to check if the Pokémon has fainted (health <= 0)
        return this.health <= 0;
    }
    // Method to get the current status of the Pokémon (name, level, health/maxHealth)24.
    public String getStatus() {
        return "Level " + this.level + " " + this.name + " with " + this.health +"/"+ this.maxHealth + " hp";
    }
        public String getName() {
            return " " + this.name;
        }
}