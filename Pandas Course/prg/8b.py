import pandas as pd
import matplotlib.pyplot as plt

data = {
    "date": pd.date_range(start="2025-09-12", periods=14, freq="D"),
    "energy_kwh": [30, 12, 29, 27, 35, 25, 31, 11, 33, 10, 31, 21, 29, 16],
}
df = pd.DataFrame(data)

# Daily Usage Plot
plt.figure(figsize=(8, 4))
plt.plot(df["date"], df["energy_kwh"], marker="o")
plt.title("Daily Energy Consumption")
plt.xlabel("Date")
plt.ylabel("Energy (kWh)")
plt.xticks(rotation=45)
plt.tight_layout()
plt.show()

# -------------------
# Weekly Pattern Plot
# -------------------
df["weekday"] = df["date"].dt.day_name()  # e.g. Monday, Tuesday
weekly_avg = df.groupby("weekday")["energy_kwh"].mean()

plt.figure(figsize=(8, 4))
weekly_avg.plot(kind="bar", color="skyblue")
plt.title("Average Energy Consumption by Weekday")
plt.xlabel("Weekday")
plt.ylabel("Avg Energy (kWh)")
plt.tight_layout()
plt.show()
