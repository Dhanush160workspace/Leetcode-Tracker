-- Last updated: 7/9/2026, 3:06:38 PM
SELECT teacher_id, COUNT(DISTINCT subject_id) AS cnt
FROM Teacher
GROUP BY teacher_id;