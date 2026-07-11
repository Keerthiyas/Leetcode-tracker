-- Last updated: 7/11/2026, 10:36:18 AM
# Write your MySQL query statement below
# Write your MySQL query statement below
select  max(num) as num
from  MyNumbers 
where num in 
(
    select num
    from MyNumbers
    group by num
    having count(*)=1
)