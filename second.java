class recurson{
    int temp;
    int rec(int a){
        if(a>0){
            temp=rec(a-1)*(a);
            System.out.println("the output is "+a);            
            return temp;
        }
        else{
            return 1;
        }
    }

}
class recurse{
    public static void main(String args[]){
        recurson re =new recurson();
        int a;
        a=re.rec(5);
        System.out.println("the output is "+a);
    }
}