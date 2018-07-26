package com.example.demo.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "hosgoods", type = "doc")
public class HosGoods {
	
	@Id
    private String GOOD_ID ;
    private String HOSPITAL_ID ;
    private String HOSPITAL_CODE ;
    private String HOSPITAL_NAME ;
    private String FACTORY_ID ;
    private String FACTORY_NAME ;
    private String FACTORY_CODE ;
    private String SMALL_UNIT_ID ;
    private String SMALL_UNIT_NAME ;
    private String RATIO_SMALL ;
    private String MID_UNIT_ID ;
    private String MID_UNIT_NAME ;
    private String RATIO_MID ;
    private String BIG_UNIT_ID ;
    private String BIG_UNIT_NAME ;
    private String RATIO_BIG ;
    private String MIX_UNIT_ID ;
    private String MIX_UNIT_NAME ;
    private String GOODS ;
    private String GOOD_NAME ;
    private String GOODS_COMMON_NAME ;
    private String GOOD_PY ;
    private String GOOD_TYPE_MODEL ;
    private String IS_ATTACH ;
    private String IS_ATTACH_NAME ;
    private String IS_PRESENT ;
    private String IS_PRESENT_NAME ;
    private String CHECKER ;
    private String CHECK_DT ;
    private String CREATER ;
    private String CREATE_DT ;
    private String STOPER ;
    private String STOP_DT ;
    private String STOP_STATUS_NAME ;
    private String VERSION ;
    private String FROM_GOOD_ID ;
    private String HOS_GOODS_BUSINESS_ID ;
    private String GOOD_MANAGER_TYPE ;
    private String QUALITY ;
    private String APPLICABLE_SCOPE ;
    private String STRUCTURE ;
    private String GOOD_STORE_CONDICTION ;
    private String GOOD_REMARK ;
    private String IS_HIGGOODS ;
    private String IS_HIGGOODS_NAME ;
    private String HIS_GOOD_CODE ;
    private String CHANNEL ;
    private String CHANNEL_NAME ;
    private String HIS_CHARGE_CODE ;
    private String LICENCE_STATUS_NAME ;
    private String CHARGER_STATUS ;
    private String CHARGER_STATUS_NAME ;
    private String CLASS_CODE ;
    private String CLASS_CODE_NAME ;
    private String TYPE_22_CODE ;
    private String TYPE_22_NAME ;
    private String TYPE_68_CODE ;
    private String TYPE_68_NAME ;
    private String TYPE_FINANCE_CODE ;
    private String TYPE_FINANCE_NAME ;
    private String TYPE_DRGS_CODE ;
    private String TYPE_DRGS_NAME ;
    private String CONTRACT_CODE ;
    private String CONTRACT_NAME ;
    private String CONTRACT_STATUS ;
    private String CONTRACT_STATUS_NAME ;
    private String CONTRACT_VENDER_ID ;
    private String VENDER_NAME ;
    private String EXPIRE_END_DATE ;
    private String HIS_PRICE ;
    private String CONTRACT_PRICE ;
    private String HIS_CHARGE_PRICE ;

    private String ISEXISTCONTRACT ;

	public String getGOOD_ID() {
		return GOOD_ID;
	}

	public void setGOOD_ID(String gOOD_ID) {
		GOOD_ID = gOOD_ID;
	}

	public String getHOSPITAL_ID() {
		return HOSPITAL_ID;
	}

	public void setHOSPITAL_ID(String hOSPITAL_ID) {
		HOSPITAL_ID = hOSPITAL_ID;
	}

	public String getHOSPITAL_CODE() {
		return HOSPITAL_CODE;
	}

	public void setHOSPITAL_CODE(String hOSPITAL_CODE) {
		HOSPITAL_CODE = hOSPITAL_CODE;
	}

	public String getHOSPITAL_NAME() {
		return HOSPITAL_NAME;
	}

	public void setHOSPITAL_NAME(String hOSPITAL_NAME) {
		HOSPITAL_NAME = hOSPITAL_NAME;
	}

