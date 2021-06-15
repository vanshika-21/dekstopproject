package com.vp.fp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FolderScanUtil {

	static List<FileFolder> scanResultList = new ArrayList<>();
	

	public static void main(String[] args) {
		displayAllv2(new File("H:\\CodeWS\\SpringBoot\\demo-rest-api-1\\src"));
		List<FileFolder> listScanFiles1 = new ArrayList<>(scanResultList);	
		System.out.println(listScanFiles1);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		scanResultList.clear();
		displayAllv2(new File("H:\\CodeWS\\SpringBoot\\demo-rest-api-1\\src"));
		List<FileFolder> listScanFiles2 = new ArrayList<>(scanResultList);
		System.out.println(listScanFiles2);
		
		System.out.println("compareFolders : "+compareFolders(listScanFiles1,listScanFiles2));
	}

	public static void displayAllv2(File path) {

		if (path.isFile()) {			
			FileFolder tempFileFolder = new FileFolder(path.getName(), path.getAbsolutePath(), path.isFile(),
					path.isDirectory(), path.getTotalSpace());
			scanResultList.add(tempFileFolder);
		} else {			
			FileFolder tempFileFolder = new FileFolder(path.getName(), path.getAbsolutePath(), path.isFile(),
					path.isDirectory(), path.getTotalSpace());
			scanResultList.add(tempFileFolder);
			File files[] = path.listFiles();
			for (File dirOrFile : files) {
				displayAllv2(dirOrFile);
			}
		}
	}
	
	public static boolean compareFolders(List<FileFolder> listScanPath1,List<FileFolder> listScanpath2) {
		System.out.println("listScanPath1.size() != listScanpath2.size() "+ listScanPath1.size() +"?"+ listScanpath2.size());
		if(listScanPath1.size() != listScanpath2.size()) {
			return false;
		}else {
			for(int i=0;i<listScanpath2.size();i++) {
				if(!listScanPath1.get(i).equals(listScanpath2.get(i))) {
					return false;
				}
			}
			return true;
		}
		
		
	}

}
