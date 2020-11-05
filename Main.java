import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel question200Zero;
  JPanel mainPanel;
  JPanel questionBoard;

  JTextField firstLabel;
  JTextField secondLabel;
  JTextField thirdLabel;
  JTextField fourthLabel;

  JButton[] pointValue200;
  JButton[] pointValue400;
  JButton[] pointValue600;
  JButton[] pointValue800;
  JButton[] pointValue1000;  

  JLabel vg200q;
  JTextField answerboxvg200q;
  
  CardLayout screens;

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
    //enlarges and changes the font style for the textfields above prices
    Font labelFont = new Font("arial", Font.PLAIN, 30);
    //turns on manuel layout
    questionBoard = new JPanel();
    // sets the genres in the top of screen
    questionBoard.setLayout(new BorderLayout());
    //adds questionBoard to the frame
    frame.add(questionBoard);
    // Make gridPanel
    JPanel gridPanel = new JPanel();
    // declares the size of the grid panel in buttons
    gridPanel.setLayout(new GridLayout(5,4));
    // declaring the size of each button's arrays
    pointValue200 = new JButton[4];
    pointValue400 = new JButton[4];
    pointValue600 = new JButton[4];
    pointValue800 = new JButton[4];
    pointValue1000 = new JButton[4];

    //Creates the buttons for the 200$ using a for loop and adds to panel
   for(int i = 0; i < pointValue200.length; i++){
      // create button with no text
      pointValue200[i] = new JButton("200$ " + i);
      
      // add actionListener
      pointValue200[i].addActionListener(this);
      // set action command to the number
      String questionNum = String.valueOf(i);
      pointValue200[i].setActionCommand("200" + questionNum);

      // add to panel
      gridPanel.add(pointValue200[i]);
    }
    //Creates the buttons for the 400$ using a for loop and adds to panel
    for(int i = 0; i < pointValue400.length; i++){
      // create button with no text
      pointValue400[i] = new JButton("400$ " + i);
      
      // add actionListener
      pointValue400[i].addActionListener(this);
      // set action command to the number
      String questionNum = String.valueOf(i);
      pointValue400[i].setActionCommand("400" + questionNum);

      // add to panel
      gridPanel.add(pointValue400[i]);
    }
    //Creates the buttons for the 600$ using a for loop and adds to panel
    for(int i = 0; i < pointValue600.length; i++){
      // create button with no text
      pointValue600[i] = new JButton("600$ " + i);
      
      // add actionListener
      pointValue600[i].addActionListener(this);
      // set action command to the number
      String questionNum = String.valueOf(i);
      pointValue600[i].setActionCommand("600" + questionNum);

      // add to panel
      gridPanel.add(pointValue600[i]);
    }
    //Creates the buttons for the 800$ using a for loop and adds to panel
    for(int i = 0; i < pointValue800.length; i++){
      // create button with no text
      pointValue800[i] = new JButton("800$ " + i);
      
      // add actionListener
      pointValue800[i].addActionListener(this);
      // set action command to the number
      String questionNum = String.valueOf(i);
      pointValue800[i].setActionCommand("800" + questionNum);

      // add to panel
      gridPanel.add(pointValue800[i]);
    }
    //Creates the buttons for the 1000$ using a for loop and adds to panel
    for(int i = 0; i < pointValue1000.length; i++){
      // create button with no text
      pointValue1000[i] = new JButton("1000$ " + i);
      
      // add actionListener
      pointValue1000[i].addActionListener(this);
      // set action command to the number
      String questionNum = String.valueOf(i);
      pointValue1000[i].setActionCommand("1000" + questionNum);

      // add to panel
      gridPanel.add(pointValue1000[i]);
    }



    JPanel labelPanel = new JPanel();
    // set the size of genre's textfields
    labelPanel.setLayout(new GridLayout(1,4));
    // adds the border along the top
    questionBoard.add(gridPanel, BorderLayout.CENTER);
    // Fill in the border's textfields with genres, add to frame and change the font/ font size
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
  
    questionBoard.add(labelPanel, BorderLayout.PAGE_START);
//
//
//
//
//
// setting up 200$ video game question

  question200Zero = new JPanel();
  vg200q = new JLabel("question here");
  answerboxvg200q = new JTextField();

  //create screen jpanel manager
  screens = new CardLayout();
  mainPanel = new JPanel();
  mainPanel.setLayout(screens);
  // add screens to CardLayout
  mainPanel.add(questionBoard, "questionBoard");
  mainPanel.add(question200Zero, "videoGame200");
  frame.add(mainPanel);
  screens.show(mainPanel, "questionBoard");
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  if(command.equals("200" + "0")){
    screens.show(mainPanel, "videoGame200");
  }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
