import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int[] s={1,2,3,4,5};
    int rot=0,i=0,item=0,flag=-1,gb=0;   // gb is garbage variable
    System.out.println("Enter no. of times to rotate:");
    rot=sc.nextInt();
    System.out.println("Enter no. to find:");
    item=sc.nextInt();
    i=s.length-1;   //i declared so as to ensure the program runs only n times
    int[] narr=new int[s.length];

    //rotate the values till rotation point
    for(int x=rot-1;x>=0;--i,--x){
      narr[x]=s[i];
      if(narr[x]==item)flag=x+1;
    }
    //rotate rest of array
    for(int x=0;i>=0;--i,++x){
      narr[s.length-1-x]=s[i];
      if(narr[s.length-1-x]==item)flag=s.length-x;
    }
    // uncomment following line to print the rotated array
    //for(int y=0;y<s.length;++y)System.out.println(" "+narr[y]+"  ");
    System.out.println("\n"+flag);    //flag returns index of element found else -1
  }
}
