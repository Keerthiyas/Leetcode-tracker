-- Last updated: 7/11/2026, 10:34:53 AM
# Write your MySQL query statement below
SELECT person_name
FROM
(
    SELECT
        person_name,
        turn,
        SUM(weight) OVER (ORDER BY turn) AS total_weight
    FROM Queue
) q
WHERE total_weight <= 1000
ORDER BY total_weight DESC
LIMIT 1;