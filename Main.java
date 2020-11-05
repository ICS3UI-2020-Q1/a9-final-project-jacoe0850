import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JTextField firstLabel;
  JTextField secondLabel;
  JTextField thirdLabel;
  JTextField fourthLabel;

  JButton[] pointValue;  

  JLabel first200answer;
  JLabel first400answer;
  JLabel first600answer;
  JLabel first800answer;
  JLabel first1000answer;

  JLabel second200answer;
  JLabel second400answer;
  JLabel second600answer;
  JLabel second800answer;
  JLabel second1000answer;

  JLabel third200answer;
  JLabel third400answer;
  JLabel third600answer;
  JLabel third800answer;
  JLabel third1000answer;

  JLabel fourth200answer;
  JLabel fourth400answer;
  JLabel fourth600answer;
  JLabel fourth800answer;
  JLabel fourth1000answer;

  JTextField first200question;
  JTextField first400question;
  JTextField first600question;
  JTextField first800question;
  JTextField first1000question;

  JTextField second200question;
  JTextField second400question;
  JTextField second600question;
  JTextField second800question;
  JTextField second1000question;

  JTextField third200question;
  JTextField third400question;
  JTextField third600question;
  JTextField third800question;
  JTextField third1000question;

  JTextField fourth200question;
  JTextField fourth400question;
  JTextField fourth600question;
  JTextField fourth800question;
  JTextField fourth1000question;
  


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    Font labelFont = new Font("arial", Font.PLAIN, 30);
    //turns on manuel layout
    mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    //adds mainPanel to the frame
    frame.add(mainPanel);

    JPanel gridPanel = new JPanel();
    gridPanel.setLayout(new GridLayout(5,4));
    pointValue = new JButton[20];


   for(int i = 0; i < pointValue.length; i++){
      // create button with no text
      pointValue[i] = new JButton("");
      // add actionListener
      pointValue[i].addActionListener(this);
      // set action command to the number
      String questionNum = String.valueOf(i);
      pointValue[i].setActionCommand(questionNum);

      // add to panel
      gridPanel.add(pointValue[i]);
    }

    JPanel labelPanel = new JPanel();
    labelPanel.setLayout(new GridLayout(1,4));
    mainPanel.add(gridPanel, BorderLayout.CENTER);

    firstLabel = new JTextField("Video Game");
    labelPanel.add(firstLabel);
    firstLabel.setFont(labelFont);
    firstLabel.setEnabled(false);
    secondLabel = new JTextField("Marvel");
    labelPanel.add(secondLabel);
    secondLabel.setFont(labelFont);
    secondLabel.setEnabled(false);
    thirdLabel = new JTextField("Word");
    labelPanel.add(thirdLabel);
    thirdLabel.setFont(labelFont);
    thirdLabel.setEnabled(false);
    fourthLabel = new JTextField("Pokemon");
    labelPanel.add(fourthLabel);
    fourthLabel.setFont(labelFont);
    fourthLabel.setEnabled(false);
  
    mainPanel.add(labelPanel, BorderLayout.PAGE_START);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
