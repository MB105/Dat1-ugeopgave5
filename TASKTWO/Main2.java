
import java.util.Scanner;

public class Main2 {
  
  

  public static void main(String[]args){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Please type your name");

    String name=scanner.nextLine();
    System.out.println("Hello" + name + "please type your age");

    int age=scanner.nextInt();
    System.out.println(age);

    int retire=67-age;
    System.out.println(retire);
}
  }