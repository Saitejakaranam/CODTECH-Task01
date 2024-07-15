import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage arg0) {
        try {
            Parent root=FXMLLoader.load(getClass().getResource("task1.fxml"));
            Scene sc=new Scene(root);
            arg0.setScene(sc);
            arg0.setTitle("Simple Calculator");
            arg0.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
     
    }
}
