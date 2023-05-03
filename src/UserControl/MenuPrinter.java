package UserControl;

import static java.lang.System.out;

public abstract class MenuPrinter {
    public static void printMainMenu() {
        out.println("Choose action from menu:");
        out.println("\t1 ... Add new movie");
        out.println("\t2 ... Edit movie");
        out.println("\t3 ... Delete movie");
        out.println("\t4 ... Add movie rating");
        out.println("\t5 ... Search movie");
        out.println("\t6 ... Print all movies");
        out.println("\t7 ... Print staff members who worked on more than 1 movie");
        out.println("\t8 ... Print movies with certain staff member");
        out.println("\t9 ... Save movie info to file");
        out.println("\t10... Save all movies to directory");
        out.println("\t11... Load movie from file");
        out.println("\t12... Exit program");
    }

    public static void printEditMenu() {
        out.println("What would you like to edit?");
        out.println("\t1 ... Title");
        out.println("\t2 ... Director");
        out.println("\t3 ... Year");
        out.println("\t4 ... Staff");
    }

    public static void printStaffMenu() {
        out.println("What would you like to do?");
        out.println("\t1 ... Add staff member");
        out.println("\t2 ... Remove staff member");
    }
}
