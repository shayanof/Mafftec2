package programPack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Person {
    int i;
    public String[] personInfo= new String[]{};
    JTextField sirname =new JTextField();
    JTextField famlyname =new JTextField();
    JTextField phonenumber =new JTextField();
    JTextField emailfield =new JTextField();
    ButtonGroup bg=new ButtonGroup();
    public String name;
    public String efternamn;
    public String telefon;
    public String email;
    public String behorighet;

    public Person(){
        name=sirname.getText();
        efternamn=famlyname.getText();
        telefon=phonenumber.getText();
        email=emailfield.getText();
        name=sirname.getText();


        JFrame addPersonFrame = new JFrame("Add ny person");
        addPersonFrame.setSize(500,500);
        addPersonFrame.setLayout(null);
        addPersonFrame.setResizable(false);
        addPersonFrame.setVisible(true);


        JLabel l1 = new JLabel("Namn");
        l1.setBounds(20,10,100,30);
        JLabel l2 =new JLabel(" Efternamn");
        l2.setBounds(250,10,100,30);
        JLabel l3 = new JLabel("Telefon");
        l3.setBounds(20,80,200,30);
        JLabel l4 = new JLabel("Email");
        l4.setBounds(250,80,200,30);
        JLabel l5 = new JLabel("Behörighet");
        l5.setBounds(20,170,200,30);

        sirname.setBounds(20,40,200,30);
        famlyname.setBounds(250,40,200,30);
        phonenumber.setBounds(20,110,200,30);
        emailfield.setBounds(250,110,200,30);

        JRadioButton r1= new JRadioButton("B");
        r1.setActionCommand("B");
        r1.setBounds(10,200,50,30);
        JRadioButton r2= new JRadioButton("BE");
        r2.setActionCommand("BE");
        r2.setBounds(60,200,50,30);
        JRadioButton r3= new JRadioButton("C");
        r3.setActionCommand("C");
        r3.setBounds(110,200,50,30);
        JRadioButton r4= new JRadioButton("CE");
        r4.setActionCommand("CE");
        r4.setBounds(160,200,50,30);
        JRadioButton r5= new JRadioButton("D");
        r5.setActionCommand("D");
        r5.setBounds(210,200,50,30);
        JRadioButton r6= new JRadioButton("DE");
        r6.setActionCommand("DE");
        r6.setBounds(260,200,50,30);
        JRadioButton r7= new JRadioButton("C+D");
        r7.setActionCommand("C+D");
        r7.setBounds(340,200,50,30);
        JRadioButton r8= new JRadioButton("CE+DE");
        r8.setActionCommand("CE+DE");
        r8.setBounds(390,200,70,30);

        bg.add(r1);bg.add(r2); bg.add(r3);bg.add(r4); bg.add(r5);bg.add(r6);bg.add(r7);bg.add(r8);

        JButton spara= new JButton("Spara");
        spara.setBounds(100,400,100,30);

        JButton avbryt=new JButton("Avbryt");
        avbryt.setBounds(250,400,100,30);
        addPersonFrame.add(l1);
        addPersonFrame.add(l2);
        addPersonFrame.add(l3);
        addPersonFrame.add(l4);
        addPersonFrame.add(l5);

        addPersonFrame.add(sirname);
        addPersonFrame.add(famlyname);
        addPersonFrame.add(phonenumber);
        addPersonFrame.add(emailfield);
        addPersonFrame.add(r1);
        addPersonFrame.add(r2);
        addPersonFrame.add(r3);
        addPersonFrame.add(r4);
        addPersonFrame.add(r5);
        addPersonFrame.add(r6);
        addPersonFrame.add(r7);
        addPersonFrame.add(r8);
        addPersonFrame.add(spara);
        addPersonFrame.add(avbryt);
        addPersonFrame.setVisible(true);

        spara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                FirstFrame gg=new FirstFrame();
                gg.chaforrNames[gg.intJcomboBoxNameCounter]=sirname.getText();
                System.out.println(gg.chaforrNames[gg.intJcomboBoxNameCounter]);

                addPersonFrame.setVisible(false);






            }
        });
    };


    public void nameSaver(){


    }

}
