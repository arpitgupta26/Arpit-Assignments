public class Answer6 {
    private int arr[]={1,2,3,4,5,1,2,3,5};
    
    void show(){
        int flag;
        for (int i = 0; i <arr.length ; i++) {
            flag=0;
            for (int j = 0; j <arr.length ; j++) {
                if(i==j){
                    continue;
                }
                if(arr[i]==arr[j]){
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println(arr[i]+ " is not repeated");
            }
        }
        
    }
    
    public static void main(String[] args) {
        Answer6 obj = new Answer6();
        obj.show();
    }
}
