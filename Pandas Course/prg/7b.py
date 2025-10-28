import matplotlib.pyplot as plt
import numpy as np

# Sample Data (replace with actual dataset)
funding = np.array(
    [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
)  # Research funding (in lakhs)

# Number of research papers
papers = np.array([3, 4, 17, 1, 12, 22, 19, 38, 20, 40])
# Citation count
citations = np.array([50, 200, 250, 470, 900, 1100, 1200, 1900, 2020, 2222])
# Create 3D Scatter Plot
fig = plt.figure(figsize=(10, 7))
ax = fig.add_subplot(111, projection="3d")

scatter = ax.scatter(funding, papers, citations, c=funding, cmap="viridis", s=100)

# Labels
ax.set_title("3D Scatter Plot: Research Data Visualization")
ax.set_xlabel("Research Funding (in lakhs)")
ax.set_ylabel("Number of Research Papers")
ax.set_zlabel("Citation Count")

# Add color bar
cbar = fig.colorbar(scatter, ax=ax)
cbar.set_label("Research Funding (in lakhs)")
plt.show()
