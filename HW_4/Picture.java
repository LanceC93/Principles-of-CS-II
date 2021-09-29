//Name: Lance Cross Date: 9/20/21 ID: 002634761
//Creates the pattern using drawing panel
import java.awt.*;

public class Picture {
    public static void main(String[] args) {
        //creates objects necessary for making graphics
        DrawingPanel canvas = new DrawingPanel(400, 400);
        Graphics g = canvas.getGraphics();
        //makes background CYAN
        canvas.setBackground(Color.CYAN);
        //prints each box
        createBox(0, 0, 100, 100, 5, 1, g, canvas);
        createBox(10, 120, 24, 24, 4, 5, g, canvas);
        createBox(150, 20, 40, 40, 5, 6, g, canvas);
        createBox(130, 275, 36, 36, 3, 3, g, canvas);
    }
    //creates the box of circles with given properties
    public static void createBox(int x, int y, int width, int height, int circles, int numRows, Graphics g, DrawingPanel canvas) {
        int origX = x;
        //prints each row of boxes
        for(int i = 0; i < numRows; i++) {
            //prints each column in each row
            for(int j = 0; j < numRows; j++) {
                g.setColor(Color.GREEN);
                g.fillRect(x, y, width, height);

                g.setColor(Color.BLACK);
                g.drawRect(x,y,width,height);

                g.setColor(Color.YELLOW);
                g.fillOval(x, y, width, height);

                g.setColor(Color.BLACK);

                for(int k = 0; k < circles; k++) {
                    g.drawOval(x + k *(width / (2*(circles))), y + k *(height / (2*(circles))), width - (width * k)/circles, height - (height * k)/circles);
                }

                g.drawLine(x, y + (height/2), x + width, y + (height/2));
                g.drawLine(x + (width/2), y, x + width/2, y + height);
                g.drawLine(x,y,x + width,y + height);
                g.drawLine(x + width,y,x,y + height);

                x += width;
            }
            y += height;
            x = origX;
        }
    }
}