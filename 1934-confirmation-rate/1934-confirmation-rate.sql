select u.user_id, 
        round(case when count(c.action) = 0 then 0
                              else sum(case when c.action = 'confirmed' then 1 else 0 end)/count(c.action) end ,2)
                              as confirmation_rate
from signups u left join confirmations c on u.user_id = c.user_id
group by u.user_id