import java.net.*;
import java.io.*;

public class app {
    public static void main(String[] args) {
        try {
            // while (!System.console().readLine().equals("stop")){
            //     System.out.println("What is the host address?");
            //     String name = System.console().readLine();
            //     System.out.println("What is the port number?");
            //     String port = System.console().readLine();
            //     Socket socket = new Socket(name, Integer.valueOf(port));
            //     InputStream in = socket.getInputStream();
            //     int readChar = 0;

            //     while((readChar = in.read()) != -1) {
            //         System.out.write(readChar);
            //     }

            //     in.close();
            //     socket.close();
            // }
            

            for (int i = 0; i < args.length; i+=2){
                Socket socket = new Socket(args[i], Integer.valueOf(args[i+1]));
                InputStream in = socket.getInputStream();
                int readChar = 0;
                while((readChar = in.read()) != -1) {
                    System.out.write(readChar);
                }

                in.close();
                socket.close();
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
       
        

    }
    
}