	public String getFACTORY_ID() {
		return FACTORY_ID;
	}

	public void setFACTORY_ID(String fACTORY_ID) {
		FACTORY_ID = fACTORY_ID;
	}

	public String getFACTORY_NAME() {
		return FACTORY_NAME;
	}

	public void setFACTORY_NAME(String fACTORY_NAME) {
		FACTORY_NAME = fACTORY_NAME;
	}

	public String getFACTORY_CODE() {
		return FACTORY_CODE;
	}

	public void setFACTORY_CODE(String fACTORY_CODE) {
		FACTORY_CODE = fACTORY_CODE;
	}

	public String getSMALL_UNIT_ID() {
		return SMALL_UNIT_ID;
	}

	public void setSMALL_UNIT_ID(String sMALL_UNIT_ID) {
		SMALL_UNIT_ID = sMALL_UNIT_ID;
	}

	public String getSMALL_UNIT_NAME() {
		return SMALL_UNIT_NAME;
	}

	public void setSMALL_UNIT_NAME(String sMALL_UNIT_NAME) {
		SMALL_UNIT_NAME = sMALL_UNIT_NAME;
	}

	public String getRATIO_SMALL() {
		return RATIO_SMALL;
	}

	public void setRATIO_SMALL(String rATIO_SMALL) {
		RATIO_SMALL = rATIO_SMALL;
	}

	public String getMID_UNIT_ID() {
		return MID_UNIT_ID;
	}

	public void setMID_UNIT_ID(String mID_UNIT_ID) {
		MID_UNIT_ID = mID_UNIT_ID;
	}

	public String getMID_UNIT_NAME() {
		return MID_UNIT_NAME;
	}

	public void setMID_UNIT_NAME(String mID_UNIT_NAME) {
		MID_UNIT_NAME = mID_UNIT_NAME;
	}

	public String getRATIO_MID() {
		return RATIO_MID;
	}

	public void setRATIO_MID(String rATIO_MID) {
		RATIO_MID = rATIO_MID;
	}

	public String getBIG_UNIT_ID() {
		return BIG_UNIT_ID;
	}

	public void setBIG_UNIT_ID(String bIG_UNIT_ID) {
		BIG_UNIT_ID = bIG_UNIT_ID;
	}

	public String getBIG_UNIT_NAME() {
		return BIG_UNIT_NAME;
	}

	public void setBIG_UNIT_NAME(String bIG_UNIT_NAME) {
		BIG_UNIT_NAME = bIG_UNIT_NAME;
	}

	public String getRATIO_BIG() {
		return RATIO_BIG;
	}

	public void setRATIO_BIG(String rATIO_BIG) {
		RATIO_BIG = rATIO_BIG;
	}

	public String getMIX_UNIT_ID() {
		return MIX_UNIT_ID;
	}

	public void setMIX_UNIT_ID(String mIX_UNIT_ID) {
		MIX_UNIT_ID = mIX_UNIT_ID;
	}

	public String getMIX_UNIT_NAME() {
		return MIX_UNIT_NAME;
	}

	public void setMIX_UNIT_NAME(String mIX_UNIT_NAME) {
		MIX_UNIT_NAME = mIX_UNIT_NAME;
	}

	public String getGOODS() {
		return GOODS;
	}

	public void setGOODS(String gOODS) {
		GOODS = gOODS;
	}

	public String getGOOD_NAME() {
		return GOOD_NAME;
	}

	public void setGOOD_NAME(String gOOD_NAME) {
		GOOD_NAME = gOOD_NAME;
	}

	public String getGOODS_COMMON_NAME() {
		return GOODS_COMMON_NAME;
	}

	public void setGOODS_COMMON_NAME(String gOODS_COMMON_NAME) {
		GOODS_COMMON_NAME = gOODS_COMMON_NAME;
	}

	public String getGOOD_PY() {
		return GOOD_PY;
	}

	public void setGOOD_PY(String gOOD_PY) {
		GOOD_PY = gOOD_PY;
	}

