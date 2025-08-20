select CATEGORY, PRICE, PRODUCT_NAME
from (
    select *,
    rank() over (partition by CATEGORY order by PRICE desc) as mp
    from FOOD_PRODUCT
    where CATEGORY in ('과자','국','김치','식용유')
    ) as rnk
where rnk.mp = 1
order by PRICE desc;