import java.util.*;
public class Main
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        Stack <Integer> numStack = new Stack<Integer>();
        Stack <String> nameStack = new Stack<String>();

        System.out.println("How many foods you want to store?");
        int array = input.nextInt();
        int arr[] = new int [array];
        for (int i = 0 i < arr.Length; i++){
            System.out.println("Enter your foods below: ");
            nameStack.add(input.nextInt);
        }
    }
}
