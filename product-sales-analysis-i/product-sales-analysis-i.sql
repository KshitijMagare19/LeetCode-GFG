# Write your MySQL query statement below
select p.product_name, s.year,  s.price
from sales as s join product as p where
p.product_id = s.product_id order by s.year desc;