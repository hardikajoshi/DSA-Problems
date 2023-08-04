# Write your MySQL query statement below
SELECT V.customer_id, COUNT(V.visit_id) as count_no_trans from Visits V
LEFT JOIN Transactions T
on V.visit_id = T.visit_id
WHERE T.visit_id IS NULL
GROUP BY V.customer_id;