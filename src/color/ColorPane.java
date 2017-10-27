//import sun.security.provider.JavaKeyStore;
package color;
/**
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame implements ActionListener{
    private JButton buttons[];
     String names[] = {"blue","cyan","green","magenta","orange","pink","red","white","yellow"};

     Container container;
    private GridLayout grid1;
    public Main(){
        super("ColorPane");
        grid1 = new GridLayout(3,3);
        container = getContentPane();
        container.setLayout(grid1);
        //setLayout(new FlowLayout());
        buttons = new JButton[names.length];
        for (int i = 0; i <names.length ; ++i) {
            buttons[i] = new JButton(names[i]);
            buttons[i].addActionListener(this);
            //container  = getContentPane();
            container.add(buttons[i]);
            //buttons[i].setBackground(Color.getColor(String.valueOf(names[i])));
        }
        setBounds(200,200,300,150);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        String temp = e.getActionCommand();
        if(e.getSource() == buttons[0]) {
            buttons[0].setBackground(Color.blue);
        }
        if(e.getSource() == buttons[1]) {
            buttons[1].setBackground(Color.cyan);
        }
        if(e.getSource() == buttons[2]) {
            buttons[2].setBackground(Color.green);
        }
        if(e.getSource() == buttons[3]) {
            buttons[3].setBackground(Color.magenta);
        }
        if(e.getSource() == buttons[4]) {
            buttons[4].setBackground(Color.orange);
        }
        if(e.getSource() == buttons[5]) {
            buttons[5].setBackground(Color.pink);
        }
        if(e.getSource() == buttons[6]) {
            buttons[6].setBackground(Color.red);
        }
        if(e.getSource() == buttons[7]) {
            buttons[7].setBackground(Color.white);
        }
        if(e.getSource() == buttons[8]) {
            buttons[8].setBackground(Color.yellow);
        }


    }

    public static void main(String[] args){
        Main m = new Main();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
**/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorPane extends JFrame implements ActionListener{
    private JButton buttons[];
    private String names[]={"blue","cyan","green","magenta","orange","pink","red","white","yellow"};
    private GridLayout grid;
    private Container container;
    public ColorPane(){
        super("ColorPane");
        grid=new GridLayout(3,3,1,1);
        container=getContentPane();
        container.setLayout(grid);
        buttons=new JButton[names.length];
        for(int count=0;count<names.length;count++){
            buttons[count]=new JButton(names[count]);
            buttons[count].addActionListener(this);
            container.add(buttons[count]);
        }
        setSize(300,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        //String temp =e.getActionCommand();
        if(e.getSource()==buttons[0]){
            buttons[0].setBackground(Color.blue);
        }
        if(e.getSource()==buttons[1]){
            buttons[1].setBackground(Color.cyan);
        }
        if(e.getSource()==buttons[2]){
            buttons[2].setBackground(Color.green);
        }
        if(e.getSource()==buttons[3]){
            buttons[3].setBackground(Color.magenta);
        }
        if(e.getSource()==buttons[4]){
            buttons[4].setBackground(Color.orange);
        }
        if(e.getSource()==buttons[5]){
            buttons[5].setBackground(Color.pink);
        }
        if(e.getSource()==buttons[6]){
            buttons[6].setBackground(Color.red);
        }
        if(e.getSource()==buttons[7]){
            buttons[7].setBackground(Color.white);
        }
        if(e.getSource()==buttons[8]){
            buttons[8].setBackground(Color.yellow);
        }
    }
    public static void main(String args[]){
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        ColorPane application=new ColorPane();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}