package bxywsystem.dto;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.xwork.StringUtils;
import org.hibernate.annotations.GenericGenerator;

import coresystem.dto.InstInfo;
import framework.interfaces.IColumn;
import framework.interfaces.IEntity;
import framework.show.ShowContext;

@Entity
@Table(name = "BXYWCJFKBWSub")
@IEntity(navigationName="保险业务采集反馈报文明细",description="保险业务采集反馈报文明细")
public class BXYWCJFKBWSub  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id", length = 32)
	@GeneratedValue(generator = "system-uuid")   
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex")  
	private String id;
	
	
	@IColumn(description="保险公司机构代码")
	@Column(name = "strBXGSJGDM", length = 50)
	private String strBXGSJGDM;
	
	@IColumn(description="数据报告日期")
	@Column(name = "strSJBGRQ", length = 50)
	private String strSJBGRQ;
	
	@IColumn(description="出错记录位置")
	@Column(name = "strCCJLWZ", length = 50)
	private String strCCJLWZ;
	
	@IColumn(description="出错信息长度")
	@Column(name = "strCCXXCD", length = 200)
	private String strCCXXCD;
	
	@IColumn(tagMethodName="getCCXXTag",description="出错信息")
	@Column(name = "strCCXX", length = 200)
	private String strCCXX;
	
	public static Map<String,String> getCCXXTag(){
		return ShowContext.getInstance().getShowEntityMap().get("BXYWCCXX");
	}
	
	@IColumn(description="出错信息记录")
	@Column(name = "strCCXXJL", length = 4000)
	private String strCCXXJL;
	
	@IColumn(isNullable = false,isSingleTagHidden=true)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "strBXYWCJFKBWId", nullable = false)
	private BXYWCJFKBW bXYWCJFKBW;
	
	@Transient
	@IColumn(description="出错信息",isListShow = true)
	private String strShowCCXX;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "strInstCode")
	@IColumn(description="所属机构")
	private InstInfo instInfo;
	
	@IColumn(tagMethodName="getCBYQTag",description="重报要求")
	@Column(name = "strCBYQ", length = 200)
	private String strCBYQ;
	
	public static Map<String,String> getCBYQTag(){
		return ShowContext.getInstance().getShowEntityMap().get("BX_CBYQ");
	}
	
	public String getStrCBYQ() {
		return strCBYQ;
	}

	public void setStrCBYQ(String strCBYQ) {
		this.strCBYQ = strCBYQ;
	}
	
	@IColumn(description="修改数据")
	@Column(name = "strLinkCCXXJL", length = 200)
	private String strLinkCCXXJL;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStrBXGSJGDM() {
		return strBXGSJGDM;
	}

	public void setStrBXGSJGDM(String strBXGSJGDM) {
		this.strBXGSJGDM = strBXGSJGDM;
	}

	public BXYWCJFKBW getbXYWCJFKBW() {
		return bXYWCJFKBW;
	}

	public void setbXYWCJFKBW(BXYWCJFKBW bXYWCJFKBW) {
		this.bXYWCJFKBW = bXYWCJFKBW;
	}

	public String getStrSJBGRQ() {
		return strSJBGRQ;
	}

	public void setStrSJBGRQ(String strSJBGRQ) {
		this.strSJBGRQ = strSJBGRQ;
	}

	public String getStrCCJLWZ() {
		return strCCJLWZ;
	}

	public void setStrCCJLWZ(String strCCJLWZ) {
		this.strCCJLWZ = strCCJLWZ;
	}

	public String getStrCCXXCD() {
		return strCCXXCD;
	}

	public void setStrCCXXCD(String strCCXXCD) {
		this.strCCXXCD = strCCXXCD;
	}

	public String getStrCCXX() {
		return strCCXX;
	}

	public void setStrCCXX(String strCCXX) {
		this.strCCXX = strCCXX;
	}

	public String getStrCCXXJL() {
		return strCCXXJL;
	}

	public void setStrCCXXJL(String strCCXXJL) {
		this.strCCXXJL = strCCXXJL;
	}

	public BXYWCJFKBW getBXYWCJFKBW() {
		return bXYWCJFKBW;
	}

	public void setBXYWCJFKBW(BXYWCJFKBW bXYWCJFKBW) {
		this.bXYWCJFKBW = bXYWCJFKBW;
	}

	public void setStrLinkCCXXJL(String strLinkCCXXJL) {
		this.strLinkCCXXJL = strLinkCCXXJL;
	}

	public String getStrLinkCCXXJL() {
		return strLinkCCXXJL;
	}
	public void setStrShowCCXX(String strShowCCXX) {
		this.strShowCCXX = strShowCCXX;
	}

	public String getStrShowCCXX() {
        String strCCXXName = "";
		
        String tempCCXX = strCCXX;
        
        while(tempCCXX.length() > 0){
        	
        	String code = tempCCXX.substring(0,4);
        	
        	if(!StringUtils.isBlank(strCCXXName)){
    			strCCXXName += " ";
    		}
        	
        	if(ShowContext.getInstance().getShowEntityMap().get("BXYWCCXX").containsKey(code)){
        		
        		strCCXXName += ShowContext.getInstance().getShowEntityMap().get("BXYWCCXX").get(code);
        	}
        	else{
        		strCCXXName += code;
        	}
        	
        	tempCCXX= tempCCXX.substring(4);
        }
		return strCCXXName;
	}

	public void setInstInfo(InstInfo instInfo) {
		this.instInfo = instInfo;
	}

	public InstInfo getInstInfo() {
		return instInfo;
	}

}