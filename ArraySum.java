public class ArraySum {
    public int sumOfArray(Integer[] a, int index) {
        if(index > a.length-1) {
        	return 0;
        }
        if(index < 0) {
        	return 0;
        }
        if(a[index] == null){
            return 0;
        }
        return a[index] + sumOfArray(a, (index-1));
    }
}