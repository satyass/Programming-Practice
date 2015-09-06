package com.main;

import java.io.File;

public class FilesInFolder {
	
	public int countFilesInFolder(String folder){
		int counter = 0;
		File file = new File(folder);
        File[] files = file.listFiles();
        for(int i =0; i< files.length;i++){
            System.out.println(files[i].getName());
            counter++;
            
        }
        return counter;
	}

	public static void main(String[] args) {
		
		FilesInFolder fif = new FilesInFolder();
		int count = fif.countFilesInFolder("C:\\JavaEx\\");
		System.out.println("File Count = "+count);
		

	}

}
