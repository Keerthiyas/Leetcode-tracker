-- Last updated: 7/11/2026, 10:33:47 AM
# Write your MySQL query statement below
# Write your MySQL query statement below
select teacher_id , count(distinct subject_id) as cnt from Teacher group by teacher_id;