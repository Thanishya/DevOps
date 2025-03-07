import java.util.Scanner;
public class Linear {}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] num={44,55,88,66};
                    int target =55;
        int position=1;
        for(int i=0;i<num.length;i++){
           if(num[i]==target){
            position=i;
            break;
           }
            
        }
        if(position!=-1){
        System.out.println("The position is:"+ position);
        }else{
         System.out.println("Not available ");    
        }
    }
}

