package basics.code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class Menu03 implements ActionListener {
    private final JFrame Frame;                     // the top-level component
    private final JPanel center = new JPanel();     // center panel
    private final BufferedImage onscreenImage;
    double Version = 1.0004;
    String Key = "Swrecords B.V.";
    String Key1 = "Swrecords B.V.";// to change sc
    Menu04 Us = new Menu04();
    ReadAndWrite File = new ReadAndWrite();
    String input, out, out1, Input, field;
    String Input3;// ask confirm to delete
    int cc, v, ii, option, i, a;

    public Menu03() {
        UIManager.put("OptionPane.background", Color.GREEN);
        onscreenImage = new BufferedImage(1600, 730, BufferedImage.TYPE_INT_ARGB);
        ImageIcon icon = new ImageIcon(onscreenImage);
        JLabel draw = new JLabel(icon);
        center.setBackground(new Color(15, 130, 255));
        JLabel center00 = new JLabel("**                                                            VERGEET U NIET UIT TE LOGGEN !!!, als u uw werkplek verlaat !!                                                                                **");
        center00.setForeground(Color.YELLOW);
        center.add(center00);
        center.add(draw);
        JPanel west = new JPanel();
        JPanel south = new JPanel();
        JPanel north = new JPanel();
        JPanel east = new JPanel();
        JPanel row = new JPanel();
        west.setBackground(Color.MAGENTA);
        east.setBackground(Color.ORANGE);
        south.setBackground(Color.CYAN);
        north.setBackground(Color.GREEN);
        row.setBackground(Color.MAGENTA);
        west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
        east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
        row.setLayout(new BoxLayout(row, BoxLayout.Y_AXIS));
        east.setBounds(134, 52, 1234, 645);
        row.setBounds(1368, 26, 700, 698);
        File.Read();
        //File.Write(); // when changes made in ReadAndWrite
        Us.Read2();
        ii = Us.maxRecords1;
        if (ii == File.count) {
            if (File.Field1[ii] == null) {
                option = 2;
                Option99();
            }
        }
        JMenuBar menuBar = new JMenuBar();
        if (Objects.equals(Us.Userlog0, "shit")) {
            JMenu menu = new JMenu("<<<<< - * - * - * - * - * - * - * - * - * - * - * - >>>>>  Data menu  <<<<< - * - * - * - * - * - * - * - * - * - >>>>> * - * - * - * - * - * - * - * - * - * <<<<<  :::  >>  versie nummer  <<  :::  >>   " + Version + "  <<   :   >>>>>     NIET GEREGISTREEDE VERSIE     <<<<<");
            menuBar.setBackground(Color.GRAY);
            menu.setForeground(Color.BLACK);
            menuBar.add(menu);
        } else {
            JMenu menu = new JMenu("<<<<< - * - * - * - * - * - * - * - * - * - * - * - >>>>>  Data menu  <<<<< - * - * - * - * - * - * - * - * - * - >>>>> * - * - * - * - * - * - * - * - * - * <<<<<  :::  >>  versie nummer  <<  :::  >>   " + Version + "  <<   :   >>>>>     Geregistreerd aan : " + Us.Company+"     <<<<<");
            menuBar.setBackground(Color.GRAY);
            menu.setForeground(Color.BLACK);
            menuBar.add(menu);
        }
        Frame = new JFrame();
        Frame.setJMenuBar(menuBar);
        Frame.add(west, BorderLayout.WEST);
        Frame.add(east, BorderLayout.CENTER);
        Frame.add(south, BorderLayout.PAGE_END);
        Frame.add(north, BorderLayout.PAGE_START);
        Frame.add(row, BorderLayout.CENTER);
        Frame.add(center, BorderLayout.CENTER);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Frame.setResizable(false);
        Frame.pack();
        center.requestFocusInWindow();
        JLabel Text0 = new JLabel(" ");
        JLabel Text1 = new JLabel("** -- ** -- ** -- ** -- >>  Welkom : " + Us.Userlog1 + "  Is Ingelogd :  << -- ** -- ** -- ** -- **");
        JLabel Text2 = new JLabel(" ");
        JLabel Text3 = new JLabel(">>>>> Data Reeks : " + ii + " <<<<< ----- ( )( )( )( )( ) ----- >>>>> Van Totaal : " + File.count + " Data's <<<<< ----- ( )( )( )( )( ) ----- >>>>> Maximaal : " + Us.MaxRecords + " toegestaan <<<<<");
        JLabel Text4 = new JLabel(" ");
        JLabel Text00 = new JLabel("<<<<<-----*****-----( )( )( )( )( )-----");
        JButton Sbutton0 = new JButton("*****");
        Sbutton0.setBackground(Color.CYAN);
        Sbutton0.setForeground(Color.BLUE);
        JLabel Text01 = new JLabel("-----( )( )( )( )( )-----*****----->>>>>");
        JLabel Text02 = new JLabel(" ");
        JLabel Text03 = new JLabel(" ");
        JLabel Text04 = new JLabel(" ");
        JLabel Text05 = new JLabel(" ");
        JLabel Text06 = new JLabel(" ");
        JLabel Text07 = new JLabel(" ");
        JLabel Text08 = new JLabel(" ");
        JLabel Text09 = new JLabel(" ");
        JLabel Text10 = new JLabel(" ");
        JLabel Text0a = new JLabel(" ");
        JLabel Text5 = new JLabel(" ");
        JLabel Text6 = new JLabel(" ");
        JLabel Text7 = new JLabel(" ");
        JLabel Text8 = new JLabel(" ");
        JLabel Text9 = new JLabel(" ");
        JLabel Text0A = new JLabel(" ");
        JButton button0 = new JButton("<Zoek Data Nr. >");
        button0.setBackground(Color.GREEN);
        button0.setForeground(Color.RED);
        JButton button1 = new JButton("Veld 01 : " + File.Field1[ii]);
        JButton button2 = new JButton("Veld 02 : " + File.Field2[ii]);
        JButton button3 = new JButton("Veld 03 : " + File.Field3[ii]);
        JButton button4 = new JButton("Veld 04 : " + File.Field4[ii]);
        JButton button5 = new JButton("Veld 05 : " + File.Field5[ii]);
        JButton button6 = new JButton("Veld 06 : " + File.Field6[ii]);
        JButton button7 = new JButton("Veld 07 : " + File.Field7[ii]);
        JButton button8 = new JButton("Veld 08 : " + File.Field8[ii]);
        JButton button9 = new JButton("Veld 09 : " + File.Field9[ii]);
        JButton buttona = new JButton("Veld 10 : " + File.Field10[ii]);
        JButton buttonb = new JButton("Veld 11 : " + File.Field11[ii]);
        JButton buttonc = new JButton("Veld 12 : " + File.Field12[ii]);
        JButton buttond = new JButton("Veld 13 : " + File.Field13[ii]);
        JButton buttone = new JButton("Veld 14 : " + File.Field14[ii]);
        JButton buttonf = new JButton("Veld 15 : " + File.Field15[ii]);
        //
        JButton button01 = new JButton("--->>> --->>> Volgend Data zoekveld : --->>> --->>>");
        button01.setBackground(new Color(0, 200, 0));
        button01.setForeground(Color.YELLOW);
        JButton button02 = new JButton("<<<--- <<<--- Vorige Data zoekveld : <<<--- <<<---");
        button02.setBackground(new Color(0, 200, 0));
        button02.setForeground(Color.YELLOW);
        JButton button04 = new JButton("** Naar HoofdMenu **");
        button04.setBackground(Color.GREEN);
        JButton button08 = new JButton("-> Data veld maken <-");
        button08.setBackground(Color.RED);
        JButton button09 = new JButton("-> Veld verplaatsen <-");
        button09.setBackground(Color.RED);
        JButton button99 = new JButton("!!!!! Dit veld wissen !!!!!");
        button99.setBackground(Color.RED);
        JButton Ebutton1 = new JButton("<- Zoek veld -> 01");
        JButton Ebutton2 = new JButton("<- Zoek veld -> 02");
        JButton Ebutton3 = new JButton("<- Zoek veld -> 03");
        JButton Ebutton4 = new JButton("<- Zoek veld -> 04");
        JButton Ebutton5 = new JButton("<- Zoek veld -> 05");
        JButton Ebutton6 = new JButton("<- Zoek veld -> 06");
        JButton Ebutton7 = new JButton("<- Zoek veld -> 07");
        JButton Ebutton8 = new JButton("<- Zoek veld -> 08");
        JButton Ebutton9 = new JButton("<- Zoek veld -> 09");
        JButton Ebuttona = new JButton("<- Zoek veld -> 10");
        JButton Ebuttonb = new JButton("<- Zoek veld -> 11");
        JButton Ebuttonc = new JButton("<- Zoek veld -> 12");
        JButton Ebuttond = new JButton("<- Zoek veld -> 13");
        JButton Ebuttone = new JButton("<- Zoek veld -> 14");
        JButton Ebuttonf = new JButton("<- Zoek veld -> 15");
        JButton Wbutton1 = new JButton("<-- Klik voor keuze -->");
        JButton Wbutton2 = new JButton("Zoek alle velden");
        Wbutton1.setBackground(Color.GRAY);
        Wbutton1.setForeground(Color.WHITE);
        Wbutton2.setBackground(Color.YELLOW);
        Wbutton2.setForeground(Color.RED);
        Ebutton1.setBackground(Color.YELLOW);
        Ebutton1.setForeground(Color.RED);
        Ebutton2.setBackground(Color.YELLOW);
        Ebutton2.setForeground(Color.RED);
        Ebutton3.setBackground(Color.YELLOW);
        Ebutton3.setForeground(Color.RED);
        Ebutton4.setBackground(Color.YELLOW);
        Ebutton4.setForeground(Color.RED);
        Ebutton5.setBackground(Color.YELLOW);
        Ebutton5.setForeground(Color.RED);
        Ebutton6.setBackground(Color.YELLOW);
        Ebutton6.setForeground(Color.RED);
        Ebutton7.setBackground(Color.YELLOW);
        Ebutton7.setForeground(Color.RED);
        Ebutton8.setBackground(Color.YELLOW);
        Ebutton8.setForeground(Color.RED);
        Ebutton9.setBackground(Color.YELLOW);
        Ebutton9.setForeground(Color.RED);
        Ebuttona.setBackground(Color.YELLOW);
        Ebuttona.setForeground(Color.RED);
        Ebuttonb.setBackground(Color.YELLOW);
        Ebuttonb.setForeground(Color.RED);
        Ebuttonc.setBackground(Color.YELLOW);
        Ebuttonc.setForeground(Color.RED);
        Ebuttond.setBackground(Color.YELLOW);
        Ebuttond.setForeground(Color.RED);
        Ebuttone.setBackground(Color.YELLOW);
        Ebuttone.setForeground(Color.RED);
        Ebuttonf.setBackground(Color.YELLOW);
        Ebuttonf.setForeground(Color.RED);
        //
        JLabel Row01 = new JLabel(" ");
        JLabel Row02 = new JLabel(" ");
        JLabel Row03 = new JLabel(" ");
        JLabel Row04 = new JLabel(" ");
        JLabel Row05 = new JLabel(" ");
        JLabel Row06 = new JLabel(" ");
        JLabel Row07 = new JLabel(" ");
        JLabel Row08 = new JLabel(" ");
        JLabel Row09 = new JLabel(" ");
        JLabel Row10 = new JLabel(" ");
        JLabel Row11 = new JLabel(" ");
        JLabel Row12 = new JLabel(" ");
        JLabel Row19 = new JLabel(" ");
        JLabel Row20 = new JLabel(" ");
        JLabel Row21 = new JLabel(" ");
        JLabel Row22 = new JLabel(" ");
        JLabel Row23 = new JLabel(" ");
        JLabel Row24 = new JLabel(" ");
        JLabel Row25 = new JLabel(" ");
        JLabel Row26 = new JLabel(" ");
        JLabel Row27 = new JLabel(" ");
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttona.addActionListener(this);
        buttonb.addActionListener(this);
        buttonc.addActionListener(this);
        buttond.addActionListener(this);
        buttone.addActionListener(this);
        buttonf.addActionListener(this);
        // uitbreiding data velden
        Wbutton2.addActionListener(this);
        Sbutton0.addActionListener(this);
        button01.addActionListener(this);
        button02.addActionListener(this);
        button04.addActionListener(this);
        button08.addActionListener(this);
        button09.addActionListener(this);
        button99.addActionListener(this);
        Ebutton1.addActionListener(this);
        Ebutton2.addActionListener(this);
        Ebutton3.addActionListener(this);
        Ebutton4.addActionListener(this);
        Ebutton5.addActionListener(this);
        Ebutton6.addActionListener(this);
        Ebutton7.addActionListener(this);
        Ebutton8.addActionListener(this);
        Ebutton9.addActionListener(this);
        Ebuttona.addActionListener(this);
        Ebuttonb.addActionListener(this);
        Ebuttonc.addActionListener(this);
        Ebuttond.addActionListener(this);
        Ebuttone.addActionListener(this);
        Ebuttonf.addActionListener(this);
        // uitbreiding zoek velden
        // button1.setToolTipText("Click me");
        north.add(Text1);
        west.add(Text2);
        east.add(Text3);
        east.add(Text07);
        west.add(button0);
        west.add(Text4);
        west.add(Text0A);
        west.add(Ebutton1);
        west.add(Ebutton2);
        west.add(Ebutton3);
        west.add(Ebutton4);
        west.add(Ebutton5);
        west.add(Ebutton6);
        west.add(Ebutton7);
        west.add(Ebutton8);
        west.add(Ebutton9);
        west.add(Ebuttona);
        west.add(Ebuttonb);
        west.add(Ebuttonc);
        west.add(Ebuttond);
        west.add(Ebuttone);
        west.add(Ebuttonf);
        west.add(Row19);
        west.add(Row20);
        west.add(Wbutton2);// zoeken alle velden
        //
        south.add(button02);
        south.add(Text00);
        south.add(Sbutton0);
        south.add(Text01);
        south.add(button01);
        east.add(Text0a);
        east.add(button1);
        east.add(button2);
        east.add(button3);
        east.add(button4);
        east.add(button5);
        east.add(button6);
        east.add(button7);
        east.add(button8);
        east.add(button9);
        east.add(buttona);
        east.add(buttonb);
        east.add(buttonc);
        east.add(buttond);
        east.add(buttone);
        east.add(buttonf);
        //
        row.add(Wbutton1);// keuze maken
        row.add(Row01);
        row.add(Row02);
        row.add(button04);// hoofd menu
        row.add(Row03);
        row.add(Row04);
        row.add(Row05);
        row.add(Row06);
        row.add(Row07);
        row.add(Row08);
        row.add(Row09);
        row.add(Row10);
        row.add(Row11);
        row.add(Text0);
        row.add(Text02);
        row.add(Text03);
        row.add(Text04);
        row.add(Text05);
        row.add(Text06);
        row.add(button08);// leeg veld zoeken/maken
        row.add(Text08);
        row.add(Text09);
        row.add(Text10);
        row.add(Text5);
        row.add(Text6);
        row.add(Text7);
        row.add(Text8);
        row.add(Text9);
        row.add(Row12);
        row.add(Row21);
        row.add(Row22);
        row.add(Row23);
        row.add(Row24);
        row.add(Row25);
        row.add(button09);// veld verplaatsen
        row.add(Row26);
        row.add(Row27);
        row.add(button99);// veld wissen
        Frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Frame.setVisible(false);
        Frame.dispatchEvent(new WindowEvent(Frame, WindowEvent.WINDOW_CLOSING));
        Frame.dispose();
        Object cmd = e.getActionCommand();
        if (cmd.equals(" Save...   ")) System.out.println("File -> Save");
        else if (cmd.equals("Veld 01 : " + File.Field1[ii])) Option01();
        else if (cmd.equals("Veld 02 : " + File.Field2[ii])) Option02();
        else if (cmd.equals("Veld 03 : " + File.Field3[ii])) Option03();
        else if (cmd.equals("Veld 04 : " + File.Field4[ii])) Option04();
        else if (cmd.equals("Veld 05 : " + File.Field5[ii])) Option05();
        else if (cmd.equals("Veld 06 : " + File.Field6[ii])) Option06();
        else if (cmd.equals("Veld 07 : " + File.Field7[ii])) Option07();
        else if (cmd.equals("Veld 08 : " + File.Field8[ii])) Option08();
        else if (cmd.equals("Veld 09 : " + File.Field9[ii])) Option09();
        else if (cmd.equals("Veld 10 : " + File.Field10[ii])) Option0a();
        else if (cmd.equals("Veld 11 : " + File.Field11[ii])) Option0b();
        else if (cmd.equals("Veld 12 : " + File.Field12[ii])) Option0c();
        else if (cmd.equals("Veld 13 : " + File.Field13[ii])) Option0d();
        else if (cmd.equals("Veld 14 : " + File.Field14[ii])) Option0e();
        else if (cmd.equals("Veld 15 : " + File.Field15[ii])) Option0f();
        else if (cmd.equals("--->>> --->>> Volgend Data zoekveld : --->>> --->>>")) Option10();
        else if (cmd.equals("<<<--- <<<--- Vorige Data zoekveld : <<<--- <<<---")) Option11();
        else if (cmd.equals("** Naar HoofdMenu **")) Option12();
        else if (cmd.equals("-> Data veld maken <-")) Data();
        else if (cmd.equals("!!!!! Dit veld wissen !!!!!")) Delete();
        else if (cmd.equals("-> Veld verplaatsen <-")) copy();
        else if (cmd.equals("<Zoek Data Nr. >")) Option15();
        else if (cmd.equals("<- Zoek veld -> 01")) Veld01();
        else if (cmd.equals("<- Zoek veld -> 02")) Veld02();
        else if (cmd.equals("<- Zoek veld -> 03")) Veld03();
        else if (cmd.equals("<- Zoek veld -> 04")) Veld04();
        else if (cmd.equals("<- Zoek veld -> 05")) Veld05();
        else if (cmd.equals("<- Zoek veld -> 06")) Veld06();
        else if (cmd.equals("<- Zoek veld -> 07")) Veld07();
        else if (cmd.equals("<- Zoek veld -> 08")) Veld08();
        else if (cmd.equals("<- Zoek veld -> 09")) Veld09();
        else if (cmd.equals("<- Zoek veld -> 10")) Veld10();
        else if (cmd.equals("<- Zoek veld -> 11")) Veld11();
        else if (cmd.equals("<- Zoek veld -> 12")) Veld12();
        else if (cmd.equals("<- Zoek veld -> 13")) Veld13();
        else if (cmd.equals("<- Zoek veld -> 14")) Veld14();
        else if (cmd.equals("<- Zoek veld -> 15")) Veld15();
        else if (cmd.equals("*****")) View();
        else if (cmd.equals("Zoek alle velden")) SearchAll();
        else JOptionPane.showMessageDialog(null, "Onbekende keuze", "Fout", JOptionPane.ERROR_MESSAGE);
        Menu03();
    }

    public void Menu03() {
        Menu03 Usr = new Menu03();
    }

    public void Option00() {
        Frame.setVisible(false);
        File.Write();
        File.Read();
    }

    public void Option01() {
        File.Field1[ii] = JOptionPane.showInputDialog("Veld 1 :", File.Field1[ii]);
        if (File.Field1[ii] == null) File.Field1[ii] = "**********";
        Option00();
    }

    public void Option02() {
        File.Field2[ii] = JOptionPane.showInputDialog("Veld 2 :", File.Field2[ii]);
        if (File.Field2[ii] == null) File.Field2[ii] = "";
        Option00();
    }

    public void Option03() {
        File.Field3[ii] = JOptionPane.showInputDialog("Veld 3 :", File.Field3[ii]);
        if (File.Field3[ii] == null) File.Field3[ii] = "";
        Option00();
    }

    public void Option04() {
        File.Field4[ii] = JOptionPane.showInputDialog("Veld 4 :", File.Field4[ii]);
        if (File.Field4[ii] == null) File.Field4[ii] = "";
        Option00();
    }

    public void Option05() {
        File.Field5[ii] = JOptionPane.showInputDialog("Veld 5 :", File.Field5[ii]);
        if (File.Field5[ii] == null) File.Field5[ii] = "";
        Option00();
    }

    public void Option06() {
        File.Field6[ii] = JOptionPane.showInputDialog("Veld 6 :", File.Field6[ii]);
        if (File.Field6[ii] == null) File.Field6[ii] = "";
        Option00();
    }

    public void Option07() {
        File.Field7[ii] = JOptionPane.showInputDialog("Veld 7 :", File.Field7[ii]);
        if (File.Field7[ii] == null) File.Field7[ii] = "";
        Option00();
    }

    public void Option08() {
        File.Field8[ii] = JOptionPane.showInputDialog("Veld 8 :", File.Field8[ii]);
        if (File.Field8[ii] == null) File.Field8[ii] = "";
        Option00();
    }

    public void Option09() {
        File.Field9[ii] = JOptionPane.showInputDialog("Veld 9 :", File.Field9[ii]);
        if (File.Field9[ii] == null) File.Field9[ii] = "";
        Option00();
    }

    public void Option0a() {
        File.Field10[ii] = JOptionPane.showInputDialog("Veld 10 :", File.Field10[ii]);
        if (File.Field10[ii] == null) File.Field10[ii] = "";
        Option00();
    }

    public void Option0b() {
        File.Field11[ii] = JOptionPane.showInputDialog("Veld 11 :", File.Field11[ii]);
        if (File.Field11[ii] == null) File.Field11[ii] = "";
        Option00();
    }

    public void Option0c() {
        File.Field12[ii] = JOptionPane.showInputDialog("Veld 12 :", File.Field12[ii]);
        if (File.Field12[ii] == null) File.Field12[ii] = "";
        Option00();
    }

    public void Option0d() {
        File.Field13[ii] = JOptionPane.showInputDialog("Veld 13 :", File.Field13[ii]);
        if (File.Field13[ii] == null) File.Field13[ii] = "";
        Option00();
    }

    public void Option0e() {
        File.Field14[ii] = JOptionPane.showInputDialog("Veld 14 :", File.Field14[ii]);
        if (File.Field14[ii] == null) File.Field14[ii] = "";
        Option00();
    }

    public void Option0f() {
        File.Field15[ii] = JOptionPane.showInputDialog("Veld 15 :", File.Field15[ii]);
        if (File.Field15[ii] == null) File.Field15[ii] = "";
        Option00();
    }

    // uitbreiding van de velden hierbij zetten ivm overzicht te houden
    public void Option10() {
        Frame.setVisible(false);
        ii++;
        if (ii == File.count + 1) ii = 1;
        Us.maxRecords1 = ii;
        Us.Write2();
    }

    public void Option11() {
        Frame.setVisible(false);
        ii--;
        if (ii == 0) ii = File.count;
        Us.maxRecords1 = ii;
        Us.Write2();
    }

    public void Option12() {
        Frame.setVisible(false);
        final Menu01 use = new Menu01();
        Frame.setVisible(false);
        Frame.dispatchEvent(new WindowEvent(Frame, WindowEvent.WINDOW_CLOSING));
        Frame.dispose();
        use.showOptions();
    }

    public void Option15() {
        Frame.setVisible(false);
        File.Read();
        // load data field input
        input = JOptionPane.showInputDialog(null, "Welk data veld nummer wilt u bekijken ?", "Data laden : ", JOptionPane.PLAIN_MESSAGE);
        i = Integer.parseInt(input);
        if (i > File.count) {
            JOptionPane.showMessageDialog(null, "Fout !! Dit veld bestaat nog niet \n Probeer opniew", "Fout !!!", JOptionPane.ERROR_MESSAGE);
            Option15();
        }
        Frame.dispatchEvent(new WindowEvent(Frame, WindowEvent.WINDOW_CLOSING));
        Vieuw();
        Frame.dispose();
    }

    public void Option98() {
        // toevoegen
        Frame.setVisible(false);
        File.count++;
        ii = File.count;
        Option99();
    }

    public void Option99() {
        File.Field1[ii] = "**********";
        File.Field2[ii] = "";
        File.Field3[ii] = "";
        File.Field4[ii] = "";
        File.Field5[ii] = "";
        File.Field6[ii] = "";
        File.Field7[ii] = "";
        File.Field8[ii] = "";
        File.Field9[ii] = "";
        File.Field10[ii] = "";
        File.Field11[ii] = "";
        File.Field12[ii] = "";
        File.Field13[ii] = "";
        File.Field14[ii] = "";
        File.Field15[ii] = "";
        // uitbreiding
        Option00();
    }

    public void Delete() {
        UIManager.put("OptionPane.background", Color.RED);
        Frame.setVisible(false);
        Us.Read2();
        File.Read();
        Input3 = JOptionPane.showInputDialog(null, "Voer uw Autorisatie code in : ", "Verwijderen", JOptionPane.PLAIN_MESSAGE);
        if (Objects.equals(Us.Userlog2, "ja")) {
            if (Objects.equals(Us.Userlog3, Input3)) {
                if (ii == File.count) File.count--;
                Option99();
            } else {
                JOptionPane.showMessageDialog(null, "Code is fout :", "FOUT !!!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "GEEN TOEGANG Tot deze functie !!", "FOUT !!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Search() {
        Frame.setVisible(false);
        input = JOptionPane.showInputDialog(null, "Wat zoekt u ?", "Input", JOptionPane.QUESTION_MESSAGE);
        cc = 0;
        option = 0;
        boolean data = false;
        while (!data) {
            cc++;
            if (Objects.equals(File.Field1[cc], input) && v == 1) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field2[cc], input) && v == 2) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field3[cc], input) && v == 3) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field4[cc], input) && v == 4) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field5[cc], input) && v == 5) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field6[cc], input) && v == 6) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field7[cc], input) && v == 7) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field8[cc], input) && v == 8) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field9[cc], input) && v == 9) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field10[cc], input) && v == 10) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field11[cc], input) && v == 11) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field12[cc], input) && v == 12) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field13[cc], input) && v == 13) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field14[cc], input) && v == 14) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (Objects.equals(File.Field15[cc], input) && v == 15) {
                ii = cc;
                option = 1;
                data = true;
            }
            if (cc == File.count) data = true;
        }
        if (option == 0)
            JOptionPane.showMessageDialog(null, "Geen resultaten gevonden", "Sorry", JOptionPane.PLAIN_MESSAGE);
        option = 0;
        Us.maxRecords1 = ii;
        Us.Write2();
    }

    public void Veld01() {
        v = 1;
        Search();
    }

    public void Veld02() {
        v = 2;
        Search();
    }

    public void Veld03() {
        v = 3;
        Search();
    }

    public void Veld04() {
        v = 4;
        Search();
    }

    public void Veld05() {
        v = 5;
        Search();
    }

    public void Veld06() {
        v = 6;
        Search();
    }

    public void Veld07() {
        v = 7;
        Search();
    }

    public void Veld08() {
        v = 8;
        Search();
    }

    public void Veld09() {
        v = 9;
        Search();
    }

    public void Veld10() {
        v = 10;
        Search();
    }

    public void Veld11() {
        v = 11;
        Search();
    }

    public void Veld12() {
        v = 12;
        Search();
    }

    public void Veld13() {
        v = 13;
        Search();
    }

    public void Veld14() {
        v = 14;
        Search();
    }

    public void Veld15() {
        v = 15;
        Search();
    }

    // uitbreiding van de velden hier bij zetten ivm overzicht
    public void copy() {
        Frame.setVisible(false);
        UIManager.put("OptionPane.background", Color.RED);
        Input3 = JOptionPane.showInputDialog(null, "Voer uw Autorisatie code in : ", "Verwijderen", JOptionPane.PLAIN_MESSAGE);
        if (Objects.equals(Us.Userlog2, "ja")) {
            if (Objects.equals(Us.Userlog3, Input3)) {
                if (ii == File.count) File.count--;
                copy1();
            } else {
                JOptionPane.showMessageDialog(null, "Code is fout :", "FOUT !!!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "GEEN TOEGANG Tot deze functie !!", "FOUT !!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void copy1() {
        File.Read();
        UIManager.put("OptionPane.background", Color.YELLOW);
        input = JOptionPane.showInputDialog(null, "welk data veld moet worden verplaatst ?", "Van", JOptionPane.QUESTION_MESSAGE);
        Input = JOptionPane.showInputDialog(null, "Naar welk veldmoet deze data ?", "Waarheen", JOptionPane.QUESTION_MESSAGE);
        i = Integer.parseInt(Input);//copy
        ii = Integer.parseInt(input);//bron
        if (ii >= File.count + 1) {
            JOptionPane.showMessageDialog(null, "Geen data aanwezig op deze positie", "Fout !!", JOptionPane.ERROR_MESSAGE);
            Menu03();
        }
        if (i >= File.count + 2) {
            JOptionPane.showMessageDialog(null, "Positie te hoog", "Fout !!", JOptionPane.ERROR_MESSAGE);
            copy();
        }
        if (Objects.equals(File.Field1[i], null)) {
            File.Field1[i] = "**********";
            File.count = i;
        }
        if (Objects.equals(File.Field1[i], "**********")) {
            UIManager.put("OptionPane.background", Color.GREEN);
            JOptionPane.showMessageDialog(null, "copy data : " + input + " Naar : " + Input, "copy", JOptionPane.PLAIN_MESSAGE);
            File.Field1[i] = File.Field1[ii];
            File.Field2[i] = File.Field2[ii];
            File.Field3[i] = File.Field3[ii];
            File.Field4[i] = File.Field4[ii];
            File.Field5[i] = File.Field5[ii];
            File.Field6[i] = File.Field6[ii];
            File.Field7[i] = File.Field7[ii];
            File.Field8[i] = File.Field8[ii];
            File.Field9[i] = File.Field9[ii];
            File.Field10[i] = File.Field10[ii];
            File.Field11[i] = File.Field11[ii];
            File.Field12[i] = File.Field12[ii];
            File.Field13[i] = File.Field13[ii];
            File.Field14[i] = File.Field14[ii];
            File.Field15[i] = File.Field15[ii];
            Option99();
            Option00();
        } else {
            JOptionPane.showMessageDialog(null, "Veld is niet leeg", "Niet leeg", JOptionPane.ERROR_MESSAGE);
        }
        Vieuw();
    }

    public void View() {
        // test veld // overzicht
        UIManager.put("OptionPane.background", Color.YELLOW);
        File.Read();
        out = "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--**--->> Maximaal toegestaan : " + Us.maxRecords + "\n" + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--**--->> Aantal data's : " + File.count + "\n\n";
        int page1 = 0;
        for (ii = 1; ii <= File.count; ii++) {
            boolean page = ii % 30 == 0;

            if (page) {
                page1++;
                JOptionPane.showMessageDialog(null, out, "                                                    Overzicht pagina :" + page1, JOptionPane.PLAIN_MESSAGE);
                out1 = "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--**--->> Maximaal toegestaan : " + Us.maxRecords + "\n" + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--**--->> Aantal data's : " + File.count + "\n\n";
                out = out1 + "Data : " + ii + "     Veld 1 : " + File.Field1[ii] + "     Veld 2 : " + File.Field2[ii] + "     Veld 3 :" + File.Field3[ii] + "     Veld 4 :" + File.Field4[ii] + "\n";
            } else {
                out = out + "Data : " + ii + "     Veld 1 : " + File.Field1[ii] + "     Veld 2 : " + File.Field2[ii] + "     Veld 3 :" + File.Field3[ii] + "     Veld 4 :" + File.Field4[ii] + "\n";
            }
        }
        page1++;
        JOptionPane.showMessageDialog(null, out, "                                                    Overzicht pagina :" + page1, JOptionPane.PLAIN_MESSAGE);
    }

    public void Data() {
        File.Read();
        a = 12;
        i = 0;
        boolean DatAS = false;
        while (!DatAS) {
            i++;
            if (i == File.count + 1) {
                a = 5;
                DatAS = true;
            }
            if (a == 12) {
                // indien het veld1 10 sterretjes
                if (Objects.equals(File.Field1[i], "**********")) {
                    JOptionPane.showMessageDialog(null, "Leeg veld nr : " + i + " gevonden.", "Data : " + i, JOptionPane.PLAIN_MESSAGE);
                    Vieuw();
                    a = 9;
                    DatAS = true;
                }
            }

            if (a == 5) {
                if (i > Us.MaxRecords) {
                    BigError();
                    DatAS = true;
                } else {
                    Option98();
                    a = 0;
                    if (a == 5) {
                        JOptionPane.showMessageDialog(null, "Nieuwe data wordt bijgemaakt", "Data : " + i, JOptionPane.PLAIN_MESSAGE);
                        Vieuw();
                        DatAS = true;
                    }
                }
            }
        }
    }

    public void BigError() {
        UIManager.put("OptionPane.background", Color.RED);
        JOptionPane.showMessageDialog(null, "Maximale data's bereikt , neem contact op met de programmeur van dit programma", "SORRY VOL", JOptionPane.ERROR_MESSAGE);
        UIManager.put("OptionPane.background", Color.BLUE);
    }

    public void Vieuw() {
        Us.Read2();
        Us.maxRecords1 = i;
        Us.Write2();
    }

    public void SearchAll() {
        File.Read();
        i = 0;
        a = 73;
        field = JOptionPane.showInputDialog(null, "Voer veld in : ", "Zoeken", JOptionPane.PLAIN_MESSAGE);
        Boolean CHANGE1 = false;
        while (!CHANGE1) {
            i++;
            if (a == 73) {
                if (Objects.equals(File.Field1[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field2[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field3[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field4[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field5[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field6[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field7[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field8[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field9[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field10[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field11[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field12[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field13[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field14[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
                if (Objects.equals(File.Field15[i], field)) {
                    CHANGE1 = true;
                    a = 74;
                    Vieuw();
                }
            }
            // hier kunnen meer velden toegevoegd worden bij uitbreiding.
            if (i <= File.count) {
                CHANGE1 = false;
            } else {
                if (a == 73) {
                    JOptionPane.showMessageDialog(null, "Einde van de data lijst", "The End", JOptionPane.PLAIN_MESSAGE);
                    CHANGE1 = true;
                }
                CHANGE1 = true;
            }
        }
    }
}