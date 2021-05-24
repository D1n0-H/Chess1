//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import org.w3c.dom.css.Rect;

public class Main extends Application {



    public Main() {
    }

    public void start(final Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Image image = new Image(new FileInputStream("resources/ChessBoard.png"));
        BackgroundSize backgroundSize = new BackgroundSize(800.0D, 800.0D, false, false, false, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background background = new Background(backgroundImage);

        boolean gameOver = false;

        List<Rectangle> RectArray = new ArrayList<>();
        for(int i = 0; i < 64; i++)
        {
            RectArray.add(new Rectangle());
            RectArray.get(i).setHeight(100);
            RectArray.get(i).setWidth(100);
            RectArray.get(i).setFill(Color.GREEN);
            RectArray.get(i).setLayoutX(3000);
        }


        List<ChessPiece> arrayOfCP = new ArrayList<>();
        for(int i = 0; i < 32; i++)
        {
            arrayOfCP.add(new ChessPiece());
        }

        for(int i = 0; i < 8; i++)
        {
            arrayOfCP.get(i).setImage("resources/WhitePawn.png"); arrayOfCP.get(i).setLayoutX(100 * i); arrayOfCP.get(i).setLayoutY(100);
            arrayOfCP.get(i).isWhite = true; arrayOfCP.get(i).setId(0); /*pane.getChildren().add(arrayOfCP.get(i)); arrayOfCP.get(i).show();*/
        }

        for(int i = 8; i < 16; i++)
        {
            arrayOfCP.get(i).setImage("resources/BlackPawn.png"); arrayOfCP.get(i).setLayoutX(100 * i - 800); arrayOfCP.get(i).setLayoutY(600);
            arrayOfCP.get(i).isWhite = false; arrayOfCP.get(i).setId(0);/*pane.getChildren().add(arrayOfCP.get(i)); arrayOfCP.get(i).show();*/

        }

        for(int i = 16; i < 18; i++)
        {
            arrayOfCP.get(i).setLayoutY(0);
            arrayOfCP.get(i).setImage("resources/WhiteRook.png");
            arrayOfCP.get(i).isWhite = true; arrayOfCP.get(i).setId(1);/*pane.getChildren().add(arrayOfCP.get(i));*/
            /*arrayOfCP.get(i).show();*/
        }
        arrayOfCP.get(16).setLayoutX(0);
        arrayOfCP.get(17).setLayoutX(700);


        for(int i = 18; i < 20; i++)
        {
            arrayOfCP.get(i).setImage("resources/BlackRook.png");
            arrayOfCP.get(i).setLayoutY(700);
            arrayOfCP.get(i).isWhite = false; arrayOfCP.get(i).setId(1);
        }
        arrayOfCP.get(18).setLayoutX(0);
        arrayOfCP.get(19).setLayoutX(700);

        for(int i = 20; i < 22; i++)
        {
            arrayOfCP.get(i).setImage("resources/WhiteKnight.png");
            arrayOfCP.get(i).setLayoutY(0);
            arrayOfCP.get(i).isWhite = true; arrayOfCP.get(i).setId(2);
        }
        arrayOfCP.get(20).setLayoutX(100);
        arrayOfCP.get(21).setLayoutX(600);

        for(int i = 22; i < 24; i++)
        {
            arrayOfCP.get(i).setImage("resources/BlackKnight.png");
            arrayOfCP.get(i).setLayoutY(700);
            arrayOfCP.get(i).isWhite = false; arrayOfCP.get(i).setId(2);
        }
        arrayOfCP.get(22).setLayoutX(100);
        arrayOfCP.get(23).setLayoutX(600);

        for(int i = 24; i < 26; i++)
        {
            arrayOfCP.get(i).setImage("resources/WhiteBishop.png");
            arrayOfCP.get(i).setLayoutY(0);
            arrayOfCP.get(i).isWhite = true; arrayOfCP.get(i).setId(3);
        }
        arrayOfCP.get(24).setLayoutX(200);
        arrayOfCP.get(25).setLayoutX(500);


        for(int i = 26; i < 28; i++)
        {
            arrayOfCP.get(i).setImage("resources/BlackBishop.png");
            arrayOfCP.get(i).setLayoutY(700);
            arrayOfCP.get(i).isWhite = false; arrayOfCP.get(i).setId(3);
        }
        arrayOfCP.get(26).setLayoutX(200);
        arrayOfCP.get(27).setLayoutX(500);

        arrayOfCP.get(28).setImage("resources/WhiteQueen.png"); arrayOfCP.get(28).isWhite = true;
        arrayOfCP.get(28).setLayoutX(300); arrayOfCP.get(28).setLayoutY(0); arrayOfCP.get(28).setId(4);
        arrayOfCP.get(29).setImage("resources/WhiteKing.png");  arrayOfCP.get(29).isWhite = true;
        arrayOfCP.get(29).setLayoutX(400); arrayOfCP.get(29).setLayoutY(0); arrayOfCP.get(29).setId(5);
        arrayOfCP.get(30).setImage("resources/BlackQueen.png"); arrayOfCP.get(30).isWhite = false;
        arrayOfCP.get(30).setLayoutX(300); arrayOfCP.get(30).setLayoutY(700); arrayOfCP.get(30).setId(4);
        arrayOfCP.get(31).setImage("resources/BlackKing.png");  arrayOfCP.get(31).isWhite = false;
        arrayOfCP.get(31).setLayoutX(400); arrayOfCP.get(31).setLayoutY(700); arrayOfCP.get(31).setId(5);





        for(int i = 0; i < 64; i++)
        {
            pane.getChildren().add(RectArray.get(i));
        }

        pane.setBackground(background);
        Scene scene1 = new Scene(pane);

        primaryStage.setTitle("First Application");
        primaryStage.setWidth(1000.0D);
        primaryStage.setHeight(1000.0D);

        Loader ldr = new Loader();

        for (int i = 0; i < 32; i++) {
            pane.getChildren().add(arrayOfCP.get(i));
            arrayOfCP.get(i).show();
        }

        primaryStage.setScene(scene1);
        primaryStage.show();


            for (int i = 0; i < 32; i++) {
                int finalI = i;
                arrayOfCP.get(finalI).getImage().setOnMouseClicked(event -> {
                    ldr.cleaner(RectArray);
                    ldr.setCoordinates(arrayOfCP, RectArray, arrayOfCP.get(finalI).id, finalI);
                    ldr.check(RectArray, arrayOfCP, finalI, pane);
                    for(int j = 0; j < 64; j++)
                    {
                        int finalJ = j;
                        RectArray.get(j).setOnMouseClicked(event1 -> {
                            ldr.move(finalI, finalJ, RectArray, arrayOfCP);
                            ldr.cleaner(RectArray);
                        });
                    }

                });

            }









    }

    public static void main(String[] args) {
        launch(args);
    }
}
