package sceneshepherd;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
public class SceneShepherd {


        /** The main application layout controller. */
        private static scheduler.Controller mainApp;

        /**
         * Save the main page so we can point to it later
         * @param mainApp the main application layout controller.
         */
        public static void setMainController(scheduler.Controller mainApp) {
            SceneShepherd.mainApp = mainApp;
        }

        /**
         * @param fxml the fxml file to be loaded.
         */
        public static void loadScene(String fxml) {
            try {
                mainApp.swapScene(FXMLLoader.load(
                        SceneShepherd.class.getResource(fxml)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}


