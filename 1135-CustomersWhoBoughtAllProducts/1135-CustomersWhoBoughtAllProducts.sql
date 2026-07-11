-- Last updated: 7/11/2026, 10:35:25 AM
# Write your MySQL query statement below
# Write your MySQL query statement below

SELECT  customer_id FROM Customer GROUP BY customer_id
HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product)