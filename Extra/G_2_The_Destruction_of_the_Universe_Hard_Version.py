MOD = 998244353

# Function for modular exponentiation
def mod_exp(base, exp, mod):
    result = 1
    while exp > 0:
        if exp % 2 == 1:
            result = (result * base) % mod
        base = (base * base) % mod
        exp //= 2
    return result

def calculate_score(n, intervals):
    intervals.sort()
    scores = 0
    
    # Precompute powers of 2 modulo MOD
    power_of_2 = [1] * (n + 1)
    for i in range(1, n + 1):
        power_of_2[i] = (power_of_2[i - 1] * 2) % MOD

    # Iterate through sorted intervals
    for i in range(n):
        l, r = intervals[i]
        min_expansions = 0  # For each interval, calculate needed expansions
        
        # Calculate expansions to overlap this interval with all previous ones
        for j in range(i):
            l_j, r_j = intervals[j]
            if r_j < l - 1:
                min_expansions += l - 1 - r_j
            elif l_j > r + 1:
                min_expansions += l_j - (r + 1)

        # Each subset involving this interval has its own expansion cost
        scores += min_expansions * power_of_2[n - i - 1]
        scores %= MOD

    return scores

# Main input loop
t = int(input().strip())
results = []
for _ in range(t):
    n = int(input().strip())
    intervals = [tuple(map(int, input().strip().split())) for _ in range(n)]
    results.append(calculate_score(n, intervals))

# Print results for all test cases
print("\n".join(map(str, results)))
