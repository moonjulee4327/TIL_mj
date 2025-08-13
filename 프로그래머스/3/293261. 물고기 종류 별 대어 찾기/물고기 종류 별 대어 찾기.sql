SELECT  i.ID,
        n.FISH_NAME AS 'FISH_NAME',
        i.LENGTH
FROM    FISH_INFO i
JOIN    FISH_NAME_INFO n
ON      i.FISH_TYPE = n.FISH_TYPE
WHERE   i.LENGTH = (
            SELECT  
                CASE
                    WHEN MAX(i2.LENGTH) > 10 THEN MAX(i2.LENGTH)
                END
            FROM    FISH_INFO i2
            WHERE   i2.FISH_TYPE = i.FISH_TYPE
        )
ORDER BY 1;