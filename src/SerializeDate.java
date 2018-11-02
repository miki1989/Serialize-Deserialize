

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.GregorianCalendar;

public class SerializeDate {
    public static void main(String[] args) {

        Date birthDate = new GregorianCalendar(2018,GregorianCalendar.NOVEMBER,2).getTime();

        try(ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("C:\\home\\mikolaj\\date.ser"))){
            o.writeObject(birthDate);
        }
        catch (IOException e){
            System.out.println("Exception serializing date " + e);
            System.exit(-1);
        }
        System.out.println("Successfully serialize data");
    }
}
