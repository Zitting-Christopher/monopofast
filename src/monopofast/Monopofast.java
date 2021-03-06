/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopofast;

import cit260.lhcz.monopofast.model.*;
import cit260.lhcz.monopofast.view.*;
import exception.GameControlException;
import java.io.BufferedReader;
import java.io.IOException;
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

    public static void main(String[] args) throws GameControlException {

        try {

            Monopofast.inFile = new BufferedReader(new InputStreamReader(System.in));
            Monopofast.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            Monopofast.logFile = new PrintWriter(filePath);

            // create StartProgramView and start the program
            StartView startView = new StartView();
            try {
                startView.startProgram();
            } catch (Throwable te) {
                System.out.println(te.getMessage());
                te.printStackTrace();
                startView.startProgram();
            }
        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString() + "\nCause: " + e.getCause() + "\nMessage: " + e.getMessage());

            e.printStackTrace();;
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
            } catch (IOException ex) {
                System.out.println("Error closing files.");
                return;
            }
        }
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
    
}