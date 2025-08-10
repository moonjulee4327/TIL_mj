SELECT  COUNT(i.FISH_TYPE) AS 'FISH_COUNT',
        MAX(i.LENGTH) AS 'MAX_LENGTH',
        i.FISH_TYPE
FROM    (
            SELECT  FISH_TYPE,
                    CASE
                        WHEN LENGTH > 10 THEN LENGTH
                        ELSE 10
                    END AS 'LENGTH'
            FROM FISH_INFO
        ) i
GROUP BY i.FISH_TYPE
HAVING  AVG(i.LENGTH) >= 33
ORDER BY i.FISH_TYPE;