
package CodeTechITSolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Math.sqrt;

public class Calculator_AP implements ActionListener
{
    JFrame frame;
    JTextField tf;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bDEL,b0,bSQR,bROOT,bCLEAR,bEQUALS,bDOT,bDIV,bMUL,bADD,bSUB,bSIN,bCOS,bTAN,bLOG;
    double num1 = 0;
    double num2 = 0;
    double result = 0;
    char operator;
    double a;

    Calculator_AP()
    {  
        frame = new JFrame();

        tf = new JTextField();
        tf.setBounds(55, 45, 440, 40);
        tf.setFont(new Font ("Aerial",Font.BOLD,20));
        tf.setEditable(false);

        Container container = frame.getContentPane();
        bDEL =new JButton("DEL");
        b7 =new JButton("7");
        b4 =new JButton("4");
        b1 =new JButton("1");
        b0 =new JButton("0");

        bSQR = new JButton("\u0058\u00B2");
        b8 =new JButton("8");
        b5 =new JButton("5");
        b2 =new JButton("2");
        bROOT = new JButton("\u221A");

        bEQUALS = new JButton("=");
        b9 =new JButton("9");
        b6 =new JButton("6");
        b3 =new JButton("3");
        bDOT = new JButton(".");
             
       bCLEAR = new JButton("CLEAR");
       bDIV =new JButton("/");
       bMUL =new JButton("X");
       bADD =new JButton("+");
       bSUB =new JButton("-");

        bSIN =new JButton("SIN");
        bCOS =new JButton("COS");
        bTAN =new JButton("TAN");
        bLOG = new JButton("LOG");  

        bDEL.setBounds(55, 130, 70, 50);
        b7.setBounds(55, 200, 70, 50);
        b4.setBounds(55, 270, 70, 50);
        b1.setBounds(55, 340, 70, 50);
        b0.setBounds(55, 410, 70, 50);

        bSQR.setBounds(140, 130, 70, 50);
        b8.setBounds(140, 200, 70, 50);
        b5.setBounds(140, 270, 70, 50);
        b2.setBounds(140, 340, 70, 50);
        bROOT.setBounds(140, 410, 70, 50);

        bEQUALS.setBounds(235, 130, 70, 50);
        b9.setBounds(235, 200, 70, 50);
        b6.setBounds(235, 270, 70, 50);
        b3.setBounds(235, 340, 70, 50);
        bDOT.setBounds(235, 410, 70, 50);

        bCLEAR.setBounds(330, 130, 165, 50);
        bDIV.setBounds(330, 200, 70, 50);
        bMUL.setBounds(330, 270, 70, 50);
        bADD.setBounds(330, 340, 70, 50);
        bSUB.setBounds(330, 410, 70, 50);

        bSIN.setBounds(425, 200, 70, 50);
        bCOS.setBounds(425, 270, 70, 50);
        bTAN.setBounds(425, 340, 70, 50);
        bLOG.setBounds(425, 410, 70, 50);

        frame.add(bDEL);
        frame.add(b7);
        frame.add(b4);
        frame.add(b1);
        frame.add(b0);

        frame.add(bSQR);
        frame.add(b8);
        frame.add(b5);
        frame.add(b2);
        frame.add(bROOT);

        frame.add(bEQUALS);
        bEQUALS.setFont(new Font ("Aerial",Font.BOLD,20));
        frame.add(b9);
        frame.add(b6);
        frame.add(b3);
        frame.add(bDOT);
        bDOT.setFont(new Font ("Aerial",Font.BOLD,30));

        frame.add(bCLEAR);
        frame.add(bDIV);
        bDIV.setFont(new Font ("Aerial",Font.BOLD,20));
        frame.add(bMUL);
        bMUL.setFont(new Font ("Aerial",Font.BOLD,20));
        frame.add(bADD);
        bADD.setFont(new Font ("Aerial",Font.BOLD,20));
        frame.add(bSUB);
        bSUB.setFont(new Font ("Aerial",Font.BOLD,20));

        frame.add(bSIN);
        frame.add(bCOS);
        frame.add(bTAN);
        frame.add(bMUL);
        frame.add(bLOG);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bDOT.addActionListener(this);
        bEQUALS.addActionListener(this);
        bADD.addActionListener(this);
        bMUL.addActionListener(this);
        bDIV.addActionListener(this);
        bSUB.addActionListener(this);
        bDEL.addActionListener(this);
        bCLEAR.addActionListener(this);
        bSQR.addActionListener(this);
        bROOT.addActionListener(this);
        bSIN.addActionListener(this);
        bCOS.addActionListener(this);
        bTAN.addActionListener(this);
        bLOG.addActionListener(this);

        b0.setFocusable(false);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);
        b6.setFocusable(false);
        b7.setFocusable(false);
        b8.setFocusable(false);
        b9.setFocusable(false);
        bDOT.setFocusable(false);
        bEQUALS.setFocusable(false);
        bADD.setFocusable(false);
        bMUL.setFocusable(false);
        bDIV.setFocusable(false);
        bSUB.setFocusable(false);
        bDEL.setFocusable(false);
        bCLEAR.setFocusable(false);
        bSQR.setFocusable(false);
        bROOT.setFocusable(false);
        bSIN.setFocusable(false);
        bCOS.setFocusable(false);
        bTAN.setFocusable(false);
        bLOG.setFocusable(false);

