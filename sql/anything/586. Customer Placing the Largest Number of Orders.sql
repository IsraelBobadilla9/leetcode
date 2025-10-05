-- URL:https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/description/
-- requieren buscar el consumidor que haya realizado la mayor cantidad de ordenes 
-- para esto simplemente tenemos que agrupar y ordenas por la cantidad maxima de ocurrencias
-- despues solo utilizamos un limit y quedaria todo okk 


SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;


-- Esta es otra posible solucion pero solo alargamos mas el codigo:
-- Write your PostgreSQL query statement below

select customer_number from (
    select customer_number, count(*) as maxorders from Orders 
    group by customer_number
) b 
order by maxorders desc 
limit 1 


