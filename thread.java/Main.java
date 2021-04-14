import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
       try {
            FileReader reader = new FileReader("C:\\java\\test.txt");
            int c;
            String ip = "";
            String port = "";
            String proxy = "";
            while ((c = reader.read()) != -1) {
                if (c == 13) continue;;
                if(c == 10){
                    ip = proxy.split(":")[0];
                    port = proxy.split(":")[1];
                    proxy = "";
                    String finalPort = port;
                    String finalIp = ip;
                    /*Способ 1
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            checkProxy(finalIp,Integer.parseInt(finalPort));
                        }
                    });
                    thread.start();*/
                    /*Способ 2
                    MyThread thread = new MyThread();
                    checkProxy(finalIp, Integer.parseInt(finalPort));*/
                    Thread thread = new Thread(new MyRunnableClass(ip,port));
                    checkProxy(finalIp,Integer.parseInt(finalPort));
                }
                else if (c != 9) {
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
    static void checkProxy(String ip, int port) {
        HttpURLConnection connection = null;
            try {
                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
                URL url = new URL("https://vozhzhaev.ru/test.php");
                connection = (HttpURLConnection) url.openConnection(proxy);
                InputStream is = connection.getInputStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(is));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = rd.readLine()) != null) {
                    response.append(line);
                    response.append("\r");
                }
                rd.close();
                System.out.println(response.toString()+ip+":"+port+" рабочий прокси");
            } catch (Exception e) {
                System.out.println("error");;
            }finally {
                if (connection != null);
                connection.disconnect();
            }
        }
    }


