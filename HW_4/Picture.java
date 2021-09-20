//Name: Lance Cross Date: 9/20/21 ID: 002634761
//Creates the pattern using drawing panel
import java.awt.*;

public class Picture {
    public static void main(String[] args) {
        DrawingPanel canvas = new DrawingPanel(400, 400);
        Graphics g = canvas.getGraphics();
        canvas.setBackground(Color.CYAN);
        createBox(0, 0, 100, 100, 5, 1, g, canvas);
    }
    //creates the box of circles with given properties
    public static void createBox(int x, int y, int width, int height, int circles, int numRows, Graphics g, DrawingPanel canvas) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);

        g.setColor(Color.BLACK);
        g.drawRect(x,y,width,height);

        g.setColor(Color.YELLOW);
        g.fillOval(x, y, width, height);

        g.setColor(Color.BLACK);

        for(int i = 0; i < circles; i++) {
            g.drawOval(i *(width / (2*(circles))), i *(height / (2*(circles))), width - (width * i)/circles, height - (height * i)/circles);
        }

        g.drawLine(0, height/2, height, height/2);
        g.drawLine(width/2, 0, width/2, height);
        g.drawLine(0,0,width,height);
        g.drawLine(width,0,0,height);
    }
}