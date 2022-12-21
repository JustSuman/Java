import java.util.*;

public class rock_paper_scissor {
    // Making method for the game
    static void game() {
        try (Scanner scan = new Scanner(System.in)) {
            String user;
            String[] choices = { "rock", "paper", "scissor" };
            System.out.println("Do you want to play?(1/0)");
            int input = scan.nextInt();
            if (input == 0) {
                System.out.print("Game Over!!");
            } else {
                Scanner scan1 = new Scanner(System.in);
                System.out.println("rock, paper or scissor?");
                user = scan1.nextLine();
                String result = "";
                /* TO make interesting, we get computer to choose another hand */
                Random random = new Random();
                int index = random.nextInt(choices.length);
                /* Printing out what computer chose */
                System.out.println("The computer chose " + choices[index]);
                scan1.close();
                if (user.equals("rock")) {
                    if (choices[index].equals("rock")) {
                        result = "tie";
                    } else if (choices[index].equals("paper")) {
                        result = "lost";
                    } else {
                        result = "won";
                    }
                }

                else if (user.equals("paper")) {
                    if (choices[index].equals("paper")) {
                        result = "tie";
                    } else if (choices[index].equals("scissor")) {
                        result = "lost";
                    } else {
                        result = "won";
                    }
                }

                else if (user.equals("scissor")) {
                    if (choices[index].equals("scissor")) {
                        result = "tie";
                    } else if (choices[index].equals("rock")) {
                        result = "lost";
                    } else {
                        result = "won";
                    }
                }
                System.out.println("You have" + result);
                if (result == "lost" || result == "won" || result == "tie") {
                    game();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] arg) {
        game();
    }

}
