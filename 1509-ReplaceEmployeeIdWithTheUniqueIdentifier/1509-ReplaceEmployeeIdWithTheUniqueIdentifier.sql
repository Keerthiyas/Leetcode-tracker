-- Last updated: 7/11/2026, 10:34:42 AM
# Write your MySQL query statement below
SELECT euni.unique_id, e.name 
FROM Employees e  
LEFT JOIN EmployeeUNI euni  
ON e.id = euni.id;