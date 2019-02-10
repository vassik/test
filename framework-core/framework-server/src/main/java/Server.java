
import org.project1.Project1;


public class Server {

    public void start() {

        System.out.println("Server!!!");

        Project1 project = new Project1();
        String srt = project.returnString("hello");

        System.out.println(srt);
    }
}
