package zxptsystem.dto.condition;

import framework.interfaces.ICondition;

public class AutoDTO_QY_MYRZ_JC_Condition  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String JRJGDM;
	private String DKKBM;
	
	private String RZXYBH;
	
	private String RPTCheckType;

	private String RPTSubmitStatus;

	private String RPTVerifyType;

	public String getRPTCheckType() {
		return RPTCheckType;
	}

	public void setRPTCheckType(String rPTCheckType) {
		RPTCheckType = rPTCheckType;
	}
	
	public String getRPTSubmitStatus() {
		return RPTSubmitStatus;
	}

	public void setRPTSubmitStatus(String rPTSubmitStatus) {
		RPTSubmitStatus = rPTSubmitStatus;
	}

	public String getRPTVerifyType() {
		return RPTVerifyType;
	}

	public void setRPTVerifyType(String rPTVerifyType) {
		RPTVerifyType = rPTVerifyType;
	}

	private String RPTSendType;
	
	private String RPTFeedbackType;
	
	private String XXJLCZLX;
	public String getJRJGDM() {
		return JRJGDM;
	}

	public void setJRJGDM(String jRJGDM) {
		JRJGDM = jRJGDM;
	}

	public String getDKKBM() {
		return DKKBM;
	}

	public void setDKKBM(String dKKBM) {
		DKKBM = dKKBM;
	}

	public String getRZXYBH() {
		return RZXYBH;
	}

	public void setRZXYBH(String rZXYBH) {
		RZXYBH = rZXYBH;
	}

	public String getRPTSendType() {
		return RPTSendType;
	}

	public void setRPTSendType(String rPTSendType) {
		RPTSendType = rPTSendType;
	}

	public String getRPTFeedbackType() {
		return RPTFeedbackType;
	}

	public void setRPTFeedbackType(String rPTFeedbackType) {
		RPTFeedbackType = rPTFeedbackType;
	}

	public String getXXJLCZLX() {
		return XXJLCZLX;
	}

	public void setXXJLCZLX(String xXJLCZLX) {
		XXJLCZLX = xXJLCZLX;
	}


}