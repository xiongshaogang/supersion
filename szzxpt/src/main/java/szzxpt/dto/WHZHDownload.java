package szzxpt.dto;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import report.dto.ReportInstInfo;

import framework.helper.FrameworkFactory;
import framework.helper.TypeParse;
import framework.interfaces.IColumn;
import framework.interfaces.IParamObjectResultExecute;
import framework.show.ShowContext;

@Entity
@Table(name = "WHZHDownload")
public class WHZHDownload implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@IColumn(description="报文序号")
	@Column(name = "strReportCode", length = 50)
	private String strReportCode;
	
	@IColumn(description="报文名称")
	@Column(name = "strReportName", length = 200)
	private String strReportName;
	
	@IColumn(tagMethodName="getSendTypeTag",description="上报类型")
	@Column(name = "strSendType")
	private String strSendType;
	
	public static Map<String,String> getSendTypeTag(){
		return ShowContext.getInstance().getShowEntityMap().get("SendType");
	}
	
	@IColumn(tagMethodName="getJRJGCodeTag",description="报送金融机构")
	@Column(name = "strJRJGCode")
	private String strJRJGCode;
	
	public static Map<String,String> getJRJGCodeTag() throws Exception{
		Map<String,String> reportInstInfoMap=new HashMap<String,String>();
		IParamObjectResultExecute singleObjectFindByCriteriaDao = (IParamObjectResultExecute)FrameworkFactory.CreateBean("singleObjectFindByCriteriaDao");
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(ReportInstInfo.class);
		detachedCriteria.add(Restrictions.or(Restrictions.eq("suit.strSuitCode","WHZH"),Restrictions.isNull("suit.strSuitCode")));
		List<ReportInstInfo> reportInstInfoList = (List<ReportInstInfo>)singleObjectFindByCriteriaDao.paramObjectResultExecute(new Object[]{detachedCriteria,null});
		for (ReportInstInfo reportInstInfo : reportInstInfoList) {
			reportInstInfoMap.put(reportInstInfo.getStrReportInstCode(), reportInstInfo.getStrReportInstName());
		}
		return reportInstInfoMap;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "YWFSRQ", length = 50, nullable = true)
	@IColumn(description="业务发生日期")
	private Date YWFSRQ;
	
	public void setStrJRJGCode(String strJRJGCode) {
		this.strJRJGCode = strJRJGCode;
	}

	public String getStrJRJGCode() {
		return strJRJGCode;
	}

	public void setYWFSRQ(String yWFSRQ) {
		YWFSRQ = TypeParse.parseDate(yWFSRQ);
	}

	public Date getYWFSRQ() {
		return YWFSRQ;
	}

	public String getStrReportCode() {
		return strReportCode;
	}

	public void setStrReportCode(String strReportCode) {
		this.strReportCode = strReportCode;
	}

	public String getStrReportName() {
		return strReportName;
	}

	public void setStrReportName(String strReportName) {
		this.strReportName = strReportName;
	}

	public void setStrSendType(String strSendType) {
		this.strSendType = strSendType;
	}

	public String getStrSendType() {
		return strSendType;
	}
	
}

