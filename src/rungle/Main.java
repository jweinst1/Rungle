package rungle; /**
 * Created by Josh on 1/10/16.
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import rungle.TuringMachine;
import rungle.Reader;

public class Main {

    private JFrame frame;
    private JTextField Input;
    public Reader interpreter;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Main() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 535, 390);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Fungle");

        interpreter = new Reader();

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setAutoscrolls(true);
        scrollPane.setBounds(0, 0, 535, 338);
        frame.getContentPane().add(scrollPane);

        final JTextArea Output = new JTextArea();
        scrollPane.setViewportView(Output);
        Output.setEditable(false);

        Input = new JTextField();
        Input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String f = Input.getText() +"\n";
                    String result = interpreter.Interpret(Input.getText());
                    Output.append(f);
                    Output.append(result + "\n");
                    Input.setText("");
                }
            }
        });
        Input.setBounds(0, 334, 535, 34);
        frame.getContentPane().add(Input);
        Input.setColumns(10);





    }
}
