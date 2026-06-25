import java.util.*;
// AryanmouliCh
class Solution {
    private long MOD = 1000000007;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        int size = 2 * m;
        
        long[] base = new long[size];
        for (int i = 0; i < m; i++) {
            base[i] = i;
            base[m + i] = m - 1 - i;
        }
        
        long[][] T = new long[size][size];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < j; i++) {
                T[m + i][j] = 1;
            }
        }
        for (int j = m; j < size; j++) {
            int valJ = j - m;
            for (int i = valJ + 1; i < m; i++) {
                T[i][j] = 1;
            }
        }
        
        T = power(T, n - 2, size);
        
        long ans = 0;
        for (int i = 0; i < size; i++) {
            long ways = 0;
            for (int j = 0; j < size; j++) {
                ways = (ways + T[i][j] * base[j]) % MOD;
            }
            ans = (ans + ways) % MOD;
        }
        
        return (int) ans;
    }

    private long[][] power(long[][] A, int p, int size) {
        long[][] res = new long[size][size];
        for (int i = 0; i < size; i++) res[i][i] = 1;
        while (p > 0) {
            if ((p & 1) == 1) res = multiply(res, A, size);
            A = multiply(A, A, size);
            p >>= 1;
        }
        return res;
    }

    private long[][] multiply(long[][] A, long[][] B, int size) {
        long[][] C = new long[size][size];
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                if (A[i][k] == 0) continue;
                for (int j = 0; j < size; j++) {
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }
}