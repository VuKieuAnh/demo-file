import java.io.FileNotFoundException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        khi thay doi du lieu -> ghi lai vao file
        try {
            List<Student> studentList = null;
            FileInputStream fis = new FileInputStream("s.ka");
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
            System.out.println(studentList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
//        try {
//            List<Student> studentList = new ArrayList<>();
//            Student student =  new Student(1,"KA", "HN");
//            studentList.add(student);
//            FileOutputStream fos = new FileOutputStream("s.ka");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(studentList);
//            oos.close();
//            fos.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
