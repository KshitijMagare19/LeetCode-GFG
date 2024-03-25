# Write your MySQL query statement below
select s1.user_id ,round(avg(if(s2.action="confirmed",1,0)),2) as confirmation_rate 
from Signups s1 left join Confirmations s2
on s1.user_id = s2.user_id group by s1.user_id
