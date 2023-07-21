import java.util.*;
class Main{
    public static void main(String[] args){
      {
      Scanner sc = new Scanner(System.in);
      int s1 = sc.nextInt();
      int s2 = sc.nextInt();
      int arr[][] = new int[s1][s2];
        for(int it=0;it<s1;++it){
         for(int it2=0;it2<s2;++it2)
            arr[it][it2] = sc.nextInt();
       }
         int first=0,sec=0,row=s1-1,col=s2-1,count=0;
         while(count!=col*row){
           for(int i=first;i<=col;i++){
           System.out.print(arr[first][i]+" ");
           count++;
       }
        first++;
        for(int i=first;i<=col;i++){
           System.out.print(arr[i][col]+" ");
           count++;
       }
           col--;
        for(int i=col;i>=sec;i--){
           System.out.print(arr[row][i]+" ");
           count++;
       }
           row--;
        for(int i=row;i>=first;i--){
            System.out.print(arr[i][sec]+" ");
           count++;
       }
       sec++;
         }
      }
    }
}
