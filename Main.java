package Chess;
import java.io.*;
import java.util.Scanner;
public class Main implements Serializable {

private String name;
private String surname;

public Main(String name, String surname) {
        this.name = name;
        this.surname = surname;
        }

@Override
public String toString() {
        return "name=" + name + ", surname=" + surname ;
        }
        


    public static void main(String[] args) {
        // Objects
        Main person1 = new Main("Iiya", "Parkotik");
        Main person2 = new Main("Mikl", "MacOed");


        // Object - file
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("objects.ser"))) {
            outputStream.writeObject(person1);
            outputStream.writeObject(person2);

            System.out.println("The objects are written to a file ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read object file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("objects.ser"))) {
            Main readPerson1 = (Main) inputStream.readObject();
            Main readPerson2 = (Main) inputStream.readObject();


            System.out.println("Read objects:");
            System.out.println(readPerson1);
            System.out.println(readPerson2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }




    System.out.println("Tournament library");
    System.out.println("Please, chose the round");
    System.out.println("1 - Round 1");
    System.out.println("2 - Round 2");
        Scanner scanner = new Scanner(System.in);
        int lib = scanner.nextInt();
        switch (lib) {
            case 1:
                Round1 round1 = new Round1();
                round1.Number1();
                round1.Information();
                break;
            case 2:
                Round2 round2 = new Round2();
                round2.Number2();
                round2.Information1();
                break;
            default:
                System.out.println("Wrong option. Try one more time");
        }
    }
    }

