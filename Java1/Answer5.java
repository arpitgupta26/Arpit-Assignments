public class Answer5 {
    private int arr1[]={1,5,7,3,9};
    private int arr2[]={2,3,6,5,7,8};
    
    public void findCommon(){
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Answer5 obj = new Answer5();
        obj.findCommon();
    }
}
