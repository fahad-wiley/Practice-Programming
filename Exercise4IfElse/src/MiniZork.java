import java.util.Scanner;

public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                }
                else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            }
            else if (action.equals("stick your hand in")) {
                System.out.println("A needle like hand grabs a hold of you. Agonising pain shocks from your nape to your femur. You wail helplessly for assistance - tragically, you are met with the caws of crows amongst the silence of the field.");
                System.out.println("You collapse and notice your vision darken as you gasp your last breath.");
                System.out.println("You lay lifeless and cold in the baron land.");
            }
        }
        else if (action.equals("go to the house")) {
            System.out.println("A large damaged white painted door stands ahead of you.");
            System.out.println("A small window on the left of the door whistles in the wind.");
            System.out.println("You notice a crack in the window.");
            System.out.print("Knock on the door, kick the door down or approach the window? ");

            action = userInput.nextLine();

            if (action.equals("knock on the door")) {
                System.out.println("Innocently, you tap on the door three times in a rhythm.");
                System.out.println("A clanking of a wheelbarrow turns your head. Noticing nothing you look back at the door.");
                System.out.println("The door is slightly ajar.");
                System.out.print("Wander inside or leave the fields? ");

                action = userInput.nextLine();

                    if (action.equals("wander inside")) {
                        System.out.println("A dark hallway awaits you.");
                        System.out.println("You feel unsafe and nervous however, decide to venture forward.");
                        System.out.println("You feel webs being torn apart by your walk, you have no regard for such consideration.");
                        System.out.println("You make it to the kitchen. A room wall painted yellow with a large island counter.");
                        System.out.println("You sit at the counter and hear a bell being rang.");
                    }
                    else if (action.equals("leave the fields")) {
                        System.out.println("As you walk further away from the house.");
                        System.out.println("You feel that you should definitely run away");
                        System.out.println("With sweat and fatigue building up, you finish your sprint with your hands on your knees.");
                        System.out.println("Only to look up and notice the same exact house staring back at you.");
                    }
            }
            else if (action.equals("kick the door down")) {
                System.out.println("With a mighty and menacing kick, the door falls to its demise.");
                System.out.println("You have bested the door, with your shoulders held high, a grin creeps onto your face.");
                System.out.println("You hear a wind picking up down the hallway, and within a lifelong moment - you are swept off your feet and land head first onto the crooked floorboards");
                System.out.println("You recall memories of playing in a playground before drifting into nothingness.");
            }
            else if (action.equals("approach the window")) {
                System.out.println("The windowsill has a note written in what appears to be blood. 'Stay away leave now'.");
                System.out.println("You have a feeling of insecurity and melancholy when peering in through the window");
                System.out.println("You hear a vinyl-like romance song being played deep within the house.");
                System.out.print("Sneak in or leave the fields? ");

                action = userInput.nextLine();

                if (action.equals("sneak in")) {
                    System.out.println("The living room is full of once-luxurious furniture, now deteriorated by age.");
                    System.out.println("You notice a latch on the window behind you fall from the power of the gust, denying the refuge of the fields.");
                    System.out.println("You are freezing cold, shivering even though a fire place burns red nearby.");
                }
                else if (action.equals("leave the fields")) {
                    System.out.println("As you walk further away from the house.");
                    System.out.println("You feel that you should definitely run away");
                    System.out.println("With sweat and fatigue building up, you finish your sprint with your hands on your knees.");
                    System.out.println("Only to look up and notice the same exact house staring back at you.");
                }
            }
        }
    }
}