/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopofast;

import cit260.lhcz.monopofast.model.*;
import cit260.lhcz.monopofast.view.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Christopher
 */
public class Monopofast {

    private static Game currentGame = null;
    private static Player player = null;
    private static Location currentLocation = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Monopofast.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Monopofast.player = player;
    }


    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Monopofast.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Monopofast.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Monopofast.logFile = logFile;
    }

    public static Location getCurrentLocation() {
        return currentLocation;
    }
   
    public static void setCurrentLocation(Location currentLocation) {
        Monopofast.currentLocation = currentLocation;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Monopofast.inFile = new BufferedReader(new InputStreamReader(System.in));
            Monopofast.outFile = new PrintWriter(System.out, true);

            String filePath = "Mopopofast_log.txt";
            Monopofast.logFile = new PrintWriter(filePath);

            StartView StartView = new StartView();
                StartView.startProgram();
            } catch (Throwable te) {
            System.out.println("Exception: " + te.toString()
                    + "\nCause: " + te.getCause()
                    + "\nMessage: " + te.getMessage());
                te.printStackTrace();
        } finally {
            try {
                if (Monopofast.inFile != null) {
                    Monopofast.inFile.close();
                }
                if (Monopofast.outFile != null) {
                    Monopofast.outFile.close();
                }
                if (Monopofast.logFile != null) {
                    Monopofast.logFile.close();
                }
            } catch (Exception ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
}
 
