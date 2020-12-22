import Users.User;
import Users.UserParser;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String stringWithNames = "programmer:vasia@123,programmer:vasia,vasia@1234,vasia,vasia:@trulala";
        List<User> users ;
        UserParser userParser = new UserParser();
        users = userParser.parse(stringWithNames);
        userParser.getUsersList(users);
    }
}