        container.setBackground(Color.darkGray);
        frame.add(tf);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String args[])
    {
         new Calculator_AP();
    }

    public void actionPerformed(ActionEvent ex)
    {
            if(ex.getSource() == b1)
            {
               tf.setText(b1.getText());
            }
            else if(ex.getSource() == b2)
            {
                  tf.setText(b2.getText());
                  
            }
              else if(ex.getSource() == b3)
            {
                  tf.setText(b3.getText());
            }
              else if(ex.getSource() == b4)
            {
                  tf.setText(b4.getText());
            }
             else if(ex.getSource() == b5)
            {
                  tf.setText(b5.getText());
            }
              else if(ex.getSource() == b6)
            {
                 tf.setText(b6.getText());
            }
              else if(ex.getSource() == b7)
            {
                 tf.setText(b7.getText());
            }
             else if(ex.getSource() == b8)
            {
                  tf.setText(b8.getText());
            }
              else if(ex.getSource() == b9)
            {
                  tf.setText(b9.getText());
            }
               else if(ex.getSource() == b0)
            {
                  tf.setText(b0.getText());
            }
            if(ex.getSource() == bDOT)
            {
                 tf.setText(bDOT.getText());
            }



            if(ex.getSource() == bADD)
            {
               num1 = Double.parseDouble(tf.getText());
               operator = '+';
               tf.setText("");
            }
            if(ex.getSource() == bSUB)
            {
               num1 = Double.parseDouble(tf.getText());
               operator = '-';
               tf.setText("");
            }
             if(ex.getSource() == bMUL)
            {
               num1 = Double.parseDouble(tf.getText());
               operator = '*';
               tf.setText("");
            }
            if(ex.getSource() == bDIV)
            {
               num1 = Double.parseDouble(tf.getText());
               operator = '/';
               tf.setText("");
            }
             if(ex.getSource() == bEQUALS)
            {
               num2 = Double.parseDouble(tf.getText());
               switch(operator)
               {
                    case '+':
                        result=num1+num2;
                        break;
                    case '-':
                        result=num1-num2;
                        break;
                     case '*':
                        result=num1*num2;
                        break;
                    case '/':
                        result=num1/num2;
                        break;
               }
               tf.setText(String.valueOf(result));
               num1=result;
            }
            if(ex.getSource()==bCLEAR)
            {
                 num1 = Double.parseDouble(tf.getText());
                tf.setText("");
            }
            if(ex.getSource()==bDEL)
            {
                String string = tf.getText();
                tf.setText("");
                for(int i=0;i<string.length()-1;i++)
                {
                
                    tf.setText(tf.getText()+string.charAt(i));
                }

            }
            if(ex.getSource()==bSQR)
            {
                
                 num1 = Double.parseDouble(tf.getText());
                 a = num1*num1;
                 tf.setText(""+ a);
               
            }
             if(ex.getSource()==bROOT)
            {
                
                 num1 = Double.parseDouble(tf.getText());
                 a = Math.sqrt(num1);
                 tf.setText(""+ a);
               
            }
             if(ex.getSource()==bSIN)
            {
                 num1 = Double.parseDouble(tf.getText());
                 a = Math.sin(num1);
                 tf.setText(""+a);
            }
            if(ex.getSource()==bCOS)
            {
                 num1 = Double.parseDouble(tf.getText());
                 a = Math.cos(num1);
                 tf.setText(""+a);
            }
            if(ex.getSource()==bTAN)
            {
                 num1 = Double.parseDouble(tf.getText());
                 a = Math.tan(num1);
                 tf.setText(""+a);
            }
            if(ex.getSource()==bLOG)
            {
                 num1 = Double.parseDouble(tf.getText());
                 a = Math.log(num1);
                 tf.setText(""+a);
            }
            
    }  
}