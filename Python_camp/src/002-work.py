import pandas as pd
## csv読み込み
data=pd.read_csv("./data/data001.csv",header=None,encoding="utf-8")
## 2-1.項目数
print(len(data.columns))
## 2-2.データ型
print(f"""
【データ型】
{data.dtypes}
""")