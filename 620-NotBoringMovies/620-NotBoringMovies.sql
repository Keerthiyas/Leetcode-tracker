-- Last updated: 7/11/2026, 10:36:17 AM
# Write your MySQL query statement below
SELECT id,movie,description,rating FROM Cinema 
    WHERE id%2 =1 AND description <> 'boring' 
    ORDER BY rating DESC;