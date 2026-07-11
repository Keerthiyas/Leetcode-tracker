-- Last updated: 7/11/2026, 10:35:04 AM
# Write your MySQL query statement below
# Write your MySQL query statement below

select distinct author_id as id from Views
where author_id = viewer_id 
order by id;