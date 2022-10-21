import java.util.Arrays;

public class App {
    public static void main(String args[]) {
        String[] cityNames = {"Paris", "London", "New York", "Stockholm"};
        int size = cityNames.length;

        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j< cityNames.length; j++) {
                if(cityNames[i].compareTo(cityNames[j])>0) {
                    String temp = cityNames[i];
                    cityNames[i] = cityNames[j];
                    cityNames[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(cityNames));
    }
}

