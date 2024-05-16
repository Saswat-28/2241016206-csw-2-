package assignment2p2;

public class Main {
    public static void main(String[] args) {
        ArrayListUser userList = new ArrayListUser();
        
        userList.addUser(new User("Archit", 21));
        userList.addUser(new User("Ashit", 19));
        userList.addUser(new User("Motu", 30));
        
        System.out.println("Original list of users:");
        userList.printUsers();
        
        userList.sortUsersByAge();
        
        System.out.println("\nSorted list of users by age:");
        userList.printUsers();
    }
}
