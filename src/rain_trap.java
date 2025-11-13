public class rain_trap {

    public static int water_trap(int[] a, int n) {
        int[] leftm = new int[n];
        int[] rightm = new int[n];
        int ans = 0;
        leftm[0] = a[0];
        for (int i = 1; i < n; i++) {
            if (leftm[i - 1] > a[i])
                leftm[i] = leftm[i - 1];
            else
                leftm[i] = a[i];
        }

        rightm[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (rightm[i + 1] > a[i])
                rightm[i] = rightm[i + 1];
            else
                rightm[i] = a[i];
        }

        for (int i = 0; i < n; i++) {
            int min = 0;
            if (leftm[i] > rightm[i]) min = rightm[i];
            else min = leftm[i];
            ans += (min - a[i]);
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] a = {3, 0, 1, 0, 4, 0, 2};
        int n = a.length;
        int x = water_trap(a, n);
        System.out.println("water trap="+x);
    }
}
