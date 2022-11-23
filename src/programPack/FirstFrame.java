package programPack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstFrame {

   static JFrame mainFrame = new JFrame();
    JPanel mainFramePanel= new JPanel();
    JPanel chauforrPanel= new JPanel();
    JPanel bilarPanel= new JPanel();

    JButton chauforr  = new JButton("Chauförr");
    JButton bilar  = new JButton("Bilar");
   // JComboBox jComboBoxChaforrname = new JComboBox<>();

    JButton showPersonInfo= new JButton("Visa Info");
    JButton back= new JButton("bak");
    public int intJcomboBoxNameCounter=0;

    String []chaforrNames=new String[1000];
    public  JComboBox jComboBoxNames =new JComboBox(chaforrNames);




    FirstFrame(){

        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setSize(1000,1000);
        mainFrame.setResizable(false);

        mainFramePanel.setSize(1000,1000);
        mainFramePanel.setLayout(null);

        chauforrPanel.setSize(1000,1000);
        chauforrPanel.setLayout(null);

        bilarPanel.setSize(1000,1000);
        bilarPanel.setLayout(null);

        mainFrame.add(mainFramePanel);
        mainFrame.add(chauforrPanel);
        mainFrame.add(bilarPanel);
        back.setBounds(10,900,100,30);

        //********************************* Chauförr button ***************************//


        chauforr.setBounds(100,10,100,30);
        mainFramePanel.add(chauforr );

        chauforr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                chaforrButtonMetod();
            }
        });

        //*********************************  Bilar button  ***************************//

        bilar.setBounds(800,10,100,30);
        mainFramePanel.add(bilar);
        bilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bilarButtonMetod();

            }
        });



    };


    //////////////////////////////////////////// /////// ///////////////////////////////////////////////////////////////
    //////////////////////////////////////////// /////// ///////////////////////////////////////////////////////////////
    //////////////////////////////////////////// METODS ////////////////////////////////////////////////////////////////
    ////////////////////////////////////////// start from //////////////////////////////////////////////////////////////
    //////////////////////////////////////////// here //////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////*********** /////////////////////////////////////////////////////////////

    //********************************** Chaforr Button Metod ************************************//

    public void chaforrButtonMetod (){
        mainFramePanel.setVisible(false);
        chauforrPanel.setVisible(true);
        chauforrPanel.add(back);

        JLabel l1=new JLabel("Välj ett namn");
        l1. setBounds(20,50,100,30);
        chauforrPanel.add(l1);

       chauforrPanel.add(jComboBoxNames);
        jComboBoxNames.setBounds(20,100,200,50);





        //********************* show personinfo Button *****************//

        showPersonInfo.setBounds(240,100,100,30);
        chauforrPanel.add(showPersonInfo);

        showPersonInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {





            }
        });

        // ********************* Add Person Button *********************//
        JButton addPerson = new JButton("Add Person");
        addPerson.setBounds(20,175,100,30);
        chauforrPanel.add(addPerson);

        addPerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Person();

            }
        });


        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backButtonMetod();
            }
        });
    }
    //**************************************************************


    //********************************** Bilar Button Metod ************************************//

    public void bilarButtonMetod(){
        mainFramePanel.setVisible(false);
        chauforrPanel.setVisible(false);
        bilarPanel.setVisible(true);
        bilarPanel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backButtonMetod();
            }
        });
    }
    //************************************************************************************************






    //********************************** back Button Metod ************************************//
    public void backButtonMetod(){
       chauforrPanel.setVisible(false);
       bilarPanel.setVisible(false);
        mainFramePanel.setVisible(true);


    }


}
