package sample;

import java.util.List;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Loader {
    public Loader() {
    }

    public void setCoordinates(List<ChessPiece> arrayOfCP, List<Rectangle> rectArray, int id, int num) {
        double startingCoordinateX = (arrayOfCP.get(num)).getLayoutX();
        double startingCoordinateY = (arrayOfCP.get(num)).getLayoutY();
        int i;

            if(id == 0) {
                if (arrayOfCP.get(num).isWhite) {
                    rectArray.get(0).setLayoutX(startingCoordinateX);
                    rectArray.get(0).setLayoutY(startingCoordinateY + 100.0D);

                    for (i = 0; i < 32; ++i) {
                        if (arrayOfCP.get(i).getLayoutX() == arrayOfCP.get(num).getLayoutX() + 100.0D && arrayOfCP.get(i).getLayoutY() == arrayOfCP.get(num).getLayoutY() + 100.0D && !arrayOfCP.get(i).isWhite) {
                            rectArray.get(1).setLayoutX(startingCoordinateX + 100.0D);
                            rectArray.get(1).setLayoutY(startingCoordinateY + 100.0D);
                        }
                    }

                    for (i = 0; i < 32; ++i) {
                        if (arrayOfCP.get(i).getLayoutX() == arrayOfCP.get(num).getLayoutX() - 100.0D && arrayOfCP.get(i).getLayoutY() == ((ChessPiece) arrayOfCP.get(num)).getLayoutY() + 100.0D && !((ChessPiece) arrayOfCP.get(i)).isWhite) {
                            ((Rectangle) rectArray.get(2)).setLayoutX(startingCoordinateX - 100.0D);
                            ((Rectangle) rectArray.get(2)).setLayoutY(startingCoordinateY + 100.0D);
                        }
                    }

                    if (((ChessPiece) arrayOfCP.get(num)).pawnAdditionalMove) {
                        ((Rectangle) rectArray.get(3)).setLayoutX(startingCoordinateX);
                        ((Rectangle) rectArray.get(3)).setLayoutY(startingCoordinateY + 200.0D);
                    }

                    for(i = 0; i < 32; i++)
                    {
                        if(startingCoordinateX == arrayOfCP.get(i).getLayoutX() && startingCoordinateY + 100 == arrayOfCP.get(i).getLayoutY())
                        {
                            rectArray.get(0).setLayoutX(3000);
                            rectArray.get(3).setLayoutX(3000);
                        }
                        if(startingCoordinateX == arrayOfCP.get(i).getLayoutX() && startingCoordinateY + 200 == arrayOfCP.get(i).getLayoutY())
                        {
                            rectArray.get(3).setLayoutX(3000);
                        }
                    }

                }
                else if (!((ChessPiece) arrayOfCP.get(num)).isWhite) {
                    ((Rectangle) rectArray.get(0)).setLayoutX(startingCoordinateX);
                    ((Rectangle) rectArray.get(0)).setLayoutY(startingCoordinateY - 100.0D);

                    for (i = 0; i < 32; ++i) {
                        if (((ChessPiece) arrayOfCP.get(i)).getLayoutX() == ((ChessPiece) arrayOfCP.get(num)).getLayoutX() + 100.0D && ((ChessPiece) arrayOfCP.get(i)).getLayoutY() == ((ChessPiece) arrayOfCP.get(num)).getLayoutY() - 100.0D && ((ChessPiece) arrayOfCP.get(i)).isWhite) {
                            ((Rectangle) rectArray.get(1)).setLayoutX(startingCoordinateX + 100.0D);
                            ((Rectangle) rectArray.get(1)).setLayoutY(startingCoordinateY - 100.0D);
                        }
                    }

                    for (i = 0; i < 32; ++i) {
                        if (((ChessPiece) arrayOfCP.get(i)).getLayoutX() == ((ChessPiece) arrayOfCP.get(num)).getLayoutX() - 100.0D && ((ChessPiece) arrayOfCP.get(i)).getLayoutY() == ((ChessPiece) arrayOfCP.get(num)).getLayoutY() - 100.0D && ((ChessPiece) arrayOfCP.get(i)).isWhite) {
                            ((Rectangle) rectArray.get(2)).setLayoutX(startingCoordinateX - 100.0D);
                            ((Rectangle) rectArray.get(2)).setLayoutY(startingCoordinateY - 100.0D);
                        }
                    }

                    if (((ChessPiece) arrayOfCP.get(num)).pawnAdditionalMove) {
                        ((Rectangle) rectArray.get(3)).setLayoutX(startingCoordinateX);
                        ((Rectangle) rectArray.get(3)).setLayoutY(startingCoordinateY - 200.0D);
                    }

                    for(i = 0; i < 32; i++)
                    {
                        if(startingCoordinateX == arrayOfCP.get(i).getLayoutX() && startingCoordinateY - 100 == arrayOfCP.get(i).getLayoutY())
                        {
                            rectArray.get(0).setLayoutX(3000);
                            rectArray.get(3).setLayoutX(3000);
                        }
                        if(startingCoordinateX == arrayOfCP.get(i).getLayoutX() && startingCoordinateY - 200 == arrayOfCP.get(i).getLayoutY())
                        {
                            rectArray.get(3).setLayoutX(3000);
                        }


                    }

                }

            }
            if(id == 1) {
                SetBelow:
                for (i = 0; i < 7; ++i) {
                    ((Rectangle) rectArray.get(i)).setLayoutX(startingCoordinateX);
                    ((Rectangle) rectArray.get(i)).setLayoutY(startingCoordinateY + 100.0D + (double) (100 * i));
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break SetBelow;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break SetBelow;
                    }
                }

                SetRight:
                for (i = 7; i < 14; ++i) {
                    ((Rectangle) rectArray.get(i)).setLayoutX(startingCoordinateX + 100.0D + (double) (100 * (i - 7)));
                    ((Rectangle) rectArray.get(i)).setLayoutY(startingCoordinateY);
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break SetRight;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break SetRight;
                    }
                }

                SetUp:
                for (i = 14; i < 21; ++i) {
                    ((Rectangle) rectArray.get(i)).setLayoutX(startingCoordinateX);
                    ((Rectangle) rectArray.get(i)).setLayoutY(startingCoordinateY - 100.0D - (double) (100 * (i - 14)));
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break SetUp;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break SetUp;
                    }
                }

                SetLeft:
                for (i = 21; i < 28; ++i) {
                    ((Rectangle) rectArray.get(i)).setLayoutX(startingCoordinateX - 100.0D - (double) (100 * (i - 21)));
                    ((Rectangle) rectArray.get(i)).setLayoutY(startingCoordinateY);
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break SetLeft;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break SetLeft;
                    }
                }
            }

            if(id == 2) {
                ((Rectangle) rectArray.get(0)).setLayoutX(startingCoordinateX + 200.0D);
                ((Rectangle) rectArray.get(0)).setLayoutY(startingCoordinateY + 100.0D);
                ((Rectangle) rectArray.get(1)).setLayoutX(startingCoordinateX + 100.0D);
                ((Rectangle) rectArray.get(1)).setLayoutY(startingCoordinateY + 200.0D);
                ((Rectangle) rectArray.get(2)).setLayoutX(startingCoordinateX - 200.0D);
                ((Rectangle) rectArray.get(2)).setLayoutY(startingCoordinateY + 100.0D);
                ((Rectangle) rectArray.get(3)).setLayoutX(startingCoordinateX - 100.0D);
                ((Rectangle) rectArray.get(3)).setLayoutY(startingCoordinateY + 200.0D);
                ((Rectangle) rectArray.get(4)).setLayoutX(startingCoordinateX + 100.0D);
                ((Rectangle) rectArray.get(4)).setLayoutY(startingCoordinateY - 200.0D);
                ((Rectangle) rectArray.get(5)).setLayoutX(startingCoordinateX + 200.0D);
                ((Rectangle) rectArray.get(5)).setLayoutY(startingCoordinateY - 100.0D);
                ((Rectangle) rectArray.get(6)).setLayoutX(startingCoordinateX - 200.0D);
                ((Rectangle) rectArray.get(6)).setLayoutY(startingCoordinateY - 100.0D);
                ((Rectangle) rectArray.get(7)).setLayoutX(startingCoordinateX - 100.0D);
                ((Rectangle) rectArray.get(7)).setLayoutY(startingCoordinateY - 200.0D);
            }
            if(id == 3)
            {

                    Angle1:
                    for (i = 0; i < 7; ++i) {
                        ((Rectangle) rectArray.get(i)).setLayoutX(startingCoordinateX + 100.0D + (double) (100 * i));
                        ((Rectangle) rectArray.get(i)).setLayoutY(startingCoordinateY + 100.0D + (double) (100 * i));
                        for(int j = 0; j < 32; j++)
                        {
                            if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                                rectArray.get(i).setLayoutX(3000);
                                break Angle1;
                            }
                            if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                                break Angle1;
                        }
                    }
                    Angle2:
                    for (i = 7; i < 14; ++i) {
                        ((Rectangle) rectArray.get(i)).setLayoutX(startingCoordinateX - 100.0D - (double) (100 * (i - 7)));
                        ((Rectangle) rectArray.get(i)).setLayoutY(startingCoordinateY + 100.0D + (double) (100 * (i - 7)));
                        for(int j = 0; j < 32; j++)
                        {
                            if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                                rectArray.get(i).setLayoutX(3000);
                                break Angle2;
                            }
                            if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                                break Angle2;
                        }
                    }

                    Angle3:
                    for (i = 14; i < 21; ++i) {
                        ((Rectangle) rectArray.get(i)).setLayoutX(startingCoordinateX + 100.0D + (double) (100 * (i - 14)));
                        ((Rectangle) rectArray.get(i)).setLayoutY(startingCoordinateY - 100.0D - (double) (100 * (i - 14)));
                        for(int j = 0; j < 32; j++)
                        {
                            if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                                rectArray.get(i).setLayoutX(3000);
                                break Angle3;
                            }
                            if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                                break Angle3;
                        }
                    }

                    Angle4:
                    for (i = 21; i < 28; ++i) {
                        ((Rectangle) rectArray.get(i)).setLayoutX(startingCoordinateX - 100.0D - (double) (100 * (i - 21)));
                        ((Rectangle) rectArray.get(i)).setLayoutY(startingCoordinateY - 100.0D - (double) (100 * (i - 21)));
                        for(int j = 0; j < 32; j++)
                        {
                            if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                                rectArray.get(i).setLayoutX(3000);
                                break Angle4;
                            }
                            if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                                break Angle4;
                        }
                    }

            }
            if(id == 4)
            {
                Angle1:
                for(i = 0; i < 7; ++i) {
                    ((Rectangle)rectArray.get(i)).setLayoutX(startingCoordinateX + 100.0D + (double)(100 * i));
                    ((Rectangle)rectArray.get(i)).setLayoutY(startingCoordinateY + 100.0D + (double)(100 * i));
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break Angle1;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break Angle1;
                    }
                }

                Angle2:
                for(i = 7; i < 14; ++i) {
                    ((Rectangle)rectArray.get(i)).setLayoutX(startingCoordinateX - 100.0D - (double)(100 * (i - 7)));
                    ((Rectangle)rectArray.get(i)).setLayoutY(startingCoordinateY + 100.0D + (double)(100 * (i - 7)));
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break Angle2;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break Angle2;
                    }
                }

                Angle3:
                for(i = 14; i < 21; ++i) {
                    ((Rectangle)rectArray.get(i)).setLayoutX(startingCoordinateX + 100.0D + (double)(100 * (i - 14)));
                    ((Rectangle)rectArray.get(i)).setLayoutY(startingCoordinateY - 100.0D - (double)(100 * (i - 14)));
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break Angle3;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break Angle3;
                    }
                }

                Angle4:
                for(i = 21; i < 28; ++i) {
                    ((Rectangle)rectArray.get(i)).setLayoutX(startingCoordinateX - 100.0D - (double)(100 * (i - 21)));
                    ((Rectangle)rectArray.get(i)).setLayoutY(startingCoordinateY - 100.0D - (double)(100 * (i - 21)));
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break Angle4;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break Angle4;
                    }
                }

                Angle5:
                for(i = 28; i < 35; ++i) {
                    ((Rectangle)rectArray.get(i)).setLayoutX(startingCoordinateX);
                    ((Rectangle)rectArray.get(i)).setLayoutY(startingCoordinateY + 100.0D + (double)(100 * (i - 28)));
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break Angle5;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break Angle5;
                    }
                }

                Angle6:
                for(i = 35; i < 42; ++i) {
                    ((Rectangle)rectArray.get(i)).setLayoutX(startingCoordinateX + 100.0D + (double)(100 * (i - 35)));
                    ((Rectangle)rectArray.get(i)).setLayoutY(startingCoordinateY);
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break Angle6;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break Angle6;
                    }
                }

                Angle7:
                for(i = 42; i < 48; ++i) {
                    ((Rectangle)rectArray.get(i)).setLayoutX(startingCoordinateX);
                    ((Rectangle)rectArray.get(i)).setLayoutY(startingCoordinateY - 100.0D - (double)(100 * (i - 42)));
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break Angle7;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break Angle7;
                    }
                }

                Angle8:
                for(i = 48; i < 56; ++i) {
                    ((Rectangle)rectArray.get(i)).setLayoutX(startingCoordinateX - 100.0D - (double)(100 * (i - 48)));
                    ((Rectangle)rectArray.get(i)).setLayoutY(startingCoordinateY);
                    for(int j = 0; j < 32; j++)
                    {
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY() && arrayOfCP.get(num).isWhite == arrayOfCP.get(j).isWhite) {
                            rectArray.get(i).setLayoutX(3000);
                            break Angle8;
                        }
                        if(rectArray.get(i).getLayoutX() == arrayOfCP.get(j).getLayoutX() && rectArray.get(i).getLayoutY() == arrayOfCP.get(j).getLayoutY())
                            break Angle8;
                    }
                }

            }
            if(id == 5)
            {
                ((Rectangle) rectArray.get(0)).setLayoutX(startingCoordinateX + 100.0D);
                ((Rectangle) rectArray.get(0)).setLayoutY(startingCoordinateY + 100.0D);
                ((Rectangle) rectArray.get(1)).setLayoutX(startingCoordinateX - 100.0D);
                ((Rectangle) rectArray.get(1)).setLayoutY(startingCoordinateY + 100.0D);
                ((Rectangle) rectArray.get(2)).setLayoutX(startingCoordinateX + 100.0D);
                ((Rectangle) rectArray.get(2)).setLayoutY(startingCoordinateY - 100.0D);
                ((Rectangle) rectArray.get(3)).setLayoutX(startingCoordinateX - 100.0D);
                ((Rectangle) rectArray.get(3)).setLayoutY(startingCoordinateY - 100.0D);
            }

    }

    void cleaner(List<Rectangle> rectArray) {
        for(int i = 0; i < 64; ++i) {
            ((Rectangle)rectArray.get(i)).setLayoutX(3000.0D);
        }

    }

    void check(List<Rectangle> rectArray, List<ChessPiece> arrayOfCP, int id, Pane pane) {
        for(int i = 0; i < 64; ++i) {
            if (((Rectangle)rectArray.get(i)).getLayoutX() > 700.0D || ((Rectangle)rectArray.get(i)).getLayoutX() < 0.0D || ((Rectangle)rectArray.get(i)).getLayoutY() > 700.0D || ((Rectangle)rectArray.get(i)).getLayoutY() < 0.0D) {
                ((Rectangle)rectArray.get(i)).setLayoutX(3000.0D);
            }

            for(int j = 0; j < 32; ++j) {
                if (((Rectangle)rectArray.get(i)).getLayoutX() == ((ChessPiece)arrayOfCP.get(j)).getLayoutX() && ((Rectangle)rectArray.get(i)).getLayoutY() == ((ChessPiece)arrayOfCP.get(j)).getLayoutY() && ((ChessPiece)arrayOfCP.get(j)).isWhite == ((ChessPiece)arrayOfCP.get(id)).isWhite) {
                    ((Rectangle)rectArray.get(i)).setLayoutX(3000.0D);
                }
            }
        }

    }

    void move(int id, int rectId, List<Rectangle> rectArray, List<ChessPiece> arrayOfCP) {
        for(int i = 0; i < 32; ++i) {
            if (((Rectangle)rectArray.get(rectId)).getLayoutX() == ((ChessPiece)arrayOfCP.get(i)).getLayoutX() && ((Rectangle)rectArray.get(rectId)).getLayoutY() == ((ChessPiece)arrayOfCP.get(i)).getLayoutY()) {
                ((ChessPiece)arrayOfCP.get(i)).setLayoutX(3000.0D);
            }
        }

        if(id < 16 && (arrayOfCP.get(id).getLayoutY() != 200 || arrayOfCP.get(id).getLayoutY() != 600))
        {
            arrayOfCP.get(id).pawnAdditionalMove = false;
        }

        ((ChessPiece)arrayOfCP.get(id)).setLayoutX(((Rectangle)rectArray.get(rectId)).getLayoutX());
        ((ChessPiece)arrayOfCP.get(id)).setLayoutY(((Rectangle)rectArray.get(rectId)).getLayoutY());
    }

    void checkMate(List<ChessPiece> arrayOfCP, boolean gameOver) {
        for(int i = 30; i < 32; ++i) {
            if (((ChessPiece)arrayOfCP.get(i)).getLayoutX() == 3000.0D) {
                gameOver = true;
            }
        }

    }
}
