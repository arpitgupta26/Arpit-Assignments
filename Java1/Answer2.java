public class Answer2 {
    
    String str1="In this string this will be repeated 3 times this";
    
    public void count(){
        String arr[] = str1.split(" ");
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].equals("*")){
                continue;
            }
            int count =0;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j].equals("*")){
                    continue;
                }
                if(arr[i].equals(arr[j])){
                    arr[j]="*";
                    count++;
                }
            
            }
            System.out.println(arr[i]+" is repeated "+ count +" times");
        }
    }
    
    public static void main(String[] args) {
        
        Answer2 obj = new Answer2();
        obj.count();
    }
}
