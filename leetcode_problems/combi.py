from itertools import combinations

# Define the range of numbers
numbers_range = range(10)

# Specify the length of combinations
combination_length = 3

# Generate and print all combinations
all_combinations = list(combinations(numbers_range, combination_length))

for combination in all_combinations:
    print(combination)
