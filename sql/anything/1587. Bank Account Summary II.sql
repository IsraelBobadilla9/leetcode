-- URL: https://leetcode.com/problems/bank-account-summary-ii/description/
-- Solo nos piden agrupar y despues sacar aquellos usuarios con transacciones mayores a 1k

-- Write your PostgreSQL query statement below
select s.name as NAME, total as BALANCE  from Users s inner join  (

    select u.account as account, sum(amount) as total from Users u inner join Transactions t on u.account = t.account
    group by u.account
    having sum(amount) > 10000


) b on s.account = b.account