/**
* 
*
*@author：
*@since： JDK1.6
*@version：1.0
*@date：2015年6月11日 上午10:36:28
*/ 

package com.cjhb.ssm.credit.comm.poi;

import java.util.List;

/**
 * @ClassName: SheetOptions
 * @Description: 表配置
 * @author 
 * @date 2015年6月11日 上午10:36:28
 *
 */
@SuppressWarnings("rawtypes")
public class SheetOptions {
	
	/**
	 * 表名
	 */
	private String sheetName;
	
	/**
	 * 跳过条数
	 */
	private int skipRows;
	
	/**
	 * 表序号
	 */
	private int sheetSeq;
	
	/**
	 * 列设置
	 */
	private CellOptions[] cellOptions;
	
	/**
	 * 导出的数据
	 */
	private List exportData;
	
	/**
	 * 数据class类型
	 */
	private Class dataClazzType;
	
	/**
	 * @author: jingleiw@rayootech.com
	 * @date: 2015年6月11日 上午10:40:27
	 * @Description:
	 */
	@SuppressWarnings("unused")
	private SheetOptions(){
		
	}
	
	/**
	 * @author: jingleiw@rayootech.com
	 * @date: 2015年6月11日 上午10:40:41
	 * @Description:按表名来构造(导入时用)
	 */
	public SheetOptions(int sheetSeq,int skipRows){
		this.sheetSeq = sheetSeq;
		this.skipRows = skipRows;
	}
	
	/**
	 * @author: jingleiw@rayootech.com
	 * @date: 2015年6月11日 下午4:02:50
	 * @Description:(导出时用)
	 */
	public SheetOptions(String sheetName,List exportData,Class dataClazzType){
		this.sheetName = sheetName;
		this.exportData = exportData;
		this.dataClazzType = dataClazzType;
	}

	/**
	 * @return the sheetName
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * @param sheetName the sheetName to set
	 */
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}

	/**
	 * @return the sheetSeq
	 */
	public int getSheetSeq() {
		return sheetSeq;
	}

	/**
	 * @param sheetSeq the sheetSeq to set
	 */
	public void setSheetSeq(int sheetSeq) {
		this.sheetSeq = sheetSeq;
	}

	/**
	 * @return the cellOptions
	 */
	public CellOptions[] getCellOptions() {
		return cellOptions;
	}

	/**
	 * @param cellOptions the cellOptions to set
	 */
	public void setCellOptions(CellOptions[] cellOptions) {
		this.cellOptions = cellOptions;
	}

	/**
	 * @return the skipRows
	 */
	public int getSkipRows() {
		return skipRows;
	}

	/**
	 * @param skipRows the skipRows to set
	 */
	public void setSkipRows(int skipRows) {
		this.skipRows = skipRows;
	}

	/**
	 * @return the exportData
	 */
	public List getExportData() {
		return exportData;
	}

	/**
	 * @param exportData the exportData to set
	 */
	public void setExportData(List exportData) {
		this.exportData = exportData;
	}

	/**
	 * @return the dataClazzType
	 */
	public Class getDataClazzType() {
		return dataClazzType;
	}

	/**
	 * @param dataClazzType the dataClazzType to set
	 */
	public void setDataClazzType(Class dataClazzType) {
		this.dataClazzType = dataClazzType;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return 
				"sheetSeq : " + this.sheetSeq + ", " + 
				"sheetName : " + this.sheetName + ", " + 
				"skipRows : " + this.skipRows + ", " + 
				"dataClazzType : " + this.dataClazzType;
	}
}