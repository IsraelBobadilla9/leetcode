-- https://leetcode.com/problems/user-activity-for-the-past-30-days-i/description/?envType=study-plan-v2&envId=top-sql-50


-- el problema tiene una definion mal pero se tiene el siguiente punto que nos indica que la busqueda va desde 
-- 2025-07-27 para esto hay que restarle 30 dias por lo tanto nos queda algo como 
-- 2025-06-28 ya que ese mismo dia se cuenta 
-- al final como tenemos que se considera una ctividad como ok solo es utilizar un distinct 


SELECT
    activity_date AS day,
    COUNT(DISTINCT user_id) AS active_users
FROM Activity
WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27'
GROUP BY activity_date;

-- otra solucion seria esta, no logro entender porque dice que es mas rapida si se estan realizando transformaciones 
-- un date y un intervalo, me suena muy raro
SELECT activity_date AS day, COUNT(DISTINCT(user_id)) AS active_users  FROM Activity 
WHERE activity_date BETWEEN '2019-07-27'::DATE - INTERVAL '29 DAYS' AND '2019-07-27'::DATE
GROUP BY activity_date