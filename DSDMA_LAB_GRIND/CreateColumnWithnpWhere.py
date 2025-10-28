import pandas as pd
import numpy as np
data = {
    "User":["Prakash","Dhomas","johncena","bigShow"],
    "Engagement":[32,133,92,83]
}
df = pd.DataFrame(data)
df['Performance']= np.where(df['Engagement']>90 , 'High', np.where(df['Engagement']>80 , 'medium','low'))
print(df)