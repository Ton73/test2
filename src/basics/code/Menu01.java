package basics.code;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Menu01 {
    double Version = 1.003;
    String Key = "Music Studio Swrecords B.V.";
    String Key1 = "* * * * * * * * * * - * * * * * * * * * *";
    String Key2 = "Swrecords B.V.";
    String Key3 = "Swrecords B.V.";// to change sc
    Menu04 Us = new Menu04();
    ReadAndWrite File = new ReadAndWrite();
    int x,a,page2,b=2,log,Usr;
    String no = "";
    String in,in1,out,Maxmax,Company;
    String user1, user2, user2a, user3a, user4, user0, User0;
    String user3 = "nee";

    public void Helpfile() {
        try {
            FileReader Read0 = new FileReader("\\\\VUSOLO4K\\harddisk\\data\\data.dll");
            Scanner read0 = new Scanner(Read0);
            Maxmax = read0.nextLine();
            Company = read0.nextLine();
            user0 = read0.nextLine();
            User0 = read0.nextLine();
            read0.close();
            Us.Read2();
            Us.MaxRecords = Integer.parseInt(user0);
            Usr = Integer.parseInt(User0);
            Us.Company = Company;
            Us.Userlog0 = Maxmax;
            Us.Write2();

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "er is iets fout gegaan : " + ex, "FOUT !!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void showOptions() {
        // menu
        Us.Read2();
        Us.maxRecords = Integer.parseInt(Us.max);
        if (Objects.equals(Us.LOG, "5")) {
            log = 5;
            UIManager.put("OptionPane.background", Color.BLUE);
            logon();
        } else UIManager.put("OptionPane.background", Color.RED);
        File.Read1();
        in1 = "                                 ----->>>> Login Menu : <<<<-----                              Versie :" + Version;
        in = "Dit zijn de volgende opties : " + "\n\n";
        in = in + "1. Inloggen" + "\n";
        in = in + "2. Gebruiker toevoegen ( **** )" + "\n";
        in = in + "3. Wachtwoord van een gebruiker wijzigen ( **** )" + "\n";
        in = in + "4. Gebruiker verwijderen ( **** )" + "\n";
        in = in + "5. Overzicht gebruikers ( **** )" + "\n";
        in = in + "6. Uitloggen" + "\n";
        in = in + "7. Gebruikers lijst opslaan" + "\n";
        in = in + "8. Naar werk menu (laatste positie)" + "\n";
        in = in + "9. Naar werk menu (positie 1)" + "\n";
        in = in + "0. Stoppen met het programma  ( !! EERST UITLOGGEN !!)";
        in = in + "\n\n" + "<<<< velden gemerkt met ( **** ) alleen toegankelijk voor bevoegde gebruikers >>>>";
        if (log == 5) {
            in = in + "\n\n\n" + "--- *** Gebruiker is ingelogd *** ---";
        }
        if (log == 0) {
            in = in + "\n\n\n" + "*** --- Gebruiker is NIET ingelogd --- ***";
        }
        Options();
    }

    public void Options() {
        no = JOptionPane.showInputDialog(null, in, in1, JOptionPane.PLAIN_MESSAGE);
        if (Objects.equals(no, "1")) {
            menuRun1();
        }
        if (Objects.equals(no, "2")) {
            menuRun2();
            showOptions();
        }
        if (Objects.equals(no, "3") && log == 5) {
            if (Objects.equals(user3, "ja")) {
                menuRun3();
                File.Write1();
                File.Read1();
                showOptions();
            }
        }
        if (Objects.equals(no, "3")) {
            menuRun0();
            showOptions();
        }
        if (Objects.equals(no, "4") && log == 5) {
            if (Objects.equals(user3, "ja")) {
                menuRun4();
                showOptions();
            }
        }
        if (Objects.equals(no, "4")) {
            menuRun0();
            showOptions();
        }
        if (Objects.equals(no, "5") && log == 5) {
            if (Objects.equals(user3, "ja")) {
                menuRun5();
                showOptions();
            }
        }
        if (Objects.equals(no, "5")) {
            menuRun0();
            showOptions();
        }
        if (Objects.equals(no, "6")) {
            menuRun6();
            showOptions();
        }
        if (Objects.equals(no, "7")) {
            File.Write1();
            JOptionPane.showMessageDialog(null, "De gegevens zijn opgeslagen !", "Aantal : " + File.counts, JOptionPane.PLAIN_MESSAGE);
            File.Read1();
            showOptions();
        }
        if (Objects.equals(no, "8") && log == 0) menuRun1();
        if (Objects.equals(no, "9") && log == 0) menuRun1();
        if (Objects.equals(no, "0") && log == 0) System.exit(1);
        if (Objects.equals(no, "0") && log == 5) {
            JOptionPane.showMessageDialog(null, "U dient zich eerst uit te loggen alvorens het programma te sluiten", "PAS OP !!", JOptionPane.ERROR_MESSAGE);
            showOptions();
        }
        if (no == null && log == 5) {
            JOptionPane.showMessageDialog(null, "U dient zich eerst uit te loggen alvorens het programma te sluiten", "PAS OP !!", JOptionPane.ERROR_MESSAGE);
            showOptions();
        }
        if (no == null && log == 0) System.exit(1);
        if (Objects.equals(no, "9") && log == 5) b = 4;
        menuRun8();
        if (Objects.equals(no, "super8") && log == 5) if (Objects.equals(user3, "ja")) menuRun9();
        if (Objects.equals(no, "8") && log == 5) {
            b = 5;
            menuRun8();
        } else {
            if (b == 2) {
                JOptionPane.showMessageDialog(null, "Foute invoer !!", "FOUT !!", JOptionPane.ERROR_MESSAGE);
                showOptions();
            }
        }
    }

    public void menuRun0() {
        JOptionPane.showMessageDialog(null, "U dient ingelogd te zijn met een bevoegdheid om data's te wijzigen", "PAS OP !!", JOptionPane.ERROR_MESSAGE);
    }

    public void menuRun1() {
        // inloggen
        if (log == 5) {
            JOptionPane.showMessageDialog(null, "U bent al ingelogd !!", "LOGGED ON !!", JOptionPane.ERROR_MESSAGE);
            showOptions();
        }
        user1 = JOptionPane.showInputDialog(null, "Uw Gebruikersnaam : ", "Log in", JOptionPane.PLAIN_MESSAGE);
        user2 = JOptionPane.showInputDialog(null, "Uw wachtwoord : ", "Log in", JOptionPane.PLAIN_MESSAGE);
        x = 0;
        boolean youlogon = false;
        while (!youlogon) {
            x = x + 1;
            if (Objects.equals(user1, File.User1[x])) {
                // gebruiker gevonden
                if (Objects.equals(user2, File.User2[x])) {
                    // wachtwoord
                    user3 = File.User3[x];
                    log = 5;
                    user4 = File.User4[x];
                    // code
                    JOptionPane.showMessageDialog(null, "Succesvol ingelogd !!", "Log in succes", JOptionPane.PLAIN_MESSAGE);
                    youlogon = true;
                    Us.LOG = "5";
                    Us.Userlog1 = File.User1[x];
                    Us.Userlog2 = File.User3[x];
                    Us.Userlog3 = File.User4[x];
                    Us.Write2();
                    showOptions();
                }
            }
            if (x == File.counts && log == 0) {
                JOptionPane.showMessageDialog(null, "U bent NIET ingelogd" + "\n" + "Er is iets mis gegaan met de invoer", "SORRY !!", JOptionPane.ERROR_MESSAGE);
                showOptions();
            }
        }
    }

    public void menuRun2() {
        // toevoegen
        a = 12;
        x = 0;
        // bevoegdheid
        if (log == 5) {
            if (Objects.equals(user3, "ja")) {
                boolean DatAS = false;
                while (!DatAS) {
                    x++;
                    if (x == File.counts + 1) {
                        a = 5;
                    }
                    if (a == 12) {
                        // indien het = 12345 = leeg
                        if (Objects.equals(File.User1[x], "12345")) {
                            JOptionPane.showMessageDialog(null, "Leeg veld nr : " + x + " gevonden.", "Data : " + x, JOptionPane.PLAIN_MESSAGE);
                            input();
                            a = 9;
                            DatAS = true;
                        }
                    }
                    if (a == 5) {
                        if (x > Usr) {
                            BigError();
                            DatAS = true;
                        } else {
                            if (File.counts < x) {
                                File.counts = x;
                            }
                            JOptionPane.showMessageDialog(null, "Nieuwe data wordt bijgemaakt", "Data : " + x, JOptionPane.PLAIN_MESSAGE);
                            input();
                            DatAS = true;
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "U dient ingelogd te zijn met een bevoegdheid om data's te wijzigen", "PAS OP !!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void BigError() {
        UIManager.put("OptionPane.background", Color.RED);
        JOptionPane.showMessageDialog(null, "Maximale data's bereikt , neem contact op met de programmeur van dit programma", "SORRY VOL", JOptionPane.ERROR_MESSAGE);
        UIManager.put("OptionPane.background", Color.BLUE);
    }

    public void menuRun3() {
        // Wachtwoord veranderen
        x = 0;
        a = 1;
        user1 = JOptionPane.showInputDialog(null, "Voer gebruikersnaam in : ", "Wijzigen", JOptionPane.PLAIN_MESSAGE);
        Boolean CHANGE = false;
        while (!CHANGE) {
            x++;
            if (a == 1) {
                if (Objects.equals(File.User1[x], user1)) {
                    JOptionPane.showMessageDialog(null, "Data : " + x + "  user : " + File.User1[x] + "Gevonden.", "Veld nummer : " + x + " gevonden.", JOptionPane.PLAIN_MESSAGE);
                    user2 = JOptionPane.showInputDialog(null, "Geef het nieuwe wachtwoord in : ", "Wachtwoord", JOptionPane.PLAIN_MESSAGE);
                    user2a = JOptionPane.showInputDialog(null, "Voer nogmaals het nieuwe wachtwoord in : ", "Wachtwoord", JOptionPane.PLAIN_MESSAGE);
                    CHANGE = true;
                    a = 2;
                    if (Objects.equals(user2, user2a)) {
                        File.User2[x] = user2;
                        JOptionPane.showMessageDialog(null, "Het wachtwoord is veranderd .", "VERANDERD !!", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Het wachtwoord is NIET veranderd.", "NIET VERANDERD !!", JOptionPane.WARNING_MESSAGE);
                    }
                    if (x >= File.counts) {
                        CHANGE = true;
                    }
                    CHANGE = false;
                }
                if (x >= File.counts) {
                    CHANGE = true;
                }
                CHANGE = false;
            }
            if (x >= File.counts) {
                CHANGE = true;
            }
        }
        JOptionPane.showMessageDialog(null, "Einde van de data lijst", "The End", JOptionPane.PLAIN_MESSAGE);
    }

    public void menuRun4() {
        // gebruiker verwijderen
        x = 0;
        a = 1;
        user1 = JOptionPane.showInputDialog(null, "Voer de te wissen gebruiker in : ", "Verwijderen", JOptionPane.PLAIN_MESSAGE);
        Boolean CHANGE = false;
        while (!CHANGE) {
            x++;
            if (a == 1) {
                if (Objects.equals(File.User1[x], user1)) {
                    out = "Gevonden : " + File.User1[x] + "\n" + "Machtiging : " + File.User3[x];
                    JOptionPane.showMessageDialog(null, out, "Gevonden om te verwijderen", JOptionPane.PLAIN_MESSAGE);
                    user3a = JOptionPane.showInputDialog(null, "Voer de beveiligings code in : ", "check machtiging", JOptionPane.QUESTION_MESSAGE);
                    if (Objects.equals(user3a, user4)) {
                        JOptionPane.showMessageDialog(null, "Data is gewist :", "Verwijderd : " + x, JOptionPane.PLAIN_MESSAGE);
                        File.User1[x] = "12345";
                        File.User2[x] = "*";
                        File.User3[x] = "nee";
                        File.User4[x] = "0000";
                        // Hier kunnen meer velden toegevoegd worden bij uitbreiding.
                        CHANGE = true;
                        a = 2;
                        File.Write1();
                        File.Read1();
                        showOptions();
                    } else {
                        JOptionPane.showMessageDialog(null, "Geen toegang tot de database !!", "Foute code", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (x <= File.counts) {
                    CHANGE = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Einde van de data lijst.", "Einde : " + x, JOptionPane.PLAIN_MESSAGE);
                    CHANGE = true;
                }
            }
        }
    }

    public void menuRun5() {
        // overzicht
        out = "Aantal gebruikers : " + File.counts + "\n\n";
        page2 = 0;
        for (x = 1; x <= File.counts; x++) {
            boolean page = x % 10 == 0;
            if (page) {
                page2++;
                // System.out.println(File.User1[i]+"---"+File.User2[i]+"---"+File.User3[i]+"---"+File.User4[i]);
                JOptionPane.showMessageDialog(null, out, "Overzicht pagina :" + page2, JOptionPane.PLAIN_MESSAGE);
                out = "Aantal gebruikers : " + File.counts + "\n\n";
                out = out + "Gebruiker : " + x + "     Naam : " + File.User1[x] + "     Bevoegdheid : " + File.User3[x] + "\n";
            } else {
                // System.out.println(File.User1[i]+"---"+File.User2[i]+"---"+File.User3[i]+"---"+File.User4[i]);
                out = out + "Gebruiker : " + x + "     Naam : " + File.User1[x] + "     Bevoegdheid : " + File.User3[x] + "\n";
            }
        }
        page2++;
        JOptionPane.showMessageDialog(null, out, "Overzicht pagina :" + page2, JOptionPane.PLAIN_MESSAGE);
    }

    public void menuRun6() {
        // Uitloggen
        log = 0;
        Us.LOG = "0";
        Us.Userlog1 = "---";
        Us.Userlog3 = "nee";
        user2 = "nee";
        Us.Userlog2 = user2;
        Us.Write2();
        JOptionPane.showMessageDialog(null, "U bent uitgelogd !!", "LET OP!!", JOptionPane.ERROR_MESSAGE);
        showOptions();
    }

    public void input() {
        JOptionPane.showMessageDialog(null, "De teller staat op data : " + x, x + " van : " + File.counts, JOptionPane.PLAIN_MESSAGE);
        File.User1[x] = JOptionPane.showInputDialog(null, "Voer nieuwe gebruikersnaam in : ", "Data : " + x, JOptionPane.PLAIN_MESSAGE);
        if (File.User1[x] == null) {
            File.User1[x] = "12345";
        }
        input1();
    }

    public void input1() {
        File.User2[x] = JOptionPane.showInputDialog(null, "Voer nieuw wachtwoord in : ", "Data : " + x, JOptionPane.PLAIN_MESSAGE);
        if (File.User2[x] == null) {
            File.User2[x] = "*";
        }
        File.User3[x] = JOptionPane.showInputDialog(null, "Is gebruiker toegestaan wijzigingen in het systeem uit te voeren : ", "Data : " + x, JOptionPane.PLAIN_MESSAGE);
        if (File.User3[x] == null) {
            File.User3[x] = "nee";
        }
        if (Objects.equals(File.User3[x], "ja")) {
            File.User4[x] = JOptionPane.showInputDialog(null, "Maak uw bevestigings code : ", "Data : " + x, JOptionPane.PLAIN_MESSAGE);
            if (File.User4[x] == null) {
                File.User4[x] = "0000";
            } else {
                File.User4[x] = "0000";
            }
        }
        File.Write1();
        File.Read1();
        // Hier kunnen meer velden toegevoegd worden bij uitbreiding.
    }

    public void menuRun8() {
        if (b == 4) {
            Us.maxRecords1 = 1;
            Us.Write2();
            final Menu03 User = new Menu03();
            b = 3;
        }
        if (b == 5) {
            final Menu03 User = new Menu03();
            b = 3;
            // User.Menu03();
        }
    }

    public void logon() {
        user1 = Us.Userlog1;
        user3 = Us.Userlog2;
        user4 = Us.Userlog3;
    }

    public void menuRun9() {
        a = 1;
        x = 0;
        user3a = JOptionPane.showInputDialog(null, "Voer de beveiligings code in : ", "check machtiging", JOptionPane.QUESTION_MESSAGE);
        if (Objects.equals(user3a, user4)) {
            user1 = JOptionPane.showInputDialog(null, "Zoek gebruiker : ", "Wijzigen / Inzien", JOptionPane.PLAIN_MESSAGE);
            Boolean CHANGE = false;
            while (!CHANGE) {
                x++;
                if (a == 1) {
                    if (Objects.equals(File.User1[x], user1)) {
                        System.out.println(File.User0);
                        user2a = JOptionPane.showInputDialog(null, "Geef de privacy code in :", "Privacy code", JOptionPane.QUESTION_MESSAGE);
                        if (Objects.equals(user2a, File.User0)) {
                            JOptionPane.showMessageDialog(null, "Data : " + x + "  user : " + File.User1[x] + " Gevonden.", "Veld nummer : " + x + " gevonden.", JOptionPane.PLAIN_MESSAGE);
                            File.User1[x] = JOptionPane.showInputDialog("Gebruikers naam", File.User1[x]);
                            File.User2[x] = JOptionPane.showInputDialog("Wachtwoord : ", File.User2[x]);
                            File.User3[x] = JOptionPane.showInputDialog("bevoegd : ", File.User3[x]);
                            if (Objects.equals(File.User3[x], "ja")) {
                                File.User4[x] = JOptionPane.showInputDialog("Supervisor wachtwoord : ", File.User4[x]);
                            } else {
                                File.User4[x] = "0000";
                            }
                            CHANGE = true;
                            a = 2;
                            File.Write1();
                            File.Read1();
                            JOptionPane.showMessageDialog(null, "De gegevens zijn aangepast .", "AANGEPAST !!", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    if (x >= File.counts) {
                        CHANGE = true;
                    }
                    CHANGE = false;
                }
                CHANGE = x >= File.counts;
            }
            if (a == 1) {
                JOptionPane.showMessageDialog(null, "De gegevens zijn NIET aangepast .", "NIET AANGEPAST !!", JOptionPane.WARNING_MESSAGE);
            }
        }
        showOptions();
    }
}