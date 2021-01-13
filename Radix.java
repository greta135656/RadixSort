public static int nth(int n, int col){
return Math.abs((n / (int) Math.pow(10,col))
 % 10);

public static int length(int n){

  
      int count = 0;
      while (n != 0) {
          n = n / 10;
          ++count;
      }
      return count;
  }

  


public static void merge(MyLinkedList original,MyLinkedList[]buckets){



  
}
