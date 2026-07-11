-- Last updated: 7/11/2026, 10:36:23 AM
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;