-- Last updated: 7/19/2026, 7:46:25 AM
# Write your MySQL query statement below

select p.product_name,sum(o.unit) as unit from products as p
join orders as o
on p.product_id=o.product_id
where  o.order_date like '2020-02-%'
group by p.product_id
having unit>=100 