package com.fileOps;

import java.io.IOException;
import java.util.InputMismatchException;

public class MainMenu extends FileOperations{
	//using sleep method with the help of thread
	
	private static void waitForNextAction() {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
        // Please edit the pathofRootFolder before running the code in FileOperations Class

		rootFolderPathFromUser();
		System.out.println();
		boolean toStopFirstLoop = true;
		while(toStopFirstLoop!=false) {
		waitForNextAction();
		System.out.println("---> Please select one of the below options to proceed:- ");
		System.out.println();
		System.out.println("Press 1. To Display files present in Root Directory");
		System.out.println("Press 2. To Do some File Operations (like Add, Delete, Search)");
		System.out.println("Press 3. To Exit the Application");
		System.out.println();
		
		do {
			try {
				System.out.println();
				System.out.print("---> Enter your choice here:- ");
				int mainMenuOption = userInputAsInteger.nextInt();
				switch(mainMenuOption){
				
				case 1:
					//Show files present in root directory
					
					displayFiles();
					System.out.println();
					waitForNextAction();
					break;
					
				case 2:
					boolean toStopSecondLoop=true;
					while(toStopSecondLoop!=false) {
					System.out.println();
					waitForNextAction();
					System.out.println("---> Please select one of the below options to proceed:- ");
					System.out.println();
					System.out.println("Press 1. To Add files to the existing Root Directory List");
					System.out.println("Press 2. To Delete files from the existing Root Directory List");
					System.out.println("Press 3. To Search specific files from the existing Root Directory List");
					System.out.println("Press 4. To Back to Main Menu");
					System.out.println();
					
					
					do {
						try {
							System.out.print("---> Enter your choice here:- ");
							int fileOperationOption = userInputAsInteger.nextInt();
							switch(fileOperationOption) {
							case 1:
								addFile();
								System.out.println();
								waitForNextAction();
								break;
								
							case 2:
								deleteFile();
								System.out.println();
								waitForNextAction();
								break;
								
							case 3:
								searchFile();
								System.out.println();
								waitForNextAction();
								break;
								
							case 4:
								//Back to main menu
								toStopSecondLoop=false;
								System.out.println();
								break;
															
							default:
								System.out.println("Invalid input");
								waitForNextAction();
							}
							break;
						}
						catch(InputMismatchException e){
				            System.out.println("please Enter a valid Option");
				            System.out.println();
				            userInputAsInteger.next();
				        }
					}
					while(true);
					}
					break;                                              //this break command is used to move on parent switch case so that toStopFirstLoop is still true;
					
				case 3:
				
					System.out.println();
					System.out.println("Thanks for using my application :)");
					System.out.println("Come Back Soon!!");
					System.exit(0);
				
				default:
					System.out.println("invalid input");
					waitForNextAction();
				}
				break;
			}
			 catch(InputMismatchException e){
		            System.out.println("please Enter a valid Option");
		            System.out.println();
		            userInputAsInteger.next();
		            }
		}
		while(true);
		
		}
		userInputAsInteger.close();
	}

}
