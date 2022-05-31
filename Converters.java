import java.util.*;

public class Converters
{
    public static void main(String[] args) {

        System.out.println("Please enter a text that you wish to be converted to upper case.");

        String txt;
        txt = lowerCase();


        System.out.print(txt.toUpperCase());
    }

    public static String lowerCase()
    {
        Scanner sc = new Scanner(System.in);

        String txt;
        txt = sc.nextLine();
        return txt;
    }

}

