
import java.util.Scanner;

public class AgeClass {

  static int age;
  static String choice = "continue";
  static Scanner input;
  static int ageLimit = 17;

  public static void main(String[] args) {

    input = new Scanner(System.in);
    System.out.println("Hello world");

    while (choice == "continue") {
      askForAge();
      System.out.println("voulez vous continuer ? (continue/sortir)");
      choice = input.next();

      if (choice.equals("sortir")) {
        for (int i = 0; i < 50; ++i)
          System.out.println(); // là je fake un peu trop, en gros on imprime plusieurs fins de lignes et
                                // simulation clear console//
        break;
      }
      System.out.println("fin du swag");

      askForAge();
    }
  }

  public static void askForAge() {
    System.out.println("Entrez votre age");

    try {
      ageLimit = Integer.parseInt(input.next());
    }

    catch (NumberFormatException a) {
      System.out.print("Problem");

      askForAge(); // fonction récurente //

      age = input.nextInt();
    }

    System.out.println("vous avez : " + age);
    if (age < ageLimit) {
      System.out.println("Acces interdit (" + ageLimit + ")");

    }

    else {
      System.out.println("vous pouvez entrer");

    }
  }
  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
   }
}