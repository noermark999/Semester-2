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
        private int count = 0;

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
                button.setOnAction(Event -> this.drawTrekant(count, pane));
        }

        private void drawTrekant(int amount, Pane pane) {
                count++;
                drawTrekant(amount, 1, pane, 500,0,0,1000,1000,1000 );
        }

        private void drawTrekant(int amount, int amount1, Pane pane, double x1, double y1, double x2, double y2, double x3, double y3) {
                if (amount>=amount1) {
                        System.out.println("here");
                        drawTrekant(amount,amount1+1,pane,((x1+x2)/2),((y1+y2)/2),((x2+x3)/2),((y2+y3)/2),((x1+x3)/2),((y1+y3)/2));
                } else {
                        System.out.println("not here");
                        Polygon polygon = new Polygon();
                        polygon.getPoints().addAll(
                                x1, y1,
                                x2, y2,
                                x3, y3);
                        polygon.setFill(Color.WHITE);
                        polygon.setStroke(Color.BLACK);
                        pane.getChildren().add(polygon);
                }
        }
}