public class Main  
{  
     public static void main(String[] args) {  
        String str = "titanic";  
        int[] freq = new int[str.length()];  
        int i, j;  
         
        //Converts given string into character array  
        char string[] = str.toCharArray();  
         
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                     
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
        int count=0;
        String s = "";
        for(i = 0; i<freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  {
            //System.out.print(freq[i]);
              if(freq[i]==2){
              count++;
              }
          }
        }
        System.out.println(count);
    }  
}  
