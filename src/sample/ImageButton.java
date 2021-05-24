package sample;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import org.w3c.dom.css.Rect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

class ImageButton extends Parent
{
    private ImageView image;

   /* public void setImage(String path) throws FileNotFoundException {

    }*/

    public void show()
    {
        this.getChildren().add(this.image);
    }


    Loader ldr = new Loader();

    /*public void useImageButton(Stage stage, Pane pane, int id, List<Rectangle> RectArray, List<ChessPiece> arrayOfCP) throws FileNotFoundException {

     *//*  this.image.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent evt) {*//*
                ldr.cleaner(RectArray);
                ldr.setCoordinates(arrayOfCP, RectArray, id);
                ldr.check(RectArray, arrayOfCP, id, pane);
                ldr.cleaner(RectArray);
     *//*

        });*//*
     *//*this.image.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ldr.cleaner(RectArray, pane);
            }
        });*//*
    }
*/
    public void setImage(String path) throws FileNotFoundException {
        File file = new File(path);
        this.image = new ImageView(new Image(new FileInputStream(file)));
        image.setFitHeight(100);
        image.setFitWidth(100);
    }

    public ImageView getImage() {
        return image;
    }
}
