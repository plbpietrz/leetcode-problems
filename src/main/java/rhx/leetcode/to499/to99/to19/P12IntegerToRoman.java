package rhx.leetcode.to499.to99.to19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P12IntegerToRoman {

    private final String[][] lookup = {
            {"I", "V", "X"},
            {"X", "L", "C"},
            {"C", "D", "M"},
            {"M"}
    };

    public String intToRoman(int num) {
        StringBuilder numeral = new StringBuilder();
        int i = 0;
        while (num > 0) {
            numeral.insert(0, format(num % 10, i++));
            num /= 10;
        }
        return numeral.toString();
    }

    private String format(int n, int dep) {
        if (n < 4) {
            return lookup[dep][0].repeat(n);
        } else if (n == 4) {
            return lookup[dep][0] + lookup[dep][1];
        } else if (n == 5) {
            return lookup[dep][1];
        } else if (n < 9) {
            return lookup[dep][1] + lookup[dep][0].repeat(n - 5);
        } else {
            return lookup[dep][0] + lookup[dep][2];
        }
    }

    public static void main(String[] args) throws IOException {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"PENNY");
        map.put(5,"NICKEL");
        map.put(10,"DIME");
        map.put(25,"QUARTER");
        map.put(50,"HALF DOLLAR");
        map.put(100,"ONE");
        map.put(200,"TWO");
        map.put(500,"FIVE");
        map.put(1000,"TEN");
        map.put(2000,"TWENTY");
        map.put(5000,"FIFTY");

        int[] coins = new int[]{5000,2000,1000,500,200,100,50,25,10,5,1};


        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            String[] input = line.split(";");
            int price = Float.valueOf(Float.parseFloat(input[0]) * 100).intValue();
            int cash = Float.valueOf(Float.parseFloat(input[1]) * 100).intValue();

            int change = cash - price;
            if (change < 0) {
                System.out.println("ERROR");
            } else if(change == 0) {
                System.out.println("ZERO");
            } else {
                List<Integer> result = new ArrayList<>();
                for (int coin : coins) {
                    while(change - coin >= 0) {
                        result.add(coin);
                        change -= coin;
                    }
                }
                System.out.println(result.stream().map(map::get).collect(Collectors.joining(",")));
            }
        }
    }

}
