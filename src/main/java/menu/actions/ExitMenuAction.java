package menu.actions;

import menu.MenuActions;

public class ExitMenuAction implements MenuActions {
    @Override
    public void doAction() {
        System.out.println("Good bye");
    }

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public boolean closeAfter() {
        return true;
    }
}
