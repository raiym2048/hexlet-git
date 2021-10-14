package com.company;
import java.util.Scanner;


public class questions {
    Scanner scanner = new Scanner(System.in);
    public void posOrNeg(){
        int number = scanner.nextInt();
        if(number>=0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }

    public void Largest(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int largest = a > b && a > c? a : b > a && b > c? b : c > a && c > b ? c: c;
        System.out.println("Largest is - " + largest);
    }
    public void EvenOrOdd(){
        int n = scanner.nextInt();
        String answer = n % 2 == 0?"Even":"Odd";
        System.out.println(answer);
    }
    public void ask(){
        String name = scanner.nextLine();
        if(name.equals("Akima")){
            System.out.println("Hello "+ name);
        }
        else if(name.equals("Anita")){
            System.out.println("Hello "+name);
        }
        else{
            System.out.println("Hello");
        }
    }
    public void Con(){
        char c = scanner.next().charAt(0);
        String answer = "";
        switch (c){
            case 'B', 'C', 'D', 'F', 'J', 'K', 'M', 'N', 'P', 'Q', 'S', 'T', 'V', 'X','Z': answer = "consonants";
            break;
            case 'E', 'G', 'H', 'I', 'L', 'R', 'U', 'W', 'Y','A','O': answer = "vowel";
            break;
            default: answer = "Wrong answer!";
            break;

        }
        System.out.println(answer);

    }
}









package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        questions one = new questions();
        //one.posOrNeg();
        //one.Largest();
        //one.EvenOrOdd();
        //one.ask();
        one.Con();

    }
}
