-- Last updated: 7/19/2026, 7:46:14 AM
# Write your MySQL query statement below

SELECT 
    user_id
    ,CONCAT(UPPER(SUBSTRING(name,1,1)),LOWER(SUBSTRING(name,2))) AS name
FROM users
ORDER BY user_id