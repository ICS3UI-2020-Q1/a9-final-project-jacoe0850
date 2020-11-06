import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel question200Zero;
  JPanel question200One;
  JPanel question200Two;
  JPanel question200Three;

  JPanel question400Zero;
  JPanel question400One;
  JPanel question400Two;
  JPanel question400Three;

  JPanel question600Zero;
  JPanel question600One;
  JPanel question600Two;
  JPanel question600Three;

  JPanel question800Zero;
  JPanel question800One;
  JPanel question800Two;
  JPanel question800Three;

  JPanel question1000Zero;
  JPanel question1000One;
  JPanel question1000Two;
  JPanel question1000Three;

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
  JTextField answerboxm200q;
  JTextField answerboxa200q;
  JTextField answerboxp200q;

  JTextField answerboxvg400q;
  JTextField answerboxm400q;
  JTextField answerboxa400q;
  JTextField answerboxp400q;

  JTextField answerboxvg600q;
  JTextField answerboxm600q;
  JTextField answerboxa600q;
  JTextField answerboxp600q;

  JTextField answerboxvg800q;
  JTextField answerboxm800q;
  JTextField answerboxa800q;
  JTextField answerboxp800q;

  JTextField answerboxvg1000q;
  JTextField answerboxm1000q;
  JTextField answerboxa1000q;
  JTextField answerboxp1000q;
  
  JButton enterButton;

  CardLayout screens;

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Jeopardy!");
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
  question200Zero.setLayout(null);
  vg200q = new JLabel("Recognized as the first ever video game, created by William Higinbotham");
  answerboxvg200q = new JTextField();
  question200Zero.add(vg200q);
  vg200q.setBounds(150, 100, 700, 50);
  question200Zero.add(answerboxvg200q);
  answerboxvg200q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question200Zero.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 200$ Marvel question
  question200One = new JPanel();
  question200One.setLayout(null);
  vg200q = new JLabel("The identity of Iron Man");
  answerboxm200q = new JTextField();
  question200One.add(vg200q);
  vg200q.setBounds(325, 100, 700, 50);
  question200One.add(answerboxm200q);
  answerboxm200q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question200One.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 200$ Animal question
  question200Two = new JPanel();
  question200Two.setLayout(null);
  vg200q = new JLabel("Reptile with a hard shell on its back");
  answerboxa200q = new JTextField();
  question200Two.add(vg200q);
  vg200q.setBounds(275, 100, 700, 50);
  question200Two.add(answerboxa200q);
  answerboxa200q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question200Two.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 200$ Pokemon question
  question200Three = new JPanel();
  question200Three.setLayout(null);
  vg200q = new JLabel("Purple pokeball with 100% capture chance");
  answerboxp200q = new JTextField();
  question200Three.add(vg200q);
  vg200q.setBounds(240, 100, 700, 50);
  question200Three.add(answerboxp200q);
  answerboxp200q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question200Three.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 400$ video game question
  question400Zero = new JPanel();
  question400Zero.setLayout(null);
  vg200q = new JLabel("The first Nintendo console");
  answerboxvg400q = new JTextField();
  question400Zero.add(vg200q);
  vg200q.setBounds(240, 100, 700, 50);
  question400Zero.add(answerboxvg400q);
  answerboxvg400q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question400Zero.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 400$ Marvel question
  question400One = new JPanel();
  question400One.setLayout(null);
  vg200q = new JLabel("The original actor of Spider-Man in 2002 Spider-Man");
  answerboxm400q = new JTextField();
  question400One.add(vg200q);
  vg200q.setBounds(180, 100, 700, 50);
  question400One.add(answerboxm400q);
  answerboxm400q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question400One.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 400$ Animal question
  question400Two = new JPanel();
  question400Two.setLayout(null);
  vg200q = new JLabel("White bird sterotypically released at weddings");
  answerboxa400q = new JTextField();
  question400Two.add(vg200q);
  vg200q.setBounds(200, 100, 700, 50);
  question400Two.add(answerboxa400q);
  answerboxa400q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question400Two.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 400$ Pokemon question
  question400Three = new JPanel();
  question400Three.setLayout(null);
  vg200q = new JLabel("The country Pokemon originated from");
  answerboxp400q = new JTextField();
  question400Three.add(vg200q);
  vg200q.setBounds(230, 100, 700, 50);
  question400Three.add(answerboxp400q);
  answerboxp400q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question400Three.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 600$ video game question
  question600Zero = new JPanel();
  question600Zero.setLayout(null);
  vg200q = new JLabel("The 2nd generation of XBOX");
  answerboxvg600q = new JTextField();
  question600Zero.add(vg200q);
  vg200q.setBounds(230, 100, 700, 50);
  question600Zero.add(answerboxvg600q);
  answerboxvg600q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question600Zero.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 600$ Marvel question
  question600One = new JPanel();
  question600One.setLayout(null);
  vg200q = new JLabel("Stan Lee's hit catchphrase");
  answerboxm600q = new JTextField();
  question600One.add(vg200q);
  vg200q.setBounds(278, 100, 700, 50);
  question600One.add(answerboxm600q);
  answerboxm600q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question600One.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 600$ animal question
  question600Two = new JPanel();
  question600Two.setLayout(null);
  vg200q = new JLabel("The king of the jungle");
  answerboxa600q = new JTextField();
  question600Two.add(vg200q);
  vg200q.setBounds(280, 100, 700, 50);
  question600Two.add(answerboxa600q);
  answerboxa600q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question600Two.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 600$ pokemon question
  question600Three = new JPanel();
  question600Three.setLayout(null);
  vg200q = new JLabel("The large rock snake-like pokemon");
  answerboxp600q = new JTextField();
  question600Three.add(vg200q);
  vg200q.setBounds(270, 100, 700, 50);
  question600Three.add(answerboxp600q);
  answerboxp600q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question600Three.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 800$ video game question
  question800Zero = new JPanel();
  question800Zero.setLayout(null);
  vg200q = new JLabel("Popular first person shooter created by Valve in 2012");
  answerboxvg800q = new JTextField();
  question800Zero.add(vg200q);
  vg200q.setBounds(210, 100, 700, 50);
  question800Zero.add(answerboxvg800q);
  answerboxvg800q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question800Zero.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 800$ Marvel question
  question800One = new JPanel();
  question800One.setLayout(null);
  vg200q = new JLabel("Antagonist of 2004 Spider-Man 2");
  answerboxm800q = new JTextField();
  question800One.add(vg200q);
  vg200q.setBounds(270, 100, 700, 50);
  question800One.add(answerboxm800q);
  answerboxm800q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question800One.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 800$ animal question
  question800Two = new JPanel();
  question800Two.setLayout(null);
  vg200q = new JLabel("Large flightleses bird known for sticking its head underground");
  answerboxa800q = new JTextField();
  question800Two.add(vg200q);
  vg200q.setBounds(240, 100, 700, 50);
  question800Two.add(answerboxa800q);
  answerboxa800q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question800Two.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 800$ pokemon question
  question800Three = new JPanel();
  question800Three.setLayout(null);
  vg200q = new JLabel("Final evolution of starter pokemon squirtle");
  answerboxp800q = new JTextField();
  question800Three.add(vg200q);
  vg200q.setBounds(260, 100, 700, 50);
  question800Three.add(answerboxp800q);
  answerboxp800q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question800Three.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 1000$ video game question
  question1000Zero = new JPanel();
  question1000Zero.setLayout(null);
  vg200q = new JLabel("Nintendo 3d platformer known for glitches");
  answerboxvg1000q = new JTextField();
  question1000Zero.add(vg200q);
  vg200q.setBounds(230, 100, 700, 50);
  question1000Zero.add(answerboxvg1000q);
  answerboxvg1000q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question1000Zero.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 1000$ Marvel question
  question1000One = new JPanel();
  question1000One.setLayout(null);
  vg200q = new JLabel("Duration Captain America was frozen in the arctic for");
  answerboxm1000q = new JTextField();
  question1000One.add(vg200q);
  vg200q.setBounds(270, 100, 700, 50);
  question1000One.add(answerboxm1000q);
  answerboxm1000q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question1000One.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 1000$ animal question
  question1000Two = new JPanel();
  question1000Two.setLayout(null);
  vg200q = new JLabel("Aquatic animal that inspired the Jaws move series");
  answerboxa1000q = new JTextField();
  question1000Two.add(vg200q);
  vg200q.setBounds(260, 100, 700, 50);
  question1000Two.add(answerboxa1000q);
  answerboxa1000q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question1000Two.add(enterButton);
  enterButton.setActionCommand("enter");

  // setting up 10000$ pokemon question
  question1000Three = new JPanel();
  question1000Three.setLayout(null);
  vg200q = new JLabel("The 2nd generation fire starter pokemon");
  answerboxp1000q = new JTextField();
  question1000Three.add(vg200q);
  vg200q.setBounds(260, 100, 700, 50);
  question1000Three.add(answerboxp1000q);
  answerboxp1000q.setBounds(300,400,200,15);
  enterButton = new JButton("ENTER ANSWER");
  enterButton.setBounds(300,250,200,100);
  question1000Three.add(enterButton);
  enterButton.setActionCommand("enter");

  //create screen jpanel manager
  screens = new CardLayout();
  mainPanel = new JPanel();
  mainPanel.setLayout(screens);
  // add screens to CardLayout
  mainPanel.add(questionBoard, "questionBoard");
  mainPanel.add(question200Zero, "videoGame200Zero");
  mainPanel.add(question200One, "marvel200Zero");
  mainPanel.add(question200Two, "animal200Zero");
  mainPanel.add(question200Three, "pokemon200Zero");
  mainPanel.add(question400Zero, "videoGame400Zero");
  mainPanel.add(question400One, "marvel400Zero");
  mainPanel.add(question400Two, "animal400Zero");
  mainPanel.add(question400Three, "pokemon400Zero");
  mainPanel.add(question600Zero, "videoGame600Zero");
  mainPanel.add(question600One, "marvel600Zero");
  mainPanel.add(question600Two, "animal600Zero");
  mainPanel.add(question600Three, "pokemon600Zero");
  mainPanel.add(question800Zero, "videoGame800Zero");
  mainPanel.add(question800One, "marvel800Zero");
  mainPanel.add(question800Two, "animal800Zero");
  mainPanel.add(question800Three, "pokemon800Zero");
  mainPanel.add(question1000Zero, "videoGame1000Zero");
  mainPanel.add(question1000One, "marvel1000Zero");
  mainPanel.add(question1000Two, "animal1000Zero");
  mainPanel.add(question1000Three, "pokemon1000Zero");
  frame.add(mainPanel);
  screens.show(mainPanel, "questionBoard");
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  if(command.equals("200" + "0")){
    screens.show(mainPanel, "videoGame200Zero");
  }
  if(command.equals("200" + "1")){
    screens.show(mainPanel, "marvel200Zero");
  }
  if(command.equals("200" + "2")){
    screens.show(mainPanel, "animal200Zero");
  }
  if(command.equals("200" + "3")){
    screens.show(mainPanel, "pokemon200Zero");
  }
  if(command.equals("400" + "0")){
    screens.show(mainPanel, "videoGame400Zero");
  }
  if(command.equals("400" + "1")){
    screens.show(mainPanel, "marvel400Zero");
  }
  if(command.equals("400" + "2")){
    screens.show(mainPanel, "animal400Zero");
  }
  if(command.equals("400" + "3")){
    screens.show(mainPanel, "pokemon400Zero");
  }
  if(command.equals("600" + "0")){
    screens.show(mainPanel, "videoGame600Zero");
  }
  if(command.equals("600" + "1")){
    screens.show(mainPanel, "marvel600Zero");
  }
  if(command.equals("600" + "2")){
    screens.show(mainPanel, "animal600Zero");
  }
  if(command.equals("600" + "3")){
    screens.show(mainPanel, "pokemon600Zero");
  }
  if(command.equals("800" + "0")){
    screens.show(mainPanel, "videoGame800Zero");
  }
  if(command.equals("800" + "1")){
    screens.show(mainPanel, "marvel800Zero");
  }
  if(command.equals("800" + "2")){
    screens.show(mainPanel, "animal800Zero");
  }
  if(command.equals("800" + "3")){
    screens.show(mainPanel, "pokemon800Zero");
  }
  if(command.equals("1000" + "0")){
    screens.show(mainPanel, "videoGame1000Zero");
  }
  if(command.equals("1000" + "1")){
    screens.show(mainPanel, "marvel1000Zero");
  }
  if(command.equals("1000" + "2")){
    screens.show(mainPanel, "animal1000Zero");
  }
  if(command.equals("1000" + "3")){
    screens.show(mainPanel, "pokemon1000Zero");
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
