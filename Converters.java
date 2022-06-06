import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Converters {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("Please choose a function: ");
        System.out.println("1. Convert text to upper case or lower case");
        System.out.println("2. Identify whether numeric values are in a given string.");
        System.out.println("3. Identify whether a given string is a valid number or not.");
        System.out.println("4. Remove any numeric values in a given string and then convert the string to upper case or lower Case.");
        System.out.println("5. Convert time.");

        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Please choose to convert to upper or lower case: ");
            System.out.println("1. Lower case to upper case.");
            System.out.println("2. Upper case to lower case.");

            int select;
            select = sc.nextInt();

            if (select == 1) {
                lowerCase("INPUT", "input");
            }

            if (select == 2) {

                upperCase("input", "INPUT");

            }
        }
        if (choice == 2) {

            containNumeric();

        }

        if (choice == 3) {

            isNumeric();
        }

        if (choice == 4) {
            removeNum();
        }

        if (choice == 5) {

            System.out.println("Please select a time conversion: ");
            System.out.println("1. Hours to minutes conversion.");
            System.out.println("2. Minutes to hours conversion.");
            System.out.println("3. Minutes to seconds conversion.");
            System.out.println("4. Seconds to minutes conversion.");

            int select;
            select = sc.nextInt();

            if (select == 1) {
                HoursToMinutes();
            }
            if (select == 2) {
                MinutesToHours();
            }
            if (select == 3) {
                MinutesToSeconds();
            }
            if (select == 4) {
                SecondsToMinutes();
            }
        }
        }

    public static String lowerCase(String input, String s) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a text that you wish to be converted to upper case.");

        String txt;
        txt = sc.nextLine();
        System.out.println(txt.toUpperCase());

        return txt;
    }

    public static String upperCase(String input, String s) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a text that you wish to be converted to lower case: ");


        String txt2;
        txt2 = sc.nextLine();
        System.out.println(txt2.toLowerCase());

        return txt2;

    }

    public static void containNumeric() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter string: ");
        String input;
        input = sc.next();

        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        boolean numeric = true;
        try {
            Double num = Double.parseDouble(String.valueOf(sb));
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if (numeric)
            System.out.println(input + " contains a number");
        else
            System.out.println(input + " doesn't contain a number");
    }

    public static void isNumeric()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter string: ");


        String input = sc.next();
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(input + " is a valid number");
        else
            System.out.println(input + " is not a valid number");
    }

    public static void removeNum(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");

        String string = sc.next();
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if(Character.isLetter(c)){
                sb.append(c);
            }
        }
        System.out.println(sb);
        String txt = sb.toString();
        
        System.out.println("Convert to: ");
        System.out.println("1. Upper case.");
        System.out.println("2. Lower case.");

        int select;
        select = sc.nextInt();

        if (select == 1)
        {
            System.out.println(txt.toUpperCase());
        }
        if (select == 2)
        {
            System.out.println(txt.toLowerCase());
        }

    }

    public static double[] readArray(String file){

        try {
           File f = new File(file);
           Scanner s = new Scanner(f);
           int ctr = 0;
           while (s.hasNextInt()) {
               ctr = ctr + 1;
               s.nextInt();

           }
           double[] times = new double[ctr];

           Scanner s1 = new Scanner(f);

           for(int i = 0; i < times.length; i++) {
               times[i] = s1.nextInt();
           }
           return times;

            } catch (FileNotFoundException e) {
        }
        return null;
    }

    public static double HoursToMinutes() throws FileNotFoundException {
        double[] times = readArray("times.txt");

        FileOutputStream fos = new FileOutputStream("Hours2Minutes.txt");
        PrintWriter pw = new PrintWriter(fos);

        double convert = 0;

        for (int i = 0; i < times.length; i++) {
            convert = times[i]*60;
            System.out.println(times[i] + " hours " + " = " + convert + "minutes");
            pw.println(times[i] + " hours " + " = " + convert + "minutes");

        }
        pw.close();
        System.out.println("Conversion has been printed to Hours2Minutes.txt");

        return convert;
    }

    public static double MinutesToHours() throws FileNotFoundException {

        double[] times = readArray("times.txt");

        FileOutputStream fos = new FileOutputStream("Minutes2Hours.txt");
        PrintWriter pw = new PrintWriter(fos);

        double convert = 0;

        for (int i = 0; i < times.length; i++) {

            convert = times[i]/60;
            System.out.println(times[i] + " minutes " + " = " + convert + "hours");
            pw.println(times[i] + " minutes " + " = " + convert + "hours");


        }
        pw.close();
        System.out.println("Conversion has been printed to Minutes2Hours.txt");

        return convert;
    }

    public static double MinutesToSeconds() throws FileNotFoundException {
        double[] times = readArray("times.txt");

        FileOutputStream fos = new FileOutputStream("Minutes2Seconds.txt");
        PrintWriter pw = new PrintWriter(fos);

        double convert = 0;

        for (int i = 0; i < times.length; i++) {
            convert = times[i]*60;
            System.out.println(times[i] + " minutes " + " = " + convert + " seconds");
            pw.println(times[i] + " minutes " + " = " + convert + " seconds");

        }
        pw.close();
        System.out.println("Conversion has been printed to Minutes2Seconds.txt");

        return convert;
    }
    public static double SecondsToMinutes() throws FileNotFoundException {

        double[] times = readArray("times.txt");

        FileOutputStream fos = new FileOutputStream("Seconds2Minutes.txt");
        PrintWriter pw = new PrintWriter(fos);

        DecimalFormat df = new DecimalFormat(".00");

        double convert = 0;

        for (int i = 0; i < times.length; i++) {

            convert = times[i]/60;
            System.out.println(times[i] + " seconds " + " = " + df.format(convert) + " minutes");
            pw.println(times[i] + " seconds " + " = " + df.format(convert) + " minutes");

        }

        pw.close();
        System.out.println("Conversion has been printed to Seconds2Minutes.txt");

        return convert;
    }

}




