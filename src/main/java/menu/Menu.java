package menu;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private MenuActions[] actions;
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.actions = new MenuActions[0];
        this.scanner = scanner;
    }

    public void addAction(MenuActions action) {
        actions = Arrays.copyOf(actions, actions.length + 1);
        actions[actions.length - 1] = action;
    }

    public void run() {

        while (true) {
            showMenu();
            int choice = getMenuIndexFromUser();
            if (!validateMenuIndex(choice)) {
                System.out.println("Invalid input");
                continue;
            }
            actions[choice].doAction();
            if (actions[choice].closeAfter()){
                break;
            }
        }
    }

    private boolean validateMenuIndex(int choice) {
        return choice >= 0 && choice < actions.length;
    }

    private int getMenuIndexFromUser() {
        System.out.println("Enter your choice: ");
        int ch = scanner.nextInt();
        scanner.nextLine();
        return ch - 1;
    }

    private void showMenu() {
        for (int i = 0; i < actions.length; i++) {
            System.out.printf("%d - %s\n", i + 1, actions[i].getName());
        }
    }
}
