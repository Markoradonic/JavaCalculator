package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
  
 
 
public class Calculator implements ActionListener{
     
    JFrame frame = new JFrame();
    JPanel panel = new JPanel( );
    JTextArea txt = new JTextArea(2, 9);
 
    JButton button1= new JButton();
    JButton button2= new JButton();
    JButton button3= new JButton();
    JButton button4= new JButton();
    JButton button5= new JButton();
    JButton button6= new JButton();
    JButton button7= new JButton();
    JButton button8= new JButton();
    JButton buttondot= new JButton();
    JButton button9= new JButton();
    JButton button0= new JButton();
    JButton buttonmin= new JButton();
    JButton buttonmul= new JButton();
    JButton buttonpw= new JButton();
    JButton buttondiv = new JButton();
    JButton buttonadd= new JButton();
    JButton buttonequal= new JButton();
    JButton buttonclear= new JButton();
 
    Double number1,number2,result;
    int addc=0,multic=0, divc=0,subc=0, pw=0;
      
 
    public Calculator(){
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
         frame.setSize(340,420);
         frame.setTitle("Calculator");
         frame.setResizable(false);
          
             
        frame.add(panel);
        panel.setBackground(Color.DARK_GRAY);
        Border border = BorderFactory.createLineBorder(Color.RED, 5);
        panel.setBorder(border);
         
  
         panel.add(txt);
         Font font = new Font("Verdana", Font.BOLD,33 );
         txt.setFont(font);
         Border D = BorderFactory.createLineBorder(Color.BLUE, 5);
         txt.setBorder(D);
         txt.setForeground(Color.WHITE);
         txt.setBackground(Color.BLACK);
         txt.setLineWrap(true);
         txt.setWrapStyleWord(true);
         txt.setPreferredSize(new Dimension(2,10));
          
         button1.setPreferredSize(new Dimension(80,43));
         button1.setText("1");
        
         button2.setPreferredSize(new Dimension(80,43));
         button2.setText("2");
   
 
         button3.setPreferredSize(new Dimension(80,43));
         button3.setText("3");
          
         button4.setPreferredSize(new Dimension(80,43));
         button4.setText("4");
         
         button5.setPreferredSize(new Dimension(80,43));
         button5.setText("5");
          
         button6.setPreferredSize(new Dimension(80,43));
         button6.setText("6");
         
         button7.setPreferredSize(new Dimension(80,43));
         button7.setText("7");
          
         button8.setPreferredSize(new Dimension(80,43));
         button8.setText("8");
           
         button9.setPreferredSize(new Dimension(80,43));
         button9.setText("9");;
           
         button0.setPreferredSize(new Dimension(80,43));
         button0.setText("0");
           
         buttondot.setPreferredSize(new Dimension(80 ,43));
         buttondot.setText(".");
          
         buttonmin.setPreferredSize(new Dimension( 80,43));
         buttonmin.setText("-");
           
         buttonmul.setPreferredSize(new Dimension(80 ,43));
         buttonmul.setText("x");
           
         buttondiv.setPreferredSize(new Dimension(80 ,43));
         buttondiv.setText("/");
           
         buttonadd.setPreferredSize(new Dimension(80 ,43));
         buttonadd.setText("+");
          
         buttonequal.setPreferredSize(new Dimension(100 ,25));
         buttonequal.setText("=");
           
         buttonclear.setPreferredSize(new Dimension(100 ,25));
         buttonclear.setText("C");
           
         panel.add(button1);
         panel.add(button2);
         panel.add(button2);
         panel.add(button3);
         panel.add(button4);
         panel.add(button5);
         panel.add(button6);
         panel.add(button7);
         panel.add(button8);
         panel.add(button9);
         panel.add(button0);
         panel.add(buttondot);
         panel.add(buttonmin);
         panel.add( buttonmul);
         panel.add(buttondiv);  
         panel.add(buttonadd);
         panel.add(buttonequal);
         panel.add(buttonclear);
          
      
         // da bi program mogao da odreaguje na klik dugmeta mi za svako
         // dugme moramo da dodamo action listener
         button1.addActionListener(this);
         button2.addActionListener(this);
         button3.addActionListener(this);
         button4.addActionListener(this);
         button5.addActionListener(this);
         button6.addActionListener(this);
         button7.addActionListener(this);
         button8.addActionListener(this);
         button9.addActionListener(this);
         button0.addActionListener(this);
         buttondot.addActionListener(this);
         buttonadd.addActionListener(this);
         buttonmin.addActionListener(this);
         buttonmul.addActionListener(this);
         buttondiv.addActionListener(this);
         buttonequal.addActionListener(this);
         buttonclear.addActionListener(this);
    } 
 
      
      // funkcija koja se izvrsava svaki put kada se nesto klikne
    public void actionPerformed(ActionEvent e) {
          
    	// Object source ce biti objekat koji u sebi ima informaciju koje dugme je stisnuto
    	// pomocu funkcije getSource mi cemo tacno dobiti klinkuti objekat oli ti kliknuto dugme
        Object source = e.getSource();
         
        
        // Svaki od ovih ifova je provera kako bi smo saznali sto je kliknnuto
        // U zavisnosti sta je kliknuto radimo odredjenu akcju.
        if(source== buttonclear){
               number1 = 0.0;
               number2 = 0.0;
               txt.setText("");
        }              
      
        if(source == button1){
            txt.append("1");   
        }
        
        if(source == button2){
            txt.append("2");
             
             
        }       
        
        if(source == button3){
            txt.append("3");
                     
        }
        if(source == button4){
            txt.append("4");
                        
        }
        if(source == button5){
            txt.append("5");
                         
        }
        if(source == button6){
            txt.append("6");            
        }
        
        if(source == button7){
            txt.append("7");    
        }
        
        if(source == button8){
            txt.append("8"); 
        }
        
        if(source == button9){
            txt.append("9");
        }
        
        if(source == button0){
            txt.append("0");     
        }
        
        if(source == buttondot){
            txt.append(".");
        }
        
        if(source == buttonadd){
            number1 =number_reader();
            txt.setText("");
            addc = 1;
            multic =0;
            divc = 0;
            subc =0 ;
        }
        
        if(source == buttonmin){
            number1 =number_reader();
            txt.setText("");
            addc = 0;
            multic =0;
            divc = 0;
            subc =1;
         }
         
        if(source == buttondiv){
            number1 =number_reader();
            txt.setText("");
            addc = 0;
            multic =0;
            divc = 1;
            subc =0 ;
         }
         
        if(source == buttonmul){
            number1 =number_reader();
            txt.setText("");
            addc = 0;
            multic =1;
            divc = 0;
            subc =0 ;
         }
        
        if(source == buttonpw){
            number1 =number_reader();
            txt.setText("");
            addc = 0;
            multic =1;
            divc = 0;
            subc =0 ;
         }
        
        if(source == buttonequal){
            number2= number_reader();
            if(addc > 0){
              result = number1 + number2;
              txt.setText(Double.toString(result));
           
         }
            if(subc>0){
                  result = number1 - number2;
                  txt.setText(Double.toString(result));
                   
          }
            if(multic>0){
                  result = number1 * number2;
                  txt.setText(Double.toString(result));       
          }
            if(divc>0){
                  result = number1 / number2;
                  txt.setText(Double.toString(result));
                   
          }
   
       } 
    } 

	
	public double number_reader(){
	            Double num1;
	            String s;
	            s = txt.getText();
	            num1= Double.valueOf(s);
	            return num1;
	}
}