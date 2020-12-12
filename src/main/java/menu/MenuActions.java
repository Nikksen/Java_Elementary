package menu;

public interface MenuActions {

    void doAction();

    String getName();

    default boolean closeAfter(){
        return false;
    }
}
