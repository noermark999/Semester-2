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

        private void drawTriangle(Pane pane, int levels, Point top, Point left, Point right) {
                if (levels < 0) {
                        return;
                }

                Polygon tri = new Polygon();
                tri.getPoints().addAll(
                        top.getX(), top.getY(),
                        left.getX(), left.getY(),
                        right.getX(), right.getY()
                );

                tri.setFill(Color.WHITE);
                tri.setStroke(Color.BLACK);
                pane.getChildren().add(tri);

                Point p12 = midpoint(top, left);
                Point p23 = midpoint(left, right);
                Point p31 = midpoint(right, top);

                drawTriangle(pane, levels - 1, top, p12, p31);
                drawTriangle(pane, levels - 1, p12, left, p23);
                drawTriangle(pane, levels - 1, p31, p23, right);
        }

        private static Point midpoint(Point p1, Point p2) {
                return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
        }
}