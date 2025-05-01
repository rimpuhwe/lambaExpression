package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("add the length of your array: ");
        int length = sc.nextInt();
        int num ;
        List<Integer> numbers = new ArrayList<>();
        for(int i=1 ; i <= length;i++){
            System.out.print("Provide #" + i + " number: ");
            num = sc.nextInt();
            sc.nextLine();
            numbers.add(num);
        }
        System.out.println("Original List: "+ numbers);
        System.out.print("Do you want to filter (y/n): ");
        String answer  = sc.next();
        if(answer.equalsIgnoreCase("y")){
            System.out.print("Do you want Even array or Odd array (E/O): ");
            String answer2 = sc.next();
            if(answer2.equalsIgnoreCase("e")){
                System.out.println("filtered even List: " + EvenNumberFilter.filterEvenNumber(numbers));
            }
            else if (answer2.equalsIgnoreCase("o")){
                System.out.println("ok");

            }
            else{
                System.out.println("Invalid choice , try again !");
            }

        }
        else{
            System.out.println("That's all!");
        }


    }

}
