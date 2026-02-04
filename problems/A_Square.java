import java.util.Scanner;
public class A_Square{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        int a,b,c,d;
        
        while(t-- >0){

            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            
            if(a==b && b==c && c==d){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }



        
    }
}