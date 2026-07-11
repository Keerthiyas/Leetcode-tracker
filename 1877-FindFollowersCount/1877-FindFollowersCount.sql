-- Last updated: 7/11/2026, 10:34:28 AM
# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT user_id , COUNT(follower_id) as followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id ASC;