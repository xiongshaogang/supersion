CREATE VIEW VIEW_QY_JKRGKXX 
AS 
SELECT DKKBM,CASE WHEN JKRZWMC IS NULL OR JKRZWMC = '' THEN JKRWWMC ELSE JKRZWMC END AS JKRZWMC,INSTINFO FROM QY_JKRGK_JC A LEFT JOIN QY_JKRGKXX B ON A.AUTOID=B.FOREIGNID;