	public String getGOOD_TYPE_MODEL() {
		return GOOD_TYPE_MODEL;
	}

	public void setGOOD_TYPE_MODEL(String gOOD_TYPE_MODEL) {
		GOOD_TYPE_MODEL = gOOD_TYPE_MODEL;
	}

	public String getIS_ATTACH() {
		return IS_ATTACH;
	}

	public void setIS_ATTACH(String iS_ATTACH) {
		IS_ATTACH = iS_ATTACH;
	}

	public String getIS_ATTACH_NAME() {
		return IS_ATTACH_NAME;
	}

	public void setIS_ATTACH_NAME(String iS_ATTACH_NAME) {
		IS_ATTACH_NAME = iS_ATTACH_NAME;
	}

	public String getIS_PRESENT() {
		return IS_PRESENT;
	}

	public void setIS_PRESENT(String iS_PRESENT) {
		IS_PRESENT = iS_PRESENT;
	}

	public String getIS_PRESENT_NAME() {
		return IS_PRESENT_NAME;
	}

	public void setIS_PRESENT_NAME(String iS_PRESENT_NAME) {
		IS_PRESENT_NAME = iS_PRESENT_NAME;
	}

	public String getCHECKER() {
		return CHECKER;
	}

	public void setCHECKER(String cHECKER) {
		CHECKER = cHECKER;
	}

	public String getCHECK_DT() {
		return CHECK_DT;
	}

	public void setCHECK_DT(String cHECK_DT) {
		CHECK_DT = cHECK_DT;
	}

	public String getCREATER() {
		return CREATER;
	}

	public void setCREATER(String cREATER) {
		CREATER = cREATER;
	}

	public String getCREATE_DT() {
		return CREATE_DT;
	}

	public void setCREATE_DT(String cREATE_DT) {
		CREATE_DT = cREATE_DT;
	}

	public String getSTOPER() {
		return STOPER;
	}

	public void setSTOPER(String sTOPER) {
		STOPER = sTOPER;
	}

	public String getSTOP_DT() {
		return STOP_DT;
	}

	public void setSTOP_DT(String sTOP_DT) {
		STOP_DT = sTOP_DT;
	}

	public String getSTOP_STATUS_NAME() {
		return STOP_STATUS_NAME;
	}

	public void setSTOP_STATUS_NAME(String sTOP_STATUS_NAME) {
		STOP_STATUS_NAME = sTOP_STATUS_NAME;
	}

	public String getVERSION() {
		return VERSION;
	}

	public void setVERSION(String vERSION) {
		VERSION = vERSION;
	}

	public String getFROM_GOOD_ID() {
		return FROM_GOOD_ID;
	}

	public void setFROM_GOOD_ID(String fROM_GOOD_ID) {
		FROM_GOOD_ID = fROM_GOOD_ID;
	}

	public String getHOS_GOODS_BUSINESS_ID() {
		return HOS_GOODS_BUSINESS_ID;
	}

	public void setHOS_GOODS_BUSINESS_ID(String hOS_GOODS_BUSINESS_ID) {
		HOS_GOODS_BUSINESS_ID = hOS_GOODS_BUSINESS_ID;
	}

	public String getGOOD_MANAGER_TYPE() {
		return GOOD_MANAGER_TYPE;
	}

	public void setGOOD_MANAGER_TYPE(String gOOD_MANAGER_TYPE) {
		GOOD_MANAGER_TYPE = gOOD_MANAGER_TYPE;
	}

	public String getQUALITY() {
		return QUALITY;
	}

	public void setQUALITY(String qUALITY) {
		QUALITY = qUALITY;
	}

	public String getAPPLICABLE_SCOPE() {
		return APPLICABLE_SCOPE;
	}

	public void setAPPLICABLE_SCOPE(String aPPLICABLE_SCOPE) {
		APPLICABLE_SCOPE = aPPLICABLE_SCOPE;
	}

	public String getSTRUCTURE() {
		return STRUCTURE;
	}

	public void setSTRUCTURE(String sTRUCTURE) {
		STRUCTURE = sTRUCTURE;
	}

