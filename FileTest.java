package Exercise04;

import org.junit.Test;

import java.io.*;

public class FileTest {
    @Test
    public void testFileReader() {
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file1 = new File("hi.txt");
            //2.FileReader的实例化
            fr = new FileReader(file1);
            //3.读入的操作
            //read(char[] cbuf):返回每次读入cbuf数组中的字符的个数。如果达到文件末尾，返回-1
            int date;
            while ((date = fr.read()) != -1) {
                System.out.print((char) date);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileReader02() {
        FileReader fc = null;
        try {
            fc = null;
            File file2 = new File("hello.txt");
            fc = new FileReader(file2);
            char[] cubf = new char[5];
            int len;
            while ((len = fc.read(cubf)) != -1) {
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cubf[i]);
//                }
                String s = new String(cubf, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileWriter01() throws IOException {
        File file = new File("hello.txt");
        FileWriter fw = new FileWriter(file, true);

        fw.write("\nI have a dream!\n");
        fw.write("You need to have a dream!\n");
        fw.write("You need to have a dream!\n");

        fw.close();
    }

    @Test
    public void testFileInput() {
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);

            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                String s = new String(buffer, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis!=null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
