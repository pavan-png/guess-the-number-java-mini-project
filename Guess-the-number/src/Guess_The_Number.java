import java.util.*;
class Guesser_Cpu{
    int Guesser() {
        Random random = new Random();
        int random_Number = random.nextInt(11);
        return random_Number;
    }
}
class players{
    Scanner sc = new Scanner(System.in);
    int player_Number ;
    String name;

    String upi_Id;
    int players_Number(){
        System.out.println();
        System.out.println("------------------------------- welcome players please fill the below information-------------------------------------------------------- ");
        System.out.println();
        System.out.print("Hello player enter your name                     :  ");
        name  = sc.nextLine();
        System.out.print("Hey " +name + " enter your upi id                      :  ");
        upi_Id = sc.nextLine();
        System.out.print("Hey " +name + " enter the number                       :  ");
        player_Number = sc.nextInt();
        while (player_Number>0||player_Number<0){
            if (player_Number>10||player_Number<0){
                System.out.println("Sorry you have entered the number that is not in our game range ");
                System.out.println("Enter the number again");
                player_Number = sc.nextInt();
            }
            else if (player_Number>=0 && player_Number<=10){
                break;
            }
        }
        return player_Number;
    }

}
class Umpire {
    Scanner sc = new Scanner(System.in);
    int Gusser_number;
    int player_1_Nnumber;
    String player_1_Name;
    int player_2_Number;
    String player_2_Name;
    int player_3_Number;
    String player_3_Name;
    int players_Number;

    String player_1_Upi_Id;
    String player_2_Upi_Id;
    String player_3_Upi_Id;


    void no_Of_Players() {
        while (true) {
            System.out.println("Select the no of players  ");
            System.out.println(" 1.  1 player ");
            System.out.println(" 2.  2 players ");
            System.out.println(" 3.  3 player ");
            System.out.print("please select from the above options             :  ");
            players_Number = sc.nextInt();
            if (players_Number >= 1 && players_Number <= 3) {
                break;
            } else {
                System.out.println("You have entered the wrong option");
                System.out.println("Please select the option again");
            }
        }
    }

    void player_Round1() {
        players obj1 = new players();
        players obj2 = new players();
        players obj3 = new players();
        if (players_Number == 3) {
            Guesser_Cpu obj = new Guesser_Cpu();
            Gusser_number = obj.Guesser();
            player_1_Nnumber = obj1.players_Number();
            player_1_Name = obj1.name;
            player_1_Upi_Id = obj1.upi_Id;
            player_2_Number = obj2.players_Number();
            player_2_Name = obj2.name;
            player_2_Upi_Id = obj2.upi_Id;
            player_3_Number = obj3.players_Number();
            player_3_Name = obj3.name;
            player_3_Upi_Id = obj3.upi_Id;

        } else if (players_Number == 2) {
            Guesser_Cpu obj = new Guesser_Cpu();
            Gusser_number = obj.Guesser();
            player_1_Nnumber = obj1.players_Number();
            player_1_Name = obj1.name;
            player_1_Upi_Id = obj1.upi_Id;
            player_2_Number = obj2.players_Number();
            player_2_Name = obj2.name;
            player_2_Upi_Id = obj2.upi_Id;
        } else {
            Guesser_Cpu obj = new Guesser_Cpu();
            Gusser_number = obj.Guesser();
            player_1_Nnumber = obj1.players_Number();
            player_1_Name = obj1.name;
            player_1_Upi_Id = obj1.upi_Id;
        }

    }

    void game_Result_Round1() {
        System.out.println();
        System.out.println("-------------------------------------------------------  Results  ------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("The secret number is                             :  " + Gusser_number);
        System.out.println();
        if (players_Number == 3) {
            if (player_1_Nnumber == Gusser_number) {
                if (player_2_Number == Gusser_number) {
                    System.out.println("player 1 " + player_1_Name + " and player 2 " + player_2_Name + " the  are winners");
                    System.out.println(player_1_Name + " your reward is sent to your upi id : " +player_1_Upi_Id );
                    System.out.println(player_2_Name + " your reward is sent to your upi id : " +player_2_Upi_Id );
                } else if (player_3_Number == Gusser_number) {
                    System.out.println("player 1 " + player_1_Name + " and player 3" + player_3_Name + " are winners");
                    System.out.println(player_1_Name + " your reward is sent to your upi id : " +player_1_Upi_Id );
                    System.out.println(player_3_Name + " your reward is sent to your upi id : " +player_3_Upi_Id );
                } else if ((player_2_Number == Gusser_number) && (player_3_Number == Gusser_number)) {
                    System.out.println("All the 3 players " + player_1_Name + " , " + player_2_Name + " , " + player_3_Name + " are winners ");
                    System.out.println(player_1_Name + " your reward is sent to your upi id : " +player_1_Upi_Id );
                    System.out.println(player_2_Name + " your reward is sent to your upi id : " +player_2_Upi_Id );
                    System.out.println(player_3_Name + " your reward is sent to your upi id : " +player_3_Upi_Id );
                }
                System.out.println("Hey player1 " + player_1_Name + " is the winner ");
                System.out.println(player_1_Name + " your reward is sent to your upi id : " +player_1_Upi_Id );
            } else if (player_2_Number == Gusser_number) {
                if (player_3_Number == Gusser_number) {
                    System.out.println("player 2 " + player_2_Name + " and player 3 " + player_3_Name + "  are the winners ");
                    System.out.println(player_2_Name + " your reward is sent to your upi id : " +player_2_Upi_Id );
                    System.out.println(player_3_Name + " your reward is sent to your upi id : " +player_3_Upi_Id );
                }
                System.out.println("Hey player 2 " + player_2_Name + " is the winner");
                System.out.println(player_2_Name + " your reward is sent to your upi id : " +player_2_Upi_Id );
            } else if (player_3_Number == Gusser_number) {
                System.out.println("Hey player 3 " + player_3_Name + " is the winner ");
                System.out.println(player_3_Name + " your reward is sent to your upi id : " +player_3_Upi_Id );
            } else {
                System.out.println("Sorry all of you had lost the game , Better luck next time  ");
            }
        } else if (players_Number == 2) {
            if (player_1_Nnumber == Gusser_number) {
                if (player_2_Number == Gusser_number) {
                    System.out.println("All the 2 players " + player_1_Name + " , " + player_2_Name + " are winners ");
                    System.out.println(player_1_Name + " your reward is sent to your upi id : " +player_1_Upi_Id );
                    System.out.println(player_2_Name + " your reward is sent to your upi id : " +player_2_Upi_Id );
                }
                System.out.println("Hey player 1" + player_1_Name + " you have won the game");
                System.out.println(player_1_Name + " your reward is sent to your upi id : " +player_1_Upi_Id );
            } else if (player_2_Number == Gusser_number) {
                System.out.println("Hey player 2 " + player_2_Name + " you have won the game ");
                System.out.println(player_2_Name + " your reward is sent to your upi id : " +player_2_Upi_Id );
            } else {
                System.out.println("Sorry all of you had lost the game , Better luck next time  ");
            }

        } else {
            if (player_1_Nnumber == Gusser_number) {
                System.out.println("Hey player 1" + player_1_Name + " you have won the game");
                System.out.println(player_1_Name + " your reward is sent to your upi id : " +player_1_Upi_Id );
            } else {
                System.out.println("Sorry you lost the game ,Better luck next time ");
            }
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
public class Guess_The_Number {
    public static void main(String[] args) {
        Umpire obj4 = new Umpire();
        obj4.no_Of_Players();
        obj4.player_Round1();
        obj4.game_Result_Round1();
    }
}
