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

import java.awt.*;

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
                button.setOnAction(Event -> this.actionHandler(pane));
        }

        private void actionHandler(Pane pane) {
                count++;
                Point top = new Point(500, 0);
                Point left = new Point(0, 1000);
                Point right = new Point(1000, 1000);
                drawTriangle(pane, count, top, left, right);
        }

        private void drawTriangle(Pane pane, int amount, Point top, Point left, Point right) {
                if (amount < 0) {
                        return;
                }

                Polygon polygon = new Polygon();
                polygon.getPoints().addAll(
                        top.getX(), top.getY(),
                        left.getX(), left.getY(),
                        right.getX(), right.getY()
                );

                polygon.setFill(Color.WHITE);
                polygon.setStroke(Color.BLACK);
                pane.getChildren().add(polygon);

                Point midP1AndP2 = midpoint(top, left);
                Point midP2AndP3 = midpoint(left, right);
                Point MindP3AndP1 = midpoint(right, top);

                drawTriangle(pane, amount - 1, top, midP1AndP2, MindP3AndP1);
                drawTriangle(pane, amount - 1, midP1AndP2, left, midP2AndP3);
                drawTriangle(pane, amount - 1, MindP3AndP1, midP2AndP3, right);
        }

        private static Point midpoint(Point point1, Point point2) {
                return new Point((point1.x + point2.x) / 2, (point1.y + point2.y) / 2);
        }
}