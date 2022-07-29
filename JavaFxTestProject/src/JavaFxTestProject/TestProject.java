
package JavaFxTestProject;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TestProject extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mainpage.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Teszt1");
        stage.setScene(scene);
        stage.show();
    }
    
    
    public static void main(String[] args){
        launch(args);
    }

    
}
