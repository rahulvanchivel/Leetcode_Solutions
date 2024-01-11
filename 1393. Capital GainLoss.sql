# Write your MySQL query statement below
SELECT stock_name, SUM(CASE WHEN OPERATION='Buy' THEN -PRICE ELSE PRICE END) AS capital_gain_loss  FROM STOCKS
GROUP BY 1;
