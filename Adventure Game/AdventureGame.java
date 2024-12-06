import java.util.Objects;
import java.util.Scanner;

// Author: Sean Farrell
// Partner: Shay Sin

public class AdventureGame {

    private static String dog;
    private static boolean gas;

    // TASK 1
        // Method: Calculate the sum of points from 1 to max
    public static void calculatePointsSum() {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the maximum number of points you can collect? ");
      
        int maxPoint = scanner.nextInt();
    
        int sum =0;
     
        for ( int i = 1; i <= maxPoint; i++) {
            sum = sum + i; // sum += i
        }

        System.out.println("Then the max XP collectable will be; " + sum + "xp");
        }

    // TASK 2
        // Method: Find the largest of 5 numbers (weapon values)
    public static void selectLargestWeapon() {
        Scanner scanner = new Scanner(System.in);
  
        int largest = Integer.MIN_VALUE;
        System.out.println("You find a table with 5 weapons");
        for (int i=1; i<=5; i++) {
            System.out.println("Chose the strength of weapon " + i + " and type enter: ");
            int weaponValue =scanner.nextInt();
        

            if (weaponValue > largest) largest = weaponValue;
         }
               
         System.out.println("The strongest weapon selected has a strength of " + largest + ", please keep it by your side.");
            
        }
    
    //TASK 3
        // Method: Find the smallest of 3 mini-boss health values
    public static void targetWeakestMiniBoss() {
        Scanner scanner = new Scanner(System.in);
        
        int smallest = Integer.MAX_VALUE;
        System.out.println("3 Mini bosses emerge before you, one by one.");
        for (int i=1; i<=3; i++) {
            System.out.println("How much health does boss " + i + " have?");
            int miniBossHealth =scanner.nextInt();


            if (miniBossHealth < smallest) smallest = miniBossHealth;
         }

         System.out.println("The boss weakest has a health value of " + smallest + ", you should target that one first!");
            
        }
        
    // TASK 4
        // Method: Calculate the factorial of a number for a power-up
    public static void calculateFactorialPowerUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Congrats! It's dead as a doornail and as a reward you get a power-up!");
        System.out.println("Please enter a number and you will receive it's factorial in power... Be careful now, push your luck and you might not like the results... ");
        int fact =scanner.nextInt();
        int factorialPower = 1;
           
        do {
            factorialPower = factorialPower*fact;
            fact = fact-1;
        }
        while (fact > 1);
        
