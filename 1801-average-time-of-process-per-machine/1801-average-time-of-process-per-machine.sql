# Write your MySQL query statement below
SELECT
   s.machine_id,
   ROUND(AVG(e.timestamp - s.timestamp),3) as processing_time 
FROM Activity s
JOIN Activity e ON e.machine_id = s.machine_id 
WHERE s.activity_type = 'start' and e.activity_type ='end'
group by s.machine_id ;