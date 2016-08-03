 //Milind Pathiyal

import gpdraw.*;
public class Square
{
    public void draw()
    {
        SketchPad pad = new SketchPad (500,500);
        DrawingTool pen = new DrawingTool(pad);
        //Square
        pen.forward(100);
        pen.turnRight(90);
        pen.forward(100);
        pen.turnRight(90);
        pen.forward(100);
        pen.turnRight(90);
        pen.forward(100);
        pen.turnRight(90);
        pen.forward(100);
        
        //Roof
        pen.turnRight(45);
        pen.forward(70);
        pen.turnRight(90);
        pen.forward(70);
        
        //Reset to Door
        pen.up();
        pen.turnRight(45);
        pen.forward(100);
        pen.turnRight(90);
        pen.forward(40);
        
        //Door
        pen.down();
        pen.turnRight(90);
        pen.forward(40);
        pen.turnLeft(90);
        pen.forward(20);
        pen.turnLeft(90);
        pen.forward(40);
        
        //Reset to Window
        pen.turnRight(90);
        pen.forward(15);
        pen.turnRight(90);
        pen.up();
        pen.forward(60);
        pen.down();
        pen.forward(10);
        pen.turnRight(90);
        pen.forward(10);
        pen.turnRight(90);
        pen.forward(10);
        pen.turnRight(90);
        pen.forward(10);
        pen.turnRight(90);
        
        //Reset to second window
        pen.up();
        pen.turnRight(90);
        pen.forward(40);
        pen.turnLeft(90);
        pen.down();
        pen.forward(10);
        pen.turnRight(90);
        pen.forward(10);
        pen.turnRight(90);
        pen.forward(10);
        pen.turnRight(90);
        pen.forward(10);
        pen.turnRight(90);
    }
}