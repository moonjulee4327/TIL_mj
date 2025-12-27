import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long[] kArr = new long[k];
        long max = 0;
        long min = 1;

        for(int i = 0; i < k; i++) {
            kArr[i] = Long.parseLong(br.readLine());
            if(kArr[i] > max) max = kArr[i];
        }

        long result = 0;

        while (min <= max) {
            long mid = (max + min) / 2;
            long count = 0;

            for (int i = 0; i < kArr.length; i++) {
                count += kArr[i] / mid;
            }

            if(count >= n) {
                result = mid;
                min = mid + 1;
            }else {
                max = mid - 1;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
