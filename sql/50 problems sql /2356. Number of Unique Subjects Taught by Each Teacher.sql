-- https://leetcode.com/problems/number-of-unique-subjects-taught-by-each-teacher/description/?envType=study-plan-v2&envId=top-sql-50

-- Como nos piden hallar los estudiantes unicos a los que el profesor da clases entonces lo que necesitamos hacer 
-- practicamente es hacer un conteo por el subject_id y utilizar distinct a la vez que estamos agrupando por el 
-- teacher_id ya que no nos importa el grupo en el que estan estudiando
select teacher_id, count( distinct subject_id )  as cnt 
From Teacher
group by teacher_id

-- otra solucion que se propone en los foros de leetcode es la siguiente 