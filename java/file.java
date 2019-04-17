import java.io.*;

class Test{
    public static void main(String args[])throws IOException{
        File f=new File("C:/Users/Naresh/Documents/java/number1.java");
        FileInputStream i=new FileInputStream(f);
        char c=(char)i.available();
        System.out.print(c);
        //File f2=new File("C:/Users/Naresh/Documents/java/date1.java");
        //OutputStream o =new FileOutputStream(f2);
        File f1=new File("C:/Users/Naresh/Documents/java");
        //System.out.print(f1.mkdirs());
        String[] paths=f1.list();
        for(String s:paths){
            System.out.print(s+"\n");
        }

    }
}