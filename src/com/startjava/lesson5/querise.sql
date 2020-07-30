select * from jaegers;

select * from jaegers where status = 'Active';

select * from jaegers where mark in ('Mark-1', 'Mark-6');

select * from jaegers order by mark desc;

select * from jaegers where launch = (select min(launch) from jaegers);

select * from jaegers where kaijuKill = (select max(kaijuKill) from jaegers);

select * from jaegers where kaijuKill = (select min(kaijuKill) from jaegers);

select avg(weight) from jaegers;

update jaegers set kaijuKill = kaijuKill + 1 where status = 'Active';

delete from jaegers where status = 'Destroyed';