	public String getGOOD_STORE_CONDICTION() {
		return GOOD_STORE_CONDICTION;
	}

	public void setGOOD_STORE_CONDICTION(String gOOD_STORE_CONDICTION) {
		GOOD_STORE_CONDICTION = gOOD_STORE_CONDICTION;
	}

	public String getGOOD_REMARK() {
		return GOOD_REMARK;
	}

	public void setGOOD_REMARK(String gOOD_REMARK) {
		GOOD_REMARK = gOOD_REMARK;
	}

	public String getIS_HIGGOODS() {
		return IS_HIGGOODS;
	}

	public void setIS_HIGGOODS(String iS_HIGGOODS) {
		IS_HIGGOODS = iS_HIGGOODS;
	}

	public String getIS_HIGGOODS_NAME() {
		return IS_HIGGOODS_NAME;
	}

	public void setIS_HIGGOODS_NAME(String iS_HIGGOODS_NAME) {
		IS_HIGGOODS_NAME = iS_HIGGOODS_NAME;
	}

	public String getHIS_GOOD_CODE() {
		return HIS_GOOD_CODE;
	}

	public void setHIS_GOOD_CODE(String hIS_GOOD_CODE) {
		HIS_GOOD_CODE = hIS_GOOD_CODE;
	}

	public String getCHANNEL() {
		return CHANNEL;
	}

	public void setCHANNEL(String cHANNEL) {
		CHANNEL = cHANNEL;
	}

	public String getCHANNEL_NAME() {
		return CHANNEL_NAME;
	}

	public void setCHANNEL_NAME(String cHANNEL_NAME) {
		CHANNEL_NAME = cHANNEL_NAME;
	}

	public String getHIS_CHARGE_CODE() {
		return HIS_CHARGE_CODE;
	}

	public void setHIS_CHARGE_CODE(String hIS_CHARGE_CODE) {
		HIS_CHARGE_CODE = hIS_CHARGE_CODE;
	}

	public String getLICENCE_STATUS_NAME() {
		return LICENCE_STATUS_NAME;
	}

	public void setLICENCE_STATUS_NAME(String lICENCE_STATUS_NAME) {
		LICENCE_STATUS_NAME = lICENCE_STATUS_NAME;
	}

	public String getCHARGER_STATUS() {
		return CHARGER_STATUS;
	}

	public void setCHARGER_STATUS(String cHARGER_STATUS) {
		CHARGER_STATUS = cHARGER_STATUS;
	}

	public String getCHARGER_STATUS_NAME() {
		return CHARGER_STATUS_NAME;
	}

	public void setCHARGER_STATUS_NAME(String cHARGER_STATUS_NAME) {
		CHARGER_STATUS_NAME = cHARGER_STATUS_NAME;
	}

	public String getCLASS_CODE() {
		return CLASS_CODE;
	}

	public void setCLASS_CODE(String cLASS_CODE) {
		CLASS_CODE = cLASS_CODE;
	}

	public String getCLASS_CODE_NAME() {
		return CLASS_CODE_NAME;
	}

	public void setCLASS_CODE_NAME(String cLASS_CODE_NAME) {
		CLASS_CODE_NAME = cLASS_CODE_NAME;
	}

	public String getTYPE_22_CODE() {
		return TYPE_22_CODE;
	}

	public void setTYPE_22_CODE(String tYPE_22_CODE) {
		TYPE_22_CODE = tYPE_22_CODE;
	}

	public String getTYPE_22_NAME() {
		return TYPE_22_NAME;
	}

	public void setTYPE_22_NAME(String tYPE_22_NAME) {
		TYPE_22_NAME = tYPE_22_NAME;
	}

	public String getTYPE_68_CODE() {
		return TYPE_68_CODE;
	}

	public void setTYPE_68_CODE(String tYPE_68_CODE) {
		TYPE_68_CODE = tYPE_68_CODE;
	}

	public String getTYPE_68_NAME() {
		return TYPE_68_NAME;
	}

