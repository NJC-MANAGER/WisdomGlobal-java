package arrays;

public class ArraysInJava {
    // Declaration and initialization of an array in Java
    String[] players;

    // Constructor to initialize the array
    public ArraysInJava() {
        players = new String[6];
        players[0] = "Bob";
        players[1] = "Luke";
        players[2] = "Chad";
        players[3] = "Dan";
        players[4] = "Henry";
        players[5] = "Joe";
    }

    // Optional: method to print the array elements
    public void printPlayers() {
        for (String player : players) {
            System.out.println(player);
        }
    }

    public static void main(String[] args) {
        ArraysInJava arrayExample = new ArraysInJava();
        arrayExample.printPlayers(); // This will print the players' names
    }
}
