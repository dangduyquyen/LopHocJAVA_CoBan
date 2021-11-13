/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThaoTacTapTinThuMuc_logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    // Thao tac 1: Liet ke tat ca cac thu muc va tap tin trong thu muc hien tai
    public File[] getDirectoryContent(String Folder){
        File directory = new File(Folder);
        if(directory.isFile())
            return null;
        File[] results = directory.listFiles();
        return results;
    }
    // Thao tac 2: Xuat ket qua
    
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < content.length; i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    // Thao tac 3: Loc ra cac thu muc
    
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i = 0; i < content.length; i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    // Thao tac 4: loc ra cac tap tin
    public File[] getFiles(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i = 0; i < content.length; i++){
            if(content[i].isFile()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
        
    }

    // Thao tac 5: Duyet de quy tat ca cac tap tin va thu muc
    
    public void getContentRecursively(String folder){
        File content = new File(folder);
        // Dieu kien dung
        if(content.isFile()){
            System.out.println(content.getPath() + File.separator + content.getName());
            return;
        }
        // Cau goi de quy trong stack
        System.err.println("Thu muc: " + folder);
        File[] sub = content.listFiles();
        for(int i = 0; i < sub.length; i ++){
            getContentRecursively(folder + File.separator + sub[i].getName());
        }
        
          
    }
    
    // Thao tac 6: Doc file van ban 
    public String readTextFile(String filename){
        StringBuilder content = new StringBuilder();
        
        try {
            // Mở file
            FileReader fr = new FileReader(filename);
            // Dùng bộ đệm
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            while ((line = br.readLine()) != null){
                content.append(line);
                content.append("\n");
            }
            // Đóng file
            br.close();
            fr.close();
            
        } catch (FileNotFoundException ex) {
            return "Ko tim thay file: " + filename;
        } catch (IOException ex) {
            return "Ko the dong file: " + filename;
        }
        return content.toString();
    }
    // thao tac 7: luu tap tin văn bản;
    public boolean writeTextFile(String filename, String content){
        boolean flag = true; // lưu thành công
        try {
            // mở file
            FileWriter fw = new FileWriter(filename);
            // 
            BufferedWriter bw = new BufferedWriter(fw);
            // ghi file ra
            bw.write(content);
            // đóng file
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            return false;
        }
        return flag;
    }
    
}
