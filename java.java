import java.util.*;
import java.util.Collections;

class array2D { 
    public static void spiral(int arr[][]) {
        int sr = 0, sc = 0, er = arr.length - 1, ec = arr[0].length - 1;

        while (sr <= er && sc <= ec) {
            for (int i = sc; i <= ec; i++) {
                System.out.print(arr[sr][i] + " ");
            }

            for (int i = sc + 1; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }

            for (int i = ec - 1; i >= sc; i--) {
                System.out.print(arr[er][i] + " ");
            }

            for (int i = er - 1; i >= sr + 1; i--) {
                System.out.print(arr[i][sc] + " ");
            }
            sr++;
            er--;
            sc++;
            ec--;
        }

    }

    public static void diagonalSum(int arr[][])
    {
        int r = arr.length - 1, c = arr[0].length - 1, sum = 0;
        
        for(int i=0,j=0;i<=r&&j<=c;i++,j++)
        {
            sum += arr[i][j];
        }
        for (int i = 0, j = c; i <= r && c >= 0;i++,j--)
        {
            sum+=i==j?0:arr[i][j];
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 21 },
                        { 5, 6, 7, 8, 22 },
                        { 9, 10, 11, 12, 23 },
                        { 13, 14, 15, 16, 24 },
                        { 17, 18, 19, 20, 25 } };
        diagonalSum(arr);
    }
}

class java {
    public static String isPrime(int a) {
        if (a == 2) {
            return "Prime.";
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return "Not prime.";
            }
        }

        return "Prime.";
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static int b2d(int n) {
        int dec = 0, p = 0, rem;
        for (int i = n; i > 0; i /= 10, p++) {
            rem = i % 10;
            dec = dec + (rem * (int) Math.pow(2, p));
        }
        return dec;
    }

    public static int d2b(int n) {
        int bin = 0;
        for (int i = n, p = 0; i > 0; i /= 2, p++) {
            int rem = i % 2;
            bin = bin + (rem * ((int) Math.pow(10, p)));
        }
        return bin;
    }

    public static boolean isPalindrome(int n) {
        int new_number = 0;
        for (int i = n; i > 0; i /= 10) {
            int rem = i % 10;
            new_number = (new_number * 10) + rem;
        }
        System.out.println(new_number + " " + n);

        return (new_number == n) ? true : false;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }

    public static void hollowSquare(int x, int y) {
        for (int r = 1; r <= x; r++) {
            for (int c = 1; c <= y; c++) {
                if (r == 1 || r == x || c == 1 || c == y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfInvertPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfInvertPyramidNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++);
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println(".");
        }
    }

    public static void binaryTriangle(int n) {
        int bin = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(bin);
                bin = (bin == 1) ? 0 : 1;
            }
            System.out.println();
            // System.out.println("b"+bin);
            bin = ((i % 2 == 0) ? 1 : 0);
            // System.out.println("a"+bin);
        }
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int searchString(String arr[], String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }

