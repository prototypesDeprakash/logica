import pandas as pd

data = {
    'Player': ["ABCD", "MNOP", "JKL", "BCD", "XYZ"],
    'Games Played': [12, 15, 14, 10, 13],
    'Total Points': [250, 300, 275, 200, 225],
    'Team': ["Team A", "Team B", "Team A", "Team C", "Team B"]
}

df = pd.DataFrame(data)
print(df)
print()

df = df.set_index('Player')
print("Indexed DataFrame:")
print(df)
print()

sorted_df = df.sort_values(by=['Total Points', "Games Played"], ascending=[False, False])
print("Sorted by Total points scored and Games played:")
print(sorted_df)
print()
