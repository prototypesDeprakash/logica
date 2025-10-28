import pandas as pd
import numpy as np

# Get expression from user
expression = input("Enter an expression using x and y: ")

# Get values of variables
x_val = int(input("Enter value of x: "))
y_val = int(input("Enter value of y: "))

# Create a dictionary for variables
variables = {"x": x_val, "y": y_val}

# Evaluate expression safely
result = eval(expression, variables)

# Display result
print(f"The result of {expression} is: {result}")
