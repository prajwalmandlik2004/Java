import java.util.*;
import java.io.*;

public class Ass_08 {
    public static void main(String[] args) {
        String filename;
        System.out.println("Enter the name of file : ");
        Scanner sc = new Scanner(System.in);
        filename = sc.next();
        filename = filename + ".txt";
        System.out.println("Your file name is : " + filename);

        Ass_08 pr = new Ass_08();

        int ch , temp;
        do{
            System.out.println("\n---!! Enter your choice !!---\n");
            System.out.println("\nMenu\t\t  Operation\n");
            System.out.println("1\t:\tCreate new File");
            System.out.println("2\t:\tDisplay data of student");
            System.out.println("3\t:\tSearch data of student");
            System.out.println("4\t:\tClear all data of students");
            System.out.println("5\t:\tDelete the file");
            System.out.println("\nEnter your choice :\n");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                pr.create(filename);
                break;
                case 2:
                pr.display(filename);
                break;
                case 3:
                pr.searchData(filename);
                break;
                case 4:
                pr.clearRecords(filename);
                break;
                case 5:
                pr.deleteFile(filename);
            }

            System.out.println("Enter 1 to continue and 0 to exit :");
            temp = sc.nextInt();
        }while(temp==1);
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String Student_Name;
    int Roll_No;
    double Mob_No;
    float Marks;

    void create(String filename) {

        try {
            File obj = new File(filename);
            if (obj.createNewFile()) {
                System.out.println("File is Created : " + obj.getName());
            }

        } catch (Exception e) {
            System.out.println("File is already Exist !");
        }

        try {

            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)));
            int ch, temp;
            do {
                System.out.println("Enter the name of the student : ");
                Student_Name = br.readLine();
                System.out.println("Enter the roll no of the student : ");
                Roll_No = Integer.parseInt(br.readLine());
                System.out.println("Enter the mobile no of the student :");
                Mob_No = Double.parseDouble(br.readLine());
                System.out.println("Enter the marks of the students :");
                Marks = Float.parseFloat(br.readLine());

                pw.println(Student_Name + "\t\t" + Roll_No + "\t\t" + Mob_No + "\t\t" + Marks + "\t\t");
                System.out.println("\nDo you want to add more data :\n");
                System.out.println("Press 1 : Add");
                System.out.println("Press 0 : Exit");
                Scanner sc = new Scanner(System.in);
                temp = sc.nextInt();
            } while (temp == 1);
            pw.close();

        } catch (IOException e) {

            System.out.println(e);

        }

    }

    void display(String filename) {

        try {

            BufferedReader file = new BufferedReader(new FileReader(filename));
            String name;
            int i = 1;

            while ((name = file.readLine()) != null) {
                System.out.println(name);
                System.out.println("");
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

 
    void searchData(String filename) {
        try {
            
            BufferedReader file = new BufferedReader(new FileReader(filename));
            String name;
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the roll no of student to search the data : ");
            String searchName = sc.next();
            

            while ((name = file.readLine()) != null) {
                String[] line = name.split("\t");
                
                if (searchName.equalsIgnoreCase(line[1])) {
                    System.out.println("Record found !");
                    System.out.println(name);
                    System.out.println("");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("Record not found !");
            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not Found !");
        }catch (IOException e) {
            System.out.println(e);
        }
    }

    void clearRecords(String filename) {
        try {

            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            pw.close();
            System.out.println("All records deleted successfull !");
            for (int i = 0; i < 999999999; i++);
        } catch (IOException e) {

            System.out.println(e);

        }
    }

    void deleteFile(String filename){
        File file = new File(filename);
        if(file.delete()){
            System.out.println(file.getName() + " has been deleted !");
        }
        else{
            System.out.println("File is not deleted !");
        }
    }

}
