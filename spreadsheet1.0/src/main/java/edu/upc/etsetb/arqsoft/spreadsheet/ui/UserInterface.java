/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.spreadsheet.ui;

/**
 *
 * @author quim5
 */
public interface UserInterface {
    
    
    /*public void setSpreadsheetAndFactory(Spreadsheet spreadsheet, SpreadsheetFactory factory);
    public String initSpreadsheetDialog() throws IOException;
    public boolean editSpreadsheetDialog() throws IOException, BadCoordinateException, ContentException;
    public void printSpreadSheet();
    public String closeSpreadsheetDialog() throws IOException;*/
    
    public void viewSpreadsheet();
    
    public String initConsole();
    
    public void editConsole();
    
    public void closeConsole();
}
