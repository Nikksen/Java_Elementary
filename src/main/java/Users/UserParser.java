package Users;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserParser {

    List<User> usersList = new ArrayList<>();

    public User userParse(String user) {
        Pattern pattern = Pattern.compile("(?:(\\w+):)?(\\w+)(?:(@)?(\\w+)?)");
        Matcher matcher = pattern.matcher(user);
        if (matcher.find()) {
            return userMatcher(matcher);
        }
        return null;
    }

    private User userMatcher(Matcher user) {
        String name = user.group(1);
        String userName = user.group(2);
        String password = user.group(4);
        return newUser(name, password, userName);
    }

    private User newUser(String name, String password, String userName) {
        if (name == null) {
            name = userName;
        }
        return new User(name, password, userName);
    }

    public List<User> parse (String stringWithNames){
        for (String users : stringWithNames.split(",")){
            User user = userParse(users);
            if (users != null){
                usersList.add(user);
            }
        }
        return  usersList;
    }

    public List<User> getUsersList(List<User> users) {
        int count = 1;
        for (User user : users){
            System.out.println("Номер: " + count + " :");
            System.out.println("nickname = " + user.name + " , "
                    + "username = " + user.userName + " , "
                    + "password = " + user.password);
            count++;
        }
        return usersList;
    }


}
