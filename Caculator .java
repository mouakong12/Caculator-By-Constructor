import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Caculator extends JFrame{
    private JTextField numberxField;
    private JTextField numberyField;
    private JTextField resultField;
    private JButton caculateButton;
    private JButton clearButton;
    private JButton closeButton;
    private JButton sumButton;
    private JButton subtractionButton;
    private JButton multiplicationButton;
    private JButton divisionButton;
    char operator;
    double num1=0,num2=0,result=0;
        
    public Caculator(){
        super("Caculator");
        setBounds(0,0,1000,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        JLabel numberxLabel = new JLabel();
        numberxLabel.setFont(new Font("Courier",Font.BOLD,20));
        numberxLabel.setText("NumberX : ");
        numberxField = new JTextField(10);
        panel.add(numberxLabel);
        panel.add(numberxField);

        JLabel numberyLabel = new JLabel();
        numberyLabel.setFont(new Font("Courier",Font.BOLD,20));
        numberyLabel.setText("NumberY : ");
        numberyField = new JTextField(10);
        panel.add(numberyLabel);
        panel.add(numberyField);

        JLabel resultLabel = new JLabel();
        resultLabel.setFont(new Font("Courier",Font.BOLD,20));
        resultLabel.setText("Result = ");
        resultField = new JTextField(10);
        panel.add(resultLabel);
        panel.add(resultField);
        resultField.setEditable(false);
        add(panel,BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        caculateButton = new JButton("=");
        clearButton = new JButton("Clear");
        closeButton = new JButton("Close");
        sumButton = new JButton("+");
        subtractionButton = new JButton("-");
        multiplicationButton = new JButton("*");
        divisionButton = new JButton("/");
        buttonPanel.add(caculateButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(closeButton);
        buttonPanel.add(sumButton);
        buttonPanel.add(subtractionButton);
        buttonPanel.add(multiplicationButton);
        buttonPanel.add(divisionButton);
        add(buttonPanel,BorderLayout.SOUTH);
        caculateButton.addActionListener(new ButtonListener());
        clearButton.addActionListener(new ButtonListener());
        closeButton.addActionListener(new ButtonListener());
        sumButton.addActionListener(new ButtonListener());
        subtractionButton.addActionListener(new ButtonListener());
        multiplicationButton.addActionListener(new ButtonListener());
        divisionButton.addActionListener(new ButtonListener());
        setVisible(true);
        }
        private class ButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                if(e.getSource() ==sumButton){
                     num1 = Double.parseDouble(numberxField.getText());
                     num2 = Double.parseDouble(numberyField.getText());
                     operator='+';
                    }
                    if(e.getSource() ==subtractionButton){
                        num1 = Double.parseDouble(numberxField.getText());
                        num2 = Double.parseDouble(numberyField.getText());
                        operator ='-';
                       }
                       if(e.getSource() ==multiplicationButton){
                        num1 = Double.parseDouble(numberxField.getText());
                        num2 = Double.parseDouble(numberyField.getText());
                        operator='*';
                       }
                       if(e.getSource() ==divisionButton){
                        num1 = Double.parseDouble(numberxField.getText());
                        num2 = Double.parseDouble(numberyField.getText());
                        operator='/';
                       }
                       if(e.getSource() == caculateButton){
                           switch(operator){
                               case '+':
                                    result = num1+num2;
                                    break;
                               case '-':
                                    result = num1-num2;
                                    break;
                               case '*':
                                    result = num1*num2;
                                    break;
                               case '/':
                                    result = num1/num2;
                                    break;
                           }
                           resultField.setText(Double.toString(result));
                       }
                if (e.getSource()== clearButton){
                    numberxField.setText("");
                    numberyField.setText("");
                    resultField.setText("");
                }
                else if (e.getSource()== closeButton){
                    System.exit(0);
                }
            }
        }
        
    }
    
    

