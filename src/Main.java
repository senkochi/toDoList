import model.Model;
import view.TaskAdder;
import view.View;
import controller.Controller;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
    }
}
