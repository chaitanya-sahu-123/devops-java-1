import java.util.*;

public class Prime{
    public static void main(String args[]){
        int n=20,f=0;
        for(int i=2;i<n;i++){
            if(n%i==0) f=1;
        }
        if(f==1) System.out.println("Not Prime");
        else System.out.println("Prime");
    }
}