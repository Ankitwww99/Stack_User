import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyStack
{
    int size;
    int top;
    int stackarray[];
    public MyStack(int sz) {
        size =sz;
        top=-1;
        stackarray = new int[size];
    }
    public void push(int value) {
        if(! isFull())
        {
            top++;
            stackarray[top]=value;
        }
    }
    public void rmm(int a){
        for (int i = a-1; i <top-1; i++) {
            stackarray[i]=stackarray[i+1];
        }
        pop();
    }
    public void isnn(int a,int vv){
        for (int i = top; i >a ; i--) {
            stackarray[i]=stackarray[i-1];
        }
        stackarray[a-1]=vv;
    }
    public boolean isFull() {
        return (top==stackarray.length-1);
    }
    public int pop(){
        return stackarray[top--];
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public void printdd(){
        for (int i = 0; i <=top; i++) {
            System.out.print(stackarray[i] +" ");
        }
    }
    public int subb(int a,int b){
        return (stackarray[a-1]-stackarray[b-1]);
    }
    public int addd(int a,int b){
        return (stackarray[a-1]+stackarray[b-1]);
    }
}
 class A {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the size of array");
        int sz=Integer.parseInt(br.readLine());
        MyStack obj = new MyStack(sz);
        for (int i = 0;; i++) {

            System.out.println("\nEnter\n0-to enter the data" +
                    "\n1=display content of array" +
                    "\n2=to check array is full" +
                    "\n3=to check array is empty" +
                    "\n4=for add two particular index" +
                    "\n5=for subtract two particular index" +
                    "\n6=to remove element" +
                    "\n7=to exit the program" +
                    "\n8=to insert at particular index");
            int c=Integer.parseInt(br.readLine());
            switch (c){
                case 0:
                    System.out.println("enter data");
                    int da=Integer.parseInt(br.readLine());
                    obj.push(da);
                    break;
                case 1:
                    obj.printdd();
                    break;
                case 2:
                    boolean b=obj.isFull();
                    System.out.println("Status="+b);
                    break;
                case 3:
                    boolean bb=obj.isEmpty();
                    System.out.println("Status="+bb);
                    break;
                case 5:
                    System.out.println("enter two index for subtract");
                    int sa1=Integer.parseInt(br.readLine());
                    int sa2=Integer.parseInt(br.readLine());
                    int x=obj.subb(sa1,sa2);
                    System.out.println("result="+x);
                    break;
                case 4:
                    System.out.println("enter two index for subtract");
                    int ad1=Integer.parseInt(br.readLine());
                    int ad2=Integer.parseInt(br.readLine());
                    int xx=obj.addd(ad1,ad2);
                    System.out.println("result="+xx);
                    break;
                case 6:
                    System.out.println("enter two index for subtract");
                    int d1=Integer.parseInt(br.readLine());
                        obj.rmm(d1);
                        break;
                case 7:
                    System.exit(0);
                case 8:
                    System.out.println("enter index and value to ne insert");
                    int in=Integer.parseInt(br.readLine());
                    int va=Integer.parseInt(br.readLine());
                    obj.isnn(in,va);
                    break;
                default:
                        System.out.println("wrong key press\ntry again");
            }
        }
    }
}
