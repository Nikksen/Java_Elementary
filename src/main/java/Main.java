import menu.Menu;
import menu.actions.ExitMenuAction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(sc);

        menu.addAction(new ExitMenuAction());
        menu.run();
    }
}
