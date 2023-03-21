package com.fileoperations;

public class MainFileOP {

	public static void displayMenu() {
		StringBuilder builder = new StringBuilder();
		builder.append("---------------------").append("\n📃File Operations📃").append("\n---------------------\n\n")
				.append("👉Select following choice:\n").append("1. Rename file\n").append("2. Copy file\n")
				.append("3. List files\n").append("4. Exit\n\n");

		System.out.println(builder.toString());
	}

	public static void operations() {
		Input input = new Input();
		FileController controller = new FileController();
		while (true) {
			displayMenu();
			int choice = 0;
			try {
				choice = input.getChoice();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			if (choice == 4) {
				System.out.println("🙏🙏Thank you🙏🙏");
				break;
			} else if (choice == 1) {
				System.out.println("📌You selected rename file option...");
				try {
					String path = input.getPath();
					String file = input.getNewFileName();
					String ofile = input.getOldFileName();
					System.out.println();
					controller.renameFile(path, file, ofile);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			} else if (choice == 2) {
				System.out.println("📌You selected copy file option...");
				try {
					String source = input.getPath();
					String destination = input.getPath();
					System.out.println();
					controller.copyFile(source,destination);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			} 
			else if(choice==3){
				System.out.println("📌You selected list file option...");
				try {
					String source = input.getPath();
					controller.getFiles(source);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else {
			
				System.out.println("Invalid choice");
			}

			System.out.println("==========================\n");
		}
	}

	public static void main(String[] args) {
		operations();
	}
}
