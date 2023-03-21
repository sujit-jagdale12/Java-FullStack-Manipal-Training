package com.filehandling;

import java.io.*;

public class MainFileHandling {

	public static void fileDemo() {


//		File file = new File("C:/Users/admin/eclipse-workspace/AxisBatch/.");
		File file = new File("files");

		if (file.isDirectory()) {
			System.out.println("This is Directory");

			File sub = new File(file, "Codes");
			if (!sub.exists()) {
				sub.mkdir();
				System.out.println("Sub-file created");
			} else
				System.out.println("Sub-file Already exists");

			File newfile = new File(sub, "Addition.txt");
			
			try {
				String done = newfile.createNewFile() ? "file Successfully created" : "file Aready exists";
				System.out.println(done);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("This is File");
		}
	}

	public void writeFile() {
		File file = new File("files/test/Program.txt");
		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
			writer.write("This is my first program\br");
			writer.write("This is my first program");
			writer.write("This is my first program");
			writer.write("This is my first program");

			System.out.println("Successfully writed into the file.");
		} catch (IOException e) {
			System.out.println("Doesn't write anything in file.");
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				System.out.println("File not closed.");
				e.printStackTrace();
			}
		}
	}

	public void writeFileTryResource() {

		File file = new File("files/test/Program.txt");
		try (FileWriter writer = new FileWriter(file);) {
			writer.write("This is my try with resource\n");
			writer.write("doesn't need finally block\n");
			writer.write("To close opened resources");

			System.out.println("Successfully writed into the file.");
		} catch (IOException e) {
			System.out.println("Doesn't write anything in file.");
			e.printStackTrace();
		}
	}

	public void readFile() {
		File file = new File("files/test/Program.txt");

		try (Reader reader = new FileReader(file);) {
			StringBuilder builder = new StringBuilder();
			while (true) {
				int ch = reader.read();
				if (ch == -1) {
					break;
				}
				builder.append((char) ch);
			}

			System.out.println(builder.toString());
		} catch (Exception e) {
			System.out.println("Trouble has been occured.");
		}

	}

	public void outPutStream() {
		File file = new File("files/InOutStream/test.dat");

		try (final OutputStream stream = new FileOutputStream(file)) {
			String in = "Writing using OutputStream interface.";
			String in1 = "FileOutputStream class help that interface to write.";

			stream.write(in.getBytes());
			stream.write(in1.getBytes());

			System.out.println("Done writing");
		} catch (Exception e) {
			System.out.println("Trouble occured....");
		}
	}

	public void inPutStream() {
		File file = new File("files/InOutStream/test.dat");

		try (final InputStream stream = new FileInputStream(file)) {

			StringBuilder builder = new StringBuilder();
			while (true) {
				int ch = stream.read();
				if (ch == -1) {
					break;
				}
				builder.append((char) ch);
			}
			System.out.println(builder.toString());
		} catch (Exception e) {
			System.out.println("Trouble");
		}
	}

	public void primitiveDataOutput() {
		File file = new File("files/PrimitiveData/Data.dat");
		int id = 100;
		String name = "Sujit Jagdale";
		boolean isDone = true;
		double sal = 12.8;
		try (FileOutputStream outputStream = new FileOutputStream(file);
				DataOutputStream dos = new DataOutputStream(outputStream);) {

			dos.writeInt(id);
			dos.writeUTF(name);
			dos.writeBoolean(isDone);
			dos.writeDouble(sal);

			System.out.println("Writing done using dataoutput stream.");
		} catch (Exception e) {
			System.out.println("Trouble...");
		}
	}

	public void primitiveDataInput() {
		File file = new File("files/PrimitiveData/Data.dat");

		try (FileInputStream inputStream = new FileInputStream(file);
				DataInputStream dis = new DataInputStream(inputStream);) {

			System.out.println("Data fetched by DataInputStream");
			int id = dis.readInt();
			String name = dis.readUTF();
			boolean isDone = dis.readBoolean();
			double sal = dis.readDouble();

			System.out.println("ID: " + id + "\nName: " + name + "\nisDone: " + isDone + "\nSalary: " + sal);
		} catch (Exception e) {
			System.out.println("Trouble...");
		}
	}

	public void objectOutput() {
		File file = new File("files/ObjectInOut/object.dat");
		Student student = new Student(1, "Sujit", "Dharashiv", 150000);
		try (FileOutputStream outputStream = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(outputStream);) {
			oos.writeObject(student);

			System.out.println("Object saved.");
		} catch (Exception e) {
			System.out.println("Trouble....");
		}
	}

	public void objectInput() {
		File file = new File("files/ObjectInOut/object.dat");
		try (FileInputStream inputStream = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(inputStream);) {
			Student student = (Student) ois.readObject();

			System.out.println(student);
		} catch (Exception e) {

			System.out.println("Trouble...." + e.getMessage());
		}
	}

	public void bufferWrite() {
		try (FileWriter fw = new FileWriter("files/BufferReadWrite/Buffer.dat");
				BufferedWriter writer = new BufferedWriter(fw);) {

			writer.write("Writing using bufferwriter class.");
			
		} catch (Exception e) {
			System.out.println("Trouble...");
		}

	}

	public void bufferRead() {

		try (FileReader fr = new FileReader("files/BufferReadWrite/Buffer.dat");
				BufferedReader br = new BufferedReader(fr);) {

			StringBuilder builder=new StringBuilder();
			while(true) {
				int ch=br.read();
				if(ch==-1)break;
				builder.append((char)ch);
			}
			System.out.println(builder.toString());
			System.out.println("Readed using BufferReader class.");
		} catch (Exception e) {
			System.out.println("Trouble...");
		}

	}

    public void bufferOutputStream() {
    	File file=new File("files/BufferReadWrite/BufferFile.dat");
    	
    	try(FileOutputStream outputStream=new FileOutputStream(file);
    			BufferedOutputStream bof =new BufferedOutputStream(outputStream)) {
			String str="Buffer output stream writing ";
			
			bof.write(str.getBytes());
		} catch (Exception e) {
			System.out.println("Trouble...");
		}
    }

    public void bufferInputStream() {
    	File file=new File("files/BufferReadWrite/BufferFile.dat");
    	
    	try( FileInputStream inputStream=new FileInputStream(file);
    			BufferedInputStream bif =new BufferedInputStream(inputStream);) {
    		
    		StringBuilder builder=new StringBuilder();
    		while(true) {
    			int read = bif.read();
    			if(read==-1) break;
    			builder.append((char)read);
    		}
    		System.out.println(builder.toString());
    	} catch (Exception e) {
    		System.out.println("Trouble...");
    	}
    }
}
