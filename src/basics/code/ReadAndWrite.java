package basics.code;

import javax.swing.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite {
    Menu04 Us = new Menu04();
    int i;// count
    int x;// count1
    int a,count,counts,maxUsers = 250;
    String[] Field1 = new String[Us.maxRecords];
    String[] Field2 = new String[Us.maxRecords];
    String[] Field3 = new String[Us.maxRecords];
    String[] Field4 = new String[Us.maxRecords];
    String[] Field5 = new String[Us.maxRecords];
    String[] Field6 = new String[Us.maxRecords];
    String[] Field7 = new String[Us.maxRecords];
    String[] Field8 = new String[Us.maxRecords];
    String[] Field9 = new String[Us.maxRecords];
    String[] Field10 = new String[Us.maxRecords];
    String[] Field11 = new String[Us.maxRecords];
    String[] Field12 = new String[Us.maxRecords];
    String[] Field13 = new String[Us.maxRecords];
    String[] Field14 = new String[Us.maxRecords];
    String[] Field15 = new String[Us.maxRecords];
    String record,records,User0;
    String[] User1 = new String[maxUsers];
    String[] User2 = new String[maxUsers];
    String[] User3 = new String[maxUsers];
    String[] User4 = new String[maxUsers];

    public void Read() { // lees hoofdmenu data ( gecodeerd )
        Menu01 Use = new Menu01();
        try {
            i = 0;
            FileReader Read = new FileReader("\\\\VUSOLO4K\\harddisk\\data\\data.cde");// database nedal
            Scanner read = new Scanner(Read);
            record = read.nextLine();
            record = AES.decrypt(record, Use.Key2);
            count = Integer.parseInt(record);
            boolean DAT = false;
            while (!DAT) {
                i++;
                Field1[i] = read.nextLine();
                Field1[i] = AES.decrypt(Field1[i], Use.Key2);
                Field2[i] = read.nextLine();
                Field2[i] = AES.decrypt(Field2[i], Use.Key2);
                Field3[i] = read.nextLine();
                Field3[i] = AES.decrypt(Field3[i], Use.Key2);
                Field4[i] = read.nextLine();
                Field4[i] = AES.decrypt(Field4[i], Use.Key2);
                Field5[i] = read.nextLine();
                Field5[i] = AES.decrypt(Field5[i], Use.Key2);
                Field6[i] = read.nextLine();
                Field6[i] = AES.decrypt(Field6[i], Use.Key2);
                Field7[i] = read.nextLine();
                Field7[i] = AES.decrypt(Field7[i], Use.Key2);
                Field8[i] = read.nextLine();
                Field8[i] = AES.decrypt(Field8[i], Use.Key2);
                Field9[i] = read.nextLine();
                Field9[i] = AES.decrypt(Field9[i], Use.Key2);
                Field10[i] = read.nextLine();
                Field10[i] = AES.decrypt(Field10[i], Use.Key2);
                Field11[i] = read.nextLine();
                Field11[i] = AES.decrypt(Field11[i], Use.Key2);
                Field12[i] = read.nextLine();
                Field12[i] = AES.decrypt(Field12[i], Use.Key2);
                Field13[i] = read.nextLine();
                Field13[i] = AES.decrypt(Field13[i], Use.Key2);
                Field14[i] = read.nextLine();
                Field14[i] = AES.decrypt(Field14[i], Use.Key2);
                Field15[i] = read.nextLine();
                Field15[i] = AES.decrypt(Field15[i], Use.Key2);
                // hier aanpassen bij uitbreiding.
                if (i == count) {
                    a = 12;
                    DAT = true;
                } else {
                    DAT = false;
                }
            }
            if (i > count) {
                read.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Write() { // schrijf hoofdmenu data ( gecodeerd )
        Menu01 Use = new Menu01();
        try {
            FileWriter writer = new FileWriter("\\\\VUSOLO4K\\harddisk\\data\\data.cde"); // Database nevjirhcs
            record = Integer.toString(count);
            final String originalString = record;
            record = AES.encrypt(originalString, Use.Key2);
            writer.write(record + "\r");
            i = 0;
            boolean DATA = false;
            while (!DATA) {
                i++;
                String originalString1 = Field1[i];
                Field1[i] = AES.encrypt(originalString1, Use.Key2);
                writer.write(Field1[i] + "\r");
                String originalString2 = Field2[i];
                Field2[i] = AES.encrypt(originalString2, Use.Key2);
                writer.write(Field2[i] + "\r");
                String originalString3 = Field3[i];
                Field3[i] = AES.encrypt(originalString3, Use.Key2);
                writer.write(Field3[i] + "\r");
                String originalString4 = Field4[i];
                Field4[i] = AES.encrypt(originalString4, Use.Key2);
                writer.write(Field4[i] + "\r");
                String originalString5 = Field5[i];
                Field5[i] = AES.encrypt(originalString5, Use.Key2);
                writer.write(Field5[i] + "\r");
                String originalString6 = Field6[i];
                Field6[i] = AES.encrypt(originalString6, Use.Key2);
                writer.write(Field6[i] + "\r");
                String originalString7 = Field7[i];
                Field7[i] = AES.encrypt(originalString7, Use.Key2);
                writer.write(Field7[i] + "\r");
                String originalString8 = Field8[i];
                Field8[i] = AES.encrypt(originalString8, Use.Key2);
                writer.write(Field8[i] + "\r");
                String originalString9 = Field9[i];
                Field9[i] = AES.encrypt(originalString9, Use.Key2);
                writer.write(Field9[i] + "\r");
                String originalString10 = Field10[i];
                Field10[i] = AES.encrypt(originalString10, Use.Key2);
                writer.write(Field10[i] + "\r");
                String originalString11 = Field11[i];
                Field11[i] = AES.encrypt(originalString11, Use.Key2);
                writer.write(Field11[i] + "\r");
                String originalString12 = Field12[i];
                Field12[i] = AES.encrypt(originalString12, Use.Key2);
                writer.write(Field12[i] + "\r");
                String originalString13 = Field13[i];
                Field13[i] = AES.encrypt(originalString13, Use.Key2);
                writer.write(Field13[i] + "\r");
                String originalString14 = Field14[i];
                Field14[i] = AES.encrypt(originalString14, Use.Key2);
                writer.write(Field14[i] + "\r");
                String originalString15 = Field15[i];
                Field15[i] = AES.encrypt(originalString15, Use.Key2);
                writer.write(Field15[i] + "\r");
                // hier kunnen meer velden toegevoegd worden bij uitbreiding.
                // LET OP ( ook encryptie en laden aanpassen }
                DATA = i == count;
            }
            writer.close();
        } catch (Exception ex) { // als het niet lukt, dan probeer :
            JOptionPane.showMessageDialog(null, "er is iets fout gegaan : " + ex, "FOUT !!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Read1() { // inlog data ( gecodeerd )
        Menu01 Use = new Menu01();
        try {
            x = 0;
            FileReader Read1 = new FileReader("\\\\VUSOLO4K\\harddisk\\data\\data.cdp");
            Scanner read1 = new Scanner(Read1);
            User0 = read1.nextLine();
            User0 = AES.decrypt(User0, Use.Key);
            records = read1.nextLine();
            records = AES.decrypt(records, Use.Key);
            counts = Integer.parseInt(records);
            if (counts > 0) {
                boolean DAT = false;
                while (!DAT) {
                    x++;
                    User1[x] = read1.nextLine();
                    User1[x] = AES.decrypt(User1[x], Use.Key);
                    User2[x] = read1.nextLine();
                    User2[x] = AES.decrypt(User2[x], Use.Key);
                    User3[x] = read1.nextLine();
                    User3[x] = AES.decrypt(User3[x], Use.Key);
                    User4[x] = read1.nextLine();
                    User4[x] = AES.decrypt(User4[x], Use.Key);
                    // hier aanpassen bij uitbreiding.
                    if (x == counts) {
                        a = 12;
                        DAT = true;
                    } else {
                        DAT = false;
                    }
                }
            }
            if (x > counts) {
                read1.close();
            }
            read1.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "er is iets fout gegaan : " + ex, "FOUT !!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Write1() { // inlog data ( gecodeerd )
        Menu01 Use = new Menu01();
        try {
            FileWriter writer1 = new FileWriter("\\\\VUSOLO4K\\harddisk\\data\\data.cdp");
            // User0="Data-00/Data-End"; // use only to change programm settings
            String originalString0 = User0;
            User0 = AES.encrypt(originalString0, Use.Key);
            writer1.write(User0 + "\r");
            records = Integer.toString(counts);
            JOptionPane.showMessageDialog(null, "er worden " + records + " data's opgeslagen.", "Opslaan !", JOptionPane.WARNING_MESSAGE);
            String originalString = records;
            records = AES.encrypt(originalString, Use.Key);
            writer1.write(records + "\r");
            x = 0;
            boolean DATA = false;
            while (!DATA) {
                x++;
                String originalString1 = User1[x];
                User1[x] = AES.encrypt(originalString1, Use.Key);
                writer1.write(User1[x] + "\r");
                String originalString2 = User2[x];
                User2[x] = AES.encrypt(originalString2, Use.Key);
                writer1.write(User2[x] + "\r");
                String originalString3 = User3[x];
                User3[x] = AES.encrypt(originalString3, Use.Key);
                writer1.write(User3[x] + "\r");
                String originalString4 = User4[x];
                User4[x] = AES.encrypt(originalString4, Use.Key);
                writer1.write(User4[x] + "\r");
                // hier kunnen meer velden toegevoegd worden bij uitbreiding.
                // LET OP ( ook encryptie en laden aanpassen }
                DATA = x == counts;
            }
            writer1.close();
        } catch (Exception ex) { // als het niet lukt, dan probeer :
            JOptionPane.showMessageDialog(null, "er is iets fout gegaan : " + ex, "FOUT !!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
