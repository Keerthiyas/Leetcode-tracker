-- Last updated: 7/11/2026, 10:35:23 AM
# Write your MySQL query statement below
select p.product_name,s.year,s.price from Sales s join Product p
where s.product_id = p.product_id;