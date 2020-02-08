import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class RoomReader {

    public static void readRoomFile(String fileName) {
        List<Paintable> rooms = new ArrayList<>();

        Object object1 = null;

        // Deserialization
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            Object obj = null;

            // Method for deserialization of object
            while ((obj = in.readObject()) != null) {
                rooms.add((Room) obj);
            }

            in.close();
            file.close();

            System.out.println("Object has been deserialized.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}