class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1)
                l.add(i+1);
            
        }
        return l;
    }
}
