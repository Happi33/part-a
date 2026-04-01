import java.util.Scanner;

public class partc {
  
    public static String inttoString(int number) {
       
            return "A"; 
        }

        String result = "";

        while (number > 0) {
            int remainder = number % 2;

            if (remainder == 0) {
                result = "A" + result; 
            } else {
                result = "B" + result; 
            }

            number = number / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        String output = inttoString(num);

        System.out.println("Binary digit in alphabetical representation = " + output);
    }
    
}
