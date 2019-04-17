import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class Test{
    public static void main(String a[]){
        FileWriter out=null;
        InputStream in=null;
        FileReader in2=null;
        try{
            byte[] b={2,23,45,4};
            String s="hello world";
            out =new FileWriter("write.txt");
            if(out!=null)
            //for(int i=0;i<s.length;i++)
            out.write(s);
            out.close();
            /*in=new FileInputStream("write.txt");
            int size=in.available();
            for(int i=0;i<size;i++){
                System.out.print((char)in.read()+"");
            }
            in.close();*/
            in2 =new FileReader("date1.java");
            int i ;
            while((i=in2.read())!=-1){
                System.out.print((char)i);
            }
        }catch(IOException e){
            System.out.print("ohh sorry");
        }
    }
}