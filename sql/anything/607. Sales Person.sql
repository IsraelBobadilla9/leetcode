-- URL:https://leetcode.com/problems/sales-person/description/
-- basicmaente nos piden el nombre de la persona que no tiene ordenes de la compañia RED

-- Solucion 1 con subquerys
select s.name from SalesPerson s
where sales_id not in (
    select sales_id from Orders where com_id in (
        select com_id from Company where name = 'RED'
    )

)


-- Solucion optima con not exists 
SELECT s.name
FROM SalesPerson s
WHERE NOT EXISTS (
    SELECT 1
    FROM Orders o
    JOIN Company c ON c.com_id = o.com_id
    WHERE o.sales_id = s.sales_id
      AND LOWER(c.name) = 'red'
);