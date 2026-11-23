import pandas as pd
## 1-1.csv読み込み
data=pd.read_csv("./data/data001.csv",encoding="utf-8")
## 1-2.読み込んだデータ先頭3件
print(data.head(3)) 
## 1-3.読み込んだデータ数
data_num = len(data)
print(f'データ数：{data_num}')