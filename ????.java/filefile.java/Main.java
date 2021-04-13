mport java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\java\\test.txt");
            int c;
            String ip = "";
            String port = "";
            while ((c = reader.read()) != -1);
               System.out.println("IP: "+ip+" port: "+port);
               System.out.print((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
