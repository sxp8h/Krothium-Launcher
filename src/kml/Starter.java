package kml;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author DarkLBP
 *         website https://krothium.com
 */
public class Starter extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    /**
     * Loads the JavaFX environment
     * @param primaryStage The main stage
     * @throws Exception If something went wrong
     */
    @Override
    public final void start(Stage primaryStage) throws Exception {
        Utils.ignoreHTTPSCert();
        new Kernel(primaryStage, this.getHostServices());
    }
}
