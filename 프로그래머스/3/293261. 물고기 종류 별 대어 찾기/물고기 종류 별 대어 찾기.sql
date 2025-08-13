SELECT  i.ID,
        n.FISH_NAME AS 'FISH_NAME',
        i.LENGTH
FROM    FISH_INFO i
JOIN    FISH_NAME_INFO n
ON      i.FISH_TYPE = n.FISH_TYPE
WHERE   (i.FISH_TYPE, i.LENGTH) IN (
            SELECT  i2.FISH_TYPE,
                    MAX(i2.LENGTH)
            FROM    FISH_INFO i2
            GROUP BY i2.FISH_TYPE
        )
ORDER BY 1;