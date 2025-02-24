package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User name = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                user = name;
                break;
            }
        }
            if (name == null) {
            throw new UserNotFoundException("The user was not found.");
            }
        return  name;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("The user is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ea) {
            ea.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }
    }
}

