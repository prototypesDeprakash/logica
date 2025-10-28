import pandas as pd

data = {
    "Post_id":[33,53,24,67],
    "timestamp":[
        '2025-10-28 13:12:00',
        '2025-10-23 8:47:00',
        '2025-10-29 3:34:00',
        '2025-9-30 4:54:32' 
    ],
    "likes":[200,453,786,243],
    "Comments":[23,45,21,90]
}
df= pd.DataFrame(data)
df['timestamp']=pd.to_datetime(df['timestamp'])
df['hour'] = df['timestamp'].dt.hour
df['minute']=df['timestamp'].dt.minute
print(df)

peak_Hours=df.query("hour > 4 and hour < 9")
print(peak_Hours)