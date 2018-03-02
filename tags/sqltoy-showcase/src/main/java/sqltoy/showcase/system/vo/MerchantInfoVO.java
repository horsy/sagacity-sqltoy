/**
 *@Generated by QuickVO Tools 2.0
 */
package sqltoy.showcase.system.vo;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import java.util.Date;
import sqltoy.showcase.system.vo.base.AbstractMerchantInfoVO;

/**
 * @project sqltoy-showcase
 * @author zhongxuchen
 * @version 1.0.0
 * Table: sys_merchant_info 	
 */
@SqlToyEntity
public class MerchantInfoVO extends AbstractMerchantInfoVO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1989253406189796047L;
	
	/** default constructor */
	public MerchantInfoVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public MerchantInfoVO(String merchantId)
	{
		this.merchantId=merchantId;
	}

	/** minimal constructor */
	public MerchantInfoVO(String merchantId,String merchantCode,String registName)
	{
		this.merchantId=merchantId;
		this.merchantCode=merchantCode;
		this.registName=registName;
	}

	/** full constructor */
	public MerchantInfoVO(String merchantId,String merchantCode,String mposMerchantCode,String country,String businessName,String registName,String businessScope,String address,Integer registArea,Integer cupsArea,String merchantType,String merchantLevel,String mccCode,String createBy,Date createTime,Date activeTime,Date closeTime,Date updateTime,String status)
	{
		this.merchantId=merchantId;
		this.merchantCode=merchantCode;
		this.mposMerchantCode=mposMerchantCode;
		this.country=country;
		this.businessName=businessName;
		this.registName=registName;
		this.businessScope=businessScope;
		this.address=address;
		this.registArea=registArea;
		this.cupsArea=cupsArea;
		this.merchantType=merchantType;
		this.merchantLevel=merchantLevel;
		this.mccCode=mccCode;
		this.createBy=createBy;
		this.createTime=createTime;
		this.activeTime=activeTime;
		this.closeTime=closeTime;
		this.updateTime=updateTime;
		this.status=status;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	
	/**
     *@todo vo columns to String
     */
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public MerchantInfoVO clone() {
		try {
			// TODO Auto-generated method stub
			return (MerchantInfoVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}