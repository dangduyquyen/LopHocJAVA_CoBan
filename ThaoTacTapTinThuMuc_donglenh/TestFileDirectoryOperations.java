/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThaoTacTapTinThuMuc_donglenh;

import ThaoTacTapTinThuMuc_logic.FileAndDirectoryOperations;
import java.io.File;
/**
 *
 * @author Admin
 */
public class TestFileDirectoryOperations {
    public static void main(String[] args) {
        FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
//        File[] content = fo.getDirectoryContent("D:\\TL");
//      //  System.out.println(fo.displayContent(content));
//        File[] thumuc = fo.getSubDirectories(content);
//        System.out.println("Danh sach cac thu muc con la");
//        System.out.println(fo.displayContent(thumuc));
//        File[] taptin = fo.getFiles(content);
//        System.out.println("Danh sach cac tap tin con la");
//        System.out.println(fo.displayContent(taptin));

        fo.getContentRecursively("C:\\Users\\dangd\\OneDrive\\Tài liệu");
        
        
        
    }
}
