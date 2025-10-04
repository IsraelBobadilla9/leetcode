SELECT 
  ROUND(
    COUNT(*) FILTER (WHERE next_event_date - event_date = 1)::numeric 
    / 
    COUNT( distinct player_id)::numeric, 
    2
  ) AS fraction
FROM (
    SELECT 
        player_id,
        event_date,
        LEAD(event_date) OVER (PARTITION BY player_id ORDER BY event_date) AS next_event_date,
        ROW_NUMBER() OVER (PARTITION BY player_id ORDER BY event_date) as rn
    FROM Activity
) sub
WHERE rn = 1;