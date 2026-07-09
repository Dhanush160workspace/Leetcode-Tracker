-- Last updated: 7/9/2026, 3:05:52 PM
SELECT ip,
       COUNT(*) AS invalid_count
FROM logs
WHERE NOT (
    ip REGEXP '^([0-9]+\\.){3}[0-9]+$'
    AND CAST(SUBSTRING_INDEX(ip, '.', 1) AS UNSIGNED) <= 255
    AND CAST(SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 2), '.', -1) AS UNSIGNED) <= 255
    AND CAST(SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 3), '.', -1) AS UNSIGNED) <= 255
    AND CAST(SUBSTRING_INDEX(ip, '.', -1) AS UNSIGNED) <= 255
    AND NOT (
        SUBSTRING_INDEX(ip, '.', 1) REGEXP '^0[0-9]+'
        OR SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 2), '.', -1) REGEXP '^0[0-9]+'
        OR SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 3), '.', -1) REGEXP '^0[0-9]+'
        OR SUBSTRING_INDEX(ip, '.', -1) REGEXP '^0[0-9]+'
    )
)
GROUP BY ip
ORDER BY invalid_count DESC, ip DESC;