# Write your MySQL query statement below
SELECT name , population , area from World where area >= 3000000 

UNION
SELECT name , population , area from World
WHERE population >= 25000000;