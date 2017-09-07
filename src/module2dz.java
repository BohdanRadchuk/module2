import java.util.Scanner;

public class module2dz {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("What city do you live in?");
        String city = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("What is your hobby?");
        String hob = in.nextLine();                     //дополнительная строка, так как после .in.nextInt первую строку ввода пропускает
        String hobby = in.nextLine();
        System.out.println("-----------------");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);

        System.out.println("-----------------");
        System.out.println("Человек по имени " + name + " живет в городе " + city + ".\n" + "Этому человеку " + age + " лет и он любит заниматься " + hobby + ".");
        System.out.println("-----------------\n" + name + " - имя\n" + city + " - город\n" + age + " - возраст\n" + hobby + " - хобби \n-----------------");
    }
}
