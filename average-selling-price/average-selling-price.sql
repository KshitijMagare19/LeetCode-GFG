# Write your MySQL query statement below
SELECT
    u.product_id,
    ROUND(SUM(p.price * u.units) / SUM(u.units), 2) AS average_price    -- Note: the prompt requires us to round results to 2 places.
FROM unitssold u 
JOIN prices p ON 1=1  -- remember, the 1=1 is just so we can format the code better.
    AND p.product_id = u.product_id 
    AND u.purchase_date BETWEEN p.start_date AND p.end_date  -- we can use any logic to join two tables, not just "="
GROUP BY u.product_id