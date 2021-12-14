package basics.code;

import javax.swing.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Menu04 {
    String Userlog1, Userlog2, Userlog3, max, max1, LOG, Company, Userlog0, Max2;
    int maxRecords1, maxRecords = 500000, MaxRecords;
    // max getest = 1700000 veilig is 1200000 ik geef 500000

    public void Read2() { // hulp file voor goede werking programma
        Menu01 Use = new Menu01();
        try {
            FileReader Read2 = new FileReader("\\\\VUSOLO4K\\harddisk\\data\\data.log");
            Scanner read2 = new Scanner(Read2);
            max1 = read2.nextLine();
            maxRecords1 = Integer.parseInt(max1);
            max = read2.nextLine();
            maxRecords = Integer.parseInt(max);
            LOG = read2.nextLine();
            if (Objects.equals(LOG, "5")) {
                Userlog1 = read2.nextLine();
                Userlog2 = read2.nextLine();
                Userlog3 = read2.nextLine();
                Userlog3 = AES.decrypt(Userlog3, Use.Key1);
                Userlog0 = read2.nextLine();
                Company = read2.nextLine();
                Max2 = read2.nextLine();
                MaxRecords = Integer.parseInt(Max2);
                // hier aanpassen bij uitbreiding.
            }
            read2.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "er is iets fout gegaan : " + ex, "FOUT !!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Write2() { // hulp file voor goede werking programma
        Menu01 Use = new Menu01();
        try {
            FileWriter writer2 = new FileWriter("\\\\VUSOLO4K\\harddisk\\data\\data.log");
            max1 = Integer.toString(maxRecords1);
            writer2.write(max1 + "\r");
            max = Integer.toString(maxRecords);
            writer2.write(max + "\r");
            writer2.write(LOG + "\r");
            if (Objects.equals(LOG, "5")) {
                writer2.write(Userlog1 + "\r");
                writer2.write(Userlog2 + "\r");
                String originalString4 = Userlog3;
                Userlog3 = AES.encrypt(originalString4, Use.Key1);
                writer2.write(Userlog3 + "\r");
                writer2.write(Userlog0 + "\r");
                writer2.write(Company + "\r");
                writer2.write(MaxRecords + "\r");
                // hier aanpassen bij uitbreiding.
            }
            writer2.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "er is iets fout gegaan : " + ex, "FOUT !!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
