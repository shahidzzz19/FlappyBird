import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        FlappyBird flappyBird = new FlappyBird();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(flappyBird);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Request focus after the frame is visible
        flappyBird.requestFocus();
    }
}