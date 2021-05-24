package sample;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.sg.prism.NGNode;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChessPiece extends ImageButton{

    /*  int x; // coordinates
      int y;*/
    public boolean isWhite;
    boolean pawnAdditionalMove = true; //only for pawn
    public int id;

    public void setId(int id)
    {
        this.id = id; // 0-pawn, 1-rook, 2-knight, 3-bishop, 4-queen, 5-king
    }



    /*  public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }
*/


    /*@Override
    public void setImage(String path) throws FileNotFoundException {
        File file = new File(path);
        this.image = new ImageView(new Image(new FileInputStream(file)));
        image.setFitHeight(100);
        image.setFitWidth(100);
        image.setLayoutY(100);
        image.setLayoutX(100);
    }*/



    /*public ImageButton getImg() {
        return img;
    }*/

}

