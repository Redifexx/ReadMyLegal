/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package biz.readmylegal.backend;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class App {
    private String test;

    public App() {
        test = "Hello world!";
    }

    public void print() {
        System.out.println(test);
    }

<<<<<<< Updated upstream
    public static void main(String[] args) {
        //GPTTest.test(args[0]);
=======
    public static void main(String[] args) throws Exception {
        HttpTest.test1();
        RequestHttp.test2();
        //GPTTest.test(tokenContents());
    }
>>>>>>> Stashed changes

        System.out.println("Hello World. I am working.");
    }
}
