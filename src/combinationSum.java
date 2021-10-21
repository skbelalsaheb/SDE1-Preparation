import java.util.ArrayList;

public class combinationSum {
    static void sum(int[] arr, int index, int target, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            if(target==0) {
                result.add(new ArrayList<Integer>(ds));
            }
            return;
        }

        if (target > arr[index]) {
            ds.add(arr[index]);
            sum(arr, index, target - arr[index], ds, result);
            ds.remove(ds.size() - 1);
        }
        sum(arr, index + 1, target, ds, result);

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7};
        int target = 7;
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        combinationSum.sum(arr, 0, target, ds, result);

        System.out.println(result);
    }
}
