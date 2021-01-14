public class Radix {
public static int nth(int n, int col){
return Math.abs((n / (int) Math.pow(10,col))
 % 10);}

public static int length(int n){
      int count = 0;
      while (n != 0) {
          n = n / 10;
          count++;
      }
      return count;
  }


  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) 
  {for(int i = 0; i < buckets.length; i++) 
    {
          original.extend(buckets[i]);
      }
  }


  public static void radixSortSimple(SortableLinkedList data){
    
  SortableLinkedList[] buckets = new SortableLinkedList[10];
  for(int i = 0; i < buckets.length; i++) {
    buckets[i] = new SortableLinkedList();}

//find MAX
int mx = 0;
for(int i = 0; i < data.size(); i++){
  mx = Math.max(mx, length(data.get(0)));
}

  for (int i = 0; i < mx; i++){
    while(data.size()>0){
      int nv = data.remove(0);
      buckets[nth(nv, i)].add(nv);
    }
    merge(data, buckets);
  }
}

  



  public static void radixSort(SortableLinkedList data) {
  SortableLinkedList positive = new SortableLinkedList();
  SortableLinkedList negitive = new SortableLinkedList();
    while(data.size() > 0) {
        int firstint = data.remove(0);
        if(firstint >= 0) {
            positive.add(firstint);
        } else {
            negitive.add(firstint);}}
      
    radixSortSimple(positive);
    radixSortSimple(negitive);
    
    while(negitive.size() > 0) {
        data.add(negitive.remove(negitive.size() - 1));
    }
    data.extend(positive);
}}
