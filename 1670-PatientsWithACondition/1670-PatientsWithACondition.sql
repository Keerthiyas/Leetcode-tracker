-- Last updated: 7/19/2026, 7:46:18 AM
# Write your MySQL query statement below
select * from Patients 
where conditions like ('DIAB1%') 
OR conditions LIKE ('% DIAB1%');