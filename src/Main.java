import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 5, 5, 6, 7));
    private static final List<String> nums1 = new ArrayList<>(List.of("abc", "abc", "bcd", "bcd", "e"));
    public static void main(String[] args) {
      task1();
      task2();
      task3();
      task4();
    }
    public static void task1(){
        System.out.println("Задание 1");
        for (int num : nums) {
            if (num % 2 != 0){
                System.out.println(num);
            }
        }
    }
    public static void task2(){
        System.out.println("Задание 2");
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums){
            if (num % 2 == 0 && num != prevNum){
                prevNum = num;
                System.out.println(prevNum);
            }
        }
    }
    public static void task3(){
        System.out.println("Задание 3");
        Set<String> uniqueNums1 = new HashSet<>(nums1);
        System.out.println(uniqueNums1);
    }
    public static void task4(){
        System.out.println("Задание 4");
        Set<String> uniqueNums1 = new HashSet<>(nums1);
        System.out.println(nums1.size() - uniqueNums1.size());
    }
}