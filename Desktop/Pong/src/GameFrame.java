import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends  JFrame{
    //create an instance of the game panel class
    GamePanel panel;

    GameFrame() {
        //finish instantiating within the constructor
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("PongGame");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack(); //adjust accordingly
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
