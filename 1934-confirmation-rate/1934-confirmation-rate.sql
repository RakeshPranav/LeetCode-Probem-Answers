select u.user_id, 
        round(ifnull(avg(c.action = 'confirmed'),0),2) as confirmation_rate
from signups u left join confirmations c on u.user_id = c.user_id
group by u.user_id

