package com.fileOps;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
	
    static String pathOfRootFolder;
    static File rootFolder;                           // creating object of root folder path
    static Scanner userInputAsInteger = new Scanner(System.in);
    static Scanner userInputAsString = new Scanner(System.in);
    static int numberOfFiles;

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Take Path of root directory from the user    
    public static void rootFolderPathFromUser() {
    	
    	System.out.print("Enter your path of Root Directory:- ");
    	pathOfRootFolder = userInputAsString.nextLine();
    	rootFolder = new File(pathOfRootFolder);
    }
    
 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    //Display files in Root Directory
    
	public static void displayFiles() {
		System.out.println();
		if(rootFolder.isDirectory()){                                                                 //checking it is directory or not
	        File[] filesInRootFolder = rootFolder.listFiles();                                        // creating an array to store the files present in given folder
	            
	            if(filesInRootFolder != null && filesInRootFolder.length > 0){
	            	Arrays.sort(filesInRootFolder, Comparator.comparing(files -> files.getName().toLowerCase()));     //Sort the files in ascending order based on lowerCase file names
	                System.out.println("---> Folder contains the following files:");
	                for(File files : filesInRootFolder){                                             //Iterating files one by one
	                    System.out.println(files.getName());
	                    
	                }
	            }
	            else{
	                System.out.println("Folder is empty");
	            }
	        }
	        else{
	            System.out.println("Directory doesn't exist or Not a Directory");
	        }
		System.out.println("===========================================================================");
	}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Add files to the existing Root Directory
	
	
	public static void addFile() throws IOException {
		
		List<String> arrayToStoreFileNames = new ArrayList<>();
		  do{                                                           //creating loop until we get the input as an integer
	            try{
	            	System.out.println();
	        System.out.print("---> How many files you want to add:- ");
	        numberOfFiles = userInputAsInteger.nextInt();
	        break;
	            }
	        catch(InputMismatchException e){
	            System.out.println("please Enter a valid number");
	            System.out.println();
	            userInputAsInteger.next();// To clear the Scanner Buffer so that it will take a new value
	        }
	    }
	        while(true);
		  System.out.println("---> Enter the name of files you want to add");
          for(int i=1; i<=numberOfFiles; i++){
              System.out.print(i+". ");
              String fileToAdd = userInputAsString.nextLine();
              File[] files = rootFolder.listFiles();
              for(File fileName:files){
                  
            	  arrayToStoreFileNames.add(fileName.getName());
              }
              
                  while(arrayToStoreFileNames.contains(fileToAdd)){                            //checking files with same name present in given array or not
                  System.out.println("File with the same name already exists.");
                  System.out.print("---> Please enter a different filename:  ");
                  fileToAdd = userInputAsString.nextLine();                                   //if present ask for the filename again
              }
              File addFile = new File(pathOfRootFolder+fileToAdd);
              addFile.createNewFile();
          
          }
          System.out.println("---> All files are created successfully");
          System.out.println("===========================================================================");

	}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Deleting files from the existing Root Directory
	
	public static void deleteFile() {
		 do{                                                           //creating loop until we get the input as an integer
	            try{
	            	System.out.println();
	        System.out.print("---> How many files you want to Delete:- ");
	        numberOfFiles = userInputAsInteger.nextInt();
	        break;
	            }
	        catch(InputMismatchException e){
	            System.out.println("please Enter a valid number");
	            System.out.println();
	            userInputAsInteger.next();// To clear the Scanner Buffer so that it will take a new value
	        }
	    }
	        while(true);
		System.out.println();
		System.out.println("---> Enter the name of the Files you want to delete:-");
		for(int i=1; i<=numberOfFiles;i++) {
		System.out.print(i+". ");
		String fileToDelete = userInputAsString.nextLine();
		File deleteFile = new File(rootFolder,fileToDelete);
		if(deleteFile.exists()){
			deleteFile.delete();
			System.out.println(fileToDelete+" File is deleted successfully");
			System.out.println();
        }
		else {
			System.out.println(fileToDelete +" File Not Found or doesn't exist");
			System.out.println();
		}
		}
		System.out.println("===========================================================================");
	}
	
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	
	//Searching file from the existing Root Directory
	
	public static void searchFile() {
		System.out.println();
		System.out.print("---> Enter filename to find from the directory:- ");
		String fileToSearch =userInputAsString.nextLine();
		File searchFile = new File(rootFolder,fileToSearch);
		if(searchFile.exists() && searchFile.isFile()) {
		       System.out.println("---> Please find the File details below:");
		       System.out.println();
	            System.out.println("Name: " + searchFile.getName());
	            System.out.println("Path: " + searchFile.getAbsolutePath());
	            System.out.println("Size: " + searchFile.length() + " bytes");
	        } else {
	            System.out.println("This file does not exist.");
	        }
		System.out.println("===========================================================================");
		}
	}
