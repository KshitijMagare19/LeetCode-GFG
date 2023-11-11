/* Write your T-SQL query statement below */
SELECT w2.id  
    FROM weather w1 
        JOIN 
        weather w2
            ON datediff(day, w1.recorddate, w2.recorddate) = 1
                AND
                w2.temperature > w1.temperature;