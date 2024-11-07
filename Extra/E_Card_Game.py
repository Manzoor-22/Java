MOD = 998244353

def count_ways(n, m):
    # Each suit has exactly 2 valid ways to split ranks for the first player to win
    return pow(2, n, MOD)

# Input and Output processing
n, m = map(int, input().strip().split())
print(count_ways(n, m))
