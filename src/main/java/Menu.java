import javafx.scene.Scene;

import java.util.Scanner;


public class Menu {



    public static void main(String[] args) {
            InMemoryContactsService contactsService = new InMemoryContactsService();
            MenuActions[] actions = {
                    new AddContactMenuAction(contactsService),
                    new ReadAllContactsMenuAction(),
                    new RemoveContactMenuAction()
            };

        for (int i = 0; i <actions.length ; i++) {
            System.out.println(actions[i].getName());
        }
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
            actions[ch].doAction();
            contactsService.getAll();


    }

    public void addAction(MenuActions action) {

    }
}
