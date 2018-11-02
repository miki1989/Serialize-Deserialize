import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.util.Date;

public class DeserializeDate {
    public static void main(String[] args) {

        Date date = null;

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\home\\mikolaj\\RawJava\\date.ser"))){
            date = (Date) in.readObject();
        }
        catch (ClassNotFoundException | IOException e){
            System.out.println("Exception deserializing date.ser " + e);
            System.exit(-1);
        }
        System.out.println("Succesfully deserialize data " + DateFormat.getDateInstance().format(date));

    }
}
