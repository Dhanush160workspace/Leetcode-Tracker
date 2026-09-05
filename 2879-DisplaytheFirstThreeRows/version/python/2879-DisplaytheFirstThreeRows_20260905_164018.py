# Last updated: 9/5/2026, 4:40:18 PM
1import pandas as pd
2
3def selectFirstRows(students: pd.DataFrame) -> pd.DataFrame:
4    return students.head(3)