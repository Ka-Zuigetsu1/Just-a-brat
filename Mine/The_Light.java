package Mine;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class The_Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String[] Enemies1 = {"5 Zombies", "Chainsaw", "Dogs"};
        String[] Bosses = {"Tyrant", "Nemesis", "Diana"};
        String[] Inventory = { "9mm Pistol", "Combat Knife", "9mm Ammo", "First Aid Spray", "Cult Letter"};
        int HP = 100;
        int Zombie = 100;
        int Zombie2 = 100;
        int Zombie3 = 100;
        int Zombie4 = 100;
        int Zombie5 = 100;
        int Tyrant = 500;
        int Nemesis = 600;
        int Diana = 1000;
        int []ZOMBIES = {Zombie, Zombie2, Zombie3, Zombie4, Zombie5};
        int Dog = 40;
        int Chainsaw = 150;
        Story();
        combat1();
        String A = sc.nextLine();
        Random ra = new Random();
        if (A.equals("A")) {
            System.out.println("Encountered " + Enemies1[0]);
            do {
                System.out.println("Turn 1 = Zombies");
                for (int i = 1; i <= 5; i++) {
                    HP = HP - 5;
                    System.out.println(HP + "HP left after attack by a zombie.");
                }
                System.out.println("Turn 2 = Lucius");
                System.out.println(">>>>INVENTORY>>>>" + Inventory[0] + " " + Inventory[1] + " " + Inventory[2] + " " + Inventory[3] + " " + Inventory[4]);
                String choice = sc.nextLine();
                if (choice.equals(Inventory[0]) || choice.equals(Inventory[1]) || choice.equals(Inventory[2]) || choice.equals(Inventory[3]) || choice.equals(Inventory[4])) {
                    System.out.println("You used " + choice);
                    if (choice.equalsIgnoreCase(Inventory[0])) {
                        for (int k = 1; k < ZOMBIES.length; k++) {
                            ZOMBIES[k] -= 40;
                        }
                        System.out.println("You used up the entire mag now reloading");
                        Inventory[2] = "9mm Ammo";
//                        System.out.println("You have " + Inventory[2] + " Left");
                        double chance = Math.random();
                        if (chance < 0.50d) {
                           ZOMBIES[ZOMBIES.length - 1]-= 40;
                            System.out.println("Landed crits! on all Zombies");
                    } System.out.println("Zombies have " + ZOMBIES[0] + " HP Left");
                } else if (choice.equalsIgnoreCase(Inventory[3])) {
                    if (HP == 100) {
                        System.out.println("Healed From 100 HP to 100 HP");
                    } else if (HP < 100) {
                        System.out.println("Healed to full HP");
                        HP = 100;
                    }
                    }
                    else if (choice.equalsIgnoreCase(Inventory[1])) {
                        System.out.println("Chose Combat Knife \n" +
                                "You Can Only Attack one Zombie");
                        System.out.print("Enter The Zombie Number You want to attack: ");
                        ZOMBIES[sc2.nextInt()] -= 50;
                        if (ZOMBIES[sc2.nextInt()] > 5) {
                            System.out.println("Invalid Zombie");
                        } else {
                            continue;
                        }
                    } else if (choice.equalsIgnoreCase(Inventory[2])) {
                        System.out.println("Throwing Bullets? Seriously?");
                        for (int kk = 0; kk < 6; kk++) {
                            ZOMBIES[kk] -= 5;
                        } System.out.println("Did 5 damage to all zombies");
                    } else if (choice.equalsIgnoreCase(Inventory[4])) {
                        System.out.println("\"The Light belongs to God no longer.\n" +
                                " We have taken His final candle. Come to Spain...\n" +
                                " if darkness does not frighten you.\"\n" +
                                " Signed only with a crimson symbol: \n" +
                                "\n" +
                                "The Eclipse Circle.");

                    }
                }
                    else {
                    System.out.println("Not in Inventory");
                }
            } while (HP > 0 && (Zombie > 0 || Zombie2 > 0 || Zombie3 > 0 || Zombie4 > 0 || Zombie5 > 0));
            System.out.println("\nAll Zombies Eliminated!");
            System.out.println("You continue deeper into the village...\n");

            int enemy = ra.nextInt(Enemies1.length);

            System.out.println("Enemy Encountered : " + Enemies1[enemy]);
            if (enemy == 0) {
                System.out.println("The ground begins to shake...");
                System.out.println("A giant figure walks through the smoke...");
                System.out.println("BOSS : TYRANT");
                System.out.println("HP : " + Tyrant);

                do {

                    System.out.println("\n===== INVENTORY =====");

                    for (int i = 0; i < Inventory.length; i++) {
                        System.out.println(Inventory[i]);
                    }
                    boolean found = false;
                    String choice = sc.nextLine();
                    for (int i = 0; i < Inventory.length; i++) {
                        if (choice.equalsIgnoreCase(Inventory[i])) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        if (choice.equalsIgnoreCase(Inventory[0])) {

                            System.out.println("You fired the 9mm!");

                            Tyrant -= 40;

                            System.out.println("Tyrant HP : " + Tyrant);

                            HP -= 30;

                            System.out.println("Tyrant punched you!");

                            System.out.println("Your HP : " + HP);

                        } else if (choice.equalsIgnoreCase(Inventory[1])) {

                            System.out.println("You slashed Tyrant!");

                            Tyrant -= 15;

                            HP -= 20;

                            System.out.println("Your HP : " + HP);

                        } else if (choice.equalsIgnoreCase(Inventory[2])) {

                            System.out.println("Reloaded!");

                            Inventory[2] = "9mm Ammo x30";

                        } else if (choice.equalsIgnoreCase(Inventory[3])) {

                            if (HP == 100) {

                                System.out.println("Already Full HP.");

                            } else {

                                HP = 100;

                                Inventory[3] = "Empty Spray";

                                System.out.println("Recovered to Full HP.");

                            }

                        } else if (choice.equalsIgnoreCase(Inventory[4])) {

                            System.out.println("\"The Light belongs to God no longer...\"");

                        }

                    } else {

                        System.out.println("Not in Inventory");

                    }
                    if (Tyrant <= 250 && Tyrant > 0) {

                        System.out.println();
                        System.out.println("--------------------------------");
                        System.out.println("Your bullets are doing nothing...");
                        System.out.println();
                        System.out.println("*HELICOPTER NOISES*");
                        System.out.println();
                        System.out.println("A mysterious Asian girl appears.");
                        System.out.println();
                        System.out.println("\"Hey Hero!\"");
                        System.out.println("\"Catch!!\"");
                        System.out.println();
                        Inventory = Arrays.copyOf(Inventory, Inventory.length + 1);
                        Inventory[5] = "Rocket Launcher";
                        System.out.println("Rocket Launcher Added To Inventory! Press 5 To trigger IT!!!!");
                        if(choice.equalsIgnoreCase(Inventory[5])){
                            System.out.println();
                            System.out.println("You fired the Rocket Launcher!");
                            System.out.println();
                            System.out.println(">>>>>>>> BOOOOOOOOM <<<<<<<<");
                            Tyrant -= 400;
                            Inventory[5]="Empty Rocket Launcher";
                        } else {
                            System.out.println("Party POOPER");
                            System.out.println("\n" +
                                    "\n" +
                                    "\n" +
                                    "Game END Bye Bye Use rocket Launcher next time you died!");
                            return;
                        }
                    }
                }
                while (Tyrant > 0 && HP > 0);
            } else if (enemy == 1) {
                boolean found = false;
                System.out.println("===== INVENTORY =====");

                for (int i = 0; i < Inventory.length; i++) {
                    System.out.println(Inventory[i]);
                }
                String choice = sc.nextLine();
                for (int i = 0; i < Inventory.length; i++) {
                    if (choice.equalsIgnoreCase(Inventory[i])) {
                        found = true;
                        break;
                    }
                }
                for (int i = 0; i < Inventory.length; i++) {
                    if (choice.equalsIgnoreCase(Inventory[i])) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    if (choice.equalsIgnoreCase(Inventory[0])) {
                        System.out.println("You fired the 9mm!");
                        Nemesis -= 35;
                        System.out.println("Nemesis HP : " + Nemesis);
                    }
                    else if (choice.equalsIgnoreCase(Inventory[1])) {
                        System.out.println("You slashed Nemesis!");
                        Nemesis -= 15;
                        System.out.println("Nemesis HP : " + Nemesis);
                    }
                    else if (choice.equalsIgnoreCase(Inventory[2])) {
                        System.out.println("Reloaded!");
                        Inventory[2] = "9mm Ammo x30";
                    }

                    else if (choice.equalsIgnoreCase(Inventory[3])) {
                        if (HP == 100) {
                            System.out.println("Already Full HP.");
                        } else {
                            Inventory[3] = "Empty Spray";
                            System.out.println("Recovered to Full HP.");
                            HP = 100;
                        }
                    }
                    else if (choice.equalsIgnoreCase(Inventory[4])) {
                        System.out.println("\"Umbrella's greatest weapon cannot be stopped...\"");
                    }
                    else if (choice.equalsIgnoreCase("Rocket Launcher")) {
                        System.out.println("You fired the Rocket Launcher!");
                        System.out.println(">>>>>>>>>> BOOOOOOOOOM <<<<<<<<<<");
                        Nemesis -= 500;
                        Inventory[5] = "Empty Rocket Launcher";
                        System.out.println("Nemesis HP : " + Nemesis);
                    }
                } else {
                    System.out.println("Not in Inventory");
                }
            }
        } else {
            System.out.println("Lucius chose to run away from the looming danger in the village saving his life desperately he ran away, his fear shadowed his love for her and came back home.\n" +
                    "THE END");
        }
    }
    static void combat1() {
        System.out.println("Having reached Spain he finds a small village where several reports of missing people was filed, the placed reeked of horror \n" +
                "but he didn't back off and kept going forward \n" +
                "A while later he found some villagers but they felt....Different or Wierd? \n" +
                "Lucius tried to one of them but suddenly everyone started attacking him \n" +
                "He ran ran ran, Ran away for his life, Felt like monsters were chasing him but he didnt look behind and kept running. \n" +
                "When he felt like no one was behind him he slowed down and looked ahead of him.... \n" +
                "He saw some villagers Burning a man alive who looked like a police officer by uniform tied on a cross \n" +
                "He cried for his life but they Still didn't stop \n" +
                "THOSE MONSTERS BURNED HIM ALIVE.\n" +
                "Lucius was scared his spine felt like it broke apart due to shivers he was feeling and suddenly that feeling that someone was behind him hit him \n" +
                "he found a a villager behind him with dislocated neck looked like a zombie the villager Screamed and every Villager Ran towards Lucius Must Flee or Fight \n" +
                "What Would he do? \n" +
                "A - Save His Love \n" +
                "B - Run Away. ");
    }
    static void Story() {
        System.out.println("There was a man...\n" +
                "\n" +
                "...who had forgotten what sunlight felt like.\n" +
                "\n" +
                "Not because the sky had turned gray.\n" +
                "\n" +
                "Not because the world had ended.\n" +
                "\n" +
                "But because somewhere along the way, life had quietly stolen every reason he had to keep walking.\n" +
                "\n" +
                "His name was Lucius.\n" +
                "\n" +
                "Once, he was a decorated military operative—feared by criminals, respected by allies, and haunted by every mission that demanded another sacrifice. Years of bloodshed had hollowed him out until he became little more than a weapon searching for a war.\n" +
                "\n" +
                "Then she appeared.\n" +
                "\n" +
                "Yelena, was her name.\n" +
                "\n" +
                "A Spanish archaeologist with a laugh that could silence the voices in his head.\n" +
                "\n" +
                "For the first time in years, Adrian saw light.\n" +
                "\n" +
                "Not in the sunrise.\n" +
                "\n" +
                "Not in the stars.\n" +
                "\n" +
                "In her.\n" +
                "\n" +
                "She gave meaning to mornings, warmth to winter, and hope to a man who believed he deserved none.\n" +
                "\n" +
                "He retired.\n" +
                "\n" +
                "Bought a small cabin near a lake.\n" +
                "\n" +
                "Learned to cook terrible meals.\n" +
                "\n" +
                "Life became ordinary.\n" +
                "\n" +
                "And ordinary was paradise.\n" +
                "\n" +
                "Then...\n" +
                "\n" +
                "One rainy evening...\n" +
                "\n" +
                "She vanished.\n" +
                "\n" +
                "No ransom.\n" +
                "\n" +
                "No struggle.\n" +
                "\n" +
                "Only a single black feather lying on the kitchen floor.\n" +
                "\n" +
                "And beneath it...\n" +
                "\n" +
                "A letter.\n" +
                "\n" +
                "\"The Light belongs to God no longer.\n" +
                "We have taken His final candle.\n" +
                "Come to Spain... if darkness does not frighten you.\"\n" +
                "\n" +
                "Signed only with a crimson symbol:\n" +
                "\n" +
                "The Eclipse Circle. \n" +
                "Now Having reached Spain, He must Fight Different Foes in order to free The Light of his LIFE.");
    }
    static void crit() {
        double chance = Math.random();
        int Zombie1 = 100;
        if (chance < 0.50d) {
            Zombie1 -= 40;
            System.out.println("Landed a crit!");
        }
    }

    // WRITING THE ENDING SOON AFTER COMPLETING THE STORY I WILL WRITE DIANA'S FIGHT AND COMPLETE THE GAME
}
