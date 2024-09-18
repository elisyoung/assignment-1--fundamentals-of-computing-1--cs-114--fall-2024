import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {
    System.out.println("EEEEEEE  YY   YY");
    System.out.println("EE        YY YY");
    System.out.println("EE         YYY");
    System.out.println("EEEE        Y");
    System.out.println("EE          Y");
    System.out.println("EE          Y");
    System.out.println("EEEEEEE     Y");

    final int BASE = 32;
    final double CONVERSION_FACTOR = 5.0/9.0;
    double fahrenheitTemp, celsiusTemp;
    String userInputText, character1, character2, character3, alteredWord;
    int numberGenerated;

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number in Fahrenheit");
    fahrenheitTemp = scan.nextDouble();
    celsiusTemp = (fahrenheitTemp-BASE)*CONVERSION_FACTOR;
    DecimalFormat fmt = new DecimalFormat("0.#");

    System.out.println("Please enter a 5-character string");
    userInputText = scan.next();
    scan.close();

    character1 = userInputText.substring(1, 2);
    character2 = userInputText.substring(2, 3);
    character3 = userInputText.substring(3, 4);
    alteredWord = character3+character2+character1;

    Random generator = new Random();
    numberGenerated = generator.nextInt(16353) + 32;
    System.out.println("Random number generated. Continuing...");
    System.out.println(fmt.format(celsiusTemp)+alteredWord+numberGenerated);
  }
}
