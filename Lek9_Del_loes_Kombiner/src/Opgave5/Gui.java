package Opgave5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui extends Application {

        private final int WIDTH = 1000;
        private final int HEIGHT = 1000;

        @Override
        public void start(Stage stage) {
                Pane root = initContent();
                Scene scene = new Scene(root);

                stage.setTitle("Shapes");
                stage.setScene(scene);
                stage.show();

        }

        private Pane initContent() {
                Pane pane = new Pane();
                pane.setPrefSize(WIDTH, HEIGHT);
                drawShapes(pane);
                return pane;
        }

        // ------------------------------------------------------------------------

        private void drawShapes(Pane pane) {
                Button button = new Button("Tegn");
                pane.getChildren().add(button);
                button.setOnAction(Event -> this.drawTrekant());
        }

        private void drawTrekant() {

        }
}