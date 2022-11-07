import javax.swing.*;

public class GameFrame extends JFrame {

//constructor:
    GameFrame() {
//        GamePanel panel = new GamePanel(); get rid of this named instance

        this.add(new GamePanel());
        //add title
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
