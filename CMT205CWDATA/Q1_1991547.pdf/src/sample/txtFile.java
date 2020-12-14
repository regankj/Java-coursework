package sample;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class txtFile {

    /*function to generate report text file
    taken from https://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-it-in-java
    accessed 35-04-20
    end of referenced code
     */

    public static void generateFile() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("report.txt", "UTF-8");
        writer.println("Key: H - highest mean max temp, L - lowest mean min temp, AF - average air frost per year, R - average rain per year \n");
        writer.println("\nAbertporth: H = 20.7(Jul2015), L = -0.1(Dec2012), AF = 16, R = 933.48\n");
        writer.println("\nArmagh: H = 23.1(Jul2015), L = -3.8(Dec2012), AF = 40.22, R = 855.66\n");
        writer.println("\nBallypatrick Forest: H = 19.6(Jul2015), L = -0.3(Dec2012) , AF = 23.22, R = 1415.91\n");
        writer.println("\nBradford: H = 23.1(Jul2015), L = -3.7(Dec2012), AF = 39.56, R = 878.27\n");
        writer.println("\nBraemar: H = 21.9(Jul2015), L = -8.1(Dec2012), AF = 107.56, R = 938.53\n");
        writer.println("\nCamborne: H = 20.8(Jul2015), L = 1.4(Dec2012), AF = 9, R = 1085.88\n");
        writer.println("\nCambridge NIAB: H = 25.1(Jul2015), L = -2.7(Dec2012), AF = 39.67, R = 536.16\n");
        writer.println("\nCardiff Bute Park: H = 25(Jul2015), L = -3.4(Ded2012), AF = 37.33, R = 1170.36\n");
        writer.println("\nChivenor: H = 23.4(Jul2015), L = -2.5(Dec2012), AF = 21.11, R = 966.61\n");
        writer.println("\nCwmystwyth: H = 18.8(Jul2012), L = -3.7(Dec2012), AF = 64, R = 1170.27\n");
        writer.println("\nDunstaffnage: H = 20.3(Jul2015), L = -2.1(Dec2012), AF = 28, R = 1766.29\n");
        writer.println("\nDurham: No Data Available\n");
        writer.println("\nEastbourne: H = 23(Jul2015), L = -0.5(Dec2012), AF = 17.89, R = 803.93\n");
        writer.println("\nEskdalemuir: H = 21.4(Jul2015), L = -6.8(Dec2012), AF = 85.22, R = 1957.74\n");
        writer.println("\nHeathrow: H = 27(Jul2015), L = -1.5(Dec2012), AF = 29.78, R = 624.67\n");
        writer.println("\nHurn: H = 25.4(Jul2015), L = -3.4(Dec2012), AF = 56.78, R = 910.7\n");
        writer.println("\nLerwick: H = 15.6(Jul2016), L = -1.2(Dec2012), AF = 28.56, R = 1287.11\n");
        writer.println("\nLeuchars: H = 21.4(Jul2015), L = -4.1(Dec2012), AF = 57.56, R = 757.22\n");
        writer.println("\nLowestoft: H = 23.6(Jul2012), L = -1.4(Dec2012), AF = 31, R = 626.02\n");
        writer.println("\nManston: H = 23.8(Aug2011), L = -1(Dec2012), AF = 23.78, R = 644.12\n");
        writer.println("\nNairn: H = 21.8(Jul2015), L = -3.7(Dec2012), AF = 54.78, R = 683.03\n");
        writer.println("\nNewton Rigg: H = 22.5(Jul2015), L = -7(dec2012), AF = 65.33, R = 1002.99\n");
        writer.println("\nOxford: H = 25.5(Jul2015), L = -2.2(Dec2012), AF = 36, R = 668.54\n");
        writer.println("\nPaisley: H = 22.4(Jul2015), L = -4.4(Dec2012), AF = 43.78, R = 1292.31\n");
        writer.println("\nRingway: No Data Available\n");
        writer.println("\nRoss-On-Wye: H = 25.5, L = -4.3(Dec2012), AF = 43.22, R = 759.56\n");
        writer.println("\nShawbury: H = 24.1(Jul2015), L = -5.8(Dec2012), AF = 58.89, R = 677.86\n");
        writer.println("\nSheffield: H = 24(Jul2015), L = -1.9(Dec2012), AF = 26.33, R = 789.27\n");
        writer.println("\nSouthampton: No Data Available\n");
        writer.println("\nStornoway Airport: H = 18.2(Jul2016), L = -0.7(Dec2012), AF = 23.11, R = 1233.39\n");
        writer.println("\nSutton Bonington: H = 24,3(Jul2015), L = -4(Dec2012), AF = 41.11, R = 601.77\n");
        writer.println("\nTiree: H = 17.7(Jul2015), L = 0.3(Dec2012), AF = 10.22, R = 1329.63\n");
        writer.println("\nValley: H = 21.6(Jul2015), L = -0.9(Dec2012), AF = 19.56, R = 875.47\n");
        writer.println("\nWaddington: H = 23.4(Jul2015), L = -3.3(Dec2012), AF = 36.67, R = 596.23\n");
        writer.println("\nWhitby: H = 22.4(Jul2015), L = -2.2(Dec(2012), AF = 31.33, R = 752.67\n");
        writer.println("\nWick Airport: H = 18.2(Jul2015), L = -2.9(Dec2012), AF = 36.67, R = 791.81\n");
        writer.println("\nYeovilton: H = 25.3(Jul2015), L = -4.5(Dec2012), AF = 50.78, R = 707.94\n");
        writer.close();
    }
}