            System.out.println("Boom! Power up! You gained " + factorialPower + " XP, feeling stronger, eh?");
        }
    
    // TASK 5
        // Method: Solve the door puzzle using a switch statement
    public static void doorPuzzle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You enter a room with doors labeled 1 to 5. You must chose which to enter, but chose wisely your fate depends on it!");
        int door =scanner.nextInt();
        // TODO: Ask the player to choose a door number (1-5)
                switch (door) {
            case 1:
                System.out.println("Really? Door 1? So basic, nothing happens.");
                break;
            case 2:
                Scanner chest = new Scanner(System.in);
                System.out.println("Lucky you! There's a chest! Will you open it? ");
                String openChest = chest.nextLine();
                if (Objects.equals(openChest, "yes")) {
                    System.out.println("Smart choice! Oh... it's empty... ");
                } else {
                    System.out.println("Well aren't you an interesting one... Fine, get out of here!");
                }
                break;
            case 3:
                System.out.println("It's a trap!");
                System.out.println("Oh, never mind it's just an Admiral Ackbar poster... Moving on");
                break;
            case 4:
                Scanner dogName = new Scanner(System.in);
                System.out.println("Oh look! There's a dog! Looks like you've found a friend!");
                System.out.println("But what will you name them? ");
                dog = dogName.nextLine();
                System.out.println("Ah " + dog + " interesting choice... Maybe they will be useful later *wink* *wink*");
                break;
            case 5:
                Scanner retry = new Scanner(System.in);
                System.out.println("Oops, that ones locked! You'll need to try another , which will you chose?");
                door = retry.nextInt();
                if (door == 5) {
                    do {
                        System.out.println("Are daft or deaf?!? I said it's LOCKED! Try again!");
                        door = retry.nextInt();
                    }
                    while (door == 5);
                    System.out.println("Now that's a better choice, looks like there's a treasure chest in this one! Oh never mind, it ran away...");
                    System.out.println("Maybe what you needed was a room with a shower instead... sorry getting off track now go fight the Dragon, oops, spoilers!");
                }
                else {
                    System.out.println("Now that's a better choice, looks like there's a treasure chest in this one! Oh never mind, it ran away...");
                    System.out.println("Maybe what you needed was a room with a shower instead... sorry, getting off track, now go fight the Dragon, oops, spoilers!");
                }
                    break;
            case 6:
                System.out.println("Wow! Sneaky, sneaky... You found the hidden door and for that you get the G.A.S... it's a giant sword, you can fill in the middle...");
                gas = true;
                break;
            default:
                System.out.println("Excuse me! I said 5 doors! 1 to 5! Are you that daft?!? You know what fine, you're going through door 1 and getting NOTHING!");
                break;
            }
    }
    // Method: Simulate a battle with a dragon using a while loop
    public static void battleDragon() {
        // TODO: Initialize player's health and dragon's health
        int playerHealth = 100;
        int dragonHealth = 1000;

        System.out.println(" ");
        System.out.println("As you advance you find you have aimlessly wandered right into the lair of a dragon. Luckily, it looks like she's sleeping...");
        System.out.println("Watch your step! *BANG* ");
        System.out.println("Great, you tripped over a rock and woke her up... a real genius this one. Welp, best bust out the weapon you picked up earlier eh?");
        Scanner toRumble = new Scanner(System.in);
        System.out.println("Are you ready?");
        String ready = toRumble.nextLine();
        System.out.println("Good! Now let me clarify how this works, each stage you get the option to Attack(A) or Defend(D). You will make your choice with either an A or a D and they MUST be capitols okay?");
        System.out.println("I'm still learning this whole Java thing so don't push it too hard, alright?");
        String setty = toRumble.nextLine();
        System.out.println(" ");
        System.out.println("Great! Now lets get this party started! And may the odds be ever in your favour.");
        System.out.println("Let the battle Begin!");
        System.out.println(" ");

        if (gas) {
            System.out.println("Oh look at  you and your G.A.S. I hear those are great a slicing through dragon scales *wink* *wink*");
            System.out.println(" * Deal double damage for all successful attacks! * ");
        }
        while ((playerHealth >= 1) && (dragonHealth >= 1)) {
            Scanner yourMove = new Scanner(System.in);
            System.out.println("The dragon stands poised, scales shimmering like molten metal under the flickering light.");
            System.out.println("Its massive chest heaves as it inhales deeply, the ground trembles beneath her weight, and the atmosphere crackles with impending energy before the roar of flame erupts!");
            System.out.println("The massive ball of fire hurls towards you, should you go for the attack (A) or try to defend (D)?");
            String round1 = yourMove.nextLine();
            if (round1.equals("A")) {
                System.out.println("You lunge like an action movie star, blade out, ready to cut right through the flames and into the dragons heart!");
                System.out.println("But this aint a movie pal! You get absolutely torched by the inferno!");
                System.out.println("* Lose 50hp *");
                playerHealth -= 101;
            }
            else if (round1.equals("D")) {
                System.out.println("With adrenaline surging, you leap to the side, narrowly evading the inferno. The fireball sails past, exploding against the cavern wall in a brilliant");
                System.out.println("eruption of light and sound, sending shards of stone and debris flying. The heat washes over you in a wave, but you land deftly, regaining your footing just in ");
                System.out.println("time to see the dragon’s furious eyes fixated on you, readying for its next attack.");
                System.out.println(" ");
            }
            else {
                System.out.println("Did not compute... You get scorched anyways! ");
                System.out.println("* Lose 50hp * ");
                playerHealth -= 51;
            }
            System.out.println("As the dragon takes a moment to recharge, its massive form stills, smoke wafting from its nostrils.");
            System.out.println("This presents itself with a unique opportunity. Should you go in for an attack (A) while she recharges or prepare your defenses (D) in case she attacks again?");
            String round2 = yourMove.nextLine();
            if (round2.equals("A")) {
                System.out.println("You see this fleeting chance and leap forward, heart pounding with determination. With a fierce battle cry, you drive your weapon toward the dragon, aiming for its vulnerable underbelly.");
                System.out.println("Your strike connects, the blade biting into the soft scales with a satisfying impact. The dragon lets out a thunderous roar, a mix of surprise and fury, shaking the very ground beneath you.");
                System.out.println("Its eyes flash with anger, and you can feel the heat radiating from its body as it recoils, momentarily disoriented. ");
                System.out.println(" ");
                System.out.println("In that instant, you know you’ve struck a blow that matters. But the dragon quickly regains its composure, its fierce gaze locking onto you once more, preparing to retaliate.");
                System.out.println("The lair crackles with tension as the battle rages on, both you and the dragon poised for the next move. ");
                System.out.println(" ");
                dragonHealth -= 201;
                if (gas) {
                    dragonHealth -= 201;}
            } else if (round2.equals("D")) {
                System.out.println("With a sudden roar, the dragon lunges forward, its massive jaws snapping wide as it aims to crush you in its fiery embrace. The ground shakes beneath the weight of its charge,");
                System.out.println("and you feel the rush of hot air as the beast closes the distance, fangs glistening menacingly.");
                System.out.println(" ");
                System.out.println("Just in time, you raise your shield, bracing yourself for the impact. The dragon’s maw collides with your shield, a bone-rattling crash that sends shock-waves through your arm.");
                System.out.println("You can feel the sheer force of its attack pressing against you, but your grip holds firm.");
                System.out.println(" ");
                System.out.println("The air around you ripples with heat as the dragon’s breath washes over the shield, embers and smoke swirling in a furious tempest. Despite the intimidation of its size,");
                System.out.println("you stand resolute, pushing back against the dragon’s power. With a fierce growl, the dragon pulls back slightly, realizing its attack was thwarted.");
                System.out.println("You take a moment to catch your breath, adrenaline surging through you, readying yourself for the next round in this perilous dance of life and death.");
                System.out.println(" ");
            }
            else {
                System.out.println("You both stare intensely at each other, planning the next attack, or the next defense. Both knowing one wrong move could be the end.");
            }

            System.out.println("You have " + playerHealth + " health remaining and she has " + dragonHealth + " health remaining. Think you can go on?");
            String roundX = yourMove.nextLine();

            if (dog != null ) {
                System.out.println("Just as the dragon lunges for another attack, you brace for impact, but out of nowhere, " + dog + " leaps into action. With a determined bark,");
                System.out.println("he snatches the blade from your hand, his instincts firing as he charges toward the massive beast. ");
                System.out.println(" ");
                System.out.println("The dragon, caught off guard, turns its attention to the small but fearless creature charging at it. With surprising agility, " + dog + " dodges the dragon’s snapping jaws,");
                System.out.println("the stolen blade gleaming in his grip as he maneuvers beneath the dragon’s bulk.");
                System.out.println(" ");
                System.out.println("In a burst of raw energy, he leaps, wielding the blade as if it were an extension of himself. With a powerful swipe, he drives the weapon into the dragon’s exposed flank.");
                System.out.println("The impact is explosive, as if he was born for this moment, a warrior in his own right. The dragon’s roar of surprise quickly morphs into one of agony as it crumples to the ground, defeated.");
                System.out.println(" ");
                System.out.println(dog + " stands proudly over the fallen beast, panting with exhilaration, a triumphant hero in a chaotic world.");
                System.out.println(dog + " You stare in disbelief, realizing that sometimes the most unexpected allies can change the course of battle.");
                dragonHealth = 0;
            }

            System.out.println("The cavern falls eerily silent, save for the faint rumble of the dragon’s breath and the whisper of your heartbeat echoing in your ears. ");
            System.out.println("Your grip tightens around your weapon, muscles tense and ready, heart racing as you weigh the options. Should you strike (A), or brace for the dragon's retaliatory attack (D)?");
            String round3 = yourMove.nextLine();
            if (round3.equals("A")) {
                System.out.println("You gather your resolve and charge forward, weapon raised high, adrenaline surging through your veins. But just as you close the distance, you catch a flicker");
                System.out.println("of movement from the corner of your eye. Before you can react, the dragon swings her massive tail, a blur of muscle and scale.");
                System.out.println(" ");
                System.out.println("The impact hits you like a freight train, sending you crashing against the cold, unforgiving stone wall of the cavern. Pain radiates through your body, and you struggle ");
                System.out.println("to catch your breath as the world around you spins, but this doesn't have to be the end. Get back up, and fight! If you have the will, that is.");
                System.out.println(" ");
                System.out.println(" * Health drops 15hp * ");
                playerHealth -= 16;
            }
            else if (round3.equals("D")) {
                System.out.println("You brace yourself, instinctively in as you choose to defend rather than attack. The dragon’s eyes narrow as she prepares to strike. You can see the tension in ");
                System.out.println("her muscles coiling, ready to unleash her ferocity.");
                System.out.println(" ");
                System.out.println("With a powerful leap, the dragon lunges forward, jaws wide and fangs glinting menacingly in the dim light. Just as she closes the distance, you shift your stance, ");
                System.out.println("raising your weapon to block her oncoming assault. The force of her attack slams against your guard, rattling your bones and forcing you to dig your heels into the ground.");
                System.out.println(" ");
                System.out.println("But you’re ready. As the dragon reels back from the force of your defense, you seize the moment. With a swift motion, you pivot and bring your weapon down in a sharp arc,");
                System.out.println("striking at her exposed flank. The blade bites into her scales, and you feel a surge of satisfaction as the dragon lets out a fierce roar of surprise and pain.");
                System.out.println(" ");
                dragonHealth -= 201;
                if (gas) {
                    dragonHealth -= 201;}
            }
            else {
                System.out.println("Come on, I made the instructions very clear, didn't I... A or D that's IT! Now lose 20hp cause the dragon insulted you or something");
                playerHealth -= 21;
            }

            System.out.println("As the dragon quickly regains her composure, a fiery determination ignites in her eyes. With a powerful flap of her wings, she launches herself into the air, ");
            System.out.println("her massive form silhouetted against the cavern's dim light. You feel the ground tremble beneath you as she ascends, and a sense of foreboding washes over you.");
            System.out.println("The air around you begins to swirl violently, debris lifting off the ground as the dragon channels her energy. You know you have mere moments to decide your next move.");
            System.out.println("Will you brace yourself, ready to defend against the onslaught of razor-sharp winds (D), or will you take the risk and attempt to strike her mid-flight, hoping to disrupt her attack (A)?");
            System.out.println(" ");
            String round4 = yourMove.nextLine();
            if (round4.equals("A")) {
                System.out.println("You decide to take the risk, charging forward in an attempt to interrupt the dragon’s impending attack. With your blade drawn your ready to slay the beast!");
                System.out.println("But reality strikes as her wings manipulate the very air that you breath sending a gust of wind right at you. The force of the gale hits you like a wall, sending you flying backward.");
                System.out.println("You struggle against the onslaught, but the winds are relentless. The sheer power knocks you off your feet and sends you crashing into a nearby boulder.");
                System.out.println("Pain radiates through your body as you hit the stone hard, leaving you momentarily dazed and gasping for breath. The dragons eyes gleaming with malice as you fight to regain your composure. ");
                System.out.println(" ");
            }
            else if (round4.equals("D")) {
                System.out.println("You make a split-second decision and dart behind a large boulder, seeking shelter from the dragon's impending wind attack. As you press yourself against the cold stone,");
                System.out.println("you feel the air rush past you with terrifying force, the winds howling like a tempest.");
                System.out.println("The gusts slam against the boulder, creating a cacophony of noise, but you remain unharmed. However, the sheer strength of the wind proves too much for the cavern's ancient stalactites.");
                System.out.println("One massive formation, dislodged by the gale, plummets toward the dragon below.");
                System.out.println("You watch in awe as the stalactite crashes down, piercing the dragon’s side with a sickening thud. She lets out a guttural roar of pain, twisting in mid-air. ");
                System.out.println("as the surprise and agony flash across her face. The tides of battle are shifting, and you feel a surge of hope igniting within you.");
                System.out.println(" ");
                dragonHealth -= 301;
            }
            else {
                System.out.println("You didn't answer with an A or a D... You just stood there with that smug look on your face as the wind starts to shred your skin apart! Are you alright inside?");
                System.out.println(" * Health drops 25hp *");
                playerHealth -= 26;
            }

            System.out.println("Like the dragon, I'm surprised you made it this far, and you still have " + playerHealth + " health, while she's got " + dragonHealth + " health.");
            if (playerHealth < 25) { System.out.println("Oh yikes! Actually I take that back you're not doing so good... Try making smarter choices okay? No more running into the fire, yeah?"); }
            System.out.println("You still got this though, right?");
            roundX = yourMove.nextLine();


            System.out.println("As the dragon steadies herself, a wicked glint sparkles in her eyes. With a powerful flap of her wings, she dives toward you, jaws agape, intent on devouring you whole. ");
            System.out.println("The ground trembles beneath her weight, and you can feel the rush of air as she closes the distance, her massive form a terrifying shadow looming over you.");
            System.out.println("Your heart races as you scramble to decide your next move. Will you attempt to strike at the dragon as she lunges (A), aiming for her vulnerable underbelly in hopes of stopping her advance,");
            System.out.println("or will you brace yourself (D) and prepare to dodge and shield yourself from the dragon’s fierce charge?");
            String round5 = yourMove.nextLine();
            if (round5.equals("A")) {
                System.out.println("With adrenaline coursing through your veins, you launch yourself at the dragon, weapon raised high, determined to land a decisive blow. You swing with all your might, but");
                System.out.println("the dragon effortlessly dodges, her movements fluid and graceful, almost mocking your attempt. Before you can recover, she lunges forward, her jaws snapping shut");
                System.out.println("around your midsection with bone-crushing force. The sharpness of her teeth is like razors, slicing through your armor as if it were mere cloth.");
                System.out.println("Pain explodes through your body as she clamps down, shaking you violently from side to side, her powerful muscles rendering you helpless. ");
                System.out.println("Then all fade to black as you fall into the belly of the beast.");
                System.out.println(" ");
                playerHealth = 0;
            }
            else if (round5.equals("D")) {
                System.out.println("You instinctively brace yourself as the dragon hurtles toward you, her jaws wide and ready to snap. With adrenaline surging through your veins, you prepare to dodge");
                System.out.println("or shield yourself from her fierce charge. As she closes in, you dive to the side, narrowly avoiding the snapping jaws that would have crushed you. ");
                System.out.println("The ground shakes as the dragon’s massive body barrels past you, and you hear the sound of her teeth clashing together, inches from your escape.");
                System.out.println(" ");
                System.out.println("You quickly regain your footing, but the dragon isn’t finished yet. She whips around with a furious growl, her eyes blazing with anger at your audacity to evade her.");
                System.out.println("With your heart racing, you know you’ll have to be ready for her next move. The tension in the air thickens as you prepare for what comes next.");
                System.out.println(" ");
            }
            else {
                System.out.println("You stand still like a stone wall (Because you didn't chose A or D!) and she swings by and swallows you whole! What an easy meal");
                playerHealth = 0;
            }

        }

         if (playerHealth == 0) {
             System.out.println("Really? You saw a dragon, jaws open flying towards and though 'Yeah, I could take that'??? What's wrong with you? That's how you wind up dead!");
             System.out.println("Oh, and look at that, you did!");
             System.out.println("YOU LOSE! Try again!");
         }
         else if (dragonHealth == 0) {
             System.out.println("Congrats You've slayed the dragon, or more accurately, " + dog + " slayed the dragon while you sat there twiddling your thumbs... Seriously they have no thumbs and handled it better than you!");
             System.out.println(" Well regardless, you (" + dog + ") have won! Now get outta here!");
         }

        else if (dragonHealth < 0) {
            System.out.println("Congrats you've slain the dragon and all her riches shall be yours... I hope you like bones though as that's all she was hording :)");
            System.out.println("Victory is yours and you are now free to leave!");
        }

        else if (playerHealth < 0) {
            System.out.println("You failed to slay the dragon and have now become her next victim, feel free to try again.");
        }


    }





public static void main(String[] args)  {
            calculatePointsSum();
            selectLargestWeapon();
            targetWeakestMiniBoss();
            calculateFactorialPowerUp();
            doorPuzzle();
            battleDragon();
        }
}
