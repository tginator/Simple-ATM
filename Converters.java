import java.util.*;

public class Converters
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("Please choose a function: ");
        System.out.println("1. Convert text to upper case or lower case");

        choice = sc.nextInt();

        if (choice == 1 );
        {
            System.out.println("Please choose to convert to upper or lower case: ");
            System.out.println("1. Lower case to upper case.");
            System.out.println("2. Upper case to lower case.");
            int select;
            select = sc.nextInt();

            if (select == 1);
            {
                String txt;
                txt = lowerCase();

                System.out.println(txt.toUpperCase());
            }

            if (select == 2);
            {
                String txt;
                txt = upperCase();

                System.out.println(txt.toLowerCase());
            }
        }
    }

    public static String lowerCase()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a text that you wish to be converted to upper case.");

        String txt;
        txt = sc.nextLine();
        return txt;


    }

    public static String upperCase()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a text that you wish to be converted to lower case: ");


        String txt;
        txt = sc.nextLine();
        return txt;

    }
}

