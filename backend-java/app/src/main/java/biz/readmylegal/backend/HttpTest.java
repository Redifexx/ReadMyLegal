package biz.readmylegal.backend;

import java.io.OutputStream;
import java.net.InetSocketAddress;

//library for http.
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.google.common.base.Charsets;


//http class. 
import com.sun.net.httpserver.HttpServer;


public class HttpTest {
    //My Void main. Purpose: make simple http server using inside json. 

     public static void test1() throws IOException {
        //System.out.println("Second Hello World ");

        int serverPort = 8000; //port 
        //is bound to an IP address and port number and listens for incoming TCP connections from clients on this address.
        HttpServer server = HttpServer.create(new InetSocketAddress(serverPort), 0);
        server.createContext("/api/hello", (exchange -> {
            String respText = "Hello!";
            exchange.sendResponseHeaders(200, respText.getBytes().length);
            OutputStream output = exchange.getResponseBody();
            output.write(respText.getBytes());
            output.flush();
            exchange.close();
        }));
        server.setExecutor(null);
        server.start();

        
        


    }
    
}
