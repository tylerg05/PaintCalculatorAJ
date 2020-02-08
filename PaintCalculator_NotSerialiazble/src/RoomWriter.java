import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class RoomWriter {

    public static void writeRoomFile(String fileName, List<Paintable> roomList) {
        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            for (Paintable room: roomList) {
            out.writeObject(room);
        }

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }
}
