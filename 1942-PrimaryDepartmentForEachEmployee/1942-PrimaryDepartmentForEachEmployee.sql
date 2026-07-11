-- Last updated: 7/11/2026, 10:34:22 AM
# Write your MySQL query statement below
SELECT employee_id, department_id
FROM Employee
WHERE primary_flag='Y' OR 
    employee_id in
    (SELECT employee_id
    FROM Employee
    Group by employee_id
    having count(employee_id)=1)