        return -1;
    }

    //find mid
    public static int binarySearch(int arr[], int key) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == key) {
                return m;
            } else if (arr[m] < key) {
                s = m + 1;
            } else if (arr[m] > key) {
                e = m - 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int arr[]) {
        {
            for (int f = 0, l = arr.length - 1; f < l; f++, l--) {
                int temp = arr[f];
                arr[f] = arr[l];
                arr[l] = temp;
            }
        }
    }

    public static void pairsInArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void subarrays(int arr[]) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
                System.out.print("| ");
            }
            System.out.println();
        }
        System.out.println("Max sum = " + max);
        System.out.println("Min sum = " + min);

    }

    public static void kadanes(int arr[]) {
        int cs = 0, ms = Integer.MIN_VALUE, neg = 0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs < 0 ? 0 : cs + arr[i];
            ms = Math.max(cs, ms);
            neg = arr[i] < 0 ? neg + 1 : neg + 0;
        }
        if (neg == arr.length) {
            ms = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                ms = Math.max(ms, arr[i]);
            }
        }
        System.out.println(ms);
    }

    public static int trappedWater(int arr[]) {
        int al = arr.length;
        int leftMax[] = new int[al], rightMax[] = new int[al], sum = 0;
        leftMax[0] = arr[0];
        rightMax[al - 1] = arr[al - 1];
        for (int i = 1; i < al; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        for (int i = al - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        for (int i = 0; i < al; i++) {
            int mini = Math.min(leftMax[i], rightMax[i]);
            int tap = mini - arr[i];
            sum += tap;
        }

        return sum;

    }

    public static int buySellStock(int arr[]) {
        int n = arr.length, bp = arr[0], mp = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            bp = Math.min(bp, arr[i]);
            int profit = arr[i] - bp;
            mp = Math.max(mp, profit);
        }
        return (mp > 0) ? mp : 0;

    }

    public static boolean duplicateElement(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    public static int testPivotBinSearch(int arr[], int t) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            // System.out.println("m= "+m+" = "+arr[m]);
            if (arr[m] == t) {
                return m;
            }

            if (arr[s] <= arr[m]) {
                if (arr[s] <= t && t <= arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (arr[m] <= t && t <= arr[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }

        }
        return -1;
    }

    public static int testBuySell(int arr[]) {
        int bp = arr[0], mp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > bp) {
                int pro = arr[i] - bp;
                mp = Math.max(mp, pro);
            } else {
                bp = arr[i];
            }

        }
        return mp;
    }

    public static int testTrapWater(int arr[]) {
        int n = arr.length, sum = 0, lm[] = new int[n], rm[] = new int[n];
        lm[0] = arr[0];
        rm[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            lm[i] = Math.max(arr[i], lm[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rm[i] = Math.max(arr[i], rm[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int mini = Math.min(lm[i], rm[i]);
            int tp = mini - arr[i];
            sum += tp > 0 ? tp : 0;
        }

        return sum;
    }

    public static void swap(int arr[], int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    // take largest, place in the end
    public static void bubble(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // take smallest, place in front
    public static void selection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int l = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[l]) {
                    l = j;
                }
            }
            int t = arr[l];
            arr[l] = arr[i];
            arr[i] = t;
        }
    }

    // take one, swap with where it belongs
    public static void insertion(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void counting(int arr[]) {

        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            large = Math.max(large, arr[i]);
        }

        int freq[] = new int[large + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0, j = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr[j] = i;
                freq[i]--;
                j++;
            }
        }
    }

    public static void testBubble(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void testSelection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int l = i;
            for (int j = i + 1; j < n; j++) {
                l = (arr[j] > arr[l]) ? j : l;
            }
            swap(arr, i, l);
        }
    }

    public static void testInsertion(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1, t = arr[i];
            while (j >= 0 && arr[j] < t) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = t;
        }
    }

    public static void main(String args[]) {

        // Scanner s = new Scanner(System.in);
        //
        // System.out.println(isPrime(4));
        // System.out.println(sum(2, 3));
        // System.out.println(sum(2f, 3f));
        // System.out.println(b2d(1010));
        // System.out.println(d2b(10));
        // System.out.println(isPalindrome(10101));
        // System.out.println(sumOfDigits(352));
        // hollowSquare(5, 5);
        // halfInvertPyramid(4);
        // halfInvertPyramidNumber(5);
        // floydsTriangle(5);
        // binaryTriangle(10);
        // butterfly(2);
        // solidRhombus(5);
        // hollowRhombus(3);
        // diamond(4);

        // ARRAYs
        // int arr[] = { 1, 2, 3, 4, 5 }; // ascending array
        // int arr[] = { 6, 5, 4, 3, 2, 0 }; //descending array
        // int arr[] = { 4, 2, 0, 6, 3, 2, 5 }; // trapped water array
        // int arr[] = { 7, 1, 5, 3, 6, 4 }; //buy sell stock array
        // int arr[] = { -3, -5, -8, -4, -2, -3, -6 };
        // int arr[] = { 2, 1, 4, 3, 2, 5, 9 }; // duplicate element;
        //
        // String menu[] = { "dosa", "chhole bhature", "samosa" };
        // int i = searchString(menu, "chhole bhature");
        // System.out.println(i);
        //
        // System.out.println(binarySearch(arr, 5));
        // reverseArray(arr);
        // pairsInArray(arr);
        // subarrays(arr);
        // kadanes(arr);
        //
        // System.out.println(trappedWater(arr));
        // System.out.println(buySellStock(arr));
        // System.out.println(duplicateElement(arr));

        // array test
        //
        // --test binary search
        // int arr[] = { 7, 8, 9, 1, 2, 3, 4, 5, 6 }, t = 1;
        // System.out.println(testPivotBinSearch(arr, t));
        //
        // --testBuySell
        // int arr[] = { 7, 6, 4, 3, 1 };
        // System.out.println(testBuySell(arr));
        //
        // --testTrapWater
        // int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // int arr[] = { 4, 2, 0, 3, 2, 5 };
        // System.out.println(testTrapWater(arr));

        // sorting
        // int arr[] = { 5, 4, 3, 2, 1, 2, 3, 4, 2, 1, 3, 5, 6, 7, 8, 3 };
        // int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // bubble(arr);
        // selection(arr);
        // insertion(arr);
        // counting(arr);

        // testBubble(arr);
        // testSelection(arr);
        // testInsertion(arr);
        // printArray(arr);

    }
}