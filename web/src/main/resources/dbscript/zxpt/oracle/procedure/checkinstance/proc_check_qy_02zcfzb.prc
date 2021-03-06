create or replace procedure Proc_Check_QY_02ZCFZB(rt out DevelopmentFramework.packageCheck,dtDate varchar2,strInstCode  varchar2)
is
 tempDate  varchar2(50);
 V_CURSQL VARCHAR2(4000);  
begin
tempDate := dtDate;
IF dtDate='*****'  and strInstCode='*****'
	THEN
	V_CURSQL :='select
      a.dtdate,
      a.instinfo,
       b.autoID
      ,b.CH
      ,b.CHCCP
      ,b.CHYCL
      ,b.CQFZHJ
      ,b.CQGQTZ
      ,b.CQJK
      ,b.CQTZ
      ,b.CQTZHJ
      ,b.CQYFK
      ,b.CQZQTZ
      ,b.DCLGDZCJSS
      ,b.DCLLDZCJSS
      ,b.DQJK
      ,b.DQTZ
      ,b.DTFY
      ,b.DYSKDX
      ,b.DYSKJX
      ,b.DYZC
      ,b.DYZCGD9577
      ,b.DYZCGDZCXL
      ,b.FRZB
      ,b.FRZBGJFRZB
      ,b.FRZBJTFRZB
      ,b.FZHJ
      ,b.FZHSYZQYHJ
      ,b.GCWZ
      ,b.GDZCHJ
      ,b.GDZCJE
      ,b.GDZCJZ
      ,b.GDZCQL
      ,b.GDZCYJ
      ,b.GDZCZJZZB
      ,b.GJZB
      ,b.GRZB
      ,b.HBJC
      ,b.HBZJ
      ,b.JTZB
      ,b.LDFZHJ
      ,b.LDZCHJ
      ,b.LJZJ
      ,b.QHBZJ
      ,b.QTCQFZ
      ,b.QTCQFZ9629
      ,b.QTCQZC
      ,b.QTCQZC9581
      ,b.QTLDFZ
      ,b.QTLDZC
      ,b.QTYFK
      ,b.QTYJK
      ,b.QTYSK
      ,b.RPTCheckType
      ,b.RPTFeedbackType
      ,b.RPTSendType
      ,b.SSGDQY
      ,b.SSZB
      ,b.SYZQYHJ
      ,b.WBBBZSCE
      ,b.WFPLR
      ,b.WQRDTZSS
      ,b.WSZB
      ,b.WXJQTZCHJ
      ,b.WXZC
      ,b.WXZCTDSYQ
      ,b.YFFLF
      ,b.YFGZ
      ,b.YFJJ
      ,b.YFLR
      ,b.YFPJ
      ,b.YFSJ
      ,b.YFZK
      ,b.YIFZK
      ,b.YJFZ
      ,b.YNNDQ9533
      ,b.YNNDQDCQFZ
      ,b.YSBTK
      ,b.YSCKTS
      ,b.YSGL
      ,b.YSLX
      ,b.YSPJ
      ,b.YSZK
      ,b.YTFY
      ,b.YUSZK
      ,b.YYGJ
      ,b.YYGJBCLDZB
      ,b.YYGJFDYYGJ
      ,b.YYGJGJJ
      ,b.ZBGJ
      ,b.ZCZJ
      ,b.ZJGC
      ,b.ZXYFK
      ,b.extend1
      ,b.extend2
      ,b.extend3
      ,b.extend4
      ,b.extend5
      ,b.FOREIGNID
  from QY_JKRCWBB_JC a,QY_02ZCFZB b
  where a.autoid=b.foreignid';

ELSE
   V_CURSQL :='select
      a.dtdate,
      a.instinfo,
       b.autoID
      ,b.CH
      ,b.CHCCP
      ,b.CHYCL
      ,b.CQFZHJ
      ,b.CQGQTZ
      ,b.CQJK
      ,b.CQTZ
      ,b.CQTZHJ
      ,b.CQYFK
      ,b.CQZQTZ
      ,b.DCLGDZCJSS
      ,b.DCLLDZCJSS
      ,b.DQJK
      ,b.DQTZ
      ,b.DTFY
      ,b.DYSKDX
      ,b.DYSKJX
      ,b.DYZC
      ,b.DYZCGD9577
      ,b.DYZCGDZCXL
      ,b.FRZB
      ,b.FRZBGJFRZB
      ,b.FRZBJTFRZB
      ,b.FZHJ
      ,b.FZHSYZQYHJ
      ,b.GCWZ
      ,b.GDZCHJ
      ,b.GDZCJE
      ,b.GDZCJZ
      ,b.GDZCQL
      ,b.GDZCYJ
      ,b.GDZCZJZZB
      ,b.GJZB
      ,b.GRZB
      ,b.HBJC
      ,b.HBZJ
      ,b.JTZB
      ,b.LDFZHJ
      ,b.LDZCHJ
      ,b.LJZJ
      ,b.QHBZJ
      ,b.QTCQFZ
      ,b.QTCQFZ9629
      ,b.QTCQZC
      ,b.QTCQZC9581
      ,b.QTLDFZ
      ,b.QTLDZC
      ,b.QTYFK
      ,b.QTYJK
      ,b.QTYSK
      ,b.RPTCheckType
      ,b.RPTFeedbackType
      ,b.RPTSendType
      ,b.SSGDQY
      ,b.SSZB
      ,b.SYZQYHJ
      ,b.WBBBZSCE
      ,b.WFPLR
      ,b.WQRDTZSS
      ,b.WSZB
      ,b.WXJQTZCHJ
      ,b.WXZC
      ,b.WXZCTDSYQ
      ,b.YFFLF
      ,b.YFGZ
      ,b.YFJJ
      ,b.YFLR
      ,b.YFPJ
      ,b.YFSJ
      ,b.YFZK
      ,b.YIFZK
      ,b.YJFZ
      ,b.YNNDQ9533
      ,b.YNNDQDCQFZ
      ,b.YSBTK
      ,b.YSCKTS
      ,b.YSGL
      ,b.YSLX
      ,b.YSPJ
      ,b.YSZK
      ,b.YTFY
      ,b.YUSZK
      ,b.YYGJ
      ,b.YYGJBCLDZB
      ,b.YYGJFDYYGJ
      ,b.YYGJGJJ
      ,b.ZBGJ
      ,b.ZCZJ
      ,b.ZJGC
      ,b.ZXYFK
      ,b.extend1
      ,b.extend2
      ,b.extend3
      ,b.extend4
      ,b.extend5
      ,b.FOREIGNID
  from QY_JKRCWBB_JC a,QY_02ZCFZB b
 where to_Date('''||tempDate||''', ''yyyy-MM-dd'')=dtDate and  Instinfo= '''||strInstCode||''' and a.autoid=b.foreignid';

END IF;
OPEN rt FOR V_CURSQL;
END;  



