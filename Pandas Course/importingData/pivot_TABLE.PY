import pandas as pd
import matplotlib.pyplot as plt
df = pd.read_csv("C:/Users/prave/OneDrive/Desktop/logica/Pandas Course/importingData/data.csv")

pivot_table = pd.pivot_table(df,
                            index='Type1',#rows
                            values=['Height','Weight'],
                            aggfunc='mean' #aggregation function
                            )
print(pivot_table)