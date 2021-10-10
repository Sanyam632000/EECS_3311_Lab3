import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameExample extends JFrame implements ActionListener {
   public boolean load_shape  ;


    public void paint(Graphics g) {

      if(load_shape == true) {


        //  super.paintComponent(g);
          Graphics2D rect = (Graphics2D) g;
          Graphics2D square = (Graphics2D) g;
          Graphics2D inverted_rect = (Graphics2D) g;
          Graphics2D large_circle = (Graphics2D) g;
          Graphics2D small_circle = (Graphics2D) g;
          Graphics2D medium_circle = (Graphics2D) g;
          int width = getWidth();


          rect.setColor(new Color(131, 21, 1));//
          rect.fillRect(950, 555 , 90, 60);
          System.out.println(rect.getClipBounds().getSize().getWidth());
      //rect.fillRect(400, 420 , 90, 60);//

          square.setColor(new Color(125, 75, 25));
          square.fillRect(850, 475, 60, 60);//
          square.getClipBounds().setSize(60,60);
          //square.fillRect(350, 350, 60, 60);//

          inverted_rect.setColor(new Color(200, 150, 10));//
          inverted_rect.fillRect(750, 365, 50, 90);//
          inverted_rect.getClipBounds().setSize(90,90);
          System.out.println("s="+inverted_rect);
          //inverted_rect.fillRect(300, 250, 50, 90);//
//System.out.println("Je;;"+square.)
          large_circle.setColor(new Color(3, 100, 200));
          large_circle.fillOval(630, 260, 100, 100);
          System.out.println(large_circle.getClipBounds().getSize());
          //large_circle.fillOval(200, 150, 100, 100);

          small_circle.setColor(new Color(20, 90, 20));
          small_circle.fillOval(560, 190, 55, 55);
          //small_circle.fillOval(150, 100, 55, 55);

          medium_circle.setColor(new Color(57, 148, 167));
          medium_circle.fillOval(450, 100, 80, 80);
          //medium_circle.fillOval(70, 50, 80, 80);

      }

    }


    public void display(){
       JFrame frame = new JFrame("JFrame Example");

       /*JFrameExample rect = new JFrameExample();

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        JButton button_1 = new JButton();
        JButton button_2 = new JButton();
        button_1.setText("Load Shapes");
        button_2.setText("Sort Shapes");
        button_1.addActionListener(this);

        panel.add(button_1);
        panel.add(button_2);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(rect);
        frame.setSize(360, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);*/

        setLayout(new FlowLayout());
        JButton button = new JButton();
        JButton button_2 = new JButton();

        //button.setPreferredSize(new Dimension(600,600));
        button_2.setText("Sort Shape");
        button.setText("Load Shape");



        add(button);
        add(button_2);
        button.addActionListener(this);
        setSize(1600, 1000);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent e){
        load_shape=true;
        repaint();
    }

    public static void main(String s[]) {
        JFrameExample rectangle = new JFrameExample();
        rectangle.display();

        /*JFrame frame = new JFrame("JFrame Example");
        JFrameExample rect = new JFrameExample();

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        JToggleButton button_1 = new JToggleButton();
        JButton button_2 = new JButton();
        button_1.setText("Load Shapes");
        button_2.setText("Sort Shapes");


        panel.add(button_1);
        panel.add(button_2);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(rect);
        frame.setSize(360, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);*/

    }
}
