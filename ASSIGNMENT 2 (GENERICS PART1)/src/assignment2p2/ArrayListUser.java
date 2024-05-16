package assignment2p2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListUser {
	private ArrayList<User> userList;

    public ArrayListUser() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void printUsers() {
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }

    public void sortUsersByAge() {
        Collections.sort(userList, Comparator.comparingInt(User::getAge));
    }
}