	public void setTYPE_68_NAME(String tYPE_68_NAME) {
		TYPE_68_NAME = tYPE_68_NAME;
	}

	public String getTYPE_FINANCE_CODE() {
		return TYPE_FINANCE_CODE;
	}

	public void setTYPE_FINANCE_CODE(String tYPE_FINANCE_CODE) {
		TYPE_FINANCE_CODE = tYPE_FINANCE_CODE;
	}

	public String getTYPE_FINANCE_NAME() {
		return TYPE_FINANCE_NAME;
	}

	public void setTYPE_FINANCE_NAME(String tYPE_FINANCE_NAME) {
		TYPE_FINANCE_NAME = tYPE_FINANCE_NAME;
	}

	public String getTYPE_DRGS_CODE() {
		return TYPE_DRGS_CODE;
	}

	public void setTYPE_DRGS_CODE(String tYPE_DRGS_CODE) {
		TYPE_DRGS_CODE = tYPE_DRGS_CODE;
	}

	public String getTYPE_DRGS_NAME() {
		return TYPE_DRGS_NAME;
	}

	public void setTYPE_DRGS_NAME(String tYPE_DRGS_NAME) {
		TYPE_DRGS_NAME = tYPE_DRGS_NAME;
	}

	public String getCONTRACT_CODE() {
		return CONTRACT_CODE;
	}

	public void setCONTRACT_CODE(String cONTRACT_CODE) {
		CONTRACT_CODE = cONTRACT_CODE;
	}

	public String getCONTRACT_NAME() {
		return CONTRACT_NAME;
	}

	public void setCONTRACT_NAME(String cONTRACT_NAME) {
		CONTRACT_NAME = cONTRACT_NAME;
	}

	public String getCONTRACT_STATUS() {
		return CONTRACT_STATUS;
	}

	public void setCONTRACT_STATUS(String cONTRACT_STATUS) {
		CONTRACT_STATUS = cONTRACT_STATUS;
	}

	public String getCONTRACT_STATUS_NAME() {
		return CONTRACT_STATUS_NAME;
	}

	public void setCONTRACT_STATUS_NAME(String cONTRACT_STATUS_NAME) {
		CONTRACT_STATUS_NAME = cONTRACT_STATUS_NAME;
	}

	public String getCONTRACT_VENDER_ID() {
		return CONTRACT_VENDER_ID;
	}

	public void setCONTRACT_VENDER_ID(String cONTRACT_VENDER_ID) {
		CONTRACT_VENDER_ID = cONTRACT_VENDER_ID;
	}

	public String getVENDER_NAME() {
		return VENDER_NAME;
	}

	public void setVENDER_NAME(String vENDER_NAME) {
		VENDER_NAME = vENDER_NAME;
	}

	public String getEXPIRE_END_DATE() {
		return EXPIRE_END_DATE;
	}

	public void setEXPIRE_END_DATE(String eXPIRE_END_DATE) {
		EXPIRE_END_DATE = eXPIRE_END_DATE;
	}

	public String getHIS_PRICE() {
		return HIS_PRICE;
	}

	public void setHIS_PRICE(String hIS_PRICE) {
		HIS_PRICE = hIS_PRICE;
	}

	public String getCONTRACT_PRICE() {
		return CONTRACT_PRICE;
	}

	public void setCONTRACT_PRICE(String cONTRACT_PRICE) {
		CONTRACT_PRICE = cONTRACT_PRICE;
	}

	public String getHIS_CHARGE_PRICE() {
		return HIS_CHARGE_PRICE;
	}

	public void setHIS_CHARGE_PRICE(String hIS_CHARGE_PRICE) {
		HIS_CHARGE_PRICE = hIS_CHARGE_PRICE;
	}

	public String getISEXISTCONTRACT() {
		return ISEXISTCONTRACT;
	}

	public void setISEXISTCONTRACT(String iSEXISTCONTRACT) {
		ISEXISTCONTRACT = iSEXISTCONTRACT;
	}
    
    
    


}
