SELECT
    ROUND(
        SUM(CASE
                WHEN LENGTH IS NULL THEN 10
                WHEN LENGTH	<=10 THEN 10 
                ELSE LENGTH
            END)
        / COUNT(*)
    , 2) as AVERAGE_LENGTH
FROM    FISH_INFO;