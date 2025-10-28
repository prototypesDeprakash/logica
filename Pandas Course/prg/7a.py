import matplotlib.pyplot as plt

# Example dataset: Students' scores in Math vs Science
math_scores = [54, 69, 89, 78, 56, 92, 94, 87, 64, 58]
science_scores = [52, 67, 85, 79, 50, 95, 88, 70, 68, 45]

# Create scatter plot
plt.scatter(math_scores, science_scores, color="green", marker="o")

# Add labels and title
plt.xlabel("Math Scores")
plt.ylabel("Science Scores")
plt.title("Scatter Plot: Math vs Science Performance")

# Show the plot
plt.show()
