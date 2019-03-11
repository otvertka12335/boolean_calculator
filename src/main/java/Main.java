import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

public class Main extends Application {
    private final static Logger logger = Logger.getLogger(Main.class);

    @Override
    public void start(Stage primaryStage) throws Exception{
        logger.info("Завантаження файлу форми");
        Parent root = FXMLLoader.load(Main.class.getResource("sample.fxml"));
        primaryStage.setTitle("Boolean Calculator");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.setResizable(false);

        logger.info("Виведення форми на екран");
        primaryStage.show();
    }


    public static void main(String[] args) {
        logger.info("Програму запущено");
        launch(args);
        logger.info("Програму заверщено");
    }
}
