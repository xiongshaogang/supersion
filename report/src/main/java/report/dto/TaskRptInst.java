package report.dto;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DiscriminatorFormula;
import org.hibernate.annotations.GenericGenerator;

import coresystem.dto.InstInfo;
import framework.interfaces.IColumn;
import framework.interfaces.IEntity;
import framework.show.ShowContext;

@Entity
@Table(name = "TaskRptInst")
@IEntity(description= "任务报表机构树")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorFormula(value = "'1'")
@DiscriminatorValue("1")
public class TaskRptInst implements java.io.Serializable{
	
	/**  **/
	private static final long serialVersionUID = -3835676507471898426L;

	@Transient
	@IColumn(isListShow=true,description="报表代码")
	private String strShowRptCode;
	
	@IColumn(isNullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "strTaskID", nullable = false)
	private TaskFlow taskFlow;
	
	@IColumn(isNullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "strRptCode", nullable = false)
	private RptInfo rptInfo;
	
	@IColumn(isNullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "strInstCode", nullable = false)
	private InstInfo instInfo;
	
	@Transient
	@IColumn(isIdListField = true, target="rptInfo")
	private String[] rptInfoIdList;
	
	@Transient
	@IColumn(isIdListField = true, target="instInfo")
	private String[] instInfoIdList;
	
	@Transient
	private String[] instInfoIds;
	
	@Transient
	private String[] rptInfoIds;
	
	@IColumn(tagMethodName="getSubmitStatusTag",description="提交状态",isSingleTagHidden = true)
	@Column(name = "SubmitStatus", length = 1)
	private String SubmitStatus;
	
	
	public static Map<String,String> getSubmitStatusTag(){
		return ShowContext.getInstance().getShowEntityMap().get("RPTSubmitStatus");
	}
	
	
	@IColumn(description="备注",isSingleTagHidden=true)
	@Column(name = "strRemark",length=500)
	private String strRemark;
	
	public String getStrRemark()
	{
		return this.strRemark;
	}
	
	public void setStrRemark(String strRemark)
	{
		this.strRemark=strRemark;
	}
	
	
	
	
	@IColumn(tagMethodName="getCheckTypeTag",description="校验状态",isSingleTagHidden = true)
	@Column(name = "strCheckState",length=1)
	private String strCheckState;
	public static Map<String,String> getCheckTypeTag(){
		return ShowContext.getInstance().getShowEntityMap().get("RPTCheckType");
	}
	
	@IColumn(tagMethodName="getVerifyTypeTag",description="审核状态",isSingleTagHidden = true)
	@Column(name = "strAllowState",length=1)
	private String strAllowState;
	
	public static Map<String,String> getVerifyTypeTag(){
		return ShowContext.getInstance().getShowEntityMap().get("RPTVerifyType");
	}
	
	@IColumn(tagMethodName="getRPTSendTypeTag",description="报送状态",isSingleTagHidden = true)
	@Column(name = "RPTSendType",length=1)
	private String RPTSendType;
	
	public static Map<String,String> getRPTSendTypeTag(){
		return ShowContext.getInstance().getShowEntityMap().get("RPTSendType");
	}
	
	@IColumn(tagMethodName="getRPTFeedbackTypeTag",description="回执状态",isSingleTagHidden = true)
	@Column(name = "RPTFeedbackType",length=1)
	private String RPTFeedbackType;
	
	public static Map<String,String> getRPTFeedbackTypeTag(){
		return ShowContext.getInstance().getShowEntityMap().get("RPTFeedbackType");
	}
	
	public void setRPTFeedbackType(String rPTFeedbackType) {
		RPTFeedbackType = rPTFeedbackType;
	}


	public String getRPTFeedbackType() {
		return RPTFeedbackType;
	}

	public String getSubmitStatus() {
		return SubmitStatus;
	}

	public void setSubmitStatus(String submitStatus) {
		SubmitStatus = submitStatus;
	}

	public String getStrCheckState() {
		return strCheckState;
	}

	public void setStrCheckState(String strCheckState) {
		this.strCheckState = strCheckState;
	}

	public String getStrAllowState() {
		return strAllowState;
	}

	public void setStrAllowState(String strAllowState) {
		this.strAllowState = strAllowState;
	}
	
	@Id
	@Column(name = "id", length = 32)
	@GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex")  
	private String id;

	public void setInstInfo(InstInfo instInfo) {
		this.instInfo = instInfo;
	}

	public InstInfo getInstInfo() {
		return instInfo;
	}

	public void setRptInfo(RptInfo rptInfo) {
		this.rptInfo = rptInfo;
	}

	public RptInfo getRptInfo() {
		return rptInfo;
	}

	public void setRptInfoIdList(String[] rptInfoIdList) {
		this.rptInfoIdList = rptInfoIdList;
	}

	public String[] getRptInfoIdList() {
		return rptInfoIdList;
	}

	public void setTaskFlow(TaskFlow taskFlow) {
		this.taskFlow = taskFlow;
	}

	public TaskFlow getTaskFlow() {
		return taskFlow;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setInstInfoIdList(String[] instInfoIdList) {
		this.instInfoIdList = instInfoIdList;
	}

	public String[] getInstInfoIdList() {
		return instInfoIdList;
	}

	public void setStrShowRptCode(String strShowRptCode) {
	}

	public String getStrShowRptCode() {
		if(null!=this.getRptInfo()){
			return this.getRptInfo().getStrBCode();
		}
		return null;
	}


	public void setRPTSendType(String rPTSendType) {
		RPTSendType = rPTSendType;
	}


	public String getRPTSendType() {
		return RPTSendType;
	}

	public String[] getInstInfoIds() {
		return instInfoIds;
	}

	public void setInstInfoIds(String[] instInfoIds) {
		this.instInfoIds = instInfoIds;
	}

	public String[] getRptInfoIds() {
		return rptInfoIds;
	}

	public void setRptInfoIds(String[] rptInfoIds) {
		this.rptInfoIds = rptInfoIds;
	}
	
	

}

