package LB7;

public class GenericUtilsTest {
    public static void main(String[] args) {
        Integer[] numbers = {1, 5, 3, 9, 2};
        Integer maxNumber = GenericUtils.findMax(numbers);
        System.out.println("Maximum number: " + maxNumber);

        String[] strings = {"apple", "banana", "orange", "pear"};
        String maxString = GenericUtils.findMax(strings);
        System.out.println("Maximum string: " + maxString);
    }
}
