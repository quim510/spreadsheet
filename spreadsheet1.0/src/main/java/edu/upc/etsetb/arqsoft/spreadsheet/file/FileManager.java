/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.spreadsheet.file;

import java.util.List;

/**
 *
 * @author quim
 */
public interface FileManager {

    public List loadSpreadsheet(String filepath);
    
    public List createEmptySpreadsheet();
    
    public void saveSpreadsheet(String filepath); 
}
