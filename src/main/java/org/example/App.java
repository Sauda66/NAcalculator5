import java.util.Scanner;
public class Calculator {

    public static void main( String[] args ) {
        Scanner input=new Scanner(System.in);
        System.out.println( "Enter The Number 1 ->" );
        int n1=input.nextint();
        System.out.println( "Enter The operation ->" );
        String op=input.next();

        System.out.println( "Enter The Number 2 ->" );
        int n2=input.nextint();

        switch (op){
            case "+":System.out.println("The sum is ->"+(n1+n2));break;
            case "-":System.out.println("The sub is ->"+(n1-n2));break;
            case "*":System.out.println("The mult is ->"+(n1*n2));break;
            case "/":System.out.println("The div is ->"+(n1/n2));break;
            default:System.out.println("Eror operation");


        }



    }
}
