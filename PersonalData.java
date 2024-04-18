import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonalData {



    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("Type 'EN' to english registration or 'PT-BR'");
        System.out.println("to Portuguese registration");
        System.out.println("----------------------------------------------------------");
        String answer = s.next();
        if(answer.equalsIgnoreCase("EN")) {
            englishResearch();
        } else if(answer.equalsIgnoreCase("PT-BR")) {
            portugueseResearch();
        } else {
            System.out.println("Oops! looks like you typed something wrong,");
            System.out.println("please, start over the program.");
        }
    }

    private static void englishResearch() {
        List<Person> females = new ArrayList<Person>();
        List<Person> males = new ArrayList<Person>();

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the english registration section, fill in");
        System.out.println("your details to continue:");
        System.out.println("----------------------------------------------------------");

        System.out.println("What is your name?");
        String name = s.next();

        System.out.println("What is your sex? - male or female");
        String sex = s.next();

        if(sex.equalsIgnoreCase("male")){
            Person man = new Person(name, sex);
            males.add(man);
            System.out.println("Congratulations, you've completed your registration!");
            System.out.println(man);

        } else if( sex.equalsIgnoreCase("female")){
            Person woman = new Person(name, sex);
            females.add(woman);
            System.out.println("Congratulations, you've completed your registration!");
            System.out.println(females);

        } else{
            System.out.println("Oops! looks like you typed something wrong,");
            System.out.println("please, start over the program.");
        }
    }
    public static void portugueseResearch() {
        List<Person> females = new ArrayList<Person>();
        List<Person> males = new ArrayList<Person>();

        Scanner s = new Scanner(System.in);

        System.out.println("Seja bem-vindo à sessão de cadastro em português, preencha");
        System.out.println("seus dados para prosseguir:");
        System.out.println("----------------------------------------------------------");

        System.out.println("Qual o seu nome?");
        String name = s.next();

        System.out.println("Qual o seu sexo? - masculino ou feminino");
        String sex = s.next();

        if(sex.equalsIgnoreCase("masculino")){
            Person man = new Person(name, sex);
            males.add(man);
            System.out.println("Parabéns, você concluiu seu cadastro!");
            System.out.println(man);

        } else if( sex.equalsIgnoreCase("feminino")){
            Person woman = new Person(name, sex);
            females.add(woman);
            System.out.println("Parabéns, você concluiu seu cadastro!");
            System.out.println(females);

        } else{
            System.out.println("Ops! parece que você digitou algo inválido,");
            System.out.println("por favor, reinicie o programa.");
        }
    }


}
