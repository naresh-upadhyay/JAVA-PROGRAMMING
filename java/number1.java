class Test {
    public static void main(String args[]){
        Integer a=5; // int not work
        a=a+2;
        Character b=9;
        System.out.println("The integer value is :-" + a.BYTES +"\nint value:-" +b.BYTES);
        System.out.println("byte " + Byte.BYTES);
        System.out.println("char " + Character.BYTES);
        System.out.println("int " + Integer.BYTES);
        System.out.println("long " + Long.BYTES);
        System.out.println("short " + Short.BYTES);
        System.out.println("double " + Double.BYTES);
        System.out.println("float " + Float.BYTES);
    }
}