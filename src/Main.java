import model.Model;
//import view.TaskAdder;
import view.View;
import controller.Controller;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
//import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf()); // Apply FlatLaf Theme
        } catch (Exception e) {
            e.printStackTrace();
        }
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
    }
}
