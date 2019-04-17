class Test{
    public static void main(String[] args) {
        String s=new String("hello world");
        Test t=new Test();
        t.finalize();
        t=null;
        System.gc();
        System.out.print("String object finised permanently");

    }
    public void finalize(){
        System.out.print("\nfinised\n");

    }
}