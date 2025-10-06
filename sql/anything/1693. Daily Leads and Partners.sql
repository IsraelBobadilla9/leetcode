-- URL:https://leetcode.com/problems/daily-leads-and-partners/description/
-- Basicamente nos piden agrupar y despues realizar un count distinct y con eso podemos obtener la informacion requerida 
--- Solucion 
select date_id,make_name, count(distinct lead_id ) as unique_leads, count(distinct partner_id) as unique_partners
from DailySales 
group by date_id,make_name