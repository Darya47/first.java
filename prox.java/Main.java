import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\java\\test.txt");
            int c;
            String ip = "";
            String port = "";
            String proxy = "";
            while ((c = reader.read()) != -1) {
                if(c == 10){
                    ip = proxy.split(":")[0];
                    port = proxy.split(":")[1];
                    System.out.print("IP: "+ip+" port: "+port);
                }
                if (c != 9) {
                    proxy += (char) c;
                } else {
                    proxy += ":";
                }
            }
               System.out.print((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
