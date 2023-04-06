
/*
1. create a java program to read n print the content to/from the file
   Note: display two options 1 for store data 2 for print data,
   if user press 1 then read the data from console and store it in file, 
   if user press 2 print the data from the file
*/
import java.io.*;
import java.util.Scanner;

public class ReadNWriteIOS {
    public static void main(String[] args) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 to store data, 2 to print data");
            int choice = sc.nextInt();

            if (choice == 1) {
                String data = "Something to write in file.";
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Languages\\java\\File.txt"));
                bos.write(data.getBytes());
                bos.close();
                System.out.println("Data stored successfully");

            } else if (choice == 2) {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Languages\\java\\File.txt"));
                byte[] dataBytes = bis.readAllBytes();
                String data = new String(dataBytes);
                System.out.println("Data from file: " + data);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

