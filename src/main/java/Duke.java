import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        Greet();
        Scanner in = new Scanner(System.in);
        String input;
        input = in.nextLine();
        while (!input.equals("bye")) {
            Echo(input);
            input = in.nextLine();
        }
        Exit();
    }

    public static void Greet() {
        System.out.println("Hello! I'm Duke" + System.lineSeparator() + "What can I do for you?");
        End();
    }

    public static void Exit() {
        System.out.println("Bye. Hope to see you again soon!" + System.lineSeparator());
        End();
    }

    public static void End() {
        System.out.println("____________________________________________________________" + System.lineSeparator());
    }

    public static void Echo(String input) {
        System.out.println(input);
        End();

    }
}
