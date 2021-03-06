import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  

  int score = 0;

  String answervg200;
  String answerm200;
  String answera200;
  String answerp200;
  String answervg400;
  String answerm400;
  String answera400;
  String answerp400;
  String answervg600;
  String answerm600;
  String answera600;
  String answerp600;
  String answervg800;
  String answerm800;
  String answera800;
  String answerp800;
  String answervg1000;
  String answerm1000;
  String answera1000;
  String answerp1000;

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
  
  JButton enterButtonvg200;
  JButton enterButtonm200;
  JButton enterButtona200;
  JButton enterButtonp200;

  JButton enterButtonvg400;
  JButton enterButtonm400;
  JButton enterButtona400;
  JButton enterButtonp400;

  JButton enterButtonvg600;
  JButton enterButtonm600;
  JButton enterButtona600;
  JButton enterButtonp600;

  JButton enterButtonvg800;
  JButton enterButtonm800;
  JButton enterButtona800;
  JButton enterButtonp800;

  JButton enterButtonvg1000;
  JButton enterButtonm1000;
  JButton enterButtona1000;
  JButton enterButtonp1000;

  JButton returnButton;

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
  enterButtonvg200 = new JButton("ENTER ANSWER");
  enterButtonvg200.setBounds(300,250,200,100);
  question200Zero.add(enterButtonvg200);
  enterButtonvg200.setActionCommand("vg200enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question200Zero.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonvg200.addActionListener(this);

  // setting up 200$ Marvel question
  question200One = new JPanel();
  question200One.setLayout(null);
  vg200q = new JLabel("The identity of Iron Man");
  answerboxm200q = new JTextField();
  question200One.add(vg200q);
  vg200q.setBounds(325, 100, 700, 50);
  question200One.add(answerboxm200q);
  answerboxm200q.setBounds(300,400,200,15);
  enterButtonm200 = new JButton("ENTER ANSWER");
  enterButtonm200.setBounds(300,250,200,100);
  question200One.add(enterButtonm200);
  enterButtonm200.setActionCommand("m200enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question200One.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonm200.addActionListener(this);

  // setting up 200$ Animal question
  question200Two = new JPanel();
  question200Two.setLayout(null);
  vg200q = new JLabel("Reptile with a hard shell on its back");
  answerboxa200q = new JTextField();
  question200Two.add(vg200q);
  vg200q.setBounds(275, 100, 700, 50);
  question200Two.add(answerboxa200q);
  answerboxa200q.setBounds(300,400,200,15);
  enterButtona200 = new JButton("ENTER ANSWER");
  enterButtona200.setBounds(300,250,200,100);
  question200Two.add(enterButtona200);
  enterButtona200.setActionCommand("a200enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question200Two.add(returnButton);
  returnButton.addActionListener(this);
  enterButtona200.addActionListener(this);

  // setting up 200$ Pokemon question
  question200Three = new JPanel();
  question200Three.setLayout(null);
  vg200q = new JLabel("Purple pokeball with 100% capture chance");
  answerboxp200q = new JTextField();
  question200Three.add(vg200q);
  vg200q.setBounds(240, 100, 700, 50);
  question200Three.add(answerboxp200q);
  answerboxp200q.setBounds(300,400,200,15);
  enterButtonp200 = new JButton("ENTER ANSWER");
  enterButtonp200.setBounds(300,250,200,100);
  question200Three.add(enterButtonp200);
  enterButtonp200.setActionCommand("p200enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question200Three.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonp200.addActionListener(this);

  // setting up 400$ video game question
  question400Zero = new JPanel();
  question400Zero.setLayout(null);
  vg200q = new JLabel("The first Nintendo console");
  answerboxvg400q = new JTextField();
  question400Zero.add(vg200q);
  vg200q.setBounds(240, 100, 700, 50);
  question400Zero.add(answerboxvg400q);
  answerboxvg400q.setBounds(300,400,200,15);
  enterButtonvg400 = new JButton("ENTER ANSWER");
  enterButtonvg400.setBounds(300,250,200,100);
  question400Zero.add(enterButtonvg400);
  enterButtonvg400.setActionCommand("vg400enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question400Zero.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonvg400.addActionListener(this);

  // setting up 400$ Marvel question
  question400One = new JPanel();
  question400One.setLayout(null);
  vg200q = new JLabel("The original actor of Spider-Man in 2002 Spider-Man");
  answerboxm400q = new JTextField();
  question400One.add(vg200q);
  vg200q.setBounds(180, 100, 700, 50);
  question400One.add(answerboxm400q);
  answerboxm400q.setBounds(300,400,200,15);
  enterButtonm400 = new JButton("ENTER ANSWER");
  enterButtonm400.setBounds(300,250,200,100);
  question400One.add(enterButtonm400);
  enterButtonm400.setActionCommand("m400enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question400One.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonm400.addActionListener(this);

  // setting up 400$ Animal question
  question400Two = new JPanel();
  question400Two.setLayout(null);
  vg200q = new JLabel("White bird sterotypically released at weddings");
  answerboxa400q = new JTextField();
  question400Two.add(vg200q);
  vg200q.setBounds(200, 100, 700, 50);
  question400Two.add(answerboxa400q);
  answerboxa400q.setBounds(300,400,200,15);
  enterButtona400 = new JButton("ENTER ANSWER");
  enterButtona400.setBounds(300,250,200,100);
  question400Two.add(enterButtona400);
  enterButtona400.setActionCommand("a400enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question400Two.add(returnButton);
  returnButton.addActionListener(this);
  enterButtona400.addActionListener(this);

  // setting up 400$ Pokemon question
  question400Three = new JPanel();
  question400Three.setLayout(null);
  vg200q = new JLabel("The country Pokemon originated from");
  answerboxp400q = new JTextField();
  question400Three.add(vg200q);
  vg200q.setBounds(230, 100, 700, 50);
  question400Three.add(answerboxp400q);
  answerboxp400q.setBounds(300,400,200,15);
  enterButtonp400 = new JButton("ENTER ANSWER");
  enterButtonp400.setBounds(300,250,200,100);
  question400Three.add(enterButtonp400);
  enterButtonp400.setActionCommand("p400enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question400Three.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonp400.addActionListener(this);

  // setting up 600$ video game question
  question600Zero = new JPanel();
  question600Zero.setLayout(null);
  vg200q = new JLabel("The 2nd generation of XBOX");
  answerboxvg600q = new JTextField();
  question600Zero.add(vg200q);
  vg200q.setBounds(230, 100, 700, 50);
  question600Zero.add(answerboxvg600q);
  answerboxvg600q.setBounds(300,400,200,15);
  enterButtonvg600 = new JButton("ENTER ANSWER");
  enterButtonvg600.setBounds(300,250,200,100);
  question600Zero.add(enterButtonvg600);
  enterButtonvg600.setActionCommand("vg600enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question600Zero.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonvg600.addActionListener(this);

  // setting up 600$ Marvel question
  question600One = new JPanel();
  question600One.setLayout(null);
  vg200q = new JLabel("Stan Lee's hit catchphrase");
  answerboxm600q = new JTextField();
  question600One.add(vg200q);
  vg200q.setBounds(278, 100, 700, 50);
  question600One.add(answerboxm600q);
  answerboxm600q.setBounds(300,400,200,15);
  enterButtonm600 = new JButton("ENTER ANSWER");
  enterButtonm600.setBounds(300,250,200,100);
  question600One.add(enterButtonm600);
  enterButtonm600.setActionCommand("m600enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question600One.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonm600.addActionListener(this);

  // setting up 600$ animal question
  question600Two = new JPanel();
  question600Two.setLayout(null);
  vg200q = new JLabel("The king of the jungle");
  answerboxa600q = new JTextField();
  question600Two.add(vg200q);
  vg200q.setBounds(280, 100, 700, 50);
  question600Two.add(answerboxa600q);
  answerboxa600q.setBounds(300,400,200,15);
  enterButtona600 = new JButton("ENTER ANSWER");
  enterButtona600.setBounds(300,250,200,100);
  question600Two.add(enterButtona600);
  enterButtona600.setActionCommand("a600enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question600Two.add(returnButton);
  returnButton.addActionListener(this);
  enterButtona600.addActionListener(this);

  // setting up 600$ pokemon question
  question600Three = new JPanel();
  question600Three.setLayout(null);
  vg200q = new JLabel("The large rock snake-like pokemon");
  answerboxp600q = new JTextField();
  question600Three.add(vg200q);
  vg200q.setBounds(270, 100, 700, 50);
  question600Three.add(answerboxp600q);
  answerboxp600q.setBounds(300,400,200,15);
  enterButtonp600 = new JButton("ENTER ANSWER");
  enterButtonp600.setBounds(300,250,200,100);
  question600Three.add(enterButtonp600);
  enterButtonp600.setActionCommand("p600enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question600Three.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonp600.addActionListener(this);

  // setting up 800$ video game question
  question800Zero = new JPanel();
  question800Zero.setLayout(null);
  vg200q = new JLabel("Popular first person shooter created by Valve in 2012");
  answerboxvg800q = new JTextField();
  question800Zero.add(vg200q);
  vg200q.setBounds(210, 100, 700, 50);
  question800Zero.add(answerboxvg800q);
  answerboxvg800q.setBounds(300,400,200,15);
  enterButtonvg800 = new JButton("ENTER ANSWER");
  enterButtonvg800.setBounds(300,250,200,100);
  question800Zero.add(enterButtonvg800);
  enterButtonvg800.setActionCommand("vg800enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question800Zero.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonvg800.addActionListener(this);

  // setting up 800$ Marvel question
  question800One = new JPanel();
  question800One.setLayout(null);
  vg200q = new JLabel("Antagonist of 2004 Spider-Man 2");
  answerboxm800q = new JTextField();
  question800One.add(vg200q);
  vg200q.setBounds(270, 100, 700, 50);
  question800One.add(answerboxm800q);
  answerboxm800q.setBounds(300,400,200,15);
  enterButtonm800 = new JButton("ENTER ANSWER");
  enterButtonm800.setBounds(300,250,200,100);
  question800One.add(enterButtonm800);
  enterButtonm800.setActionCommand("m800enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question800One.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonm800.addActionListener(this);

  // setting up 800$ animal question
  question800Two = new JPanel();
  question800Two.setLayout(null);
  vg200q = new JLabel("Large flightleses bird known for sticking its head underground");
  answerboxa800q = new JTextField();
  question800Two.add(vg200q);
  vg200q.setBounds(240, 100, 700, 50);
  question800Two.add(answerboxa800q);
  answerboxa800q.setBounds(300,400,200,15);
  enterButtona800 = new JButton("ENTER ANSWER");
  enterButtona800.setBounds(300,250,200,100);
  question800Two.add(enterButtona800);
  enterButtona800.setActionCommand("a800enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question800Two.add(returnButton);
  returnButton.addActionListener(this);
  enterButtona800.addActionListener(this);

  // setting up 800$ pokemon question
  question800Three = new JPanel();
  question800Three.setLayout(null);
  vg200q = new JLabel("Final evolution of starter pokemon squirtle");
  answerboxp800q = new JTextField();
  question800Three.add(vg200q);
  vg200q.setBounds(260, 100, 700, 50);
  question800Three.add(answerboxp800q);
  answerboxp800q.setBounds(300,400,200,15);
  enterButtonp800 = new JButton("ENTER ANSWER");
  enterButtonp800.setBounds(300,250,200,100);
  question800Three.add(enterButtonp800);
  enterButtonp800.setActionCommand("p800enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question800Three.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonp800.addActionListener(this);

  // setting up 1000$ video game question
  question1000Zero = new JPanel();
  question1000Zero.setLayout(null);
  vg200q = new JLabel("Nintendo 3d platformer known for glitches");
  answerboxvg1000q = new JTextField();
  question1000Zero.add(vg200q);
  vg200q.setBounds(230, 100, 700, 50);
  question1000Zero.add(answerboxvg1000q);
  answerboxvg1000q.setBounds(300,400,200,15);
  enterButtonvg1000 = new JButton("ENTER ANSWER");
  enterButtonvg1000.setBounds(300,250,200,100);
  question1000Zero.add(enterButtonvg1000);
  enterButtonvg1000.setActionCommand("vg1000enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question1000Zero.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonvg1000.addActionListener(this);

  // setting up 1000$ Marvel question
  question1000One = new JPanel();
  question1000One.setLayout(null);
  vg200q = new JLabel("Duration Captain America was frozen in the arctic for");
  answerboxm1000q = new JTextField();
  question1000One.add(vg200q);
  vg200q.setBounds(270, 100, 700, 50);
  question1000One.add(answerboxm1000q);
  answerboxm1000q.setBounds(300,400,200,15);
  enterButtonm1000 = new JButton("ENTER ANSWER");
  enterButtonm1000.setBounds(300,250,200,100);
  question1000One.add(enterButtonm1000);
  enterButtonm1000.setActionCommand("m1000enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question1000One.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonm1000.addActionListener(this);

  // setting up 1000$ animal question
  question1000Two = new JPanel();
  question1000Two.setLayout(null);
  vg200q = new JLabel("Aquatic animal that inspired the Jaws move series");
  answerboxa1000q = new JTextField();
  question1000Two.add(vg200q);
  vg200q.setBounds(260, 100, 700, 50);
  question1000Two.add(answerboxa1000q);
  answerboxa1000q.setBounds(300,400,200,15);
  enterButtona1000 = new JButton("ENTER ANSWER");
  enterButtona1000.setBounds(300,250,200,100);
  question1000Two.add(enterButtona1000);
  enterButtona1000.setActionCommand("a1000enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question1000Two.add(returnButton);
  returnButton.addActionListener(this);
  enterButtona1000.addActionListener(this);

  // setting up 1000$ pokemon question
  question1000Three = new JPanel();
  question1000Three.setLayout(null);
  vg200q = new JLabel("The 2nd generation fire starter pokemon");
  answerboxp1000q = new JTextField();
  question1000Three.add(vg200q);
  vg200q.setBounds(260, 100, 700, 50);
  question1000Three.add(answerboxp1000q);
  answerboxp1000q.setBounds(300,400,200,15);
  enterButtonp1000 = new JButton("ENTER ANSWER");
  enterButtonp1000.setBounds(300,250,200,100);
  question1000Three.add(enterButtonp1000);
  enterButtonp1000.setActionCommand("p1000enter");
  returnButton = new JButton("RETURN TO BOARD");
  returnButton.setBounds(10,450,200,100);
  returnButton.setActionCommand("return");
  question1000Three.add(returnButton);
  returnButton.addActionListener(this);
  enterButtonp1000.addActionListener(this);

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
  // if statements, if a button on questionboard is pressed it will take you to its question frame
  if(command.equals("200" + "0")){
    screens.show(mainPanel, "videoGame200Zero");
    pointValue200[0].setEnabled(false);
  }
  if(command.equals("200" + "1")){
    screens.show(mainPanel, "marvel200Zero");
    pointValue200[1].setEnabled(false);
  }
  if(command.equals("200" + "2")){
    screens.show(mainPanel, "animal200Zero");
    pointValue200[2].setEnabled(false);
  }
  if(command.equals("200" + "3")){
    screens.show(mainPanel, "pokemon200Zero");
    pointValue200[3].setEnabled(false);
  }
  if(command.equals("400" + "0")){
    screens.show(mainPanel, "videoGame400Zero");
    pointValue400[0].setEnabled(false);
  }
  if(command.equals("400" + "1")){
    screens.show(mainPanel, "marvel400Zero");
    pointValue400[1].setEnabled(false);
  }
  if(command.equals("400" + "2")){
    screens.show(mainPanel, "animal400Zero");
    pointValue400[2].setEnabled(false);
  }
  if(command.equals("400" + "3")){
    screens.show(mainPanel, "pokemon400Zero");
    pointValue400[3].setEnabled(false);
  }
  if(command.equals("600" + "0")){
    screens.show(mainPanel, "videoGame600Zero");
    pointValue600[0].setEnabled(false);
  }
  if(command.equals("600" + "1")){
    screens.show(mainPanel, "marvel600Zero");
    pointValue600[1].setEnabled(false);
  }
  if(command.equals("600" + "2")){
    screens.show(mainPanel, "animal600Zero");
    pointValue600[2].setEnabled(false);
  }
  if(command.equals("600" + "3")){
    screens.show(mainPanel, "pokemon600Zero");
    pointValue600[3].setEnabled(false);
  }
  if(command.equals("800" + "0")){
    screens.show(mainPanel, "videoGame800Zero");
    pointValue800[0].setEnabled(false);
  }
  if(command.equals("800" + "1")){
    screens.show(mainPanel, "marvel800Zero");
    pointValue800[1].setEnabled(false);
  }
  if(command.equals("800" + "2")){
    screens.show(mainPanel, "animal800Zero");
    pointValue800[2].setEnabled(false);
  }
  if(command.equals("800" + "3")){
    screens.show(mainPanel, "pokemon800Zero");
    pointValue800[3].setEnabled(false);
  }
  if(command.equals("1000" + "0")){
    screens.show(mainPanel, "videoGame1000Zero");
    pointValue1000[0].setEnabled(false);
  }
  if(command.equals("1000" + "1")){
    screens.show(mainPanel, "marvel1000Zero");
    pointValue1000[1].setEnabled(false);
  }
  if(command.equals("1000" + "2")){
    screens.show(mainPanel, "animal1000Zero");
    pointValue1000[2].setEnabled(false);
  }
  if(command.equals("1000" + "3")){
    screens.show(mainPanel, "pokemon1000Zero");
    pointValue1000[3].setEnabled(false);
  }
  if(command.equals("return")){
    screens.show(mainPanel, "questionBoard");
  }
  // reads the textfield when enter button is pressed and puts the text into string variable
  if(command.equals("vg200enter")){
    screens.show(mainPanel, "questionBoard");
    String answervg200 = answerboxvg200q.getText();
    if(answervg200 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("m200enter")){
    screens.show(mainPanel, "questionBoard");
    String answerm200 = answerboxm200q.getText();
    if(answerm200 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("a200enter")){
    screens.show(mainPanel, "questionBoard");
    String answera200 = answerboxa200q.getText();
    if(answera200 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("p200enter")){
    screens.show(mainPanel, "questionBoard");
    String answerp200 = answerboxp200q.getText();
    if(answerp200 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("vg400enter")){
    screens.show(mainPanel, "questionBoard");
    String answervg400 = answerboxvg400q.getText();
    if(answervg400 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("m400enter")){
    screens.show(mainPanel, "questionBoard");
    String answerm400 = answerboxm400q.getText();
    if(answerm400 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("a400enter")){
    screens.show(mainPanel, "questionBoard");
    String answera400 = answerboxa400q.getText();
    if(answera400 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("p400enter")){
    screens.show(mainPanel, "questionBoard");
    String answerp400 = answerboxp400q.getText();
    if(answerp400 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("vg600enter")){
    screens.show(mainPanel, "questionBoard");
    String answervg600 = answerboxvg600q.getText();
    if(answervg600 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("m600enter")){
    screens.show(mainPanel, "questionBoard");
    String answerm600 = answerboxm600q.getText();
    if(answerm600 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("a600enter")){
    screens.show(mainPanel, "questionBoard");
    String answera600 = answerboxa600q.getText();
    if(answera600 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("p600enter")){
    screens.show(mainPanel, "questionBoard");
    String answerp600 = answerboxp600q.getText();
    if(answerp600 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("vg800enter")){
    screens.show(mainPanel, "questionBoard");
    String answervg800 = answerboxvg800q.getText();
    if(answervg800 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("m800enter")){
    screens.show(mainPanel, "questionBoard");
    String answerm800 = answerboxm800q.getText();
    if(answerm800 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("a800enter")){
    screens.show(mainPanel, "questionBoard");
    String answera800 = answerboxa800q.getText();
    if(answera800 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("p800enter")){
    screens.show(mainPanel, "questionBoard");
    String answerp800 = answerboxp800q.getText();
    if(answerp800 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("vg1000enter")){
    screens.show(mainPanel, "questionBoard");
    String answervg1000 = answerboxvg1000q.getText();
    if(answervg1000 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("m1000enter")){
    screens.show(mainPanel, "questionBoard");
    String answerm1000 = answerboxm1000q.getText();
    if(answerm1000 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("a1000enter")){
    screens.show(mainPanel, "questionBoard");
    String answerm1000 = answerboxm1000q.getText();
    if(answerm1000 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
  }
  if(command.equals("p1000enter")){
    screens.show(mainPanel, "questionBoard");
    String answerp1000 = answerboxp1000q.getText();
    if(answerp1000 == ("Whatispong")){
      score = score + 200;
      System.out.println("Score: $" + score);
    }
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
