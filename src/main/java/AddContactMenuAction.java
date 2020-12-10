import java.util.Scanner;

public class AddContactMenuAction implements MenuActions {
    InMemoryContactsService inMemoryContactsService;

    public AddContactMenuAction(InMemoryContactsService inMemoryContactsService) {
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Введите имя человека");
        String phone = scanner.next();
        scanner.nextLine();
        Contact contact = new Contact(name, phone);
        inMemoryContactsService.add(contact);
    }

    @Override
    public String getName() {
        return "Вы добавили новый контакт";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
