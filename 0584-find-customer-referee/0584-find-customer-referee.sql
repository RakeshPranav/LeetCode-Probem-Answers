select c.name
from customer c
join customer d
on c.id=d.id
where c.referee_id != 2 or c.referee_id is null