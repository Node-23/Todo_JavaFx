package todo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Home extends Application {

    public void start(Stage stage) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}