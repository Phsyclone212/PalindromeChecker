import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); //Will be using a loop and append()

        System.out.print("Enter your potential palindrome: ");
        String input = sc.nextLine();
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int x = input.length()-1; //index tracker to grab chars in reverse
        for(int i = 0; i<input.length(); i++){
            char c = input.charAt(x);
            sb.append(c);
            x--;
        }
        String other = sb.toString();
        System.out.println("Is a palindrome: "+input.equals(other)); //true or false
    }
}
