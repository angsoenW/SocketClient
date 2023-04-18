
import java.io.*;
import java.net.*;
// java TCPClient host port
public class app {
public static void main(String... args) {
String host = args[0];
int port = Integer.valueOf(args[1]);
try (Socket sock = new Socket(host, port)) {
OutputStream out = sock.getOutputStream();
String get = "GET / HTTP/1.0\n\n";
out.write(get.getBytes());
InputStream in = sock.getInputStream();
int readChar = 0;
while ((readChar = in.read()) != -1) {
System.out.write(readChar);
}
}
catch (IOException ex) {
ex.printStackTrace();
}
}
}

        
            

        //     for (int i = 0; i < args.length; i+=2){
        //         Socket socket = new Socket(args[i], Integer.valueOf(args[i+1]));
        //         InputStream in = socket.getInputStream();
        //         int readChar = 0;
        //         while((readChar = in.read()) != -1) {
        //             System.out.write(readChar);
        //         }

        //         in.close();
        //         socket.close();
        //     }
        // }

// //         catch (Exception e) {
// //             System.out.println(e);
// //         }
       
        

// //     }
    
// // }

