import javax.swing.*;
import java.awt.*;

/**
 * Created by h on 24/01/2017.
 */
public class Main {

    public static void main(String[] args) {
        JTextArea Txt1,Txt2,Txt3,Txt4,Txt5, RLText,DSText,ErrorText,CText,RoomNoText;
        JButton DoorLock,Database,Clear,unLock,Lock,DataSearch,CleanerLock,RoomNo,UpdateChange;
        JTabbedPane tabbedPane=new JTabbedPane();
        JTabbedPane tabbedPane1=new JTabbedPane();
        JLabel label,labelR,labelC;
        String number;

        JFrame frame = new JFrame("Hotel Server");
        frame.setSize(1372,738);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel tabPane1=new JPanel();
        tabPane1.setLayout(new BorderLayout());
        JPanel tabPane2 =new JPanel();


        JPanel westPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        JPanel northPanel = new JPanel();

        frame.getContentPane().add(northPanel, "North");
        frame.getContentPane().add(westPanel, "West");
        frame.getContentPane().add(eastPanel, "Center");
        // eastPanel.setSize(800,100);
        eastPanel.setLayout(new FlowLayout());
        eastPanel.setBackground(Color.decode("#90989E"));
        westPanel.setSize(800,100);
        westPanel.setLayout(new GridLayout(10,1));
        JLabel Header =new JLabel("Automated Hotel\n");
        Clear = new JButton("Clear");
        Database = new JButton("Database");
        DoorLock = new JButton("Lock/Unlock Room");
        RoomNo = new JButton("Room No.");
        //JButton Search = new JButton("Search");



        westPanel.add(Clear);
        westPanel.add(Database);
        westPanel.add(DoorLock);
        westPanel.add(RoomNo);
        westPanel.setBackground(Color.decode("#90989E"));
        Header.setFont(new Font("Calibri", Font.ITALIC, 32));
        northPanel.add(Header);
        northPanel.setBackground(Color.red);

        //upperPanel.add(Search);
        Txt1 = new JTextArea(38, 28);
        Txt1.setEditable(false);
        Txt1.setLineWrap(true);
        Txt1.setWrapStyleWord(true);
        Txt1.append("Status:\t\tDate:              Time:\n\n");
        eastPanel.add(new JScrollPane(Txt1));
        Txt5 = new JTextArea(38, 28);
        Txt5.setEditable(false);
        Txt5.setLineWrap(true);
        Txt5.setWrapStyleWord(true);
        Txt5.append("Room Config:\n\n");
        eastPanel.add(new JScrollPane(Txt5));

        Txt2 = new JTextArea(38, 28);
        Txt2.setEditable(false);
        Txt2.setLineWrap(true);
        Txt2.setWrapStyleWord(true);
        Txt2.append("Connections:\n\n");
        eastPanel.add(new JScrollPane(Txt2));

        tabPane1.add(westPanel,BorderLayout.LINE_START);
        tabPane1.add(eastPanel,BorderLayout.CENTER);

        tabbedPane.addTab("Tab1",tabPane1);
        tabbedPane.addTab("Tab2",tabPane2);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }

}
